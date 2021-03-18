package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePageRegister;
import pageobjects.RegisterPage;
import resources.Base;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class RegisterTest extends Base {
    public WebDriver driver;

    @Test
    public void register() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        HomePageRegister homePageRegister = new HomePageRegister(driver);
        homePageRegister.myAccountDropdown().click();
        homePageRegister.registerOption().click();

        Thread.sleep(3000);

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.firstNameField().sendKeys(prop.getProperty("firstName"));
        registerPage.lastNameField().sendKeys(prop.getProperty("lastName"));
        registerPage.emailField().sendKeys(prop.getProperty("email"));
        registerPage.phoneField().sendKeys(prop.getProperty("telephone"));
        registerPage.pswdField().sendKeys(prop.getProperty("pswd"));
        registerPage.confirmPswdField().sendKeys(prop.getProperty("confirmpswd"));
        registerPage.continueBtn().click();
        driver.close();
    }

}
