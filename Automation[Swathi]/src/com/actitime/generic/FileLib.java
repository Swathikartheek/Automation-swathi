package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public static String data(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./File/TestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count=wb.getSheet(sheetname).getLastRowNum();
		String data = "";
		for(int i=1;i<=count;i++)
		{
			int count1=wb.getSheet(sheetname).getRow(row).getLastCellNum();
			for(int j=1;j<=count1;j++)
			{
				 data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
				  
			}
		}
		return data;	
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String data1=data("CustomerLogin",0,1);
		System.out.println(data1);
	}

	
	
}
