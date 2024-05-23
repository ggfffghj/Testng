package base;

import POM.signinPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.utilclasses2;
import utility.utilities;

public class launching {
    protected static WebDriver driver = new ChromeDriver();
    protected static signinPage loginpage = new signinPage(driver);
    protected static utilclasses2 util = new utilclasses2();

    public static void home_page(){

        driver.get("https://www.facebook.com/login.php");
        driver.manage().window().maximize();
    }
}
