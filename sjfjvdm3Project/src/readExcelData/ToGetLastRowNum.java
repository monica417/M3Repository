package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetLastRowNum {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./testData/testdata.xlsx");
		 
		 Workbook wb=WorkbookFactory.create(fis); //To make the file ready to read
		 
		 Sheet sheet = wb.getSheet("ipl"); //To go to the desired sheet
		 
		 int rowCount = sheet.getLastRowNum();
		 System.out.println(rowCount);
	}

}
