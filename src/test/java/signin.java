import POM.signinPage;
import base.launchBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utility.utilities;

import java.io.IOException;

public class signin extends base.launchBrowser {
   // WebDriver driver = launchBrowser.driver;
   // signinPage loginpage = launchBrowser.loginpage;
   // utilities util = launchBrowser.util;

    @Test
    public void login() throws IOException, InterruptedException {
        Thread.sleep(5000);
        loginpage.username(util.testdata1());
        loginpage.password(util.testdata2());
        loginpage.signin1();
        Thread.sleep(7000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        Assert.assertEquals(actualTitle.toLowerCase(), expectedTitle.toLowerCase());
    }

    @AfterMethod
    public void screenshot(ITestResult result) throws IOException, InterruptedException {

       if (result.getStatus()==ITestResult.FAILURE){
           util.screenshot(driver);
       }
       driver.quit();
    }

}
