package basic.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		
		System.out.println("Before selection of Zulu link");
		if(driver.findElement(By.linkText("isiZulu")).isDisplayed()) {
			System.out.println("Zulu language page is visible in the link");
		}
		else {
		System.out.println("Zulu language page is invisible in the link");
		}
		//To click the isiZulu link
		driver.findElement(By.linkText("isiZulu")).click();
		Thread.sleep(4000);
		System.out.println("After selection of the isiZulu link");
		//using size() method
		List<WebElement> zuluLnks=driver.findElements(By.linkText("isiZulu"));
		if(zuluLnks.size()== 0) {
			System.out.println("Zulu language page is visible in the link");
		}
		else {
		System.out.println("Zulu language page is invisible in the link");
		}
	}

}
