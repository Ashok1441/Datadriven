package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreatingXLSFile {
	public static void main(String[] args) throws Throwable {
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("Sheet!");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Hello Ashok ");
        sheet.getRow(0).createCell(1).setCellValue("Welcome to my World");
        sheet.getRow(0).createCell(2).setCellValue("Bye Bye");
        
        sheet.createRow(4);
        sheet.getRow(4).createCell(0).setCellValue("Hello Ashok ");
        sheet.getRow(4).createCell(1).setCellValue("Welcome to my World");
        sheet.getRow(4).createCell(2).setCellValue("Bye Bye");
        
        FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample1.xls");
        wb.write(fos);
        wb.close();
        fos.close();
        
        
        
	}

}
