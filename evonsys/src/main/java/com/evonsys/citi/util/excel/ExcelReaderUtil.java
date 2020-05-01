package com.evonsys.citi.util.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.evonsys.citi.util.logger.LoggerUtil;
import com.evonsys.citi.util.resource.ResourceUtil;

public class ExcelReaderUtil {
	private Logger log = LoggerUtil.getLogger(ExcelReaderUtil.class);
	
	public Object[][] getExcelData(String excelLocation, String sheetName){
		try{
			Object dataSets[][] = null;
			FileInputStream file = new FileInputStream(new File(excelLocation));
			
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sh = wb.getSheet(sheetName);
			int totalRows=sh.getLastRowNum();
			System.out.println("totalRows"+totalRows);
			int totalColumns = sh.getRow(0).getLastCellNum();
			dataSets = new Object[totalRows+1][totalColumns];
			
			 Iterator<Row> rowIterator = sh.iterator();
			 int i=0;
			while(rowIterator.hasNext()){
				i++;
				 Row row = rowIterator.next();
				 Iterator<Cell> cellIterator = row.cellIterator();
				 int j=0;
				while(cellIterator.hasNext()){
					j++;
					Cell cell = cellIterator.next();
					switch(cell.getCellType()){
					case STRING:
						dataSets[i-1][j-1] = cell.getStringCellValue();
						break;
					case NUMERIC:
						dataSets[i-1][j-1] = cell.getNumericCellValue();
						break;
					case BOOLEAN:
						dataSets[i-1][j-1] = cell.getBooleanCellValue();
					case FORMULA:
						dataSets[i-1][j-1] = cell.getCellFormula();
						break;

					default:
						System.out.println("no matching cell type found");
						break;
					}
				}
				
			}
			return dataSets;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		ExcelReaderUtil	 excelHelper = new ExcelReaderUtil();
		 String excelLocation = ResourceUtil.getResourcePath("/src/main/java/com/evonsys/citi/testdata/TestData.xlsx");
		 Object[][] data = excelHelper.getExcelData(excelLocation, "Login");
		 System.out.println(data);
		
		
	}
}
