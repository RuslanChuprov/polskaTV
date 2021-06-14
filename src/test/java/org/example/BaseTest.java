package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.web.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;


                                 //Use testNG
public class BaseTest {


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        Web.driver = new ChromeDriver(options);
        Web.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    /*@AfterMethod
    public void close() {Web.driver.quit();}*/

}
