package org.example.sites.apptv.Pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuIconPage extends BasePage {

    public MenuIconPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.menuIconPage;
    }
    public WebElement getCloselField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public MenuIconPage clickCloseField() {
        waitForElement(getCloselField()).click();
        return Web.site.appTV.menuIconPage;
    }
    public WebElement getMenuIconField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public MenuIconPage clickMenuIconField() {
        waitForElement(getMenuIconField()).click();
        return Web.site.appTV.menuIconPage;
    }
    public MenuIconPage  windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.menuIconPage;
    }

}