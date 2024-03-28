package BestBuyPages;

import Base.ProjectSepecifications;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.List;

public class HomePage extends ProjectSepecifications {

    @FindBy(xpath="//span[@data-automation='sign-in-text']")
    public WebElement accountBtn;

    @FindBy (xpath="//div//input[@type='search']")
    public WebElement search;

    @FindBy(xpath="//div[@class='cart-icon']")
    public WebElement cartBtn;

    @FindBy(xpath = "//button//span[@data-automation='x-shop']")
    public WebElement shopBtn;

    @FindBy(xpath = "(//button[contains(@type,'submit')])[2]")
    public WebElement addToCartBtn;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void footerLinks() throws InterruptedException, AWTException {

        WebElement footerArea = driver.findElement(By.xpath("//html//body//div//div//div//footer"));
        List<WebElement> allLinks = footerArea.findElements(By.tagName("a"));
        System.out.println("=================="+allLinks.size());

        for (int i=0; i<allLinks.size();i++) {

            String links = allLinks.get(i).getAttribute("href");
            String linkName = allLinks.get(i).getText();
            System.out.println(linkName+"  Page Title is  " + driver.getTitle());
            driver.navigate().to(links);
            driver.navigate().back();
            driver.navigate().refresh();
            footerArea = driver.findElement(By.xpath("//html//body//div//div//div//footer"));
            allLinks = footerArea.findElements(By.xpath("//div[@class='style-module_primaryLinksContainer__IoRVe']//div//div//div//div//div//ul//li//a"));

        }
    }

    public void selectRequiredProduct(String product, String requiredProduct) throws InterruptedException, AWTException {

        new Actions(driver).click(search).sendKeys(product).sendKeys(Keys.ENTER).perform();
        Thread.sleep(10000);
        List<WebElement> eachProduct1= driver.findElements(By.xpath("//div//div[@class='productItemRow_hyNOs row_1mOdd']"));
        System.out.println(eachProduct1.size());
        Thread.sleep(5000);
        int count = 1;
        for(WebElement reqProduct:eachProduct1) {
            WebElement proName=reqProduct.findElement(By.xpath("(//div//div[@class='productItemName_3IZ3c'])["+count+"]"));

            if (proName.getText().trim().equalsIgnoreCase(requiredProduct.trim())) {
                Thread.sleep(5000);

                try {
                    new Actions(driver).moveToElement(proName).perform();
                }catch (Exception e){
                    e.printStackTrace();
                }
                Thread.sleep(1000);
                mouseWheel(1);
                Thread.sleep(1000);
                proName.click();
                //Thread.sleep(5000);
                driver.navigate().refresh();
                Thread.sleep(5000);

                try {
                    new Actions(driver).moveToElement(addToCartBtn).perform();
                }catch (Exception e){
                    e.printStackTrace();
                }
                mouseWheel(1);
                addToCartBtn.click();

                break;
            }count++;
        }
    }

    public void clickCartBtn(){
            click(cartBtn);
    }

    public void navigateToLoginscreen(){
            click(accountBtn);
    }

    public void clickShopBtn(){
        click(shopBtn);
    }


}
