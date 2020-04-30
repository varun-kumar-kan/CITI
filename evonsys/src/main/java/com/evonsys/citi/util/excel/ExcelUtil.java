package com.evonsys.citi.util.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.resource.ResourceUtil;


public class ExcelUtil {
	
	private Logger log = LoggerUtil.getLogger(ExcelUtil.class);

	public Object[][] getExcelData(String excelLocation, String sheetName) {

		try {
			Object dataSets[][] = null;
			FileInputStream file = new FileInputStream(new File(excelLocation));
			// Create Workbook instance
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get sheet Name from Workbook
			XSSFSheet sheet = workbook.getSheet(sheetName);

			// count number of active rows in excel sheet
			int totalRow = sheet.getLastRowNum();
            System.out.println(totalRow);
			// count active columns in row
			int totalColumn = sheet.getRow(0).getLastCellNum();

			dataSets = new Object[totalRow][totalColumn-1];

			// Iterate Through each Rows one by one.
			Iterator<Row> rowIterator = sheet.iterator();
			int i = 0;
			while (rowIterator.hasNext()) {
				i++;
				// for Every row , we need to iterator over columns
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int j = 0;
				while (cellIterator.hasNext()) {
					               
					Cell cell = cellIterator.next();
					if (cell.getStringCellValue().contains("Execute")) {
						i = 0;
						break;
					}
					switch (cell.getCellType()) {
					case STRING:
						dataSets[i-1][j++] = cell.getStringCellValue();
						break;
					case NUMERIC:
						dataSets[i-1][j++] = cell.getNumericCellValue();
						break;
					case BOOLEAN:
						dataSets[i-1][j++] = cell.getBooleanCellValue();
					case FORMULA:
						dataSets[i-1][j++] = cell.getCellFormula();
						break;

					default:
						System.out.println("no matching cell type found");
						break;
					}
				}
			}
			return dataSets;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateResult(String excelLocation, String sheetName, String testCaseName, String testStatus){
		try{
			FileInputStream file = new FileInputStream(new File(excelLocation));
			// Create Workbook instance
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get sheet Name from Workbook
			XSSFSheet sheet = workbook.getSheet(sheetName);
			// count number of active rows in excel sheet
			int totalRow = sheet.getLastRowNum()+1;
			for(int i =1; i<totalRow; i++){
				XSSFRow r = sheet.getRow(i);
				String ce = r.getCell(0).getStringCellValue();
				if(ce.contains(testCaseName)){
					r.createCell(1).setCellValue(testStatus);
					file.close();
					log.info("result updated..");
					FileOutputStream out = new FileOutputStream(new File(excelLocation));
					workbook.write(out);
					out.close();
					break;
				}
			}
		}
		catch(Exception e){
		e.printStackTrace();	
		}
	}
	
	public static void print2D(Object[][] data) 
    { 
        // Loop through all rows 
        for (int i = 0; i < data.length; i++) 
        {
            // Loop through all elements of current row 
            for (int j = 0; j < data[i].length; j++) 
                System.out.print(data[i][j] + " "); 
            	System.out.println("");
        }
        
    } 
	
	public static void main(String[] args) {
		String sheetName = "Login";
	 ExcelUtil	 excelHelper = new ExcelUtil();
	 String excelLocation = ResourceUtil.getResourcePath("\\src\\main\\java\\com\\evonsys\\citi\\testdata\\TestData.xlsx");
	 Object[][] data = excelHelper.getExcelData(excelLocation.trim(), sheetName.trim());
	// print2D(data);
	
	 /*excelHelper.updateResult(excelLocation, "Status", "Login", "PASS");
	 excelHelper.updateResult(excelLocation, "Status", "Registration", "FAIL");
	 excelHelper.updateResult(excelLocation, "Status", "Add to Cart", "PASS");
	 */
	}
}