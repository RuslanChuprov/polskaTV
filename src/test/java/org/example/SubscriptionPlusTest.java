package org.example;
import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionPlusTest extends BaseTest{
    @Test(groups = {"checkintest"})
    public void test9() throws Exception {
        WriteLogs.LogTestSteps("SubscriptionPlusTest is incorrect");
        basePage
                .subscriptionPlus
                .openPage()
                .clickCloseButton()
                .clickMenuIconButton()
                .clickSubscriptionPlusButton();



    }
}
