package BestBuyPages;

import Base.ProjectSepecifications;
import Utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProjectSepecifications {


    @FindBy(xpath="//a[@class='_3Po4I create-account-link']")
    public WebElement createAccount;

    @FindBy (id="username")
    public WebElement emailField;

    @FindBy (xpath="//div//input[@type='password']")
    public WebElement password;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement submitBtn;

    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }

    public void login(String userName, String pwsd) throws InterruptedException {

        sendkeys(emailField,userName);
        sendkeys(password,pwsd);
        submitBtn.click();
    }

    public void clickCretaAccountBtn(){
        click(createAccount);
    }
}
