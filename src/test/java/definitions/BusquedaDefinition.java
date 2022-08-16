package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GooglePage;
import pageobjects.LastLinkPage;

import java.io.IOException;

import static support.Util.evidencias;

public class BusquedaDefinition {

    GooglePage buscar;
    LastLinkPage lastLink;

    public BusquedaDefinition(){
        buscar = new GooglePage();
        lastLink = new LastLinkPage();
    }
    @Given("estando en la pagina de busqueda")
    public void estandoEnLaPaginaDeBusqueda() {
        Hooks.driver.get("https://www.google.com/");
    }

    @When("ingresa y realiza la busqueda {string}")
    public void ingresaYRealizaLaBusqueda(String busqueda) {
        buscar.ingresarBusqueda(busqueda+"\n");
    }

    @Then("entramos al ultimo link")
    public void entramosAlUltimoLink() throws IOException {
        lastLink.scrooll();
        lastLink.clickUltimoLink();
        evidencias();
    }
}
