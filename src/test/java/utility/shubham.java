package utility;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class shubham
{
    public String datadriven(int i , int j) throws IOException
    {
        FileInputStream file = new FileInputStream("C:\\excel\\Book1.xlsx");
       String cellvalue= WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
       return cellvalue;
    }

    public void screenshot(WebDriver driver) throws IOException {
        File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File destination=new File("C:\\selenium\\failed.png");
        FileHandler.copy(screen,destination);

    }
}
