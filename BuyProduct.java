package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyProduct {
	public void buy(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		try {
			driver.findElement(By.xpath("//span[text()='Delivery Address']")).click();
			System.out.println("User Enter to Select Address Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Select Address Page");
		}
		finally {
			driver.findElement(By.xpath("//span[text()='HOME']/../../../../..//input[@type='radio']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
			Thread.sleep(1000);
			try
			{
				driver.findElement(By.xpath("//div[text()='Delivery Address']/..//span[text()='Kumar M S']")).click();
				System.out.println("User able to select Address");
			}
			catch (Exception e) {
				System.out.println("User Failed to Select Address");
			}
			finally {
				driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
				try {
					driver.findElement(By.xpath("//div[contains(text(),'Rest assured')]")).click();
					System.out.println("Pop-up Msg Displayed");
					driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
					Thread.sleep(1000);
				}
				catch (Exception e) {
					System.out.println("Pop-up Msg Not Displayed");
				}
			}
			
		}
	}
	
	// Payment Mode 
	
	public void payCOD(WebDriver driver) throws InterruptedException {
		this.buy(driver);
		try {
			driver.findElement(By.xpath("//span[text()='Payment Options']")).click();
			System.out.println("User Enter to Select Payment Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Select Payment Page");
		}
		finally {
			driver.findElement(By.xpath("//div[text()='Cash on Delivery']/../../../..//input[@type='radio']")).click();
		}
	}
	public void payUPI(WebDriver driver) throws InterruptedException {
		this.buy(driver);
		try {
			driver.findElement(By.xpath("//span[text()='Payment Options']")).click();
			System.out.println("User Enter to Select Payment Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Select Payment Page");
		}
		finally {
			driver.findElement(By.xpath("//span[text()='UPI']/../../../..//input[@type='radio']")).click();
		}
	}
	public void payCard(WebDriver driver) throws InterruptedException {
		this.buy(driver);
		try {
			driver.findElement(By.xpath("//span[text()='Payment Options']")).click();
			System.out.println("User Enter to Select Payment Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Select Payment Page");
		}
		finally {
			driver.findElement(By.xpath("//span[contains(text(),'Credit / Debit')]/../../../../..//input[@type='radio']")).click();
		}
	}
	public void payNetBanking(WebDriver driver) throws InterruptedException {
		this.buy(driver);
		try {
			driver.findElement(By.xpath("//span[text()='Payment Options']")).click();
			System.out.println("User Enter to Select Payment Page");
		}
		catch (Exception e) {
			System.out.println("User Failed to Enter Select Payment Page");
		}
		finally {
			driver.findElement(By.xpath("//div[text()='Net Banking']/../../..//input[@type='radio']")).click();
		}
	}
}
