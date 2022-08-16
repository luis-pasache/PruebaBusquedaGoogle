package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class GooglePage extends Util {

    @FindBy(xpath = "//input[@name = 'q']") protected WebElement tfdBusqueda;

    public GooglePage(){
        PageFactory.initElements(driver,this);
    }

    public void ingresarBusqueda(String texto){
        wait.until(ExpectedConditions.visibilityOf(tfdBusqueda));
        tfdBusqueda.sendKeys(texto);
    }
}
