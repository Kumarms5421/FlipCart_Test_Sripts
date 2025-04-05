package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Synchronization
		
		driver.get("https://onlineking.in/");
		
		//login Page
		driver.findElement(By.xpath("//a[@href='/Login']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sanjay.m@jurysoft.com");
		driver.findElement(By.xpath(" //input[@id='password']")).sendKeys("12345678");
		driver.findElement(By.xpath(" //input[@type='checkbox']")).click();
		driver.findElement(By.xpath(" //button[text()='LOGIN NOW']")).click();
		
		//Search Product
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Gskill Ripjaws V 32GB",Keys.ENTER);
		
		
		//Add Product
		driver.findElement(By.xpath("//a[contains(text(),'Gskill Ripjaws V 32GB')]")).click();
		driver.findElement(By.xpath("//img[@alt='AddToCart']")).click();
		
		// Add WishList
		driver.findElement(By.xpath("(//img[@alt='AddToCart']/..//*[name()='svg'])[3]")).click(); //  imp
		
	//	driver.quit();
	}
}
