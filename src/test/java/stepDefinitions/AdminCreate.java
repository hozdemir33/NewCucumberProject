package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminCreatesNewUser;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AdminCreate {

    AdminCreatesNewUser adminCreatesNewUser=new AdminCreatesNewUser();

    @Given("user clicks on sign in button section")
    public void user_clicks_on_sign_in_button_section() {

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_bank_link"));
    }
    @Given("user clicks on sign in UserName section")
    public void user_clicks_on_sign_in_user_name_section() {

        adminCreatesNewUser.AccountMenu.click();
        adminCreatesNewUser.SignIn.click();
        adminCreatesNewUser.UserName.sendKeys("CWoburn");

    }
    @Given("user clicks on newPassword section")
    public void user_clicks_on_new_password_section() {

        adminCreatesNewUser.NewPassword.sendKeys("Cw192837?");
    }
    @Given("user clicks on SignInButton")
    public void user_clicks_on_sign_in_button() {

        Driver.wait(2);
        adminCreatesNewUser.SignInButton.click();

    }
    @Given("user clicks on Admin Menu")
    public void user_clicks_on_admin_menu() {

          Driver.waitAndClick(adminCreatesNewUser.AdministrationMenu);
    }
    @Given("user clicks on the User Management")
    public void user_clicks_on_the_user_management() {

          Driver.waitAndClick(adminCreatesNewUser.UserManagment);

    }

    @Then("user verified USERS SIGN")
    public void user_verified_users_sign() {

     Driver.wait(2);

    boolean yes= adminCreatesNewUser.USERSsign.isDisplayed();

    if(yes=true){
        System.out.println("Correct");

    } else{
        System.out.println("false");
    }

    Driver.closeDriver();

    }

}
