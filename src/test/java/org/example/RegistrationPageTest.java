package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationPageTest extends BaseTest {

    @Test(groups = {"checkintest"})
    public void test4() throws Exception {
        WriteLogs.LogTestSteps("RegistrationPageTest is incorrect");
        basePage
                .registrationPage
                .openPage()
                .clickCloseButton()
                .clickJoinButton()
                .clickQuickRegistField()
                .typeTextToEmailField(Credentials.EMAIL)
                .typeTextToFirstNameField(Credentials.FIRSTNAME)
                .typeTextToLastNameField(Credentials.LASTNAME)
                .typeTextToPasswordField(Credentials.PASSWORD)
                .clickSignUpButton();
    }

}
