package org.example.sites.apptv.Pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    public MainPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.mainPage;
    }


    public MainPage clickCloseButton() {
        waitForElement(getCloselButton("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button")).click();
        return Web.site.appTV.mainPage;
    }
}
