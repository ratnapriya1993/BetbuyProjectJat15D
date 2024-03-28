package BestBuyPages;

import Base.ProjectSepecifications;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShopPage extends ProjectSepecifications {

    @FindBy(xpath = "//a[@title='Brands']")
    public WebElement brandsBtn;

    @FindBy(xpath = "//a[contains(@title,'A B')]")
    public WebElement brandNames;


    @FindBy(xpath = "//a[contains(@title,'Acer')]")
    public WebElement brandProducts;

    public ShopPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }
    public void selectItemFromShop() throws InterruptedException{

        Thread.sleep(2000);
        brandsBtn.click();
        Thread.sleep(2000);
        brandNames.click();
        Thread.sleep(2000);
        brandProducts.click();
        Thread.sleep(3000);

    }
}
