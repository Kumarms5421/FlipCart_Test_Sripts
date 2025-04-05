package Flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
	public void orderShirt(WebDriver driver) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// login
		Login lg = new Login();
		lg.login(driver);
		
		//Search
		Search search = new Search();
		search.shirt(driver);
		
		// Select Product
		driver.findElement(By.xpath("//div[contains(@data-id,'SHTF')]")).click();
		try
		{
			driver.findElement(By.xpath("//span[contains(text(),'Men Regular Fit Solid')]")).click();
			System.out.println("User Enter to Perticular Product Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Perticular Product Page");
		}
		finally {
			// Order
			BuyProduct buy = new BuyProduct();
			buy.payCOD(driver);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Order or = new Order();
		or.orderShirt(driver);
	}
}
