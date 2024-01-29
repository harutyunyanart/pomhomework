package test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SignUpLoginPage;
import pages.SignUpPage;

import java.time.Duration;

public class HomePageTests extends BaseTest {

    //Implement all functionality, which need to execute before test
    @BeforeTest
    public void beforeTestSetup() {


    }

    //Implement all functionality, which need to execute after test
    @AfterTest
    public void afterTestSetup() {
        driver.quit();
    }

    @Test
    public void verifyIsLogoVisible() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.getLogoVisible().isDisplayed());


    }

    @Test
    public void validationURL() {
        HomePage homePage1 = new HomePage(super.driver);
        homePage1.openURL();
        String expectedUrl = "https://automationexercise.com/";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String originalUrl = this.driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(originalUrl, expectedUrl);
    }

    @Test
    public void validationSignUpLoginButton() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.getSignUpLoginButtonVisible().isDisplayed());
    }

    @Test
    public void validationSignUpLoginPageUrl() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        String expectedUrl = "https://automationexercise.com/login";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String originalUrl = this.driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(originalUrl, expectedUrl);
    }
    @Test
    public void validationLoginTOYourAccountSection() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.validationLoginTOYourAccountSection().isDisplayed());
    }

    @Test
    public void validationNewUserSignUp() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.validationNewUserSignUp().isDisplayed());

    }

    @Test
    public void validationSignUpButton() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.validationSignUpButton().isDisplayed());
    }
    @Test
    public void validationLoginButton() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.validationLoginButton().isDisplayed());
    }
    @Test
    public void validationAccountCreate() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(driver);
        signUpLoginPage.clickSignUpButton();
        signUpLoginPage.sendSignUpName("Artur");
        signUpLoginPage.sendSignUpEmailAddress("ArtuAbyssgdrsdfsc" +
                "fhhtdhkfhjrvhA@mail.ru");
        SignUpPage signUpPage = signUpLoginPage.clickSignUpButton();
        signUpPage.sendLoginPassword("password");
        signUpPage.clickOnDayOfBirth();
        signUpPage.selectDayOfBirth("13");
        signUpPage.clickOnDayOfMonth();
        signUpPage.selectMonthOfBirth("April");
        signUpPage.clickOnYearOfDay();
        signUpPage.selectYearOfDay("1999");
        signUpPage.setOffers(true);
        signUpPage.setFirstName("Artur");
        signUpPage.setLastName("Harutyunyan");
        signUpPage.setAddress("AddressStreet2");
        signUpPage.setAddress2("Str1253");
        signUpPage.setState("Oklahoma");
        signUpPage.setCity("Glendale");
        signUpPage.setZipCode("91020");
        signUpPage.setMobileNumber("043322133");
        signUpPage.clickCreateAccount();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.validationAccountCreate().isDisplayed(), "ACCOUNT CREATED!");


    }
    @Test
    public void validateCongratulation() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(driver);
        signUpLoginPage.clickSignUpButton();
        signUpLoginPage.sendSignUpName("Artur");
        signUpLoginPage.sendSignUpEmailAddress("hrdfdfdjdssdsdkdddjf@mail.ru");
        SignUpPage signUpPage = signUpLoginPage.clickSignUpButton();
        signUpPage.sendLoginPassword("password");
        signUpPage.clickOnDayOfBirth();
        signUpPage.selectDayOfBirth("13");
        signUpPage.clickOnDayOfMonth();
        signUpPage.selectMonthOfBirth("April");
        signUpPage.clickOnYearOfDay();
        signUpPage.selectYearOfDay("1999");
        signUpPage.setOffers(true);
        signUpPage.setFirstName("Artur");
        signUpPage.setLastName("Harutyunyan");
        signUpPage.setAddress("AddressStreet2");
        signUpPage.setAddress2("Str1253");
        signUpPage.setState("Oklahoma");
        signUpPage.setCity("Glendale");
        signUpPage.setZipCode("91020");
        signUpPage.setMobileNumber("043322133");
        signUpPage.clickCreateAccount();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.validateCongratulation().isDisplayed(), "Congratulations Your new account has been successfully created!\n" +
                "\n" +
                "You can now take advantage of member privileges to enhance your online shopping experience with us.");
    }
    @Test
    public void validationContinue() {
        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(driver);
        signUpLoginPage.clickSignUpButton();
        signUpLoginPage.sendSignUpName("Artur");
        signUpLoginPage.sendSignUpEmailAddress("hrdfdrrrssdkdddjf@mail.ru");
        SignUpPage signUpPage = signUpLoginPage.clickSignUpButton();
        signUpPage.sendLoginPassword("password");
        signUpPage.clickOnDayOfBirth();
        signUpPage.selectDayOfBirth("13");
        signUpPage.clickOnDayOfMonth();
        signUpPage.selectMonthOfBirth("April");
        signUpPage.clickOnYearOfDay();
        signUpPage.selectYearOfDay("1999");
        signUpPage.setOffers(true);
        signUpPage.setFirstName("Artur");
        signUpPage.setLastName("Harutyunyan");
        signUpPage.setAddress("AddressStreet2");
        signUpPage.setAddress2("Str1253");
        signUpPage.setState("Oklahoma");
        signUpPage.setCity("Glendale");
        signUpPage.setZipCode("91020");
        signUpPage.setMobileNumber("043322133");
        signUpPage.clickCreateAccount();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.validateCongratulation().isDisplayed());
    }


}
