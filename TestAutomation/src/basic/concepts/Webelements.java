package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		//To focus on "username" editbox
		driver.findElement(By.id("username")).click();
		
		//To enter "Mindq" in "username" editbox
		driver.findElement(By.id("username")).sendKeys("Mindq");
		
		//To read value from "username" editbox
		String uid=driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(uid);
		
		//To clear the data from "username" 
		driver.findElement(By.id("username")).clear();
		

	}

}
