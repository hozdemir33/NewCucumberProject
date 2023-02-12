package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MercuryPageRegistration;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MercuryStepDefs {

    MercuryPageRegistration mercuryPageRegistration=new MercuryPageRegistration();

    @Given("user gets on the mercury page")
    public void user_gets_on_the_mercury_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("mercury_tours_registration_Page"));

    }
    @Given("user place firstName {string} and lastName {string}")
    public void user_place_first_name_and_last_name(String string, String string2) {

      mercuryPageRegistration.FirstName.sendKeys(string);
      mercuryPageRegistration.LastName.sendKeys(string2);

    }
    @Given("user place phone number {string}")
    public void user_place_phone_number(String string) {

       mercuryPageRegistration.Phone.sendKeys(string);

    }
    @Given("user place emailaddress {string}")
    public void user_place_emailaddress(String string) {

        mercuryPageRegistration.Email.sendKeys(string);

    }
    @Given("user place address {string}")
    public void user_place_address(String string) {

        mercuryPageRegistration.Address.sendKeys(string);

    }
    @Given("user place City {string}")
    public void user_place_city(String string) {

        mercuryPageRegistration.City.sendKeys(string);
    }
    @Given("user place State {string}")
    public void user_place_state(String string) {

        mercuryPageRegistration.State.sendKeys(string);
    }
    @Given("user place zipcode {string}")
    public void user_place_zipcode(String string) {

       mercuryPageRegistration.Zipcode.sendKeys(string);

    }
    @Given("user place Country {string}")
    public void user_place_country(String string) {

        mercuryPageRegistration.Country.sendKeys(string);

    }
    @Given("user place UserName {string}")
    public void user_place_user_name(String string) {
         mercuryPageRegistration.UserName.sendKeys(string);
    }
    @Given("user place firstPassword {string} and SecondPassword {string}")
    public void user_place_first_password_and_second_password(String string, String string2) {
         mercuryPageRegistration.Password.sendKeys(string);
         mercuryPageRegistration.SecondPassword.sendKeys(string2);
    }
    @Given("user clicks the SubmitButton")
    public void user_clicks_the_submit_button() {

          mercuryPageRegistration.Submit.click();

    }
    @Then("user very the info")
    public void user_very_the_info() {

        Driver.wait(2);
        Assert.assertTrue(mercuryPageRegistration.Mercury_Interactive.isDisplayed());

    }
}
