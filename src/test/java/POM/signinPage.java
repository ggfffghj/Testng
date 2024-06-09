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

    @FindBy(xpath="//button[@name='login']")
    private WebElement BUTTON;

    @FindBy(xpath = "//a[@href=\"/r.php?locale=en_GB&display=page\"]")
    private WebElement signup;

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")
    private WebElement name;

    @FindBy(xpath = "(//input[@type=\"text\"])[2]")
    private WebElement surname;

    @FindBy(xpath = "(//input[@type=\"text\"])[3]")
    private WebElement email;

    @FindBy(xpath = "(//input[@type=\"text\"])[4]")
    private WebElement reemail;

    @FindBy(xpath = "//input[@type=\"password\"]")
    private WebElement pass;

    @FindBy(xpath = "//select[@aria-label=\"Day\"]")
    private WebElement date;

    @FindBy(xpath = "//select[@aria-label=\"Month\"]")
    private WebElement month;

    @FindBy(xpath = "//select[@aria-label=\"Year\"]")
    private WebElement year;

    @FindBy(xpath = "(//input[@type=\"radio\"])[1]")
    private WebElement gender;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    private WebElement submit;


    public signinPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void username(String userid){

        UN.sendKeys(userid);
    }

    public void password(String password)
    {
        PASS.sendKeys(password);
    }

    public void signin1()
    {
        BUTTON.click();
    }

    public void click(){
        signup.click();
    }
    public void firstname(String username){
        name.sendKeys(username);
    }

    public void lastname(String last){

        surname.sendKeys(last);
    }

    public void emailaddress(String emailid){

        email.sendKeys(emailid);
    }

    public void retryemail(String emailid1){

        reemail.sendKeys(emailid1);
    }
    public void passwods(String pasword){
        pass.sendKeys(pasword);
    }
    public void datem(){
        date.click();
    }
    public void monthm(){
        month.click();
    }
    public void yearm(){
        year.click();
    }
    public void genderm(){
        gender.click();
    }
}
