package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlazeHome
{
    private WebDriver driver;

    @FindBy(id = "login2")
    WebElement logInLink;

    @FindBy(id = "signin2")
    WebElement SignUpLink;

    @FindBy(id = "loginusername")
    WebElement usernameInput;

    public DemoBlazeHome(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get("https://www.demoblaze.com/");
    }

    public void Login(String user, String pass)
    {
        logInLink.click();
    }

}
