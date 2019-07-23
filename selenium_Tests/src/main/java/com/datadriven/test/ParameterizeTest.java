package com.datadriven.test;

import com.excel.utility.Read_XSL;

public class ParameterizeTest {

	public static void main(String[] args) {
	
		Read_XSL reader = new Read_XSL ("C:\\Users\\PSQA\\workspace\\selenium_Tests\\src\\main\\java\\com\\testdata\\half ebay test data.xlsx");
int rowCount = reader.getRowCount("Registra");

for (int rowNum = 2; rowNum<=rowCount; rowNum++){
	
String firstname= reader.getCellData("Registra", "firstname", 2);
	System.out.println("firstname");
}


	}

}
