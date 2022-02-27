package pages;

import manager.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static final int WAIT_TIME_IN_SECONDS =10;


    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        BasePage.wait = new WebDriverWait(driver, WAIT_TIME_IN_SECONDS);
    }

    private WebElement findByXpath(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    private List<WebElement> getAllElements(String locator) {
        List<WebElement> elements = driver.findElements(By.xpath(locator));
        waitForElements(elements);
        return elements;
    }

    private void waitForElements(List<WebElement> list){
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME_IN_SECONDS);
        wait.until(ExpectedConditions.visibilityOfAllElements(list));
    }

    public static void createDriver() {
        driver = new WebDriverManager().getDriver();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    /**
     *
     * @param url: link to the page
     */
    public static void navigateTo(String url) {
        driver.get(url);
    }

    /**
     *
     * @param locator: element by xpath
     */
    public void clickElement(String locator) {
        findByXpath(locator).click();
    }

    /**
     *
     * @param locator: element by xpath
     * @param textToWrite: text
     */
    public void writeElement(String locator, String textToWrite) {
        findByXpath(locator).clear();
        findByXpath(locator).sendKeys(textToWrite);
    }

    /**
     *
     * @param locator: element by xpath
     * @return
     */
    public String getTextElement(String locator) {
        return findByXpath(locator).getText();
    }

    /**
     *
     * @param locator: xpath element with childs
     * @param text: text to compare using contains
     */
    public void selectItemByTextContains(String locator, String text)  {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<WebElement> elements = getAllElements(locator);
        for (WebElement element: elements) {
            if (element.getText().contains(text) ) {
                element.click();
                break;
            }
        }
    }

    /**
     *
     * @param locator: xpath element
     */
    public void clickElementIfIsVisible(String locator) {
        try {
            boolean isDisplayed = driver.findElement(By.xpath(locator)).isDisplayed();
            if (isDisplayed) {
                clickElement(locator);
            }
        } catch (NoSuchElementException e) {
            //in case the popup not appears, which is almost the times
        }
    }
}