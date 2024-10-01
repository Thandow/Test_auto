package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledemo2 {

	public static void main(String[] args) {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//Create objects for Web tables
		WebElement myTable = driver.findElement(By.id("customers"));
		
		List<WebElement> tds =myTable.findElements(By.tagName("td"));
		for (WebElement td:tds) {
			System.out.println(td.getText());
		}

	}

}
