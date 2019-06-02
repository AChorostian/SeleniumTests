package tests;

import pages.TheInternetFormAuth;
import pages.TheInternetFormAuthLogged;
import pages.TheInternetHome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest
{
    @ParameterizedTest
    @MethodSource("drivers")
    void loginTest(Class driverClass)
    {
        setUpDriver(driverClass);

        driver.get("http://the-internet.herokuapp.com");
        TheInternetHome homePage = new TheInternetHome(driver);
        homePage.goToFormAuth();

        TheInternetFormAuth loginPage = new TheInternetFormAuth(driver);
        loginPage.insertData("tomsmith","SuperSecretPassword!");
        loginPage.submit();

        TheInternetFormAuthLogged loggedPage = new TheInternetFormAuthLogged(driver);

        assertTrue(loggedPage.iconFound());
    }

    @ParameterizedTest
    @MethodSource("drivers")
    void loginFailTest(Class driverClass)
    {
        setUpDriver(driverClass);

        driver.get("http://the-internet.herokuapp.com");
        TheInternetHome homePage = new TheInternetHome(driver);
        homePage.goToFormAuth();

        TheInternetFormAuth loginPage = new TheInternetFormAuth(driver);
        loginPage.insertData("dawawfaw","SuperSecretPassword!");
        loginPage.submit();

        TheInternetFormAuthLogged loggedPage = new TheInternetFormAuthLogged(driver);

        assertFalse(loggedPage.iconFound());
    }
}
