package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.HomePage;
import BestBuyPages.LoginPage;
import BestBuyPages.SelectCountryPage;
import org.testng.annotations.Test;

import java.awt.*;

public class HomePageBottomLinksTest extends ProjectSepecifications {

    HomePage homePage;
    SelectCountryPage selectCountryPage;
    LoginPage loginPage;

    @Test
    public void bottomLinksNavigation() throws InterruptedException, AWTException {
        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.footerLinks();
    }
}
