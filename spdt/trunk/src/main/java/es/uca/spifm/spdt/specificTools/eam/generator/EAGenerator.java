/**
 * 
 */
package es.uca.spifm.spdt.specificTools.eam.generator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.sparx.CreateModelType;







import es.uca.spifm.spdt.genericTools.vmm.Diagram;
import es.uca.spifm.spdt.genericTools.vmm.Element;
import es.uca.spifm.spdt.genericTools.vmm.Package;
import es.uca.spifm.spdt.specificTools.eam.EamPackage;
import es.uca.spifm.spdt.specificTools.eam.EnterpriseArchitectDatabase;

/**
 * @author Iv�n
 * 
 */
public class EAGenerator {

	
	private static Map<String,String> mapElements = new HashMap<String,String>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		String inputFileName=args[0];
		String outputFileName=args[1];
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(EamPackage.eNS_URI, 
					EamPackage.eINSTANCE);

		
		URI myURI=URI.createFileURI(inputFileName);
		
		Resource resource = resourceSet.getResource(myURI, true);
		System.out.println("Loaded " + myURI);

		 
		try {
			resource.save(System.out, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EnterpriseArchitectDatabase database = (EnterpriseArchitectDatabase) resource.getContents().get(0);
		
		processRepository(database,outputFileName);
		
		
			
		}

	
	
	
	private static void processRepository(EnterpriseArchitectDatabase database, String fileName) {
		
		org.sparx.Repository repo = new org.sparx.Repository();
		
		File file=new File(fileName);
		if (file.exists()){
			System.out.println("Conectando a repositorio de modelos " + fileName + " ...");		
		} else {
			System.out.println("Creando repositorio de modelos " + fileName  + " ...");
			repo.CreateModel(CreateModelType.cmEAPFromBase, fileName,  0);
		}
		
		repo.OpenFile(fileName);
		org.sparx.Package modelEA=repo.GetModels().GetByName("Model");
		
		System.out.println("Eliminando contenidos anteriores de" + fileName  + " ...");
		int total=modelEA.GetPackages().GetCount();
		for(int i=0;i<total;i++){
			modelEA.GetPackages().Delete((short) i);
		}
		
		modelEA.Update();
		
		for(Package pack:database.getModelRepository().getProjects().get(0).getPackages()){
			processPackage(modelEA,pack);
		}
		
		System.out.println("Final del proceso!");
		
	}
	
	
	private static void processPackage(org.sparx.Package packEA, Package pack) {
		System.out.println("Creando paquete "+ pack.getName());
		org.sparx.Package subPackageEA = packEA.GetPackages().AddNew(pack.getName(), "Package");
		subPackageEA.SetNotes(pack.getDescription());
		subPackageEA.Update();
		packEA.GetPackages().Refresh();
		

		for(Element element:pack.getElements()){
			processElement(subPackageEA,element);			
		}
		
		for(Diagram diagram:pack.getDiagrams()){
			processDiagram(subPackageEA,diagram);			
		}
			
		
		for(Package subPack:pack.getEmbeddedPackages()){
			processPackage(subPackageEA,subPack);
		}
		
	}



	private static void processElement(org.sparx.Package packEA,Element element) {
		System.out.println("Creando elemento " + element.getName());
		String type=obtainEAElementType(element.getType().getLiteral());
		System.out.println("aaaaaaaaa elemento " + type);
		org.sparx.Element elementEA = packEA.GetElements().AddNew(element.getName(), type);
		elementEA.SetNotes(element.getDescription());
		elementEA.Update();
		
		mapElements.put(String.valueOf(element.hashCode()), String.valueOf(elementEA.GetElementID()));
		
	}


	
	private static void processDiagram(org.sparx.Package packEA, Diagram diagram) {
		String type=obtainEADiagramType(diagram.getType().getName());
		System.out.println("Creando diagrama " + type);
		org.sparx.Diagram myDiagramEA = packEA.GetDiagrams().AddNew(diagram.getName(), type);
		myDiagramEA.Update();
		packEA.GetDiagrams().Refresh();	
		
		for(Element elto:diagram.getContainedElements()){
			System.out.println("Vinculando elemento a diagrama");
			org.sparx.DiagramObject myObjectEA = myDiagramEA.GetDiagramObjects().AddNew(elto.getName(), elto.getType().toString());
			
			myObjectEA.SetElementID(Integer.parseInt(mapElements.get(String.valueOf(elto.hashCode()))));
			myObjectEA.Update();
		}
		
		myDiagramEA.GetDiagramObjects().Refresh();		
	
	}




	private static String obtainEADiagramType(String type) {
		
		if(type.equals("USECASE")){
			return "Use Case";
		} else if(type.equals("CLASS")){
			return "Logical";
		} else {
			String first=type.charAt(0)+"";
			return type.toLowerCase().replaceFirst(first.toLowerCase(), first.toUpperCase());
			
		}
		
	}

private static String obtainEAElementType(String type) {
		
	if(type.equals("USECASE")){
		return "UseCase";
	} else {
		String first=type.charAt(0)+"";
		return type.toLowerCase().replaceFirst(first.toLowerCase(), first.toUpperCase());
		
	}
	}
		

	}


