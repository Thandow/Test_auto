package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNDemo {

	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//to click on "Forgotten password" link
		//driver.findElement(By.linkText("Forgotten password")).click();
		//driver.findElement(By.partialText("Forgotten")).click();
		//driver.findElement(By.partialText("password")).click();
		driver.findElement(By.partialLinkText("Ten pass")).click();

	}

}
