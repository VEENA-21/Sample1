
package StepDefinition;

import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.util.*;
 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pages.page1;

import java.io.File;
 
import io.cucumber.datatable.DataTable;
public class Sample3Scenario {
	
	@When("User Enters Login Credentials")
	public void user_enters_login_credentials(DataTable dataTable) throws Exception {
	    
		List<List<String>> credentials = credentials(
				"C:\\Users\\saimu\\eclipse-workspace\\ProjectName-3\\src\\test\\resources\\TestData.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		
		
		page1.enterusername(dataTable.cell(0, 0));
		page1.enterpassword(dataTable.cell(0, 1));
}
	
	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<List<String>>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<String>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					org.apache.poi.ss.usermodel.Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}	
}


