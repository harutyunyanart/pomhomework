package test;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpLoginPage;
import pages.SignUpPage;

public class RegistrationTest extends BaseTest {

    @Test
    public void isOk() {

        HomePage homePage = new HomePage(super.driver);
        homePage.openURL();
        homePage.clickSignUpButton();
        SignUpLoginPage signUpLoginPage = new SignUpLoginPage(driver);
        signUpLoginPage.clickSignUpButton();
        signUpLoginPage.sendSignUpName("Artur");
        signUpLoginPage.sendSignUpEmailAddress("ArturHAA@mail.ru");
        SignUpPage signUpPage = signUpLoginPage.clickSignUpButton();
        signUpPage.sendLoginPassword("password");
        signUpPage.clickOnDayOfBirth();
        signUpPage.selectDayOfBirth("12");
        signUpPage.clickOnDayOfMonth();
        signUpPage.selectMonthOfBirth("April");
        signUpPage.clickOnYearOfDay();
        signUpPage.selectYearOfDay("1999");
        signUpPage.setOffers(true);
        signUpPage.setFirstName("Art");
        signUpPage.setLastName("Har");
        signUpPage.setAddress("AddressStreet2");
        signUpPage.setAddress2("Street3");
        signUpPage.setState("Oklahoma");
        signUpPage.setCity("Glendale");
        signUpPage.setZipCode("91020");
        signUpPage.setMobileNumber("043322133");
        signUpPage.clickCreateAccount();
        signUpPage.clickContinueButton();
        signUpPage.clickDeleteAccountButton();








    }
}
