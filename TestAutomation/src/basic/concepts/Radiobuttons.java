package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//To click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(4000);
		
		//To address radio buttons
		List<WebElement> radioBtns=driver.findElements(By.className("_58mt"));
		System.out.println("Number of radiobuttons are :" +radioBtns.size());
		
		for (WebElement radioBtn:radioBtns) {
			System.out.println(radioBtn.getText());
			radioBtn.click();
			Thread.sleep(4000);
		}
		
		
		

	}

}
