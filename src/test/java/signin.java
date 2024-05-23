import POM.signinPage;
import base.launchBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utility.utilities;

import java.io.IOException;

public class signin extends base.launchBrowser {
    WebDriver driver = launchBrowser.driver;
    signinPage loginpage = launchBrowser.loginpage;
    utilities util = launchBrowser.util;

    @Test
    public void login() throws IOException {

        home_page();
        loginpage.username(util.testdata1());
        loginpage.password(util.testdata2());
        loginpage.signin();
        Assert.assertEquals(driver.getTitle(),"Facebook");
    }

    @AfterMethod
    public void screenshot() throws IOException {

        util.screenshot(driver);
        driver.quit();
    }

}
