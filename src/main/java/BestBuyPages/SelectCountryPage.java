package BestBuyPages;

import Base.ProjectSepecifications;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCountryPage extends ProjectSepecifications {


    public SelectCountryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    @FindBy(className="country-selection")
    public WebElement countryList;
    
    public void chooseCountry(String countryName) throws InterruptedException {

        java.util.List<WebElement> countryNames	= countryList.findElements(By.tagName("a"));

        for (WebElement country : countryNames) {
            WebElement requiredCountry= country.findElement(By.tagName("h4"));
            if(requiredCountry.getText().equalsIgnoreCase(countryName)) {
               click(requiredCountry);
               Thread.sleep(3000);
                break;
            }
        }
    }
}
