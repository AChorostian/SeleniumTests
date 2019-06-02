package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import pages.AddressBook;
import pages.AddressBookSignIn;
import pages.AddressBookSignUp;

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

        assertTrue(true);
    }
}
