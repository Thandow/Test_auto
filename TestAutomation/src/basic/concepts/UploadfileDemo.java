package basic.concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadfileDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//To initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//To click on "Im experienced"
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		Thread.sleep(4000);
		
		//To click on upload resume
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(4000);
		
		//To select file path
		StringSelection myFile= new StringSelection("E:\\testfile.docx");
		
		//To set the value into the systems clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(myFile,null);
		
		Robot rb = new Robot();
		//To press ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		//To release keys
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); 
	}

}
