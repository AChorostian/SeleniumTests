package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetFormAuthLogged extends BasePage
{
    @FindBy(css = "#content > div > h2 > i")
    private WebElement icon;

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
