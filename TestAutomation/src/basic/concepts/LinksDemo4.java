package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		//Create object for language links parent web element
		WebElement myLanguages = driver.findElement(By.id("SIvCob")); 
		
		List<WebElement> pgLinks= myLanguages.findElements(By.tagName("a"));
        System.out.println("Number of languages links are:"+ pgLinks.size());

	}

}
