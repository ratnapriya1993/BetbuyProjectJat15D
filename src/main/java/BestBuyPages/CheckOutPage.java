package BestBuyPages;

import Base.ProjectSepecifications;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends ProjectSepecifications {
    @FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
    public WebElement checkOutBtn;

    @FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
    public WebElement continueToPaymentBtn;

    @FindBy(xpath = "//input[contains(@id,'number')]")
    public WebElement cNo;

    @FindBy(xpath="//input[@id='first-name']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='last-name']")
    public WebElement lastName;

    @FindBy(xpath = "//span[contains(.,'Place Your Order')]")
    public WebElement placeOrder;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }
    public void checkoutDetails(String fName, String lName, String add, String cardNo) {
        checkOutBtn.click();
        continueToPaymentBtn.click();
        cNo.sendKeys(cardNo);
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        new Actions(driver).sendKeys(add).pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        placeOrder.click();
    }
}
