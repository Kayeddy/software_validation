import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FalabellaResultPage extends PageObject {

    @FindBy(xpath = "//div[contains(@class, 'product-name')]") 
    private List<WebElementFacade> listaProductos;

    public void validarListaProductos(String categoria) {
        Assert.assertFalse("La lista de productos está vacía", listaProductos.isEmpty());
        
        for (WebElementFacade producto : listaProductos) {
            String nombreProducto = producto.getText().toLowerCase();
            Assert.assertTrue("El producto no pertenece a la categoría " + categoria,
                    nombreProducto.contains(categoria.toLowerCase()));
        }
    }

    @FindBy(xpath = "//div[contains(@class, 'product-name')]")
    private List<WebElementFacade> listaResultadosBusqueda;

    public void validarResultadosBusqueda(String terminoBusqueda) {
        Assert.assertFalse("La lista de resultados de búsqueda está vacía", listaResultadosBusqueda.isEmpty());

        for (WebElementFacade resultado : listaResultadosBusqueda) {
            String nombreResultado = resultado.getText().toLowerCase();
            Assert.assertTrue("El resultado de búsqueda no está relacionado con el término de búsqueda " + terminoBusqueda,
                    nombreResultado.contains(terminoBusqueda.toLowerCase()));
        }
    }
}
