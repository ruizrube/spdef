/**
 * 
 */
package es.uca.spifm.spdt.specificTools.mwm.generator;

import es.uca.spifm.spdt.genericTools.wikim.Article;
import es.uca.spifm.spdt.genericTools.wikim.Category;
import es.uca.spifm.spdt.genericTools.wikim.Image;
import es.uca.spifm.spdt.genericTools.wikim.Item;
import es.uca.spifm.spdt.genericTools.wikim.ItemList;
import es.uca.spifm.spdt.genericTools.wikim.Paragraph;
import es.uca.spifm.spdt.genericTools.wikim.Section;
import es.uca.spifm.spdt.genericTools.wikim.SectionContent;
import es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl;
import es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl;

/**
 * @author Ivan
 * 
 */
public class MWRenderer {

	public String render(Article article) {
		StringBuffer result = new StringBuffer();

		for (Section section : article.getSections()) {
			result.append(this.render(section, 1));

		}

		for (Category cat : article.getCategories()) {
			result.append("\n[[Category:").append(cat.getName())
					.append("]]\n");
		}

		return result.toString();
	}

	public String render(Category category) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		StringBuffer result = new StringBuffer();
		result.append("\n\n ''Associated Documentation for '' '''")
				.append(category.getName()).append("'''");
		result.append("\n\n[[Category:").append("Technical Documentation")
				.append("]]\n");
		return result.toString();
	}

	public String render(Image img) {
		StringBuffer result = new StringBuffer();

		result.append("\n''").append(img.getAlternative()).append("''\n");

		result.append("\n").append(img.getUri());
		result.append("\n");

		return result.toString();
	}

	public String render(ItemList list) {

		StringBuffer result = new StringBuffer();
		result.append("\n\n''").append(list.getName()).append("''\n");
		for (Item item : list.getItems()) {
			result.append("\n* ").append(item.getText());
		}
		return result.toString();

	}

	public String render(Paragraph par) {
		return "\n\n" + par.getText();

	}

	public String render(Section section, int level) {
		StringBuffer result = new StringBuffer();
		StringBuffer heading = new StringBuffer();

		for (int i = 1; i <= level; i++)
			heading.append("=");

		result.append("\n\n").append(heading).append(" ")
				.append(section.getName()).append(" ").append(heading)
				.append("\n");

		if (section.getText() != null) {
			result.append(section.getText());
		}

		for (SectionContent content : section.getContents()) {
			if (content instanceof ImageImpl) {
				result.append(this.render((Image)content));
			} else if (content instanceof ItemListImpl) {
				result.append(this.render((ItemList)content));
			} else if (content instanceof ParagraphImpl) {
				result.append(this.render((Paragraph)content));
			}
			
		}

		if (section.getEmbeddedSections() != null) {
			for (Section subsec : section.getEmbeddedSections()) {
				result.append(this.render(subsec,level + 1));
			}
		}
		return result.toString();
	}

}
