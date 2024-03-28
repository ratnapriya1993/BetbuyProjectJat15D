package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.HomePage;
import BestBuyPages.LoginPage;
import BestBuyPages.SelectCountryPage;
import org.testng.annotations.Test;


public class LoginTest extends ProjectSepecifications {
    HomePage homePage;
    SelectCountryPage selectCountryPage;
    LoginPage loginPage;


    @Test
    public void login() throws InterruptedException {
        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.navigateToLoginscreen();
        loginPage = new LoginPage(driver);
        loginPage.login("james.bond@mailinator.com","Bond@123");
    }
}
