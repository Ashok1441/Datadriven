package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateArrayListExcel {
	
	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet();
		
		ArrayList<Object[]> empData=new ArrayList<Object[]>();
		
		empData.add(new Object[]{"EmpID", "Name" ,"Job"});
		empData.add(new Object[]{001,"ashok", "QA Engineer"});
		empData.add(new Object[] {002,"satya","QA Enginner"});
		empData.add(new Object[] {003,"srinu","QA Engineer"});
		
		int rowCount=0;
		 
		for(Object[] emp:empData) {
		
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
		
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\example2.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println("Employee Excel sheet is created");
		
	}

}
