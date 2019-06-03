package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookSignUp extends BasePage
{
    @FindBy(id = "user_email")
    private WebElement email;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(css = "input.btn.ptn-primary")
    private WebElement submit;

    public AddressBookSignUp(WebDriver driver)
    {
        super(driver);
    }

    public void SignUp()
    {
        email.sendKeys("jakisemail@abc.com");
        password.sendKeys("Qwer_=-awfaty123");
        password.submit();
        //submit.click();
    }
}
