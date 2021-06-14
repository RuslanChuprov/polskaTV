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

    public WebElement getCloselField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public CorrectLogin clickCloseField() {
        waitForElement(getCloselField()).click();
        return Web.site.appTV.correctLogin;
    }
    public CorrectLogin  windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.correctLogin;
    }
    public WebElement getJoinField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization-link\"]"));
    }
    public CorrectLogin clickJoinField() {
        waitForElement(getJoinField()).click();
        return Web.site.appTV.correctLogin;
    }
    public WebElement getLoginUserEmailField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div[1]/input"));
    }
    public RegistrationPage typeTextToLoginUserEmailField(String email) {
        waitForElement(getLoginUserEmailField()).sendKeys(email, Keys.ENTER);
        return Web.site.appTV.registrationPage;
    }

}
