package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.security.Key;

public class LoginStepDefs {

    LoginPage loginPage= new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_bank_link"));

    }
    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() {
//create LoginPage object, Locate the elements

        loginPage.loginDropdown.click();

    }
    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {

//        loginPage.signInButton.click();
    }
    @Given("user provides {string} and {string}")
    public void user_provides_and(String string, String string2) {

        loginPage.username.sendKeys(string);
        loginPage.password.sendKeys(string2);

    }
    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {

        loginPage.loginButton.click();
    }

}
