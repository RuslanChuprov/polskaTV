package org.example.sites.apptv.Pages;

import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PanelLeftMenuPage extends BasePage {
    public PanelLeftMenuPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.panelLeftMenuPage;
    }

    public PanelLeftMenuPage clickCloseButton() {
        waitForElement(getCloselButton("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button")).click();
        return Web.site.appTV.panelLeftMenuPage;
    }
    public WebElement getPanelLeftButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"desktop-hamburger-menu\"]"));
    }

    public PanelLeftMenuPage clickPanelLeftButton() {
        waitForElement(getPanelLeftButton()).click();
        return Web.site.appTV.panelLeftMenuPage;
    }
    public WebElement getPremiumPackageButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"navigation-hamburger_desktop\"]/li[1]/ul/li[1]/a/span"));
    }
    public PanelLeftMenuPage clickPremiumPackageButton() {
        waitForElement(getPremiumPackageButton()).click();
        return Web.site.appTV.panelLeftMenuPage;
    }
}
