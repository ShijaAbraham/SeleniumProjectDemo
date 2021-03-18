package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class DemoTest extends Base{
    public WebDriver driver;

    @Test
        public void demo() throws IOException, InterruptedException {
        System.out.println("Test Demo");
        driver = initializeDriver();

        driver.get("http://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        Assert.assertTrue(false);

    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}
