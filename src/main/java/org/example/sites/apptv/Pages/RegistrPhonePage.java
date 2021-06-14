package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RegistrPhonePage extends BasePage{
    public RegistrPhonePage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.registrPhonePage;
    }

    public WebElement getCloselField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public RegistrPhonePage clickCloseField() {
        waitForElement(getCloselField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public RegistrPhonePage  windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getJoinField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization-link\"]"));
    }
    public RegistrPhonePage clickJoinField() {
        waitForElement(getJoinField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getQuickRegistField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[1]/a"));
    }
    public RegistrPhonePage clickQuickRegistField() {
        waitForElement(getQuickRegistField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getCountryField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[2]/div/div/div/div"));
    }
    public RegistrPhonePage clickCountryField() {
        waitForElement(getCountryField()).click();
        return Web.site.appTV.registrPhonePage;
    }
    public WebElement getCanadaField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[2]/div/div/div/ul/li[2]/span[1]"));
    }
    public RegistrPhonePage clickCanadaField() {
        waitForElement(getCanadaField()).click();
        return Web.site.appTV.registrPhonePage;
    }
}
