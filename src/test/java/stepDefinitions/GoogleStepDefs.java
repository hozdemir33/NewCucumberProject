package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {

        //Our Java Logic GOES HERE
        //THIS IS SAME AS @Test in Junit or TestNG

        Driver.getDriver().get("https://www.google.com");

    }

    @When("user search for iPhone on google")
    public void user_search_for_i_phone_on_google() {

  googlePage.googleSearchBox.sendKeys("iphone"+Keys.ENTER);

    }
    @Then("verify the iPhone related")
    public void verify_the_i_phone_related() {

        String title =Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("iphone"));

    }

    @When("user search for Tea Pot on google")
    public void user_search_for_tea_pot_on_google() {

        googlePage.googleSearchBox.sendKeys("TeaPot"+Keys.ENTER);

    }
    @Then("verify the Tea Pot related")
    public void verify_the_tea_pot_related() {

      String title= Driver.getDriver().getTitle();
      Assert.assertTrue(title.contains("TeaPot"));

    }

    @When("user search for flower on google")
    public void user_search_for_flower_on_google() {

        googlePage.googleSearchBox.sendKeys("flower"+Keys.ENTER);
    }
    @Then("verify the flower related")
    public void verify_the_flower_related() {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("flower"));

    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();

    }

    @When("user search for {string}")
    public void user_search_for(String string) {

        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);

    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {

        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));

    }

    @When("user is searching for {string}")
    public void user_is_searching_for(String string) {

        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);

    }
    @Then("verify the {string} related results")
    public void verify_the_related_results(String string) {

        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));

    }
    @When("user is searching for {string} car")
    public void user_is_searching_for_car(String string) {
        googlePage.googleSearchBox.sendKeys(string+Keys.ENTER);
    }

    @Then("verify the {string} results")
    public void verify_the_results(String string) {

        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(string));
    }
}