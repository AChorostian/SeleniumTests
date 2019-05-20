package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
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
    WebDriver driver;

    static Stream<Arguments> drivers()
    {
        if (System.getProperty("os.name").toLowerCase().contains("mac"))
            return Stream.of(
                    Arguments.of(FirefoxDriver.class),
                    Arguments.of(ChromeDriver.class),
                    Arguments.of(OperaDriver.class),
                    Arguments.of(SafariDriver.class),
                    Arguments.of(HtmlUnitDriver.class),
                    Arguments.of(PhantomJSDriver.class)
            );
        else
            return Stream.of(
                    //Arguments.of(FirefoxDriver.class),
                    Arguments.of(ChromeDriver.class),
                    Arguments.of(OperaDriver.class),
                    Arguments.of(HtmlUnitDriver.class),
                    Arguments.of(PhantomJSDriver.class)
            );
    }

    void setUpDriver(Class driverClass)
    {
        try
        {
            driver = (WebDriver)driverClass.newInstance();
        }
        catch (Exception e) { System.out.println("Webdriver loading error");}
    }


}
