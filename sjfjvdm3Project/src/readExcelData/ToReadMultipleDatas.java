package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatas {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		 //To specify the path of excel file
		
		FileInputStream fis1=new FileInputStream("./testData/testdata.xlsx");
		 
		 Workbook wb1=WorkbookFactory.create(fis1); //To make the file ready to read
		 
		 Sheet sheet1 = wb1.getSheet("ipl"); //To go to the desired sheet
		 
		 int rowCount = sheet1.getLastRowNum();
		 System.out.println(rowCount);
		
		for(int i=1; i<=rowCount; i++)
		{
		 
		 FileInputStream fis=new FileInputStream("./testData/testdata.xlsx");
		 
		 Workbook wb=WorkbookFactory.create(fis); //To make the file ready to read
		 
		 Sheet sheet = wb.getSheet("ipl"); //To go to the desired sheet
		 
		Row row = sheet.getRow(i); //To go the desired row
		
		Cell cell = row.getCell(0); //To go the desired cell/column
		
		String data = cell.getStringCellValue(); //To read the data from desired cell/column
		
		System.out.println(data);
		Thread.sleep(1000);
		}
	}

}
