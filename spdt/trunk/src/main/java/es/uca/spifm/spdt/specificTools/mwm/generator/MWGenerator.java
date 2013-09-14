package es.uca.spifm.spdt.specificTools.mwm.generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import es.uca.spifm.spdt.deployment.swpm.impl.SectionImpl;
import es.uca.spifm.spdt.genericTools.wikim.Article;
import es.uca.spifm.spdt.genericTools.wikim.Category;
import es.uca.spifm.spdt.genericTools.wikim.Image;
import es.uca.spifm.spdt.genericTools.wikim.ItemList;
import es.uca.spifm.spdt.genericTools.wikim.Paragraph;
import es.uca.spifm.spdt.genericTools.wikim.Section;
import es.uca.spifm.spdt.genericTools.wikim.WikiContent;
import es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.CategoryImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl;
import es.uca.spifm.spdt.specificTools.mwm.MediaWikiDatabase;
import es.uca.spifm.spdt.specificTools.mwm.MwmPackage;

public class MWGenerator {

	static MWRenderer mwRender = new MWRenderer();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		
		String inputFileName=args[0];
		String outputWikiConfigFile=args[1];
		
		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(
				MwmPackage.eNS_URI,
				MwmPackage.eINSTANCE);

		URI myURI = URI
				.createFileURI(inputFileName);

		Resource resource = resourceSet.getResource(myURI, true);
		System.out.println("Loaded " + myURI);

		
		try {
			resource.save(System.out, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MediaWikiDatabase myDatabase = (MediaWikiDatabase) resource.getContents().get(0);

		processDatabase(myDatabase, outputWikiConfigFile);

	}

	public static void processDatabase(MediaWikiDatabase myDatabase, String outputWikiConfigFile) {

		// Local variables
		net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot bot=null;
				
				
		// Connect to wiki
		try {
			FileInputStream fis = new FileInputStream(outputWikiConfigFile);
			ResourceBundle properties = new PropertyResourceBundle(fis);
			
			bot = new MediaWikiBot(properties.getString("[URL]"));
			bot.login(properties.getString("[LOGIN]"),
					properties.getString("[PASSWORD]"));

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Writting in wiki

		// Obtains the pages list
				List<WikiContent> pages = myDatabase.getWikiDatabase().getContents();

		long tiempoInicio = System.currentTimeMillis();
		Double tiempoEstimado = new Double(2 * pages.size());

		System.out.println("CREANDO " + pages.size()
				+ " P�?GINAS  EN WIKI.");
		System.out.println("Tiempo aproximado: " + tiempoEstimado.toString()
				+ " segundos");

		SimpleArticle auxArticle;
		for (int i = 0; i < myDatabase.getWikiDatabase().getContents().size(); i++) {
			auxArticle = processArticle(myDatabase.getWikiDatabase().getContents().get(i));

			try {
				bot.writeContent(auxArticle);
				System.out.println("PAG " + (i + 1) + "/"
						+ myDatabase.getWikiDatabase().getContents().size() + ": "
						+ auxArticle.getTitle() + " importada...");
			} catch (Exception ex) {
				System.out.println("PAG " + (i + 1) + " ha generado excepcion...");
				ex.printStackTrace();
			}

		}

		long totalTiempo = (System.currentTimeMillis() - tiempoInicio) / 1000;

		System.out.println("Tiempo total empleado: " + totalTiempo + " segundos.");
		System.out.println(pages.size() + " PAGINAS MULTI-IDIOMAS CREADAS EN WIKI");

	}

	private static SimpleArticle processArticle(WikiContent page) {
		SimpleArticle article = null;
		article = new SimpleArticle();

		article.setTitle(page.getTitle());
		if (page instanceof CategoryImpl) {
			article.setTitle("Category:" + page.getTitle());
			article.addText(mwRender.render((Category)page));
		} else if (page instanceof ArticleImpl) {
			article.addText(mwRender.render((Article)page));
		}
		
		//if (page in.getNamespace() != 0) {
		//	article.setTitle(page.getNamespace() + ":" + page.getTitle());
		article.setEditSummary("Generated by MWGenerator");
		article.setEditor("Software Process Deployment Toolkit");

		return article;
	}

	

}
