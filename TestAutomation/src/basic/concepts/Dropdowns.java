package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		//To enter "hyd" in "from" dropdown
		driver.findElement(By.name("fromPlaceName")).sendKeys("Hyd");
		
		Thread.sleep(5000);
		
		//To select "HYDERABAD DARSHAN 3"
		driver.findElement(By.xpath("//span[text()='HYDERABAD DARSHAN 3']")).click();

	}

}
