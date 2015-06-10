package StepDefinitions;
import cucumber.api.java.en.Given;
import  cucumber.api.java.en.When;
import  cucumber.api.java.en.Then;
import pageObjects.*;

public class SearchStepDefinitions {

  GoogleHomePage google = new GoogleHomePage();

    @Given("^I go to google$")
    public void i_go_to_google() throws Throwable {
        google.navigateToGoogleHomePage();
    }

    @When("^I enter java$")
    public void i_enter_java() throws Throwable {
        google.SearchForJava();
    }

    @Then("^I should see Download Free Java Software$")
    public void i_should_see_Download_Free_Java_Software() throws Throwable {
        google.SelectJavaDownload();
    }
}
