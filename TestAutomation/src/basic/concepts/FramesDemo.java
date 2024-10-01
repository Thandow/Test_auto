package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get(null);
		driver.manage().window().maximize();
		
		//To Switch to frame
		driver.switchTo().frame("iframeResult");
		
		//To click on "try it" button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

	}

}
