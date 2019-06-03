package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookSignedUp extends BasePage
{
    @FindBy(linkText = "Addresses")
    WebElement addressesLink;

    public AddressBookSignedUp(WebDriver driver)
    {
        super(driver);
    }

    public void gotoAddressesList()
    {
        addressesLink.click();
    }

    public boolean isLogged()
    {
        try {
            driver.findElement(By.linkText("Sign out"));
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }
}
