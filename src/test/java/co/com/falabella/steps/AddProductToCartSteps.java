package steps;

import net.thucydides.core.annotations.Step;
import pages.FalabellaHomePage;
import pages.ProductDetailsPage;
import pages.ProductListPage;
import pages.ShoppingCartPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddProductToCartSteps {

    FalabellaHomePage falabellaHomePage;
    ProductListPage productListPage;
    ProductDetailsPage productDetailsPage;
    ShoppingCartPage shoppingCartPage;

    @Step
    public void openFalabellaHomePage() {
        falabellaHomePage.open();
    }

    @Step
    public void searchForProduct(String searchTerm) {
        falabellaHomePage.searchFor(searchTerm);
    }

    @Step
    public void selectProductFromResults() {
        productListPage.selectFirstProduct();
    }

    @Step
    public void addProductToCart() {
        productDetailsPage.addProductToCart();
    }

    @Step
    public void verifyProductInCart() {
        assertThat(shoppingCartPage.getProductName()).isEqualTo(productDetailsPage.getProductName());
    }
}
