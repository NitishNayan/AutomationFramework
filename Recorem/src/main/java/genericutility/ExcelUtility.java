package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String getStringDataFromExcel(String SheetName, int rowNum, int colNum)throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./");
		Workbook wk = WorkbookFactory.create(fis);
		String url = wk.getSheet(SheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return url;
	}

	public boolean getBooleanDataFromExcel(String sheeName, int rowNum, int colNum)throws EncryptedDocumentException, IOException 
	{

		FileInputStream fis = new FileInputStream("./");
		Workbook wk = WorkbookFactory.create(fis);
		boolean b = wk.getSheet(sheeName).getRow(rowNum).getCell(colNum).getBooleanCellValue();
		return b;
	}

	public double getNumericDataFromExcel(String sheetName, int rowNum, int colNum)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./");
		Workbook wk = WorkbookFactory.create(fis);
		double x = wk.getSheet(sheetName).getRow(rowNum).getCell(colNum).getNumericCellValue();
		return x;
	}

	public LocalDateTime getDateAndTimeFromExcel(String sheetName, int rowNum, int colNum)throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./");
		Workbook wk = WorkbookFactory.create(fis);
		LocalDateTime locl = wk.getSheet(sheetName).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
		return locl;
	}
}
