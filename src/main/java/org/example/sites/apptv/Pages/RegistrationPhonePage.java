package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPhonePage extends BasePage{
    public RegistrationPhonePage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.registrPhonePage;
    }

    public WebElement getCloselButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public RegistrationPhonePage clickCloseButton() {
        waitForElement(getCloselButton()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public RegistrationPhonePage windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getJoinButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization-link\"]"));
    }
    public RegistrationPhonePage clickJoinButton() {
        waitForElement(getJoinButton()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getQuickRegistField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[1]/a"));
    }
    public RegistrationPhonePage clickQuickRegistField() {
        waitForElement(getQuickRegistField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getCountryField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[2]/div/div/div/div"));
    }
    public RegistrationPhonePage clickCountryField() {
        waitForElement(getCountryField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getCanadaField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[2]/div/div/div/ul/li[2]/span[1]"));
    }
    public RegistrationPhonePage clickCanadaField() {
        waitForElement(getCanadaField()).click();
        return Web.site.appTV.registrPhonePage;
    }
}
