package org.example.sites.apptv.Pages;


import org.example.web.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {

    public StartPage openPage() {
        Web.driver.get("https://test.polskafirmatv.com/");
        return Web.site.appTV.startPage;
    }

    public WebElement getAdditionalField() {
         return Web.driver.findElement(By.xpath("//*[@id=\"details-button\"]"));
    }

    public StartPage clickAdditionalField() {
        waitForElement(getAdditionalField()).click();
        return Web.site.appTV.startPage;
    }

    public WebElement getTransitionField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"));
    }

    public StartPage clickTransitionField() {
        waitForElement(getTransitionField()).click();
        return Web.site.appTV.startPage;
    }

    public StartPage  windowMaximize () {
        Web.driver.manage().window().maximize();
        return Web.site.appTV.startPage;
    }

    public WebElement getMoviesField() {
        return Web.driver.findElement(By.xpath("//*[@id=\"navigation-main_navigation\"]/li[1]/a/span"));
    }

    public StartPage clickMoviesField() {
        waitForElement(getMoviesField()).click();
        return Web.site.appTV.startPage;
    }

}