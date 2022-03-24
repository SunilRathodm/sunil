package b6FileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {

	public static void main(String[] args) throws IOException {


		String path=System.getProperty("user.dir");
		String final_path =path +"\\driver\\file.xlsx";
		
		
		
		File f=new File(final_path);         //provide path of file 
		FileInputStream fi=new FileInputStream(f);
		
		
		XSSFWorkbook workbook =new XSSFWorkbook(fi);   //Creating object to read excel file
	    XSSFSheet sheet = workbook.getSheet("sheet1");

	    
//read excel value by row and cell 	    
		String data=sheet.getRow(1).getCell(0).getStringCellValue(); //row and cell value start from 0
		System.out.println(data);
		
		String value1=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value1);
	
		 String data2 = sheet.getRow(4).getCell(0).getStringCellValue();
		 System.out.println(data2);
		 
		 int value2=(int) sheet.getRow(4).getCell(1).getNumericCellValue();     //type cast in int 
		// double value3= sheet.getRow(4).getCell(1).getNumericCellValue();   
		 System.out.println(value2);
		 
		short x = sheet.getRow(0).getLastCellNum();      //getLastCellNum starting from 1
		System.out.println(x);
		 
		int y = sheet.getLastRowNum();             //** getLastRowNum  starting from 0
		System.out.println(y);    
		
		System.out.println(sheet.getPhysicalNumberOfRows());   //** getPhysicalNumberOfRows  starting from 1
		
		
		
		
		
	}
	
	
	

}
