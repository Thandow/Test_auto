package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames02 {

	public static void main(String[] args) {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		//To switch to frame
		driver.switchTo().frame("iframeResult");
		
		//To switch to child frame
		driver.switchTo().frame(0);
		
		//To click on menu
		driver.findElement(By.linkText("Menu")).click();

	}

}
