package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class FalabellaHomePage extends PageObject {

    @FindBy(id = "searchQuestion")
    private WebElementFacade searchInput;

    @FindBy(css = ".SearchBar-module_searchBtn__3zSNl")
    private WebElementFacade searchButton;

    public void searchFor(String searchTerm) {
        searchInput.typeAndEnter(searchTerm);
    }

    @FindBy(id = "searchQuestion")
    private WebElementFacade searchBar;

    public void buscarProductoPorTermino(String terminoBusqueda) {
        searchBar.typeAndEnter(terminoBusqueda);
    }

    @FindBy(xpath = "//a[contains(text(), 'Tecnología')]")
    private WebElementFacade tecnologiaLink;

    public void seleccionarCategoria(String categoria) {
        switch (categoria) {
            case "Tecnología":
                tecnologiaLink.click();
                break;
            
            default:
                throw new IllegalArgumentException("Categoría no válida");
        }
    }
}
