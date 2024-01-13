package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLoginPage extends BasePage {
    private By signUpNameInput = By.cssSelector("input[type=\"text\"]");
    private By signUpEmailAddressInput = By.cssSelector("input[data-qa=\"signup-email\"]");
    private By signUpButton = By.cssSelector("button[data-qa=\"signup-button\"]");
    private By loginEmailAddress = By.cssSelector("input[data-qa=\"login-email\"]");
    private By loginPassword = By.cssSelector("input[data-qa=\"login-password\"]");
    private By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");

    public SignUpLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/login");
    }

    public void sendSignUpName(String name) {
        sendKeysOnElement(signUpNameInput, name);
    }

    public void sendSignUpEmailAddress(String name) {
        sendKeysOnElement(signUpEmailAddressInput, name);
    }

    public void sendLoginEmailAddress(String name) {
        sendKeysOnElement(loginEmailAddress, name);
    }

    public void sendLoginPassword(String name) {
        sendKeysOnElement(loginPassword, name);
    }

    public SignUpPage clickSignUpButton(){
        super.clickOnElement(signUpButton);
        return new SignUpPage(driver);
    }
    public void clickLoginButton(){
        super.clickOnElement(loginButton);
    }


}
