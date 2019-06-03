package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudTest extends BaseTest
{
    @ParameterizedTest
    @MethodSource("drivers")
    public void loginTest(Class driverClass)
    {
        setUpDriver(driverClass);

        driver.get("http://a.testaddressbook.com");
        AddressBook homePage = new AddressBook(driver);
        homePage.goToSignIn();

        AddressBookSignIn signInPage = new AddressBookSignIn(driver);
        signInPage.goToSignUp();

        AddressBookSignUp signUpPage = new AddressBookSignUp(driver);
        signUpPage.SignUp();

        AddressBookSignedUp signedUpPage = new AddressBookSignedUp(driver);

        assertTrue(signedUpPage.isLogged());
    }

    @ParameterizedTest
    @MethodSource("drivers")
    public void CreateTest(Class driverClass)
    {
        setUpDriver(driverClass);

        driver.get("http://a.testaddressbook.com");
        AddressBook homePage = new AddressBook(driver);
        homePage.goToSignIn();

        AddressBookSignIn signInPage = new AddressBookSignIn(driver);
        signInPage.goToSignUp();

        AddressBookSignUp signUpPage = new AddressBookSignUp(driver);
        signUpPage.SignUp();

        AddressBookSignedUp signedUpPage = new AddressBookSignedUp(driver);
        signedUpPage.gotoAddressesList();

        AddressBookList listPage = new AddressBookList(driver);
        listPage.newAddressClick();

        driver.findElement(By.id("awfawfwa"));

        assertTrue(true);
    }
}
