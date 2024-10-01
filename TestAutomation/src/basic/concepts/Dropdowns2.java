package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
				
		//To click on create new account
		driver.findElement(By.linkText("Create new account")).click();
				
		Thread.sleep(4000);
		
		//To configure class with "Monthly" dropdown
		Select monthList = new Select(driver.findElement(By.id("month")));
		
		//To select "dec" using VisibleText
		monthList.selectByVisibleText("Dec");
		Thread.sleep(4000);
		
		//To select "march" using visible attribute
		monthList.selectByValue("3");
		Thread.sleep(4000);
		
		//To select "Jan" using index
		monthList.selectByIndex(0);

	}

}
