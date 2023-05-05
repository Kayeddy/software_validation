import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.FalabellaSteps;

@RunWith(SerenityRunner.class)
public class FiltrarProductosPorCategoria {

    @Steps
    FalabellaSteps falabellaSteps;

    @Test
    public void filtrarProductosPorCategoriaTecnologia() {
        falabellaSteps.abrirPaginaPrincipal();
        falabellaSteps.seleccionarCategoria("Tecnología");
        falabellaSteps.validarListaProductos("Tecnología");
    }
}
