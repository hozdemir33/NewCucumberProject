package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminCreatesNewUser {

    public AdminCreatesNewUser(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

   @FindBy(id = "account-menu")
    public WebElement AccountMenu;

    @FindBy(id="login-item")
    public WebElement SignIn;

   @FindBy(id="username")
    public WebElement UserName;

    @FindBy(id="password")
    public WebElement NewPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SignInButton;


    @FindBy(id="admin-menu")
    public WebElement AdministrationMenu;


    @FindBy(xpath = "//*[text()='User management']")
    public WebElement UserManagment;

    @FindBy(xpath = "//*[text()='Users']")
    public WebElement USERSsign;
}
