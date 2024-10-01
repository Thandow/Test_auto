package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo4 {

	public static void main(String[] args) {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement ele1= driver.findElement(By.id("draggable"));
		WebElement ele2= driver.findElement(By.id("draggable"));
		
		Actions actObj = new Actions(driver);
		
		actObj.dragAndDrop(ele1, ele2).build().perform();

	}

}
