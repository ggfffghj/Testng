package POM;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

    @FindBy(xpath="//input[@type='text']")
    private WebElement un;
    @FindBy(xpath= "//input[@type=\"password\"]")
    private WebElement password;
    @FindBy(xpath="//button[@name='login']")
    private WebElement button;

   public  loginpage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }

    public void username(String userid){
        un.sendKeys(userid);
    }
    public void pass(String pass){
        password.sendKeys(pass);
    }

    public void clickbutton(){
        button.click();
    }




}
