package org.example;

import org.example.sites.apptv.AppTV;
import org.example.web.Web;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.Assert.assertTrue;

public class StartPageTest extends BaseTest {

        @Test(groups = {"checkintest"})
        public void test1 () throws Exception {
            WriteLogs.LogTestSteps("StartPageTest is incorrect");
            basePage
                    .startPage
                    .openPage()
                    .clickCloseButton()
                    .clickAdditionalField()
                    .clickTransitionField()
                    .clickMoviesField();

                    }
    }
