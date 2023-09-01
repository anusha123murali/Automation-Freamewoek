package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./ex/book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
	  Sheet sheet = book.createSheet("Sheet3");
		 Row row = sheet.createRow(0);
		 Cell cell = row.createCell(0);
		 cell.setCellValue("API");
		 FileOutputStream fio=new FileOutputStream("./ex/book1.xlsx");
		 book.write(fio);
		
		
	}

}
