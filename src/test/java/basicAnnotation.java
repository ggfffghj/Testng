import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class basicAnnotation
{
    @BeforeClass
    public void sumit(){
        System.out.println("Excuse Me");    }

    @BeforeTest
    public void shailes(){
        System.out.println("hello");
    }

    @Test
    public void shubham(){
        System.out.println("My name is shubham");
    }

    @Test
    public void vaishali(){
        System.out.println("My name is vaishali");
    }

    @AfterTest
    public void anna(){
        System.out.println("ok");
    }

    @AfterClass
    public void papa(){
        System.out.println("By");
    }

}
