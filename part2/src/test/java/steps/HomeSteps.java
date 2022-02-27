package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("^I navigate to Lego Store$")
    public void goToLegoStoreSpain() {
        homePage.navigateToLegoStoreSpain();
        homePage.goToStore();
        homePage.acceptAllCookies();
    }
}
