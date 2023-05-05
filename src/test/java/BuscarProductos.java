import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.FalabellaSteps;

@RunWith(SerenityRunner.class)
public class BuscarProductos {

    @Steps
    FalabellaSteps falabellaSteps;

    @Test
    public void buscarProductosPorTermino() {
        falabellaSteps.abrirPaginaPrincipal();
        falabellaSteps.buscarProductoPorTermino("televisor");
        falabellaSteps.validarResultadosBusqueda("televisor");
    }
}
