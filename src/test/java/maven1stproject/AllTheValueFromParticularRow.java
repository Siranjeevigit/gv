package maven1stproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllTheValueFromParticularRow {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		for(int i=0; i<s.getPhysicalNumberOfRows();i++) {
		    Row r=s.getRow(0);
				
			
				Cell c =r.getCell(i);
				System.out.println(c);

}
}}