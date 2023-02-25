package jan22_ddt_crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws IOException
	{
	
		/*
		 *  Excel
		 *  	Apache POI- Read microsoft document
		 *  	JExcel	
		 * 
		 */
		
		
		File src=new File("./testdata/TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		/* XSSFWorkbook wb;
		XSSFSheet sh1;
		XSSFRow r1;
		XSSFCell c1;
		*/
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		int sheetCount=wb.getNumberOfSheets();
		
		System.out.println(sheetCount);
		
		XSSFSheet sh1=wb.getSheet("Login");
		
		int row=sh1.getPhysicalNumberOfRows();
		
		//int newRowCount=sh1.getLastRowNum();
		
		System.out.println("Total rows "+row);
		//System.out.println("Total rows new count "+newRowCount);
		
		XSSFRow r1=sh1.getRow(0);
		
		XSSFCell c1=r1.getCell(0);
		
		System.out.println(c1.getStringCellValue());
		
		
		
	}
	

}
