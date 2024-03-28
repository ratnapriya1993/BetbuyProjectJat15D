package Base;

import Utilities.Utility;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class ProjectSepecifications extends Utility {
    @Parameters({"browser","url"})
    @BeforeMethod
    public void launchBrowser(String browser, String url) throws InterruptedException {
        browserLaunch(browser,url);
        Thread.sleep(2000);
    }

    @DataProvider(name = "readExcel")
    public String[][] getExceldata() throws IOException {
        String[][] data = readExcel(excelFile, excelSheet);
        return data;
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}
