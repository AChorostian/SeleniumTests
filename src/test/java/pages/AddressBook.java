package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBook extends BasePage
{
    @FindBy(id = "sign-in")
    private WebElement signIn;

    public AddressBook(WebDriver driver)
    {
        super(driver);
    }

    public void goToSignIn()
    {
        signIn.click();
    }
}
