import POM.loginpage;
import POM.signinPage;
import base.launchBrowser;
import base.launching;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.utilclasses2;
import utility.utilities;
import java.io.IOException;

public class fblogin extends base.launching {
    WebDriver driver = launching.driver;
    signinPage loginpage = launching.loginpage;
    utilclasses2 util = launching.util;
    @BeforeMethod
    public void landing()
    {
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();
    }

    @Test
    public void login() throws IOException {
        loginpage.username(util.testdata1(0,1));
        loginpage.password(util.testdata1(1,1));
       loginpage.signin();

    }

    //@AfterMethod
  //  public void screenshot(){

   //     driver.quit();
  //  }

}