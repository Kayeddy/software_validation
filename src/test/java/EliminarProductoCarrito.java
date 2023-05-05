import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.FalabellaSteps;

@RunWith(SerenityRunner.class)
public class EliminarProductoCarrito {

    @Steps
    FalabellaSteps falabellaSteps;

    @Test
    public void eliminarProductoCarrito() {
        falabellaSteps.añadirProductoAlCarrito();
        falabellaSteps.eliminarProductoDelCarrito();
        falabellaSteps.validarProductoEliminado();
    }
}
