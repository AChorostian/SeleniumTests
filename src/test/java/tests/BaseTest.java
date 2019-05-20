package tests;

import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.stream.Stream;

abstract class BaseTest
{
    public WebDriver driver;

    public static Stream<Arguments> drivers() {
        return Stream.of(
                Arguments.of(FirefoxDriver.class),
                Arguments.of(ChromeDriver.class),
                Arguments.of(OperaDriver.class),
                Arguments.of(SafariDriver.class),
                Arguments.of(HtmlUnitDriver.class),
                Arguments.of(PhantomJSDriver.class)
        );
    }

    public void setUpDriver(Class driverClass)
    {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        System.setProperty("webdriver.safari.driver", "src/test/resources/safaridriver");
        System.setProperty("webdriver.opera.driver", "src/test/resources/operadriver");
        System.setProperty("phantomjs.binary.path", "src/test/resources/phantomjs");

        try
        {
            driver = (WebDriver)driverClass.newInstance();
        }
        catch (Exception e) {}
    }
}
