package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
    WebDriver driver = new ChromeDriver();

    //@AfterTest
    protected void quitBrowser(){
        driver.quit();
    }

}
