package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.HomePage;
import BestBuyPages.LoginPage;
import BestBuyPages.SelectCountryPage;
import BestBuyPages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends ProjectSepecifications {

    SignUpPage signUpPage;
    HomePage homePage;
    SelectCountryPage selectCountryPage;
    LoginPage loginPage;
    @Test
    public void signUp() throws InterruptedException{

        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.navigateToLoginscreen();
        loginPage = new LoginPage(driver);
        loginPage.clickCretaAccountBtn();
        signUpPage= new SignUpPage(driver);
        signUpPage.createAccount("James","Bond","james.bond@mailinator.com","Bond@123");


    }
}
