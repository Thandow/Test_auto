package basic.concepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTLogintest {

	public static void main(String[] args) {
		//To read Login credentials
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String uid = sc.nextLine();
		System.out.println("Enter password");
		String pwd = sc.nextLine();
		sc.close();
		
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		//To perform Login operation
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		
		//To read page title
		String pgTitle = driver.getTitle();
		
		//To compare page Title
		if (pgTitle.equals("Login: Mercury tours")) {
		System.out.println("Successful login operation");
	}
		else {
			System.out.println("Unsuccessful login operation");
		}

	}

}
