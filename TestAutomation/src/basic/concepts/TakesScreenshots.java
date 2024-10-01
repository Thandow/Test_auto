package basic.concepts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date dt= new Date();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		FileHandler.copy(myFile, new File("./Defects\\fb"+df.format(dt)+".png"));
	}

}
