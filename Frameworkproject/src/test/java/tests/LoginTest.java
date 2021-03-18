package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

import java.io.IOException;


public class LoginTest extends Base {
    Logger log;
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {

        log = LogManager.getLogger(LoginTest.class.getName());
        driver = initializeDriver();
        log.debug("Browser got launched");
        driver.get(prop.getProperty("url"));
        log.debug("Navigated to application URL");

    }

    @Test(dataProvider="getLoginData")
    public void login(String email, String password, String expectedResult) throws IOException, InterruptedException {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.myAccountDropdown().click();
        log.debug("Clicked on My Account dropdown");
        landingPage.loginOption().click();
        log.debug("Clicked on login option");

        Thread.sleep(3000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailIdField().sendKeys(email);
        log.debug("Email addressed got entered");
        loginPage.pswdField().sendKeys(password);
        log.debug("Password got entered");
        loginPage.loginBtn().click();
        log.debug("Clicked on Login Button");

        Thread.sleep(3000);

        //AccountPage accountPage = new AccountPage(driver);
        //Assert.assertTrue(accountPage.editAccInfoOption().isDisplayed());


        AccountPage accountPage = new AccountPage(driver);
        String actualResult = null;
        try {
            if (accountPage.editAccInfoOption().isDisplayed())
                log.debug("User got logged in");
                actualResult = "Successful";

        } catch (Exception e) {
            log.debug("User didn't log in");
            actualResult = "Failure";
        }

        Assert.assertEquals(actualResult, expectedResult);
        log.info("Login Test got passed");
    }

   @AfterMethod
   public void tearDown(){

        driver.close();
       log.debug("Browser got closed");
   }

    @DataProvider
    public Object[] getLoginData() {
        Object[][] data = {{"arun.selenium@gmail.com", "Second@123", "Successful"}, {"dummy@test.com", "dummy", "Failure"}};

        return data;

    }


}

