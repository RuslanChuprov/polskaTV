package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CorrectLoginTest extends BaseTest {


    @Test(groups = {"checkintest"})
    public void test6() throws Exception {
        WriteLogs.LogTestSteps("CorrectLoginTest is incorrect");
        basePage
                .correctLogin
                .openPage()
                .clickCloseButton()
                .clickJoinButon()
                .typeTextToLoginUserEmailField(Credentials.EMAIL)
                .typeTextToLoginUserPasswordField(Credentials.PASSWORD);
    }
}