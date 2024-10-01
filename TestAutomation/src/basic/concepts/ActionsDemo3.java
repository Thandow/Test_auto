package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions actObj = new Actions(driver);
		
		actObj.moveToElement(ele).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Men's Kurtas")).click();
		
		

	}

}
