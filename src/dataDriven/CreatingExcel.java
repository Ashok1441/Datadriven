package dataDriven;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {
	public static void main(String[] args) throws Throwable {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("TestSheet");
		
		
		Object empData[][]= { {"EmpID", "Name" ,"Job"},
		                  {001,"ashok", "QA Engineer"},
		                  {002,"satya","QA Enginner"},
		                  {003,"srinu","QA Engineer"},
		                  {004,"akash","Sprinklar"},
		                  {005,"venkat", "QA Engineer"}			
		                 };
//		int rows=empData.length;
//		int cells=empData[0].length;
//		
//		System.out.println(rows);
//		System.out.println(cells);
		
		//FOR LOOP
//		for(int r=0;r<rows;r++) {
//			XSSFRow row = sheet.createRow(r);
//			
//			for(int c=0;c<cells;c++) {
//				XSSFCell cell = row.createCell(c);
//				Object value = empData[r][c];
//				
//				if(value instanceof String)
//					cell.setCellValue((String)value);
//				if(value instanceof Integer)
//					cell.setCellValue((Integer)value);
//				if(value instanceof Boolean)
//					cell.setCellValue((Boolean)value);
//				
//			}
//		}
		
		//for each loop
		
		int rowCount=0;
		for(Object emp[]:empData) {
		
			XSSFRow row = sheet.createRow(rowCount++);
			int cellcount=0;
			
			for(Object value:emp) {	
				XSSFCell cell = row.createCell(cellcount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
			
		}
		
		
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\example1.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Employee Excel sheet is created");
		
		
   }
}
