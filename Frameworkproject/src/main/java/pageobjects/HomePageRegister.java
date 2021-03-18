package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRegister {
    WebDriver driver;

    public HomePageRegister(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title ='My Account']")
    public
    WebElement myAccDropdown;

    @FindBy(linkText = "Register")
    WebElement registerOption;


    public WebElement myAccountDropdown() {
        return myAccDropdown;
    }

    public WebElement registerOption() {
        return registerOption;
    }


}
