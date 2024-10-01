package basic.concepts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {

	public static void main(String[] args) {
		 String expCountry="";
		 boolean myStatus= false;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter expected country name");
		 expCountry= sc.nextLine();
		 sc.close();
		
		//To initialize Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
								
		//To click on "Register"
		driver.findElement(By.linkText("REGISTER")).click();
		
		Select countryList = new Select(driver.findElement(By.name("country")));
		
		//To read all options from country dropdown
		List<WebElement> opts=countryList.getOptions();
		
		for(WebElement opt : opts) {
			String actCountry= opt.getText();
			if(actCountry.equalsIgnoreCase(expCountry)) {
			System.out.println("Expected country exists");
			countryList.selectByVisibleText(actCountry);
			myStatus = true;
			break;
		}
	}
	if (myStatus==false) {
	System.out.println("Expected results deos not exist");
		
	}
	}

}
