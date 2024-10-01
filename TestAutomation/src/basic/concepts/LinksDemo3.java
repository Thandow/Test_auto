package basic.concepts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo3 {

	public static void main(String[] args) {
		String expLink = "";
		boolean myStatus = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expected link");
		expLink=sc.nextLine();
		sc.close();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		List<WebElement> pgLinks=driver.findElements(By.tagName("a"));
		
		for (WebElement lnk:pgLinks) {
			if (lnk.getText().equalsIgnoreCase(expLink)) {
				System.out.println("Expected link exist in a page");
				lnk.click();
				myStatus= true;
				break;
			}
		}
		if (myStatus==false) {
			System.out.println("Expected link doesnt exist in a page");
		}
	

	}

}
