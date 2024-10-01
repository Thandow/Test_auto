package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements2 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser 
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//Create object for "username" editbox
		WebElement uidObj = driver.findElement(By.id("username"));
		
		//focus on editbox
		uidObj.clear();
		
		//To enter "Mindq"
		uidObj.sendKeys("Mindq");
		
		//To pause the execution
		Thread.sleep(3000);
		
		//To enter Systems
		uidObj.sendKeys("systems");
		
		//To pause execution
		Thread.sleep(3000);
		
		//To read value from "username" editbox
		String uid= uidObj.getAttribute("value");
		
		//To compare data
		if(uid.equals("Mindqsystems")) {
		System.out.println("sendKeys() - method will not overwrite the existing value" );
	}
	else {
		System.out.println("sendKeys() - method will overwrite the existing value");
				
	}
	}
}
