package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		//To read all links from page
		List<WebElement> pgLinks= driver.findElements(By.tagName("a"));
		
		if (pgLinks.size()==300) {
			System.out.println("Test passed. expected number of Links exists");
		}
		else {
			System.out.println("Test Failed, Actual number of pageLinks are:"+pgLinks.size());
		}

	}

}
