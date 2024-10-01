package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	public static void main(String[] args) throws InterruptedException {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
		
		driver.findElement(By.id("myFile")).click();
		//driver.findElement(By.id("myFile")).sendKeys("E:\\sample.docx");
		//Thread.sleep(3000);
		
		

	}

}
