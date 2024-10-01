package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDemo1 {

	public static void main(String[] args) {
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediffmail.com");
		driver.manage().window().maximize();
		
		String toolTip =driver.findElement(By.linkText("Business Email")).getAttribute("title");
		System.out.println(toolTip);
		

	}

}
