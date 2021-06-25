package org.example;
import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PanelLeftMenuPageTest extends BaseTest{
    @Test(groups = {"checkintest"})
    public void test7() {
        basePage
                .panelLeftMenuPage
                .openPage()
                .clickCloseButton()
                .clickPanelLeftButton()
                .clickPremiumPackageButton();

    }
}
