import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FalabellaHomePage;
import pages.FalabellaResultPage;
import pages.FalabellaCartPage;

public class FalabellaSteps extends ScenarioSteps {

    FalabellaHomePage falabellaHomePage;
    FalabellaResultPage falabellaResultPage;
    FalabellaCartPage falabellaCartPage;

    @Step("Abrir la página principal de Falabella.com.co")
    public void abrirPaginaPrincipal() {
        falabellaHomePage.open();
    }

    @Step("Seleccionar la categoría {0} en el menú principal")
    public void seleccionarCategoria(String categoria) {
        falabellaHomePage.seleccionarCategoria(categoria);
    }

    @Step("Validar que se muestre una lista de productos de la categoría {0}")
    public void validarListaProductos(String categoria) {
        falabellaResultPage.validarListaProductos(categoria);
    }

    @Step("Introducir un término de búsqueda {0} en la barra de búsqueda y presionar Enter")
    public void buscarProductoPorTermino(String terminoBusqueda) {
        falabellaHomePage.buscarProductoPorTermino(terminoBusqueda);
    }

    @Step("Validar que se muestre una lista de resultados relacionados con el término de búsqueda {0}")
    public void validarResultadosBusqueda(String terminoBusqueda) {
        falabellaResultPage.validarResultadosBusqueda(terminoBusqueda);
    }

    @Step("Añadir un producto al carrito de compras")
    public void añadirProductoAlCarrito() {
        falabellaResultPage.añadirProductoAlCarrito();
    }

    @Step("Cambiar la cantidad del producto en el carrito a {0}")
    public void cambiarCantidadProductoCarrito(int cantidad) {
        falabellaCartPage.cambiarCantidadProducto(cantidad);
    }

    @Step("Validar que la cantidad del producto en el carrito se actualice a {0} y el precio total se ajuste en consecuencia")
    public void validarCantidadActualizadaYTotal(int cantidad) {
        falabellaCartPage.validarCantidadActualizadaYTotal(cantidad);
    }

    @Step("Eliminar el producto del carrito")
    public void eliminarProductoDelCarrito() {
        falabellaCartPage.eliminarProducto();
    }

    @Step("Validar que el producto es eliminado del carrito y el carrito se actualiza")
    public void validarProductoEliminado() {
        falabellaCartPage.validarProductoEliminado();
    }
}
