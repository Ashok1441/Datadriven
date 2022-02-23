package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelValue {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestSheet");
		sheet.getRow(1).createCell(0).setCellValue("Pasula Ashok kumar");
		
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
    	wb.write(fos);
		
		
		System.out.println("done writing in excel sheet");
	}
}
