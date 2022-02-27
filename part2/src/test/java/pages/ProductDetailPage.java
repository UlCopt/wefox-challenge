package pages;

public class ProductDetailPage extends BasePage{

    private String productNameOnBreadcrumb = "//span[@data-test='breadcrumb']";
    private String addToCartButton = "//button[@data-test='add-to-bag']";
    private String addedProductToCart = "//div[@data-test='add-to-bag-modal']//h2";
    private String popupSurveyNo = "//area[@id='noButton']";

    public ProductDetailPage() {
        super(driver);
    }

    public String getBreadcrumbText() {
        return getTextElement(productNameOnBreadcrumb);
    }

    public void addProductToCart() {
        clickElement(addToCartButton);
    }

    public String getAddedProductText() {
        return getTextElement(addedProductToCart);
    }

    public void skipPopupSurvey() {
        clickElementIfIsVisible(popupSurveyNo);
    }
}
