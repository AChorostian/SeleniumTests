package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

abstract class BaseTest
{
    protected WebDriver driver;

    protected static Stream<Arguments> drivers()
    {
        // local and travis options here
        if (System.getProperty("os.name").toLowerCase().contains("mac"))
            return Stream.of(
                    Arguments.of(FirefoxDriver.class)
//                    Arguments.of(ChromeDriver.class),
//                    Arguments.of(OperaDriver.class),
//                    Arguments.of(SafariDriver.class),
//                    Arguments.of(HtmlUnitDriver.class),
//                    Arguments.of(PhantomJSDriver.class)
            );
        else if (System.getProperty("os.name").toLowerCase().contains("windows"))
            return Stream.of(
                    Arguments.of(FirefoxDriver.class),
                    Arguments.of(ChromeDriver.class),
                    Arguments.of(OperaDriver.class),
                    Arguments.of(EdgeDriver.class),
                    Arguments.of(HtmlUnitDriver.class),
                    Arguments.of(PhantomJSDriver.class)
            );
        else
            return Stream.of(
                    Arguments.of(FirefoxDriver.class),
                    Arguments.of(ChromeDriver.class),
                    Arguments.of(HtmlUnitDriver.class),
                    Arguments.of(PhantomJSDriver.class)
            );
    }

    protected void setUpDriver(Class driverClass)
    {
        try
        {
            driver = (WebDriver)driverClass.newInstance();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
        catch (Exception e)
        {
            System.out.println("Webdriver loading error: "+e.getMessage());
        }
    }

    @BeforeAll
    protected static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.phantomjs().setup();
        WebDriverManager.operadriver().setup();

        if (System.getProperty("os.name").toLowerCase().contains("mac"))
            System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
    }

    @AfterEach
    protected void tearUp()
    {
        driver.quit();
    }
}
