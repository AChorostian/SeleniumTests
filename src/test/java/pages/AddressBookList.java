package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookList extends BasePage
{
    @FindBy(linkText = "New Address")
    WebElement newAddress;

    public AddressBookList(WebDriver driver)
    {
        super(driver);
    }

    public void newAddressClick()
    {
        newAddress.click();
    }
}
