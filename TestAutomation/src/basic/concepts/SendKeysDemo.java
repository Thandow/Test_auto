package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		//To create object for search
		WebElement ele = driver.findElement(By.name("q"));
		
		ele.sendKeys("selenium");
		Thread.sleep(3000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		ele.sendKeys(Keys.ENTER);

	}

}
