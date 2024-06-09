import POM.signinpage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.shubham;

import java.io.IOException;
import java.sql.Driver;

public class fbloginpage {

    WebDriver driver=new ChromeDriver();
    signinpage1 log = new signinpage1(driver);
    shubham tester = new shubham();

    @BeforeMethod
    public  void landing(){
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void openpage() throws IOException {
        log.setid(tester.datadriven(0,1));
        log.setpass(tester.datadriven(1,1));
        log.click();

        String title=driver.getTitle();
        Assert.assertEquals(title,"facebook");
    }
    @AfterMethod
    public void close(ITestResult result) throws IOException {
       if(result.getStatus()==ITestResult.FAILURE) {
           tester.screenshot(driver);

       }

    }
}
