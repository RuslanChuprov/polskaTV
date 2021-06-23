package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;

public class MainPageTest extends  BaseTest {


    @Test (groups = {"checkintest"})
    public void test2 () {
        basePage
                .mainPage
                .openPage()
                .clickCloseField();
    }
}
