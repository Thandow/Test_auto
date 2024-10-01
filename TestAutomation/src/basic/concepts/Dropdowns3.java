package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns3 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
						
		//To click on create new account
		driver.findElement(By.linkText("Create new account")).click();
						
		Thread.sleep(4000);
				
		//To configure class with "Monthly" dropdown
		Select yrList = new Select(driver.findElement(By.id("year")));
		
		//To select 
		String opt =yrList.getFirstSelectedOption().getText();
		
		if (opt.equals("2024")) {
			System.out.println("Expected year already selected");
		}
		else {
			yrList.selectByVisibleText("2024");
		}

	}

}
