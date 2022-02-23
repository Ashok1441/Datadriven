package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RewriteData {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\example.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("TestSheet").getRow(0).createCell(0).setCellValue(100);
		wb.getSheet("TestSheet").getRow(0).createCell(1).setCellValue("Pasula Ashok kumar");
		
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\example.xlsx");
		wb.write(fos);
		System.out.println("successfully rewrite the String value is Completed");
		

	}

}
