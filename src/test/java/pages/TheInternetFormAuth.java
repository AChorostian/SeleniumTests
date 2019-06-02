package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetFormAuth extends BasePage
{
    @FindBy(id = "username")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(className = "radius")
    private WebElement subm;

    public TheInternetFormAuth(WebDriver driver)
    {
        super(driver);
    }

    public void insertData(String log, String pass)
    {
        login.sendKeys(log);
        password.sendKeys(pass);
    }

    public void submit()
    {
        subm.submit();
    }
}
