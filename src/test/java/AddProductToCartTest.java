package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.AddProductToCartSteps;

@RunWith(SerenityRunner.class)
public class AddProductToCartTest {

    @Steps
    AddProductToCartSteps addProductToCartSteps;

    @Test
    public void addProductToCart() {
        addProductToCartSteps.openFalabellaHomePage();
        addProductToCartSteps.searchForProduct("televisor");
        addProductToCartSteps.selectProductFromResults();
        addProductToCartSteps.addProductToCart();
        addProductToCartSteps.verifyProductInCart();
    }
}
