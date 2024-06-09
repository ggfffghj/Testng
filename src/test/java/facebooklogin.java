import POM.signinPage;
import base.launchBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.utilities;

import java.io.IOException;

public class facebooklogin extends base.launchBrowser {
   // WebDriver driver = launchBrowser.driver;
   // signinPage loginpage = launchBrowser.loginpage;
   // utilities util = launchBrowser.util;

    //when we have to excecute same test multiple time with different data then instead of taking data every time from excel we can use data provider annotation.
    @DataProvider
    public Object[][] getdata(){

        Object[][] data = new Object[3][2];
        //1st set of data
        data[0][0]= "7350164673";
        data[0][1]= "aMahbuhs@1995";
        //2nd set of data
        data[1][0]= "9284689902";
        data[1][1]= "aShubham@1995";
        //3rd set of data
        data[2][0]="9823035489";
        data[2][1]="Vaishali@1996";

        return data;
    }

    @Test(dataProvider = "getdata")
    public void login(String user, String pass) throws IOException, InterruptedException {

        loginpage.username(user);
        loginpage.password(pass);
       // loginpage.signin();
       // Assert.assertEquals(driver.getTitle(),"Facebook");
        Thread.sleep(2000);
    }


}
