package basic.concepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		//To read page title
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);
		
		//To click on help
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(4000);
		
		//To read opened window handles
		Set<String> pgHandles=driver.getWindowHandles();
		
		//To read one by one value
		Iterator<String> winHandles=pgHandles.iterator();
		String w1 = winHandles.next();
		String w2 = winHandles.next();
		
		System.out.print(w1);
		System.out.print(w2);
		
		//To read page title
		driver.switchTo().window(w2);
		
		//To read page title
		pgTitle = driver.getTitle();
		System.out.println(pgTitle);

	}
	
}
