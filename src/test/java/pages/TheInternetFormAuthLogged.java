package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheInternetFormAuthLogged extends BasePage
{
    public TheInternetFormAuthLogged(WebDriver driver)
    {
        super(driver);
    }

    public boolean iconFound()
    {
        try {
            driver.findElement(By.cssSelector("#content > div > h2 > i"));
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
