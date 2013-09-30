/**
 * 
 */
package es.uca.spifm.spdt.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.eodm.RDFFactory;
import org.eclipse.eodm.rdf.rdfbase.RDFGraph;
import org.eclipse.eodm.rdf.rdfbase.impl.URIReferenceImpl;
import org.eclipse.eodm.rdf.rdfweb.Document;
import org.eclipse.eodm.rdf.resource.RDFXMLResource;
import org.eclipse.eodm.rdf.resource.RDFXMLResourceFactoryImpl;
import org.eclipse.eodm.rdf.resource.RDFXMLSaver;
import org.eclipse.eodm.rdf.resource.parser.element.RDFResourceElement;
import org.eclipse.eodm.rdf.resource.parser.element.URIReference;
import org.eclipse.eodm.rdf.transformer.EODMRDFSTransformerException;
import org.eclipse.eodm.rdf.transformer.Ecore2RDFS;
import org.eclipse.eodm.util.Triple;

/**
 * @author Iván
 * 
 */
public class RDFVocabularyGenerator {

	/**
	 * @param <E>
	 * @param args
	 */
	public static <E> void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(RDFXMLResource.DEFAULT_RDFXML_EXTENSION, new RDFXMLResourceFactoryImpl());

		String path = "E:\\workspace\\spdt\\src\\main\\resources\\es\\uca\\spifm\\spdt\\";

		List<String> modelsList = new ArrayList<String>();
		modelsList.add("deployment\\swpm\\SoftwareWorkProductModel");
		modelsList.add("deployment\\spcm\\SoftwareProjectControlModel");
		modelsList.add("genericTools\\vmm\\VisualModelingtoolModel");
		modelsList.add("genericTools\\wikim\\WikitoolModel");
		modelsList.add("genericTools\\itm\\IssueTrackingtoolModel");
		
		try {
			for (String modelFileName : modelsList) {
				System.out.println("Generando RDFS para..." + path + modelFileName + ".ecore");

				// Ecore2RDFS.ecore2RDF(path + modelFileName + ".ecore", path +
				// modelFileName + ".rdf", null);

				RDFGraph rdf = Ecore2RDFSchema.ecore2RDF(path + modelFileName + ".ecore", null);

				Document document = RDFFactory.eINSTANCE.createDocument("");
				document.setComplementalGraph(rdf);

				RDFXMLSaver.saveToFile(document, path + modelFileName + ".rdf", "UTF-8");

			}

		} catch (EODMRDFSTransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
