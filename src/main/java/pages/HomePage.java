package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    By signUpButton = By.cssSelector("a[href=\"/login\"]");
    By productsButton = By.cssSelector("a[href=\"/products\"]");
    By contactUs = By.cssSelector("a[href=\"/contact_us\"]");




    public HomePage(WebDriver driver) {
        super(driver);
    }


    //    By logoPage = By.cssSelector("img[src=\"/static/images/home/logo.png\"]");
    public static final String logo = "img[src=\"/static/images/home/logo.png\"]";
    public static final String signUpLoginButton = "a[href=\"/login\"]";
    public static final String loginToYourAccount = "div[class=\"login-form\"]";
    public static final String newUserSignUp = "form[action=\"/signup\"]";
    public static final String signUpButtonValidate = "button[data-qa=\"login-button\"]";
    public static final String loginButtonV = "button[data-qa=\"login-button\"]";
    public static final String ACCOUNTCREATED ="h2[data-qa=\"account-created\"] b";
    public static final String CONGRATULATIONS = "div[class=\"col-sm-9 col-sm-offset-1\"";
    public static final String CONTINUE_BUTTON = "a[data-qa=\"continue-button\"]";

    protected void waitTillElementIsVisible(WebElement element) {
        new WebDriverWait(this.driver, timeout).pollingEvery(Duration.ofMillis(200))
                .until(ExpectedConditions.visibilityOf(element));
    }


    protected WebElement findElementByCssSelector(String selector) {
        return this.driver.findElement(By.cssSelector(selector));
    }

    public WebElement getLogoVisible() {
        WebElement logoVisible = findElementByCssSelector(logo);
        waitTillElementIsVisible(logoVisible);
        return logoVisible;
    }

    public WebElement getSignUpLoginButtonVisible() {
        WebElement signUpLoginVisible = findElementByCssSelector(signUpLoginButton);
        waitTillElementIsVisible(signUpLoginVisible);
        return signUpLoginVisible;
    }

    public WebElement validationLoginTOYourAccountSection() {
        WebElement validationLoginSection = findElementByCssSelector(loginToYourAccount);
        waitTillElementIsVisible(validationLoginSection);
        return validationLoginSection;
    }

    public WebElement validationNewUserSignUp() {
        WebElement validationNewUser = findElementByCssSelector(newUserSignUp);
        waitTillElementIsVisible(validationNewUser);
        return validationNewUser;
    }

    public WebElement validationSignUpButton() {
        WebElement signUpButton = findElementByCssSelector(signUpButtonValidate);
        waitTillElementIsVisible(signUpButton);
        return signUpButton;
    }

    public WebElement validationLoginButton() {
        WebElement loginButton = findElementByCssSelector(loginButtonV);
        waitTillElementIsVisible(loginButton);
        return loginButton;
    }

    public WebElement validationAccountCreate() {
        WebElement account = findElementByCssSelector(ACCOUNTCREATED);
        waitTillElementIsVisible(account);
        return account;
    }

    public WebElement validateCongratulation(){
        WebElement congratulation = findElementByCssSelector(CONGRATULATIONS);
        waitTillElementIsVisible(congratulation);
        return congratulation;
    }

    public WebElement validationContinueButton(){
        WebElement continueButton = findElementByCssSelector(CONTINUE_BUTTON);
        waitTillElementIsVisible(continueButton);
        return continueButton;
    }


//    public WebElement validationAccountCreate(){
//
//    }


//    public WebElement getUrlHomePage(){
//        WebElement url = findElementByCssSelector()
//
//    }


    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }


    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }


}
