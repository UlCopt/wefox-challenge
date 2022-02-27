package steps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductDetailPage;

public class ProductDetailSteps {

    ProductDetailPage productDetailPage = new ProductDetailPage();
    private final TestContext testContext;

    public ProductDetailSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then("^I add to the cart$")
    public void addProductToCart() {
        productDetailPage.skipPopupSurvey();
        Assert.assertTrue("Fail: The product don't contains the expected name", productDetailPage.getBreadcrumbText().contains(testContext.productFullName));
        productDetailPage.addProductToCart();
        Assert.assertEquals("Fail: The product wasn't added to the cart","Añadido a la bolsa", productDetailPage.getAddedProductText());
    }
}
