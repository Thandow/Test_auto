package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		//To create object for "search" editbox
		WebElement ele = driver.findElement(By.name("q"));
		
		Actions actObj= new Actions(driver);
		
		actObj.keyDown(Keys.SHIFT).sendKeys(ele, "mad youtube Channel").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(4000);
		
		actObj.sendKeys(Keys.ENTER).build().perform();
		

	}

}
