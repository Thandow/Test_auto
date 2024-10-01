package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iFrameResult");
		
		//To click on "Try it" button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		
		//To read msg frm Java alert
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		
		//To close Java alert
		driver.switchTo().alert().dismiss();

	}

}
