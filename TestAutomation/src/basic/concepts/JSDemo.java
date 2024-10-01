package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//To navigate URL
		js.executeScript("window.location='https://login.salesforce.com'");
		
		//To enter "mindq" in username 
		js.executeScript("window.document.getElementById('username').value='Mindq'");
		
		Thread.sleep(4000);
		
		//Java alert
		js.executeScript("window.alert('Hi i am jsExecutor running')");
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//To click on "login" button
		WebElement ele = driver.findElement(By.id("Login"));
		js.executeScript("arguments[0].click();", ele);

	}

}
