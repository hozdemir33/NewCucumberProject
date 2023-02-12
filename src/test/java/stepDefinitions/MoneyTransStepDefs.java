package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MoneyTranPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MoneyTransStepDefs {

    MoneyTranPage moneyTranPage=new MoneyTranPage();

    @Given("user is on the GMIBANK")
    public void user_is_on_the_gmibank() {

        Driver.getDriver().get(ConfigurationReader.getProperty("GMIBANK"));
    }

    @Given("user clicks on the FromLink and chooses Checking Account and click on the checking account")
    public void user_clicks_on_the_from_link_and_chooses_checking_account_and_click_on_the_checking_account() {
        Driver.getDriver().get(ConfigurationReader.getProperty("GMIBANK"));

    }
    @Given("user places username {string} and password {string}")
    public void user_places_username_and_password(String string, String string2) {

         moneyTranPage.userN.sendKeys(string);
         moneyTranPage.passN.sendKeys(string2);
         moneyTranPage.signInN.click();


    }

    @Given("user clicks on My Operation sign")
    public void user_clicks_on_my_operation_sign() {

       Driver.waitAndClick(moneyTranPage.myOperationSign);

    }
    @Given("user clicks on Money transfer sign")
    public void user_clicks_on_money_transfer_sign() {

    moneyTranPage.MoneyTransferLink.click();
    Driver.waitAndClick(moneyTranPage.CheckingOption);


    }
    @Given("user clicks on the ToLink and clicks on the SavingAccount")
    public void user_clicks_on_the_to_link_and_clicks_on_the_saving_account() {

         Driver.waitAndClick(moneyTranPage.ToOption);

    }
    @Given("user clicks on the Balance place and sends {string}")
    public void user_clicks_on_the_balance_place_and_sends(String string) {

    }
    @Given("user writes the desciption of the transfering money")
    public void user_writes_the_desciption_of_the_transfering_money() {



    }
    @Given("user clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {


    }
    @Then("user verifies the success message")
    public void user_verifies_the_success_message() {


    }
}
