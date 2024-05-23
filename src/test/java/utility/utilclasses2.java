package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class utilclasses2 {

    public String testdata1(int a , int b) throws IOException {

        FileInputStream file = new FileInputStream("C:\\excel\\Book1.xlsx");

        String input = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
        return input;
    }
}
