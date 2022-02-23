package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingFormula {
	
	public static void main(String[] args) throws Throwable {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue(9);
        sheet.getRow(0).createCell(1).setCellValue(2);
        sheet.getRow(0).createCell(2).setCellValue(8);
        sheet.getRow(0).createCell(3).setCellFormula("A1*B1*C1");
        
        FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Calculation.xlsx");
        wb.write(fos);
        wb.close();
        
        System.out.println("Calculation Excel sheet is created ");
	}

}
