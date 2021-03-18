package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "input-email")
    WebElement emailIdField;

    @FindBy(id = "input-password")
    WebElement pswdField;

    @FindBy(css ="input[value= 'Login']")
    WebElement loginBtn;

    public WebElement emailIdField(){

        return emailIdField;
    }

    public WebElement pswdField(){

        return pswdField;
    }

    public WebElement loginBtn(){

        return loginBtn;
    }



}
