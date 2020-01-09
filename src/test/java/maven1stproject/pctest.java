package maven1stproject;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class pctest {
	
public static String data(int row, int cell) throws Throwable {
		
		String v = null;
		
		File f = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		
		FileInputStream i = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(i);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		int type = c.getCellType();
		
		if(type==1) {
			
			 v = c.getStringCellValue();
			}
		else if(type==0) {
			
			if(DateUtil.isCellDateFormatted(c)) {
				
				Date dateCellValue = c.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				sim.format(dateCellValue);
			}
			else {
				double numericCellValue = c.getNumericCellValue();
				
				long l = (long)numericCellValue;
				 v = String.valueOf(l);
			}
		}
		return null;
		
	}


}
