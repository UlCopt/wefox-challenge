package steps;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import pages.SearchComponentPage;

public class SearchComponentSteps {

    SearchComponentPage searchComponentPage = new SearchComponentPage();
    private final TestContext testContext;

    public SearchComponentSteps(TestContext testContext){
        this.testContext = testContext;
    }

    @When("^I search a product with (.+) and select the product with (.+)$")
    public void searchProductBySuggestedName(String suggestName, String name ) {
        searchComponentPage.openSearchOption();
        searchComponentPage.enterProductToSearch(suggestName);
        searchComponentPage.selectProduct(name);
        testContext.productFullName = name;
    }
 }
