package base;

import POM.signinPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import utility.utilities;

public class launchBrowser {
    protected static WebDriver driver = new ChromeDriver();
    protected static signinPage loginpage = new signinPage(driver);
    protected static utilities util = new utilities();

    public static void home_page(){

        driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize();
    }
}
