package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPageTest extends BaseTest {
    private static AppTV basePage = Web.site.appTV;
    public SoftAssert softAssert = new SoftAssert();

    @Test(groups = {"checkintest"})
    public void test4() {
        basePage
                .registrationPage
                .openPage()
                .windowMaximize()
                .clickCloseField()
                .clickJoinField()
                .clickQuickRegistField()
                .typeTextToEmailField(Credentials.EMAIL)
                .typeTextToFirstNameField(Credentials.FIRSTNAME)
                .typeTextToLastNameField(Credentials.LASTNAME)
                .typeTextToPasswordField(Credentials.PASSWORD)
                .clickSignUpField();
    }

}
