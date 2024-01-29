package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
    WebDriver driver = new ChromeDriver();
    protected void quitBrowser(){
        driver.quit();
    }

}
