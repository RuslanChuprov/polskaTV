package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;

public class MenuIconPageTest extends BaseTest{


    @Test (groups = {"checkintest"})
    public void test3 () {
        basePage
                .menuIconPage
                .openPage()
                .clickCloseButton()
                .clickMenuIconButton();
    }
}
