package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./File/TestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		for(int i=0;i<wb.getNumberOfSheets();i++)
		{
		Sheet sheet = wb.getSheetAt(i);
		System.out.println("Reading Sheet name :"+sheet.getSheetName());
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue()+"\t");
				break;
				case NUMERIC:System.out.println(cell.getNumericCellValue()+"\t");
				break;
				default:System.out.println("unsupported cell type\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		}
		wb.close();
		fis.close();
	}

}
