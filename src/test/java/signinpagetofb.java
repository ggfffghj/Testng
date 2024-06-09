import POM.signinpage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.data;

import java.io.IOException;

public class signinpagetofb {

    WebDriver driver = new ChromeDriver();
    signinpage1 log = new signinpage1(driver);
    data object =new data();

    @BeforeMethod
    public void landing(){

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void enterid() throws IOException, InterruptedException{
        log.setid(object.testdata1(0,1));
        log.setpass(object.testdata1(1,1));
        log.click();
        Assert.assertEquals(driver.getTitle(), "facebook");
    }

    @AfterMethod
    public void close(ITestResult result) throws IOException {

        if(result.getStatus()==ITestResult.FAILURE){
              object.screeshot(driver);
        }

        driver.quit();
    }

}
