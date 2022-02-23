package dataDriven;

import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingXLSXFile {
public static void main(String[] args) throws Throwable {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("TestSheet");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Hello Ashok ");
        sheet.getRow(0).createCell(1).setCellValue("Welcome to my World");
        sheet.getRow(0).createCell(2).setCellValue("Bye Bye");
        
        sheet.createRow(4);
        sheet.getRow(4).createCell(0).setCellValue(123456);
        sheet.getRow(4).createCell(1).setCellValue("@#$%&*");
        sheet.getRow(4).createCell(2).setCellValue(779935.0123);
        
        FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
        wb.write(fos);
        wb.close();
        
        
        
	}

}
