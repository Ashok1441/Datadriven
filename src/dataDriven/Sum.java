package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sum {
	public static void main(String[] args) throws Exception {
		
		String path = "D:\\Selenium\\ApachePOI\\DataFiles\\FormulaCell.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		sheet.createRow(6);
		sheet.getRow(6).createCell(2).setCellFormula("SUM(C2:C6)");
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		
		System.out.println("Done");
	}

}
