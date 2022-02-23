package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingAllData {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./DataFiles/Sample2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowNum = sh.getLastRowNum();
		short cellNum = sh.getRow(0).getLastCellNum();
		System.out.println(rowNum);
		System.out.println(cellNum);
		
		for(int i=0; i<=rowNum; i++) {
			Row row = sh.getRow(i);
			for(int j=0;j<cellNum;j++) {
				Cell cell = row.getCell(j);
				switch (cell.getCellType()) 
				{
				case STRING:System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				
				default:
					break;
				}
				System.out.print("      ");
				
			}
			System.out.println();
		}
	}
	

}
