package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    private Duration timeout = Duration.ofSeconds(30);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(this.driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void writeInText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public abstract void openURL();

    public void sendKeysOnElement(By locator, String name) {
        this.getElement(locator).sendKeys(name);
    }

    protected void clickOnElement(By locator) {
        getElement(locator).click();

    }

    public void selectOptionByText(By locator, String text) {
        Select drop = new Select(getElement(locator));
        drop.selectByVisibleText(text);
    }

    public boolean isCheckBoxSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public void setCheckboxState(By locator,boolean check){
       if(isCheckBoxSelected(locator)!=check){
           clickOnElement(locator);
       }
    }

}
