package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    By signUpButton = By.cssSelector("a[href=\"/login\"]");
    By productsButton = By.cssSelector("a[href=\"/products\"]");
    By contactUs = By.cssSelector("a[href=\"/contact_us\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }


    public WebElement getSignUpButton() {
        return driver.findElement(signUpButton);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public WebElement getProductsButton() {
        return driver.findElement(productsButton);
    }

    public void clickProductsButton() {
        driver.findElement(productsButton).click();
    }

    public WebElement getContactUsButton() {
        return driver.findElement(contactUs);
    }

    public void clickContactUsButton() {
        getContactUsButton().click();
    }


}
