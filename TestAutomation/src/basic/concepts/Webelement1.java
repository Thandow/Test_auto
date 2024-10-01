package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
				
		//To focus on editbox
		driver.findElement(By.id("username")).click();
				
		//To enter "Mindq"
		driver.findElement(By.id("username")).sendKeys("Mindq");
		
		//To pause execution
		Thread.sleep(4000);
				
		//To read value from "username" editbox
		String uid=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("value in editbox is" +uid);
				
		//To clear the data from "username" 
		driver.findElement(By.id("username")).clear();

	}

}
