package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeData {
	public static String path = "E:\\VisaProject\\GhanaNewVisaApp\\src\\main\\java\\com\\ghana\\app\\qa\\testdata\\GhanaVisaConsulateTestData.xlsx";
	public static XSSFWorkbook book;
	public static  XSSFSheet sheet ;
	
	public static Object[][] readUniqueData(String sheetName) throws IOException{
		FileInputStream fis = null;
		 fis = new FileInputStream(path);
		 book = new XSSFWorkbook(fis);		
		     sheet =book.getSheet(sheetName);		    
		    Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];	    
		    for (int i=0; i<sheet.getLastRowNum(); i++){	    	
		    	for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++){		    		
		    		data[i][k] = sheet.getRow(i+1).getCell(k).getStringCellValue();	    		
		    	}
		    }
		return data;		
		
	}
	
}
