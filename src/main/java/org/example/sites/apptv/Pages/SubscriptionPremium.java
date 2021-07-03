package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubscriptionPremium extends BasePage{
    public SubscriptionPremium openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.subscriptionPremium;
    }

    public SubscriptionPremium  clickCloseButton() {
        waitForElement(getCloselButton("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button")).click();
        return Web.site.appTV.subscriptionPremium;
    }
    public WebElement getMenuIconButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"desktop-hamburger-menu\"]"));
    }

    public SubscriptionPremium clickMenuIconButton() {
        waitForElement(getMenuIconButton()).click();
        return Web.site.appTV.subscriptionPremium;
    }
    public WebElement getSubscriptionPremiumButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"navigation-hamburger_desktop\"]/li[1]/ul/li[1]/a/span"));
    }

    public SubscriptionPremium clickSubscriptionPremiumButton() {
        waitForElement(getSubscriptionPremiumButton()).click();
        return Web.site.appTV.subscriptionPremium;
    }
}
