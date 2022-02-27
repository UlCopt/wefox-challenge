package pages;

public class SearchComponentPage extends BasePage{

    private String searchButton = "//button[@data-test='search-input-button']";
    private String searchTextField = "//input[@id='desktop-search-search-input']";
    private String productSuggestions = "//p[@data-test='product-suggestion-name']";

    public SearchComponentPage() {
        super(driver);
    }

    public void openSearchOption() {
        clickElement(searchButton);
    }

    public void enterProductToSearch(String text) {
        writeElement(searchTextField, text);
    }

    public void selectProduct(String text) {
        selectItemByTextContains(productSuggestions,text);
    }
}
