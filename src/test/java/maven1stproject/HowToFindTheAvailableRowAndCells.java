package maven1stproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToFindTheAvailableRowAndCells {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\Prasanth Ramasamy\\eclipse-workspace\\maven1stproject\\ExcelRead\\ExcelRead.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("Availble of rows" +rows);
		System.out.println("Find  Availble column from single row");
		Row row1 =s.getRow(0);
		int cells =row1.getPhysicalNumberOfCells();
		System.out.println("Available of cells" +cells);
		
		
	

}
}