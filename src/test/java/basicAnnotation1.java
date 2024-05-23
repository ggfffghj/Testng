import org.testng.annotations.*;

public class basicAnnotation1 {

    @BeforeSuite
    public void aai(){
        System.out.println("Good morning");
    }

    @BeforeMethod
    public void shubhada(){
        System.out.println("i am a girl");
    }
    @AfterMethod
    public void sam(){
        System.out.println("i am a boy");
    }

    @AfterSuite
    public void baba(){
        System.out.println("Good Night");
    }

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
