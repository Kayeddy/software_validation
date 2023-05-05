package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageObject {

    @FindBy(css = ".fb-added-to-basket__product-name")
    private WebElementFacade productNameInCart;

    public String getProductName() {
        return productNameInCart.getText();
    }
}