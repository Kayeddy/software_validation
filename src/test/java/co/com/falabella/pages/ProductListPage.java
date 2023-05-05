package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends PageObject {

    @FindBy(css = ".fb-product-cta__buy-button")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".fb-product-title__title")
    private WebElementFacade productName;

    public void addProductToCart() {
        addToCartButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }
}