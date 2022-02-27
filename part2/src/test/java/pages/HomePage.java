package pages;

public class HomePage extends BasePage {

    private String continueOption = "//button[contains(text(),'Continuar')]";
    private String acceptCookies = "//button[contains(text(),'Aceptar todo')]";

    public HomePage() {
        super(driver);
    }

    public void navigateToLegoStoreSpain() {
        navigateTo("https://www.lego.com/es-es");
    }

    public void goToStore() {
        clickElement(continueOption);
    }

    public void  acceptAllCookies() {
        clickElement(acceptCookies);
    }
}
