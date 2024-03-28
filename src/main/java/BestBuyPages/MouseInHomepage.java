package BestBuyPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseInHomepage {
	
	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	WebElement menu;
	
	@FindBy(id = "gh-search-input")
	WebElement searchbar;
	
	@FindBy(className = "header-search-button")
	WebElement searchbutton;
	
	@FindBy(className = "cart-label")
	WebElement cart;
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealoftheday;
	
	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement bestbuysells;
	
	@FindBy(xpath = "//span[contains(text(),\"More\")]")
	WebElement more;		
	
	@FindBy(xpath = "//span[text()='Recently Viewed']")
	WebElement recentlyviewed;


}
