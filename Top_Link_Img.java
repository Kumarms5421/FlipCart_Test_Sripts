package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top_Link_Img {
	public void kilos(WebDriver driver) {
		WebElement kilos = driver.findElement(By.xpath("//span[text()='Kilos']"));
		System.out.println("font-size : "+kilos.getCssValue("font-size"));
		System.out.println("color : "+kilos.getCssValue("color"));
		kilos.click();
		if(driver.getTitle().equals("Online Grocery Store with Up to 80% OFF - Flipkart Kilos"))
			System.out.println("User able to Click and Navigate to Kilos Page");
		else
			System.out.println("User Failed to Click and Navigate to Kilos Page");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Top_Link_Img tli = new Top_Link_Img();
		tli.kilos(driver);
		Thread.sleep(2000);
		driver.quit();
	}
}
