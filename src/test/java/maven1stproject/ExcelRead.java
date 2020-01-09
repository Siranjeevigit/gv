package maven1stproject;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++) {
			Row r =s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells(); j++) {
				Cell c=r.getCell(j);
				int type = c.getCellType();
				
		if(type==0) {//String cell
			String stringCellValue =c.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(type==0) {
			if(DateUtil.isCellDateFormatted(c));
			Date dateCellValue =c.getDateCellValue();
			SimpleDateFormat sim= new SimpleDateFormat("dd-mm-yy");
			String format = sim.format(dateCellValue);
			System.out.println(format);
		}else {//numeric cell value
			double numericCellValue=c.getNumericCellValue();
			//converting double into long
			long l =(long) numericCellValue;
			//converting into long into String
			String v= String.valueOf(l);
			//System.out.println(v);
			
			
		}
				
			}
		}
		
		 
		
	}

	
		
	}
	
	 


