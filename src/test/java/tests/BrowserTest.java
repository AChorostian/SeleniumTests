package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class BrowserTest extends BaseTest
{
    @BeforeAll
    static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.phantomjs().setup();
        WebDriverManager.operadriver().setup();
        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
    }

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

        driver.get("http://google.com");
        assertTrue(true);
    }
}