package BestBuyPages;

import Base.ProjectSepecifications;
import Utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends ProjectSepecifications {


    @FindBy(xpath="(//div//input[@type='text'])[1]")
    public WebElement fName;

    @FindBy (xpath="(//div//input[@type='text'])[2]")
    public WebElement lName;

    @FindBy (xpath="(//div//input[@type='text'])[3]")
    public WebElement email;
    @FindBy (xpath="//div//label[@for='newsletter']")
    public WebElement checkBox;

    @FindBy (xpath="//div//input[@type='password']")
    public WebElement password;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement submitBtn;

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    public void createAccount(String firstName, String lastName,String emailId, String pswd){
        sendkeys(fName, firstName);
        sendkeys(lName,lastName);
        sendkeys(email,emailId);
        sendkeys(password,pswd);
        click(submitBtn);
    }
}
