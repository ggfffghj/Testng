package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage1 {
    @FindBy(xpath = "//input[@type='text']")
    private WebElement un;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement pass;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement botton;

    public signinpage1(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void setid(String id)
    {
        un.sendKeys(id);
    }
    public void setpass(String password)
    {
        pass.sendKeys(password);
    }

    public void click(){
        botton.click();


    }

}





