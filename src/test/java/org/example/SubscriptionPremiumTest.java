package org.example;
import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionPremiumTest extends BaseTest{
    @Test(groups = {"checkintest"})
    public void test8() throws Exception {
        WriteLogs.LogTestSteps("SubscriptionPremiumTest is incorrect");
        basePage
                .subscriptionPremium
                .openPage()
                .clickCloseButton()
                .clickMenuIconButton()
                .clickSubscriptionPremiumButton();



    }
}
