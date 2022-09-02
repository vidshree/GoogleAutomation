package com.testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {
	
	@Test
	public void excel() throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook(".//Excel//vidyatest.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();   //27
		int colCount=sheet.getRow(1).getLastCellNum(); //170
		System.out.println(rowCount);
		System.out.println(colCount);

		for(int i=1;i<=rowCount;i++)
		{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<colCount;j++)
		{
			try {
				String cellValue=row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			
			}
		//String cellValue=row.getCell(j).getStringCellValue();
		//System.out.println(cellValue);
		}
		}
		
	}

}
