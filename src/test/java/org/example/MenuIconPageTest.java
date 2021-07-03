package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;

public class MenuIconPageTest extends BaseTest{


    @Test (groups = {"checkintest"})
    public void test3 () throws Exception {
        WriteLogs.LogTestSteps("MenuIconPageTest is incorrect");
        basePage
                .menuIconPage
                .openPage()
                .clickCloseButton()
                .clickMenuIconButton();
    }
}
