package webDriver;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    public void navigateToURL(String URL){
        SharedDriver.driver.navigate().to(URL);
    }
    public void enterText(String cssSelector,String text){
        SharedDriver.driver.findElement(By.cssSelector(cssSelector)).sendKeys(text);
    }
    public void clickButton(String cssSelector){
        SharedDriver.driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void clickLink(String Text){
        SharedDriver.driver.findElement(By.linkText(Text)).click();
    }

    public void waitFor(int time){
        SharedDriver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void quitDriver(){
        SharedDriver.driver.quit();
    }
}
