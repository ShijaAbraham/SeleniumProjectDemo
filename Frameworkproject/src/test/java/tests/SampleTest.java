package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class SampleTest extends Base {
    public WebDriver driver;

    @Test
    public void sample() throws IOException, InterruptedException {
        System.out.println("Test Sample");
        driver = initializeDriver();

        driver.get("http://tutorialsninja.com/demo/");

        Thread.sleep(2000);
        driver.close();
    }

}
