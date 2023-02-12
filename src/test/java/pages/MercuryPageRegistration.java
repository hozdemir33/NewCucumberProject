package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MercuryPageRegistration {

    public MercuryPageRegistration(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='firstName']")
    public WebElement FirstName;

    @FindBy(xpath ="//*[@name='lastName']")
    public WebElement LastName;

    @FindBy(xpath ="//*[@name='phone']")
    public WebElement Phone;

    @FindBy(xpath ="//input[@id='userName']")
    public WebElement Email;

    @FindBy(xpath ="//input[@name='address1']")
    public WebElement Address;

    @FindBy(xpath ="//input[@name='city']")
    public WebElement City;

    @FindBy(xpath ="//input[@name='state']")
    public WebElement State;

    @FindBy(xpath ="//input[@name='postalCode']")
    public WebElement Zipcode;

    @FindBy(xpath ="//select")
    public WebElement Country;

    @FindBy(xpath ="//input[@id='email']")
    public WebElement UserName;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement Password;

    @FindBy(xpath ="//input[@name='confirmPassword']")
    public WebElement SecondPassword;

    @FindBy(xpath ="//input[@name='submit']")
    public WebElement Submit;

    @FindBy(xpath = "//div[@class='footer']")
    public WebElement Mercury_Interactive ;


}
