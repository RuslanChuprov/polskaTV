package org.example.sites.apptv.Pages;
import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class RegistrationPage extends BasePage{
    public RegistrationPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.registrationPage;
    }

    public WebElement getCloselField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"frmCallMe_modal\"]/div/div/div[1]/button"));
    }
    public RegistrationPage clickCloseField() {
        waitForElement(getCloselField()).click();
        return Web.site.appTV.registrationPage;
    }

    public WebElement getJoinButton() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization-link\"]"));
    }
    public RegistrationPage clickJoinButton() {
        waitForElement(getJoinButton()).click();
        return Web.site.appTV.registrationPage;
    }
    public WebElement getQuickRegistField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[1]/a"));
    }
    public RegistrationPage clickQuickRegistField() {
        waitForElement(getQuickRegistField()).click();
        return Web.site.appTV.registrationPage;
    }

    public WebElement getEmailField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[1]/div[1]/input"));
    }
    public RegistrationPage typeTextToEmailField(String email) {
        waitForElement(getEmailField()).sendKeys(email, Keys.ENTER);
        return Web.site.appTV.registrationPage;
    }
    public WebElement getFirstNameField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[1]/div[2]/input"));
    }
    public RegistrationPage typeTextToFirstNameField(String firstname) {
        waitForElement(getFirstNameField()).sendKeys(firstname, Keys.ENTER);
        return Web.site.appTV.registrationPage;
    }
    public WebElement getLastNameField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[1]/div[3]/input"));
    }
    public RegistrationPage typeTextToLastNameField(String lastname) {
        waitForElement(getLastNameField()).sendKeys(lastname, Keys.ENTER);
        return Web.site.appTV.registrationPage;
    }
    public WebElement getPasswordField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/fieldset[1]/div[4]/div/input"));
    }
    public RegistrationPage typeTextToPasswordField(String password) {
        waitForElement(getPasswordField()).sendKeys(password, Keys.ENTER);
        return Web.site.appTV.registrationPage;
    }
    public WebElement getSignUpButon() {
        return Web.driver.findElement(By.xpath("//*[@id=\"authorization\"]/div/div[2]/form/div/input"));
    }
    public RegistrationPage clickSignUpButton() {
        waitForElement(getSignUpButon()).click();
        return Web.site.appTV.registrationPage;
    }
}
