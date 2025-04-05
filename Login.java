package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public void login(WebDriver driver) throws InterruptedException {
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//INPUT[contains(@class,\"r4vIwl BV+Dqf\")]")).sendKeys("7676061800");
		driver.findElement(By.xpath("//BUTTON[contains(.,'Request OTP')]")).click();
		Thread.sleep(20000);
	//	driver.findElement(By.xpath("//BUTTON[contains(.,'Verify')]")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Login lg = new Login();
		lg.login(driver);
	}
}
