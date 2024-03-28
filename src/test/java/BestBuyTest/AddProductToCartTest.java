package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.HomePage;
import BestBuyPages.LoginPage;
import BestBuyPages.SelectCountryPage;
import org.testng.annotations.Test;

import java.awt.*;

public class AddProductToCartTest extends ProjectSepecifications {

    HomePage homePage;
    SelectCountryPage selectCountryPage;

    @Test
    public void addProductToCartFromHomePage() throws InterruptedException, AWTException {
        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.selectRequiredProduct("phone","Open Box - Samsung Galaxy S20 FE 5G 128GB - Cloud Navy - Unlocked");
    }
}
