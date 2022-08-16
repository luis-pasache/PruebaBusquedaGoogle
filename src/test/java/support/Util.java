package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Util extends Hooks {

    public static WebDriverWait wait;
    public static JavascriptExecutor je;

    public Util(){
        wait =new WebDriverWait(driver, Duration.ofSeconds(30));
        je = (JavascriptExecutor) driver;
    }

    public void scrooll(){
        je.executeScript("window.scrollBy(0,1000)");
    }

    public static void evidencias() throws IOException {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");

        String path = "D:\\Archivos Intellij IDEA\\PruebaBusquedaGoogle\\target\\evidencia\\";
        String nombre = formato.format(fecha) + "_evidencia.jpg";

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(path+nombre));
    }
}
