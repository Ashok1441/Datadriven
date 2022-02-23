package WorkBookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class IteratorDemo {
	
	@Test
	public void readAllData() throws Exception {
		
		FileInputStream fis = new FileInputStream("./DataFiles/Sample2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		 Iterator rowIte = sh.iterator();
		 while(rowIte.hasNext()) {
			Row row = (Row) rowIte.next();
			
			Iterator cellIte = row.cellIterator();
			
			while(cellIte.hasNext()) {
				
				Cell cell=(Cell) cellIte.next();
				switch (cell.getCellType()) 
				{
				case STRING:System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				break;
				}
				System.out.print("  ||  ");		
			}
			System.out.println();
			
		 }
		
	}

}
