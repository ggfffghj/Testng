package base;

import POM.signinPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utility.utilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {
    protected WebDriver driver;
    protected  signinPage loginpage;
    protected  utilities util;

    @Parameters({"browser","url"})
    @BeforeMethod
    public void home_page(String browser, String url){

        if (browser.equalsIgnoreCase("chrome")) {
           // WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
         loginpage = new signinPage(driver);
        util = new utilities();

    }
}
