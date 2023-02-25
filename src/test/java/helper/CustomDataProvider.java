package helper;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "EmpDataSet")
	public static Object[][] getData() 
	{
		Object[][] arr = ExcelReader.getDataFromSheet("Emp");
		return arr;
	}

	/*
	 * @DataProvider(name="LoginDataSet") public static Object[][] getData1() {
	 * Object[][]arr=ExcelReader.getDataFromSheet("Login"); return arr; }
	 * 
	 */

}
