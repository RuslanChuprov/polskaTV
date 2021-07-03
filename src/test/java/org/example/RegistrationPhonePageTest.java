package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPhonePageTest extends BaseTest {

    @Test(groups = {"checkintest"})
    public void test5() throws Exception {
        WriteLogs.LogTestSteps("RegistrationPhonePageTest is incorrect");
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
