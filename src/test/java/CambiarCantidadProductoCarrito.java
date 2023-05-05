import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.FalabellaSteps;

@RunWith(SerenityRunner.class)
public class CambiarCantidadProductoCarrito {

    @Steps
    FalabellaSteps falabellaSteps;

    @Test
    public void cambiarCantidadProductoCarrito() {
        falabellaSteps.añadirProductoAlCarrito();
        falabellaSteps.cambiarCantidadProductoCarrito(2);
        falabellaSteps.validarCantidadActualizadaYTotal(2);
    }
}
