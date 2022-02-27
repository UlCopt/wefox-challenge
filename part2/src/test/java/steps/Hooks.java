package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class Hooks {

    @Before
    public void beforeScenario(){
        BasePage.createDriver();
    }

    @After
    public void afterScenario(){
        BasePage.closeBrowser();
    }
}