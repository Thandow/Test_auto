package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		//use Javascript executer
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window scrollBy(0, 500");
		
		Thread.sleep(4000);
		
		//To read all checkboxes in page
		List<WebElement> chkBoxes=driver.findElements(By.name("Checkbox"));
		System.out.println("Number of checkboxes are: " +chkBoxes.size());
		
		for (WebElement chkBox: chkBoxes) {
			if (!chkBox.isSelected()) {
				chkBox.click();
			}
			
		}
		

	}

}
