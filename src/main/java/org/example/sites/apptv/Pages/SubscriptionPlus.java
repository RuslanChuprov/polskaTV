package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubscriptionPlus extends BasePage{
    public SubscriptionPlus openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.subscriptionPlus;
    }

    public SubscriptionPlus  clickCloseButton() {
        waitForElement(getCloselButton("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button")).click();
        return Web.site.appTV.subscriptionPlus;
    }
    public WebElement getMenuIconButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"desktop-hamburger-menu\"]"));
    }

    public SubscriptionPlus clickMenuIconButton() {
        waitForElement(getMenuIconButton()).click();
        return Web.site.appTV.subscriptionPlus;
    }
    public WebElement getSubscriptionPlusButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"navigation-hamburger_desktop\"]/li[1]/ul/li[2]/a/span"));
    }

    public SubscriptionPremium clickSubscriptionPlusButton() {
        waitForElement(getSubscriptionPlusButton()).click();
        return Web.site.appTV.subscriptionPremium;
    }
}
