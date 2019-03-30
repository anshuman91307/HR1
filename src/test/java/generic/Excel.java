package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String readData(String sheet,int m, int n) throws EncryptedDocumentException, IOException  {
		File f=new File("E:\\Seagate Backup\\Documents\\Finance & Personal\\Selenium\\HRMGT\\HRMA1\\data\\test data.xlsx");
		// created file above now create workbook
		Workbook wb=WorkbookFactory.create(f);
		// go to sheet, row and cell value
		String s = wb.getSheet(sheet).getRow(m).getCell(n).getStringCellValue();
		return s;
		// fetch the data
		
	}
}
