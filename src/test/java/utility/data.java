package utility;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class data {

    public String testdata1(int i, int b) throws IOException
    {
        FileInputStream file = new FileInputStream("C:\\excel\\book1.xlsx");
        String cellvalue= WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(b).getStringCellValue();
        return cellvalue;
    }

    public void screeshot(WebDriver driver) throws IOException {

        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\selenium\\input.png");

        FileHandler.copy(screen,dest);
    }

}
