package ddt.framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		//To read data
		FileInputStream fi = new FileInputStream("E:\\Studentdetails");
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Student");
		
		//To find number of rows
		int r = ws.getLastRowNum();
		System.out.println("Number of columns are: "+(r+1));
		
		//To find the number of columns
		int c = ws.getRow(0).getLastCellNum();
		System.out.println("Number of columns are: "+c);
		
		//To read Cell value
		for (int i=0; i<=r; i++) {
			for (int j=0; j<=c-1; j++) {
				XSSFCell myCell = ws.getRow(i).getCell(j);
				System.out.println(myCell.toString()+" ");
			}
			System.out.println();
		}
		wb.close();
		fi.close();
		

	}

}
