package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetRowCount {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//int count= sheet.getLastRowNum(); // this will give index number
	    int rowCount = sheet.getPhysicalNumberOfRows(); //this method will give actual number
		System.out.println(rowCount);
	
		wb.close();
		fis.close();			
	}
	
	

}
