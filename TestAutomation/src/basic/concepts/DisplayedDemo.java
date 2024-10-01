package basic.concepts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DisplayedDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		System.out.println("Before selection of Zulu link");
		if(driver.findElement(By.linkText("isiZulu")).isDisplayed()) {
			System.out.println("Zulu language page is visible in the link");
		}
		else {
		System.out.println("Zulu language page is invisible in the link");
		}
		//To click the isiZulu link
		driver.findElement(By.linkText("isiZulu")).click();
		Thread.sleep(4000);
		
		System.out.println("After selection of the isiZulu link");
		
		try {
		if(driver.findElement(By.linkText("isiZulu")).isDisplayed()) {
		System.out.println("Zulu language page is visible in the link");
		}
		}
		catch (Exception e) {
		System.out.println("Zulu language page is invisible in the link");
		}
		finally {
			File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Date dt= new Date();
			DateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			FileHandler.copy(myFile, new File("./Defects\\google"+df.format(dt)+".png"));
		}
	}

}
