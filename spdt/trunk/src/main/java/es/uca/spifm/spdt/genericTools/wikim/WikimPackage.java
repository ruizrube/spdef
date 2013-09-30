/**
 * Created by Ivan Ruiz
 */
package es.uca.spifm.spdt.genericTools.wikim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uca.spifm.spdt.genericTools.wikim.WikimFactory
 * @model kind="package"
 * @generated
 */
public interface WikimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wikim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://spi-fm.uca.es/spdef/models/genericTools/wikim/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wikim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WikimPackage eINSTANCE = es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.WikiContentImpl <em>Wiki Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikiContentImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getWikiContent()
	 * @generated
	 */
	int WIKI_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_CONTENT__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Wiki Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_CONTENT___RENDER = 0;

	/**
	 * The number of operations of the '<em>Wiki Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_CONTENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.CategoryImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = WIKI_CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT_CATEGORY = WIKI_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = WIKI_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___RENDER = WIKI_CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = WIKI_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

	/**
	 * The feature id for the '<em><b>Embedded Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__EMBEDDED_SECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.WikiDatabaseImpl <em>Wiki Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikiDatabaseImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getWikiDatabase()
	 * @generated
	 */
	int WIKI_DATABASE = 3;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_DATABASE__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Wiki Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wiki Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = WIKI_CONTENT__TITLE;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__SECTIONS = WIKI_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CATEGORIES = WIKI_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = WIKI_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE___RENDER = WIKI_CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = WIKI_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionContentImpl <em>Section Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.SectionContentImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getSectionContent()
	 * @generated
	 */
	int SECTION_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTENT__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Section Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Section Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 5;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ORDER = SECTION_CONTENT__ORDER;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URI = SECTION_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ALTERNATIVE = SECTION_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SECTION_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SECTION_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ORDER = SECTION_CONTENT__ORDER;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = SECTION_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = SECTION_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = SECTION_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl <em>Item List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getItemList()
	 * @generated
	 */
	int ITEM_LIST = 8;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST__ORDER = SECTION_CONTENT__ORDER;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST__ITEMS = SECTION_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST__TITLE = SECTION_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST_FEATURE_COUNT = SECTION_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_LIST_OPERATION_COUNT = SECTION_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ItemImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.FileImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TITLE = WIKI_CONTENT__TITLE;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = WIKI_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___RENDER = WIKI_CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = WIKI_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.UserImpl
	 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getUser()
	 * @generated
	 */
	int USER = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TITLE = WIKI_CONTENT__TITLE;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = WIKI_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Render</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___RENDER = WIKI_CONTENT___RENDER;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = WIKI_CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference '{@link es.uca.spifm.spdt.genericTools.wikim.Category#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Category</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Category#getParentCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_ParentCategory();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.WikiContent <em>Wiki Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Content</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikiContent
	 * @generated
	 */
	EClass getWikiContent();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.WikiContent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikiContent#getTitle()
	 * @see #getWikiContent()
	 * @generated
	 */
	EAttribute getWikiContent_Title();

	/**
	 * Returns the meta object for the '{@link es.uca.spifm.spdt.genericTools.wikim.WikiContent#render() <em>Render</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Render</em>' operation.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikiContent#render()
	 * @generated
	 */
	EOperation getWikiContent__Render();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getEmbeddedSections <em>Embedded Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Sections</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Section#getEmbeddedSections()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_EmbeddedSections();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Section#getText()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.wikim.Section#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Section#getContents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contents();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.WikiDatabase <em>Wiki Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Database</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikiDatabase
	 * @generated
	 */
	EClass getWikiDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.wikim.WikiDatabase#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.WikiDatabase#getContents()
	 * @see #getWikiDatabase()
	 * @generated
	 */
	EReference getWikiDatabase_Contents();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.wikim.Article#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Article#getSections()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Sections();

	/**
	 * Returns the meta object for the reference list '{@link es.uca.spifm.spdt.genericTools.wikim.Article#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Article#getCategories()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Categories();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Image#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Image#getUri()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Uri();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Image#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Image#getAlternative()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Alternative();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.SectionContent <em>Section Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Content</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.SectionContent
	 * @generated
	 */
	EClass getSectionContent();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.SectionContent#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.SectionContent#getOrder()
	 * @see #getSectionContent()
	 * @generated
	 */
	EAttribute getSectionContent_Order();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.ItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item List</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.ItemList
	 * @generated
	 */
	EClass getItemList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uca.spifm.spdt.genericTools.wikim.ItemList#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.ItemList#getItems()
	 * @see #getItemList()
	 * @generated
	 */
	EReference getItemList_Items();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.ItemList#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.ItemList#getTitle()
	 * @see #getItemList()
	 * @generated
	 */
	EAttribute getItemList_Title();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uca.spifm.spdt.genericTools.wikim.Item#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.Item#getText()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Text();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for class '{@link es.uca.spifm.spdt.genericTools.wikim.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see es.uca.spifm.spdt.genericTools.wikim.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WikimFactory getWikimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.CategoryImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Parent Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PARENT_CATEGORY = eINSTANCE.getCategory_ParentCategory();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.WikiContentImpl <em>Wiki Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikiContentImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getWikiContent()
		 * @generated
		 */
		EClass WIKI_CONTENT = eINSTANCE.getWikiContent();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKI_CONTENT__TITLE = eINSTANCE.getWikiContent_Title();

		/**
		 * The meta object literal for the '<em><b>Render</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIKI_CONTENT___RENDER = eINSTANCE.getWikiContent__Render();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.SectionImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Embedded Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__EMBEDDED_SECTIONS = eINSTANCE.getSection_EmbeddedSections();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TEXT = eINSTANCE.getSection_Text();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.WikiDatabaseImpl <em>Wiki Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikiDatabaseImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getWikiDatabase()
		 * @generated
		 */
		EClass WIKI_DATABASE = eINSTANCE.getWikiDatabase();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_DATABASE__CONTENTS = eINSTANCE.getWikiDatabase_Contents();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ArticleImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__SECTIONS = eINSTANCE.getArticle_Sections();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__CATEGORIES = eINSTANCE.getArticle_Categories();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ImageImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__URI = eINSTANCE.getImage_Uri();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__ALTERNATIVE = eINSTANCE.getImage_Alternative();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.SectionContentImpl <em>Section Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.SectionContentImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getSectionContent()
		 * @generated
		 */
		EClass SECTION_CONTENT = eINSTANCE.getSectionContent();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_CONTENT__ORDER = eINSTANCE.getSectionContent_Order();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ParagraphImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl <em>Item List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ItemListImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getItemList()
		 * @generated
		 */
		EClass ITEM_LIST = eINSTANCE.getItemList();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_LIST__ITEMS = eINSTANCE.getItemList_Items();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_LIST__TITLE = eINSTANCE.getItemList_Title();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.ItemImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TEXT = eINSTANCE.getItem_Text();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.FileImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '{@link es.uca.spifm.spdt.genericTools.wikim.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.UserImpl
		 * @see es.uca.spifm.spdt.genericTools.wikim.impl.WikimPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

	}

} //WikimPackage
