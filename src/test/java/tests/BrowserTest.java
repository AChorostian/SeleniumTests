package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.jupiter.api.Assertions.*;

class BrowserTest
{
    private static WebDriver driver;

    @AfterEach
    void tearDown()
    {
        driver.quit();
    }

    @Test
    void firefoxTest()
    {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        driver = new FirefoxDriver();
        assertTrue(true);
    }

    @Test
    void chromeTest()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        assertTrue(true);
    }

    @Test
    void safariTest()
    {
        System.setProperty("webdriver.safari.driver", "src/test/resources/safaridriver");
        driver = new SafariDriver();
        assertTrue(true);
    }

    @Test
    void operaTest()
    {
        System.setProperty("webdriver.opera.driver", "src/test/resources/operadriver");
        driver = new OperaDriver();
        assertTrue(true);
    }

    @Test
    void htmlUnitTest()
    {
        driver = new HtmlUnitDriver();
        assertTrue(true);
    }

    @Test
    void phantomJSTest()
    {
        System.setProperty("phantomjs.binary.path", "src/test/resources/phantomjs");
        driver = new PhantomJSDriver();
        assertTrue(true);
    }
}