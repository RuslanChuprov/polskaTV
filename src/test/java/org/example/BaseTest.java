package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


//Use testNG
public class BaseTest {
    public SoftAssert softAssert = new SoftAssert();
    public static AppTV basePage = Web.site.appTV;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--start-maximized");
        Web.driver = new ChromeDriver(options);
        Web.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    /*@AfterMethod
    public void close() {Web.driver.quit();}*/

}
