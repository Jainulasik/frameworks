package com.Read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_practice {

	public static void All_data() throws IOException {
		
		File f = new File ("D:\\Details.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		int Pnr = sheet.getPhysicalNumberOfRows();
		
//		for (int i=0; i<Pnr; i++) {
//			
//			Row row = sheet.getRow(i);
//			
//			int pnc = row.getPhysicalNumberOfCells();
//			
//			for (int j=0; j<pnc ; j++) {
//				 
//				Cell cell = row.getCell(j);
		
		
		for (int i=0;i<=4;i++) {
		
		Row row1 = sheet.getRow(i);
		
		Cell cell1 = row1.getCell(0);
		
				
				CellType cellType = cell1.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					cell1.getStringCellValue();
					System.out.println(cell1.getStringCellValue());
				}
				else if (cellType.equals(CellType.NUMERIC)){
					double numericCellValue = cell1.getNumericCellValue();
					System.out.println(numericCellValue);
					
				
				
				
			}
		
		
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		All_data();
	}
		
		
		

	}
	
	
	
	
	
	
	
	
	

