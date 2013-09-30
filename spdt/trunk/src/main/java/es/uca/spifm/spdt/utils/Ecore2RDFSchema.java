
/**
 * <copyright> 
 * 
 * Copyright (c) 2004-2005 IBM Corporation and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License - v 1.0 
 * which accompanies this distribution, and is available at 
 * http://opensource.org/licenses/eclipse-1.0.txt 
 * 
 * Contributors: 
 *   IBM - Initial API and implementation 
 * 
 * </copyright> 
 * 
 * $Id: Ecore2RDFSchema.java,v 1.3 2007/04/03 10:21:20 lzhang Exp $
 * Modificación por IRR para incluir el NS del vocabulario
 */

package es.uca.spifm.spdt.utils;


import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.eodm.RDFFactory;
import org.eclipse.eodm.rdf.rdfbase.PlainLiteral;
import org.eclipse.eodm.rdf.rdfbase.RDFGraph;
import org.eclipse.eodm.rdf.rdfbase.RDFProperty;
import org.eclipse.eodm.rdf.rdfbase.RDFSResource;
import org.eclipse.eodm.rdf.rdfbase.URIReference;
import org.eclipse.eodm.rdf.rdfs.RDFBag;
import org.eclipse.eodm.rdf.rdfs.RDFSClass;
import org.eclipse.eodm.rdf.rdfs.RDFSDatatype;
import org.eclipse.eodm.rdf.rdfweb.Document;
import org.eclipse.eodm.rdf.resource.RDFXMLSaver;
import org.eclipse.eodm.rdf.transformer.EODMRDFSTransformerException;



/**
 * 
 * The API realizes translation from ECore model to RDF model.
 * 
 *  
 */
public class Ecore2RDFSchema {

    public static RDFGraph ecore2RDF(String ecoreFilePath, Map options) throws EODMRDFSTransformerException {
        //register default resource factory
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        
        //create resource set to hold the resource we're loading and its dependent resources
        ResourceSet resourceSet = new ResourceSetImpl();
        
        // load file
        resourceSet.getResource(URI.createFileURI(ecoreFilePath), true);
        File inputFile = new File(ecoreFilePath);
        URI absoluteInputURI = URI.createFileURI(inputFile.getAbsolutePath());
        
        Resource resource = resourceSet.getResource(absoluteInputURI, true);

        return ecore2RDF(resource, options); 
    }
    
    public static void ecore2RDF(String ecoreFilePath, String rdfFilePath, Map options) throws EODMRDFSTransformerException {
    	RDFGraph graph = ecore2RDF(ecoreFilePath,options);
    	
    	try {
    		saveRDFGraph(graph,rdfFilePath,null);
    	} catch (URISyntaxException e1) {
    		throw new EODMRDFSTransformerException("Cannot create Documents:" + e1.getMessage());
    	} catch (IOException e2) {
    		throw new EODMRDFSTransformerException("Cannot save RDF Graph:" + e2.getMessage());
    	}
    	
    }
    
