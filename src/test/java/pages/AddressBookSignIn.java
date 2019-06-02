package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookSignIn extends BasePage
{
    @FindBy(linkText = "Sign up")
    private WebElement signUp;

    public AddressBookSignIn(WebDriver driver)
    {
        super(driver);
    }

    public void goToSignUp()
    {
        signUp.click();
    }
}
