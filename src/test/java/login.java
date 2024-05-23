import POM.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.utilities;

import java.io.IOException;

public class login {
    WebDriver driver=new ChromeDriver();
   // loginpage object = new logipage(driver);
    loginpage log = new loginpage(driver);
    utilities util = new utilities();
    @BeforeMethod
    public void landing()
    {
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();
    }
    @Parameters ({ "url" })
    @Test
    public void login(String urlname) throws IOException {
        log.username(util.testdata1());
        log.pass(util.testdata2());
        log.clickbutton();
        System.out.println(urlname);


    }

    @AfterMethod
    public void screenshot() throws IOException {

        util.screenshot(driver);
        driver.quit();
    }
}

