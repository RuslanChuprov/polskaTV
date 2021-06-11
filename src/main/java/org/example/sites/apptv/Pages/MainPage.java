package org.example.sites.apptv.Pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    public MainPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.mainPage;
    }

    public WebElement getCloselField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public MainPage clickCloseField() {
        waitForElement(getCloselField()).click();
        return Web.site.appTV.mainPage;
    }
    public MainPage  windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.mainPage;
    }
}
