package jan22_ddt_crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	
	@Test
	public void readExcel() throws IOException
	{	
	
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/TestData.xlsx")));
	
		System.out.println(wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue());
		
		System.out.println(wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue());
		
		System.out.println(wb.getSheet("Users").getRow(2).getCell(0).getStringCellValue());
		
		System.out.println(wb.getSheet("Users").getRow(2).getCell(1).getNumericCellValue());
		
	}
	
}
