package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStepDefs {

    RegistrationPage registrationPage=new RegistrationPage();

    @Given("user is on the registration page")
    public void user_is_on_the_registration_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("gmbank_registration_Page"));
    }
    @Given("user enters ssn number as  {string}")
    public void user_enters_ssn_number_as(String string) {

        registrationPage.ssnTextbox.sendKeys(string);

    }
    @Given("user enters firstname {string} and lastname\"kus\"")
    public void user_enters_firstname_and_lastname_kus(String string) {

     registrationPage.firstnameTextbox.sendKeys(string);
     registrationPage.lastnameTextbox.sendKeys("kus");
    }
    @Given("user provides address {string}")
    public void user_provides_address(String string) {
        registrationPage.addressTextbox.sendKeys(string);

    }
    @Given("user provides phonenumber {string}")
    public void user_provides_phonenumber(String string) {

    registrationPage.mobilephoneTextbox.sendKeys(string);
    }
    @Given("user provides username {string}")
    public void user_provides_username(String string) {

registrationPage.usernameTextbox.sendKeys(string);
    }
    @Given("user provides email {string}")
    public void user_provides_email(String string) {
        Driver.waitAndSendText(registrationPage.emailTextbox,string);
    }
    @Given("user provides the firstPassword as {string} and secondPassword {string}")
    public void user_provides_the_first_password_as_and_second_password(String string, String string2) {

Driver.waitAndSendText(registrationPage.firstPasswordTextbox,string);
Driver.waitAndSendText(registrationPage.newPasswordTextbox,string2);
            }

    @Given("user clicks on the register button and see the success message as {string}")
    public void user_clicks_on_the_register_button_and_see_the_success_message_as(String string) {



        Driver.waitAndClick(registrationPage.registerButton);
        Assert.assertTrue(registrationPage.successMessageToastContainer.isDisplayed());

    }
}
