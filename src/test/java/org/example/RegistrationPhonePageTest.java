package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPhonePageTest extends BaseTest {
    private static AppTV basePage = Web.site.appTV;
    public SoftAssert softAssert = new SoftAssert();

    @Test(groups = {"checkintest"})
    public void test5() {
        basePage
                .registrPhonePage
                .openPage()
                .clickCloseButton()
                .clickJoinButton()
                .clickQuickRegistField()
                .clickCountryField()
                .clickCanadaField();
    }

}