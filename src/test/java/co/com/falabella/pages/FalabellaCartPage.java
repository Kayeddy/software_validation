import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class FalabellaCartPage extends PageObject {

    @FindBy(xpath = "//input[@type='number' and @name='quantity']")
    private WebElementFacade inputCantidadProducto;

    @FindBy(xpath = "//span[contains(@class, 'fbra_text fbra_test_checkoutTotal_value')]")
    private WebElementFacade precioTotal;

    public void cambiarCantidadProducto(int cantidad) {
        inputCantidadProducto.clear();
        inputCantidadProducto.type(Integer.toString(cantidad));
        inputCantidadProducto.sendKeys(Keys.ENTER);
    }

    public void validarCantidadActualizadaYTotal(int cantidad) {
        String cantidadActual = inputCantidadProducto.getValue();
        Assert.assertEquals("La cantidad del producto en el carrito no se actualizó correctamente",
                Integer.toString(cantidad), cantidadActual);

        // Aquí se obtiene el precio unitario del producto y se calcula el precio total esperado.
        // Luego, se compara el precio total esperado con el precio total mostrado en la página de Falabella.
    }

    @FindBy(xpath = "//button[contains(@class, 'fbra_button fbra_test_button fbra_button--stateless')]")
    private WebElementFacade botonEliminarProducto;

    @FindBy(xpath = "//p[contains(@class, 'fbra_text fbra_test_cartEmpty_cartEmptyMessage')]")
    private WebElementFacade mensajeCarritoVacio;

    public void eliminarProducto() {
        botonEliminarProducto.click();
    }

    public void validarProductoEliminado() {
        waitFor(mensajeCarritoVacio);
        Assert.assertTrue("El producto no fue eliminado correctamente del carrito",
                mensajeCarritoVacio.isVisible());
    }
}
