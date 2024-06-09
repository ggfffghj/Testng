package utility;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.logging.FileHandler;

public class utilities {

    public String testdata1() throws IOException {

        FileInputStream file = new FileInputStream("C:\\excel\\Book1.xlsx");
        String userid = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
        return userid;
    }

    public String testdata2() throws IOException {

        FileInputStream file = new FileInputStream("C:\\excel\\Book1.xlsx");

        String password = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        return password;
    }

    public void screenshot(WebDriver driver) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\selenium\\input.png");
        //FileUtils.copyFile(screenshot, destinationFile);
        FileUtils.copyFile(screenshot, destinationFile);

    }


}
