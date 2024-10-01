package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		//To read all links from page
		List<WebElement> pgLinks= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are:" +pgLinks.size());
		int count=0;
		for (WebElement lnk: pgLinks) {
			if (!lnk.getText().isEmpty()) {
				count++;
			}
		}
		System.out.println("Total number of visible links are:"+ count);
		System.out.println("Total number of hidden links are:"+(pgLinks.size()-count));
		

	}

}
