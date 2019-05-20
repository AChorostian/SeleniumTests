package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class BrowserTest extends BaseTest
{
    @ParameterizedTest
    @MethodSource("drivers")
    void browserTest(Class driverClass)
    {
        setUpDriver(driverClass);

        driver.get("http://google.com");
        assertTrue(true);
    }
}