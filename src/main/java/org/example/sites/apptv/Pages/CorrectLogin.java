package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CorrectLogin extends BasePage {
    public CorrectLogin openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.correctLogin;
    }

    public WebElement getCloselButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public CorrectLogin clickCloseButton() {
        waitForElement(getCloselButton()).click();
        return Web.site.appTV.correctLogin;
    }
    public WebElement getJoinButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization-link\"]"));
    }
    public CorrectLogin clickJoinButon() {
        waitForElement(getJoinButton()).click();
        return Web.site.appTV.correctLogin;
    }
    public WebElement getLoginUserEmailField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div[1]/input"));
    }
    public CorrectLogin typeTextToLoginUserEmailField(String email) {
        waitForElement(getLoginUserEmailField()).sendKeys(email, Keys.ENTER);
        return Web.site.appTV.correctLogin;
    }
    public WebElement getLoginUserPasswordField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div[2]/div/input"));
    }
    public CorrectLogin typeTextToLoginUserPasswordField(String password) {
        waitForElement(getLoginUserPasswordField()).sendKeys(password, Keys.ENTER);
        return Web.site.appTV.correctLogin;
    }
}
