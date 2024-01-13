package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage {


    By nameInput = By.cssSelector("input[id=\"name\"]");
    By email = By.cssSelector("input[data-qa=\"email\"]");
    By password = By.cssSelector("input[data-qa=\"password\"]");
    By dayOfBirth = By.id("days");
    By dayOfMonth = By.id("months");
    By dayOfYear = By.id("years");
    By newsletter = By.cssSelector("label[for=\"newsletter\"]");
    By offers = By.cssSelector("label[for=\"optin\"]");
    By firstName = By.cssSelector("input[data-qa=\"first_name\"]");
    By lastName = By.cssSelector("input[data-qa=\"last_name\"]");
    By company = By.cssSelector("input[data-qa=\"company\"]");
    By address = By.cssSelector("input[data-qa=\"address\"]");
    By address2 = By.cssSelector("input[data-qa=\"address2\"]");
    By country = By.cssSelector("select[data-qa=\"country\"]");
    By state = By.cssSelector("input[data-qa=\"state\"]");
    By city = By.cssSelector("input[data-qa=\"city\"]");
    By zipCode = By.cssSelector("input[data-qa=\"zipcode\"]");
    By mobileNumber = By.cssSelector("input[data-qa=\"mobile_number\"]");
    By createAccountButton = By.cssSelector("button[data-qa=\"create-account\"]");


    public void sendLoginPassword(String name) {
        sendKeysOnElement(password, name);
    }


    public void clickOnDayOfBirth() {
        super.clickOnElement(dayOfBirth);

    }

    public void clickOnDayOfMonth(){
        super.clickOnElement(dayOfMonth);
    }

    public void clickOnYearOfDay(){
        super.clickOnElement(dayOfYear);
    }
    public void selectDayOfBirth(String day){
        selectOptionByText(dayOfBirth,day);
    }
    public void selectMonthOfBirth(String month){
        selectOptionByText(dayOfMonth,month);
    }
    public void selectYearOfDay(String year){
        selectOptionByText(dayOfYear,year);
    }


    public void selectYearOfBirth(String year){
        selectOptionByText(dayOfYear,year);
    }



    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openURL() {

    }

    public void setFirstName(String first_name) {
        sendKeysOnElement(firstName, first_name);
    }

    public void setLastName(String last_name) {
        sendKeysOnElement(lastName, last_name);
    }

    public void setCompanyName(String companyName) {
        sendKeysOnElement(company, companyName);
    }

    public void setAddress(String address_) {
        sendKeysOnElement(address, address_);
    }

    public void setAddress2(String address2_) {
        sendKeysOnElement(address2, address2_);
    }


    //??
    public void selectCountry(String countryText) {
        selectOptionByText(country, countryText);
    }

    public void setState(String state_) {
        sendKeysOnElement(state, state_);
    }

    public void setCity(String city_) {
        sendKeysOnElement(city, city_);
    }

    public void setZipCode(String zipCode_) {
        sendKeysOnElement(zipCode, zipCode_);
    }

    public void setMobileNumber(String mobilNumber) {
        sendKeysOnElement(mobileNumber, mobilNumber);
    }

    public void clickCreateAccount() {
        clickOnElement(createAccountButton);
    }
    public void setNewsLetter(boolean check){
        setCheckboxState(newsletter,check);
    }
    public void setOffers(boolean check){
        setCheckboxState(offers,check);
    }


}
