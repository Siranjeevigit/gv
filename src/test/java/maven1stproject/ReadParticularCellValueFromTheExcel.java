package maven1stproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularCellValueFromTheExcel {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		//Row r = s.getRow(1);
		//Cell c = r.getCell(0);
		//System.out.println(c);
		
		for(int i=0; i<s.getPhysicalNumberOfRows();i++) {
	    Row r=s.getRow(i);
			
		for(int j=0; j<r.getPhysicalNumberOfCells(); j++) {
			Cell c =r.getCell(j);
			System.out.println(c);
			
		}
			
		}
		
		
		
	}

}
