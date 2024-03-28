package BestBuyTest;

import Base.ProjectSepecifications;
import BestBuyPages.CheckOutPage;
import BestBuyPages.HomePage;
import BestBuyPages.LoginPage;
import BestBuyPages.SelectCountryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckOutTest  extends ProjectSepecifications {
    HomePage homePage;
    SelectCountryPage selectCountryPage;
    LoginPage loginPage;
    CheckOutPage checkOutPage;

    @Test
    public void checkOut() throws InterruptedException {
        selectCountryPage= new SelectCountryPage(driver);
        selectCountryPage.chooseCountry("canada");
        homePage = new HomePage(driver);
        homePage.navigateToLoginscreen();
        loginPage = new LoginPage(driver);
        loginPage.login("name1@mailinator.com","Name@123");
        Thread.sleep(5000);
        homePage.clickCartBtn();
        checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkoutDetails("James","Bond","Hyderabad","12345678954511");
    }
}
