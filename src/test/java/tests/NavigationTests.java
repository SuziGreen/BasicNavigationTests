package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class NavigationTests {

    public WebDriver driver;

    @Test(description = "verify titles (chrome)")
    public void testChrome(){
        driver = BrowserFactory.getDriver("chrome");//1
        driver.get("https://google.com");//2
        String googleTitle = driver.getTitle();//3
        driver.get("https://etsy.com");//4
        String etsyTitle = driver.getTitle();//5
        driver.navigate().back();//6
        StringUtility.verifyEquals(googleTitle, driver.getTitle());//7
        driver.navigate().forward();//8
        StringUtility.verifyEquals(etsyTitle, driver.getTitle());//9


        driver.quit();
    }
    //@Test(description = "verify titles(firefox)")


}
