package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class signinPage {

    @FindBy(xpath= "//input[@type='text']")
    private WebElement UN;

    @FindBy(xpath= "//input[@type=\"password\"]")
    private WebElement PASS;

    @FindBy()
    private WebElement BUTTON;

    public signinPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void username(String userid){

        UN.sendKeys(userid);
    }

    public void password(String password){
        PASS.sendKeys(password);
    }

    public void signin(){
        BUTTON.click();
    }
}
