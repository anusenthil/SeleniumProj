package org.excel.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File excelloc = new File("E:\\Selenium\\Day1\\MavenStart\\ExcelSheets\\Test.xlsx");
		FileInputStream strm = new FileInputStream(excelloc);
		Workbook wrkbk = new XSSFWorkbook(strm);
		Sheet sht = wrkbk.getSheet("TestData");
		
		for (int i = 0; i < sht.getPhysicalNumberOfRows(); i++) {
			
			Row row = sht.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cel = row.getCell(j);
				System.out.println(cel);
				
			}

		}
				
		
		
		

	}

}
