package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement ele= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actObj= new Actions (driver);
		
		//actObj.moveToElement(ele).contextClick().build().perform();
		actObj.contextClick(ele).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
		
		Thread.sleep(3000);
		
		String msg= driver.switchTo().alert().getText();
		System.out.println(msg);
		
		driver.switchTo().alert().accept();
		 

	}

}
