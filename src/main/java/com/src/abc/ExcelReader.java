package com.src.abc;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class ExcelReader {
	@Test
	public void readData() {
			String filepath="D:\\Nitin\\SeleniumTest\\src\\java\\resources";
			String fileName ="testData.xlsx";
			File file=new file (filepath+"\\"+filename);
			FileInputStream inp=new FileInputStream(file);
			Workbook wb=null;
			String extsn=fileName.substring(fliename.indexof("."));
			if(extsn.contentEquals(".xlsx")) {
				wb=new XSSFWorkbook(inp);
			}else if(extsn.contentEquals(".xls")) {
				wb=new HSSrWorkbook(np);
				
			}else {
				throw new RuntimeException("not a valid file");
			
			}
			Sheet sheet=wb.getSheet("sheetName");
			int rowscount=sheet.getLastRowNum()=sheet.getFirstRowNum();
			for(int i=0;I,rowcount=1;i++) {
				Row row=sheet.getRow(i);
				for(int j=0;j,row.getLastcellNum();j++) {
					Cell cell=row.getCell(j);
					int x=cell.getCellType();
					System.out.println(cell.getStringCellValue());
				}
			}
	}
}
				
				


