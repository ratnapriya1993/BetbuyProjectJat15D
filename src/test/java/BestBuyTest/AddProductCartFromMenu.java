package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.HomePage;
import BestBuyPages.SelectCountryPage;
import BestBuyPages.ShopPage;
import org.testng.annotations.Test;

import java.awt.*;

public class AddProductCartFromMenu extends ProjectSepecifications {
    HomePage homePage;
    SelectCountryPage selectCountryPage;
    ShopPage shopPage;

    @Test
    public void addProductFromShop() throws InterruptedException, AWTException {
        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.clickShopBtn();
        shopPage = new ShopPage(driver);
        Thread.sleep(3000);
        shopPage.selectItemFromShop();
        homePage.selectRequiredProduct("","Acer Aspire 3 15.6\" Laptop - Silver (AMD RyzenTM 5 7520U/1TB SSD/16GB RAM/Windows 11 Home)");
    }
}
