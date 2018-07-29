package com.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class ReadXls {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(new File(System.getProperty("User.dir"))));
		HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFRow row = sheet.getRow(0);
		String cell = row.getCell(0).getStringCellValue();
		System.out.println(cell);
		workbook.close();

		Iterator<Row> iterator = sheet.rowIterator();
		while (iterator.hasNext()) {
             Row nxtRow = iterator.next();
             Iterator <Cell> cellIterator = nxtRow.iterator();
             
             while (cellIterator.hasNext())
             {
            	 Cell cell1 = cellIterator.next();
            	
            	 switch(cell1.getCellType())
            	 {
            	 case Cell.CELL_TYPE_STRING:
                   System.out.println();
                   break;
            	 case Cell.CELL_TYPE_BOOLEAN:
            		 System.out.println();
            		 break;
            	 case Cell.CELL_TYPE_NUMERIC:
            	     System.out.println();
            	     break;
            	 }
            	 
             }
		}
	}
}














