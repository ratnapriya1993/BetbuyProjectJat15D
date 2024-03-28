package BestBuyPages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSepecifications;
//import pages.HomePage;

public class Bottonlinksvalidation extends ProjectSepecifications {
	
	@BeforeTest
	public void setup() {
		excelFile = "TestData";
		excelSheet = 3;
	}

	@Test(dataProvider = "readExcel")
	public void BottonLinksValidation(String link, String expTitle) {
		
		HomePage obj = new HomePage(driver);
		//((Object) obj).bottomLinksValidation(link, expTitle);

	}


}
