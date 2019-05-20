package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BrowserTest extends BaseTest
{
    @AfterEach
    void tearUp()
    {
        driver.quit();
    }

    @ParameterizedTest
    @MethodSource("drivers")
    void browserTest(Class driverClass)
    {
        setUpDriver(driverClass);

        this.driver.get("http://google.com");
        assertTrue(true);
    }
}