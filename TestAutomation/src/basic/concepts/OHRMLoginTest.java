package basic.concepts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OHRMLoginTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		//To read users login credentials
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		String uid = sc.nextLine();
		System.out.println("Enter Password:");
		String pwd = sc.nextLine();
		sc.close();
		
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//To pause execution by using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//To perform login operation
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		try {
			if(driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
				System.out.println("successful login operation");
				//To perform logout operation
				//To click on the image profile
				driver.findElement(By.cssSelector("img[alt='profile picture']")).click();
				driver.findElement(By.linkText("Logout")).click();		
			}
		}
		catch (Exception e) {
			System.out.println("Unsuccessful login operation");
			File myFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Date dt= new Date();
			DateFormat df = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			FileHandler.copy(myFile, new File("./Defects\\OHRMLogin"+df.format(dt)+".png"));
		}
		finally {
			driver.quit();
		}

	}

}
