package ddt.framework;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		//To specify file location
		FileOutputStream fo = new FileOutputStream("E:\\studentdetail.sxlsx"); 
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("Student");
		
		XSSFRow row01 = ws.createRow(0);
		row01.createCell(0).setCellValue("St_name");
		row01.createCell(1).setCellValue("Subjects");
		
		XSSFRow row02 = ws.createRow(1);
		row02.createCell(0).setCellValue("Shudu");
		row02.createCell(1).setCellValue("Selenium");
		
		XSSFRow row03 = ws.createRow(2);
		row03.createCell(0).setCellValue("Lebo");
		row03.createCell(1).setCellValue("Tosca");
		
		wb.write(fo);
		
		System.out.println("Writing data in excel file completed");

	}

}