    public static RDFGraph ecore2RDF(Resource ecoreResource, Map options) throws EODMRDFSTransformerException {
       
        if(options==null) {
            options = Collections.EMPTY_MAP;
        }
        
        EPackage ePackage = (EPackage)ecoreResource.getContents().get(0);
                
        return ecore2RDF(ePackage,options);
    }
    
    
    public static RDFGraph ecore2RDF(EPackage ePackage, Map options) throws EODMRDFSTransformerException {
    	   	
        String nsUri = ePackage.getNsURI();
        
        RDFGraph graph = null;
        
        try {
        	RDFFactory factory = RDFFactory.eINSTANCE;
        	
        	// set ePackage NsURI as graph name
        	graph = factory.createGraph(nsUri);       	
        	
        	// retrieve all eclassifier need to be transformed
        	List eclassifierLst = getEclassifier(ePackage);
        	
        	HashMap ecore2rdfMap = new HashMap();
        	
        	// transform classifier
        	for(Iterator it = eclassifierLst.iterator();it.hasNext();) {
        		EClassifier eclassifier = (EClassifier) it.next();
        		
        		RDFSResource rsource = eclass2RDF(eclassifier,graph,ecore2rdfMap,nsUri);
        		
        		if(eclassifier instanceof EClass) {
        			RDFSClass rclass = (RDFSClass)rsource;
        			
        			// eSuperTypes -> RDFSSubClassOf
        			EClass eclass = (EClass) eclassifier;
                    for(Iterator itSuper=eclass.getESuperTypes().iterator();itSuper.hasNext();) {
	                	EClassifier eSuper = (EClassifier)itSuper.next();
	                	if(eSuper.eIsProxy()) {
	                		continue;
	                	}
                    	
                        RDFSClass parents = (RDFSClass)eclass2RDF(eSuper,graph, ecore2rdfMap,nsUri);
                        parents.getSubClass().add(rclass);
                    }
        		
                    // EAttribute -> OWLDatatypeProperty
                    for(Iterator itAtt=eclass.getEAttributes().iterator();itAtt.hasNext();) {
                        EAttribute eatt = (EAttribute) itAtt.next();

                        String pname = eatt.getName();
                        //@TODO
                        RDFProperty prop = factory.createRDFProperty(graph,nsUri+"#"+pname);
                        prop.getRDFScomment().addAll( eAnnotation2Literal(eatt) );
                        prop.getRDFSlabel().add( factory.createPlainLiteral("The " + pname + " attribute") );
                        
                        prop.getRDFSdomain().add(rclass);
                        
                        if (!EEnum.class.isInstance(eatt.getEType())) {
                            //create range as a datatype instance, including
                            // XSD, EMF and user-defined datatype

                        	String xsdName = null;
                            //check if XSD datatype
                            if (eatt.getEType() == EcorePackage.eINSTANCE.getEBoolean())
                            	xsdName = XSD_BOOLEAN;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEFloat())
                            	xsdName = XSD_FLOAT;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEByte())
                            	xsdName = XSD_BYTE;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEInt())
                            	xsdName = XSD_INT;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getELong())
                            	xsdName = XSD_LONG;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEDouble())
                            	xsdName = XSD_DOUBLE;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEShort())
                            	xsdName = XSD_SHORT;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEIntegerObject())
                            	xsdName = XSD_INTEGER;
                            else if (eatt.getEType() == EcorePackage.eINSTANCE.getEString())
                            	xsdName = XSD_STRING;

                            if (xsdName != null) {
                            	// is XSD type
                            	RDFSDatatype type = factory.createRDFSDatatype(graph,xsdName);
                            	prop.getRDFSrange().add(type);

                            } else {
                                //is user-defined datatype
                            	RDFSDatatype type = factory.createRDFSDatatype(graph,eatt.getEType().getName());
                            	prop.getRDFSrange().add(type);
                            }
                            
                        } else {
                            //a bag attribute
                        	RDFBag bag = (RDFBag)eclass2RDF(eatt.getEType(),graph,ecore2rdfMap,nsUri);
                        	if(bag!=null) {
                        		RDFSDatatype dummy = factory.createRDFSDatatype(graph,(URIReference)bag.getUriRef().get(0));
                        		dummy.getRDFSisDefinedBy().add(bag);
                        		prop.getRDFSrange().add(dummy);
                        	}
                        	
                        }
                    }
                    
                    // EReference -> RDFProperty
                    for(Iterator itRef=eclass.getEReferences().iterator();itRef.hasNext();){
                    	EReference eref = (EReference) itRef.next();
                    	//@TODO
                    	String pname = eref.getName();
                    	RDFProperty prop = factory.createRDFProperty(graph,nsUri+"#"+pname);
                        prop.getRDFScomment().addAll( eAnnotation2Literal(eref) );
                        prop.getRDFSlabel().add( factory.createPlainLiteral("The " + pname + " reference") );
                        
                        prop.getRDFSdomain().add(rclass);
                        
                        RDFSClass range = factory.createRDFSClass(graph,nsUri+"#"+eref.getEReferenceType().getName());
                        prop.getRDFSrange().add(range);
                    }
                    
                }
        	}
        	
        } catch (URISyntaxException e){
        	throw new EODMRDFSTransformerException("Something wrong when creating RDF Resource:" + e.getMessage());
        }
        
        return graph;
    }
    
    /**
     * 
     * @param eNameElem
     * @return a list of PlainLiterals from eclassifier
     */
    private static List eAnnotation2Literal(ENamedElement eNameElem) {
    	List alist = new ArrayList();
    	
        for(Iterator itAn = eNameElem.getEAnnotations().iterator();itAn.hasNext();){
        	EAnnotation an = (EAnnotation)itAn.next();
        	if(an!=null){
        		PlainLiteral literal = RDFFactory.eINSTANCE.createPlainLiteral(eAnnotation2String(an));
        		alist.add(literal);
        	}       	
        }
    	
    	return alist;
    }
    
    
    
    private static RDFSResource eclass2RDF(EClassifier eclassifier, RDFGraph graph, Map ecore2rdfMap, String nsUri) throws EODMRDFSTransformerException {    	
    	
    	RDFSResource rsource = (RDFSResource)ecore2rdfMap.get(eclassifier);
    	
    	if(rsource==null) { 
	        try {       	
	        	RDFFactory factory = RDFFactory.eINSTANCE;
	        	
				String name = eclassifier.getName();
		
				if(eclassifier instanceof EClass) {
		        	// EClass -> RDFSClass
		            RDFSClass rclass = factory.createRDFSClass(graph, nsUri+"#"+name);
		
		            // create comments
		           	rclass.getRDFScomment().addAll( eAnnotation2Literal(eclassifier) );
		           	rclass.getRDFSlabel().add( factory.createPlainLiteral("The " + name + " entity") );
		           	rsource = rclass;
				}
		        else if (eclassifier instanceof EEnum) {               	
		            //EEnum -> RDFBag
		        	RDFBag rbag = (name==null) ? factory.createRDFBag(graph,"EEnum") 
		        			: factory.createRDFBag(graph,nsUri+"#"+name);
	
		            rbag.getRDFScomment().addAll( eAnnotation2Literal(eclassifier) );
		            rbag.getRDFSlabel().add( factory.createPlainLiteral("The " + name + " enumeration") );
		
		            //EEnumLiteral -> RDFSMember
		            for(Iterator et=((EEnum)eclassifier).getELiterals().iterator();et.hasNext();){
		            	EEnumLiteral eLiteral = (EEnumLiteral) et.next();
		            	rbag.getRDFSmember().add(factory.createPlainLiteral("The " + eLiteral.getName() + " enum literal"));
		            }
		            
		            rsource = rbag;
		        } 
		        else if (eclassifier instanceof EDataType) {
		            //EDataType -> RDFSDatatype
		            RDFSDatatype rdatatype = factory.createRDFSDatatype(graph,nsUri+"#"+name);
		            rdatatype.getRDFScomment().addAll( eAnnotation2Literal(eclassifier) );
		            rdatatype.getRDFSlabel().add( factory.createPlainLiteral("The " + name + " datatype") );
		            
		            rsource = rdatatype;
		        }
				
				ecore2rdfMap.put(eclassifier,rsource);
	        } catch (URISyntaxException e) {
	        	throw new EODMRDFSTransformerException("Something wrong when creating RDF Resource:" + e.getMessage());
	        }
    	}
    	
    	return rsource;
    }
    
    
    //private static Namespace nsURI2Namespace(String nsPrefix, String nsURI) {
        // TODO create a namespace object according to the uri
    //   return null;
    //}
    
    private static String eAnnotation2String(EAnnotation an) {
        String str = an.getSource() + ": ";
        EMap detail = (EMap) an.getDetails();
        for (Iterator iter = detail.keySet().iterator(); iter.hasNext();) {
            Object key = iter.next();
            str += "  " + key + ":" + detail.get(key);
        }
        return replaceKeywords(str);
    }

    private static String replaceKeywords(String str) {
        str = str.replaceAll("&", "&amp;");
        str = str.replaceAll("<", "&lt;");
        str = str.replaceAll(">", "&gt;");
        str = str.replaceAll("'", "&apos;");
        str = str.replaceAll("\"", "&quot;");

        return str;
    }
    
	static void saveRDFGraph(RDFGraph graph, String filePath, String docURI) throws URISyntaxException, IOException {
        Document document = RDFFactory.eINSTANCE.createDocument(docURI);
        document.setComplementalGraph(graph);
        RDFXMLSaver.saveToFile(document, filePath, "UTF-8");
	}
    
	static List getEclassifier(EPackage ePackage) {
		List lst = ePackage.getEClassifiers();
		
		for (Iterator iter = ePackage.getESubpackages().iterator(); iter.hasNext();) {
			EPackage sube = (EPackage) iter.next();
			lst.addAll( getEclassifier(sube)  );
		}
		
		return lst;
	}
	
	
	
    private static String XSD_BOOLEAN = "http://www.w3.org/2001/XMLSchema#boolean";
    private static String XSD_FLOAT = "http://www.w3.org/2001/XMLSchema#float";
    private static String XSD_BYTE = "http://www.w3.org/2001/XMLSchema#byte";
    private static String XSD_INT = "http://www.w3.org/2001/XMLSchema#int";
    private static String XSD_LONG = "http://www.w3.org/2001/XMLSchema#long";
    private static String XSD_DOUBLE = "http://www.w3.org/2001/XMLSchema#double";
    private static String XSD_SHORT = "http://www.w3.org/2001/XMLSchema#short";
    private static String XSD_INTEGER = "http://www.w3.org/2001/XMLSchema#integer";
    private static String XSD_STRING = "http://www.w3.org/2001/XMLSchema#string";
}