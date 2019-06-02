package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetHome extends BasePage
{
    private WebDriver driver;

    @FindBy(linkText = "Basic Auth")
    private WebElement basicAuthLink;

    @FindBy(linkText = "Basic Auth")
    private WebElement digestAuthLink;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthLink;

    public TheInternetHome(WebDriver driver)
    {
        super(driver);
    }

    public void goToFormAuth()
    {
        formAuthLink.click();
    }
}