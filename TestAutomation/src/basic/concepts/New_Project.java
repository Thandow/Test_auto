package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Project {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//To pause the execution
		Thread.sleep(5000);
		
		//To Login to the system
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//To pause execution
		Thread.sleep(5000);
		
		//To click the dashboard 
		driver.findElement(By.linkText("Dashboard")).click();
	
		//To logout of the system
		driver.findElement(By.cssSelector("img[alt='Profile Picture")).click();
		driver.findElement(By.linkText("logout")).click();
		
	}

}
