package pages;

import org.openqa.selenium.WebDriver;

public class DemoBlazeHome
{
    private WebDriver driver;


    public DemoBlazeHome(WebDriver driver)
    {
        this.driver = driver;
        driver.get("https://www.demoblaze.com/");
    }

}
