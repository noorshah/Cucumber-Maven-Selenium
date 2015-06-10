package pageObjects;
import webDriver.WebDriverUtils;
public class GoogleHomePage {
    WebDriverUtils webDriverUtils= new WebDriverUtils();

    public  void navigateToGoogleHomePage()
    {webDriverUtils.navigateToURL("https://www.google.co.uk");
    }

    public void SearchForJava()
    {
        webDriverUtils.enterText("input[title=Search]", "java download");
    }

    public void SelectJavaDownload(){
        webDriverUtils.waitFor(10);
        webDriverUtils.clickLink("Download Free Java Software");
        webDriverUtils.waitFor(2);
        webDriverUtils.clickLink("Free Java Download");
        webDriverUtils.quitDriver();
    }
}
