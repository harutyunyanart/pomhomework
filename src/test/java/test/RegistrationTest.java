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
        signUpLoginPage.sendSignUpEmailAddress("ArturH@mail.ru");
        SignUpPage signUpPage = signUpLoginPage.clickSignUpButton();
        signUpPage.sendLoginPassword("password");
        signUpPage.clickOnDayOfBirth();
        signUpPage.selectDayOfBirth("12");

        signUpPage.clickOnDayOfMonth();
        signUpPage.selectMonthOfBirth("April");

        signUpPage.clickOnYearOfDay();
        signUpPage.selectYearOfDay("1999");



        signUpPage.setFirstName("FirstNume");
        signUpPage.setLastName("LastNume");

        signUpPage.setAddress("AddressStreet2");
        signUpPage.setAddress2("Street3");
        signUpPage.setState("Oklahoma");

//        signUpPage.setCity("washington");







    }
}
