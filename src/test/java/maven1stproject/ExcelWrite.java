package maven1stproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWrite {
	public static String getdata (int row, int cell) throws Throwable {
		String v = null;
	//public static void main(String[] args) throws Throwable {
		
		
	File d = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		
		FileInputStream f = new FileInputStream(d);
		
		Workbook w = new XSSFWorkbook(f);
		
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
			v = sim.format(dateCellValue);
			}
			else {
				double numericCellValue = c.getNumericCellValue();
				
				long l =(long) numericCellValue;
				
				v= String.valueOf(l);
				
				
		//	}
	//	}
		
		
		
				
		
		
		
		
		
			
		
	}
		}
		return v;

	}
}

 