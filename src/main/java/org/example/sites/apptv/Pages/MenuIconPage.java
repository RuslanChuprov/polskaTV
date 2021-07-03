package org.example.sites.apptv.Pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuIconPage extends BasePage {

    public MenuIconPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.menuIconPage;
    }

    public MenuIconPage clickCloseButton() {
        waitForElement(getCloselButton("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button")).click();
        return Web.site.appTV.menuIconPage;
    }

    public WebElement getMenuIconButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }

    public MenuIconPage clickMenuIconButton() {
        waitForElement(getMenuIconButton()).click();
        return Web.site.appTV.menuIconPage;
    }

}
