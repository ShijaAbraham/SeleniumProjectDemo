package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @FindBy(id = "input-email")
    WebElement emailField;

    @FindBy(id = "input-telephone")
    WebElement phoneField;

    @FindBy(id = "input-password")
    WebElement pswdField;

    @FindBy(id = "input-confirm")
    WebElement confirmPswdField;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueBtn;


    public WebElement firstNameField() {
        return firstNameField;
    }

    public WebElement lastNameField(){
        return lastNameField;
    }

    public WebElement emailField(){
        return emailField;
    }

    public WebElement phoneField() {
        return phoneField;
    }

    public WebElement pswdField(){
        return pswdField;
    }

    public WebElement confirmPswdField(){
        return confirmPswdField;
    }

    public WebElement continueBtn(){
        return continueBtn;
    }


}
