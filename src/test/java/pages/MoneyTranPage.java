package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MoneyTranPage {

    public MoneyTranPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
   @FindBy(id="username")
   public WebElement userN;
    @FindBy(xpath="//*[@name='password']")
   public WebElement passN;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInN;
    @FindBy(xpath = "//*[text()='My Operations']")
    public WebElement myOperationSign;
    @FindBy(xpath = "//*[text()='Transfer Money']")
    public WebElement MoneyTransferLink;

    @FindBy(xpath = "//*[@id=\"fromAccountId\"]/option[2]")
    public WebElement CheckingOption;

    @FindBy(xpath = "//*[@id='toAccountId']/option[2]")
    public WebElement ToOption;


}
