package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {
    By nameInput = By.cssSelector("input[name=\"name\"]");
    By emailInput = By.cssSelector("input[name=\"email\"]");
    By subjectInput = By.cssSelector("input[name=\"subject\"]");
    By yourMessageHereInput = By.cssSelector("textarea[name=\"message\"]");
    By submitButton = By.cssSelector("input[type=\"submit\"]");

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openURL() {

    }

    public WebElement getNameInput(){
        return super.driver.findElement(nameInput);
    }

    public WebElement getEmailInput(){
        return driver.findElement(emailInput);
    }

    public WebElement getSubjectInput(){
        return driver.findElement(subjectInput);
    }
    public WebElement getYourMessageHereInput(){
        return driver.findElement(yourMessageHereInput);
    }

    public WebElement getSubmitButton(){
        return driver.findElement(submitButton);
    }

    public void setSubmitButton(){
        getSubmitButton().sendKeys();
    }

    public void clickSubmitButton(){
        getSubmitButton().click();
    }

}
