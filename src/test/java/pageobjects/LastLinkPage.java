package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class LastLinkPage extends Util {

    @FindBy(xpath = "//*[@id='rso']/div[12]/div/div/div/div[1]/div/a/h3") protected WebElement lnkBusqueda;


    public LastLinkPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickUltimoLink(){
        wait.until(ExpectedConditions.visibilityOf(lnkBusqueda));
        lnkBusqueda.click();
    }
}
