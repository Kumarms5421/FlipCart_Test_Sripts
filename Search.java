package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Search {
	
	public void propertys(WebDriver driver) {
		WebElement search = driver.findElement(By.xpath("//input[contains (@title,'Search for')]"));
		System.out.println("SearchField Height : "+search.getRect().getHeight());
		System.out.println("SearchField Width : "+search.getRect().getWidth());
		System.out.println("SearchField X Location : "+search.getRect().getX());
		System.out.println("SearchField Y Location : "+search.getRect().getY());
		
		System.out.println("Color : "+search.getCssValue("background-color"));
		System.out.println("font-size : "+search.getCssValue("font-size"));	
	}
	
	public void multipleValid(WebDriver driver) throws InterruptedException {
		String[] valid = {"Book","Shoes","Pen","Shirt","Mobile"};
		for(String value : valid)
		{
			driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(value);
			Thread.sleep(1000);
			System.out.println("User able to Enter "+value);
			driver.navigate().refresh();
			Thread.sleep(2000);
		}
	}
	
	public void multipleInvalid(WebDriver driver) throws InterruptedException {
	 String[] invalid = {"jhhgj","tetetty","wteyte","whtkljluim","wkeybykwyqdknq"};
	 for(String inv : invalid)
	 {
		driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(inv);
		Thread.sleep(1000);
		System.out.println("User able to Enter "+inv);
		driver.navigate().refresh();
		Thread.sleep(2000);
	 }
	}
		
	public void number(WebDriver  driver) throws InterruptedException {
		String[] number = {"69","96","108","11","66","99","143"};

		for(String num : number)
		 {
			driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(num);
			Thread.sleep(1000);
			System.out.println("User able to Enter "+num);
			driver.navigate().refresh();
			Thread.sleep(2000);
		 }
	}
	
	public void alphaNumarical(WebDriver driver) throws InterruptedException {
		String[] alphaNumarical = {"abs12","bghbhj245","hvfjhg90","Apple12","Shoe54"};
		for(String alNum : alphaNumarical)
		 {
			driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(alNum);
			Thread.sleep(1000);
			System.out.println("User able to Enter "+alNum);
			driver.navigate().refresh();
			Thread.sleep(2000);
		 }
	}
	
	public void specialChar(WebDriver driver) throws InterruptedException {
		String[] spec = {"@#$$","&*%^","(%#$#%","#%@","?>+","{}{[]~`","_=)("};
		for(String spc : spec)
		 {
			driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(spc);
			Thread.sleep(1000);
			System.out.println("User able to Enter "+spc);
			driver.navigate().refresh();
			Thread.sleep(2000);
		 }
	}
	
	
	// Integration Test
	
	public void shirt(WebDriver driver) throws InterruptedException {
		//driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys("Shirt",Keys.ENTER);
		Thread.sleep(1000);
		if(driver.getTitle().equals("Shirt- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
		{
			System.out.println("User able to Search Product");
		}
		else
		System.out.println("User Unable to Search Product");
	}
	
	public void multipleSearch(WebDriver driver) throws InterruptedException {
		String[] valid = {"Book","Shoes","Pen","Apple12","Shoe54"};
		for(String value : valid)
		{
			driver.findElement(By.xpath("//input[contains (@title,'Search for')]")).sendKeys(value , Keys.ENTER);
			Thread.sleep(1000);
			if(driver.getTitle().equals(value+"- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
			{
				System.out.println("User able to Search Product : "+value);
			}
			else
			{
				System.out.println("User Unable to Search Product");
			}

			driver.navigate().back();
			Thread.sleep(2000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Search sc = new Search();
		sc.multipleSearch(driver);
		driver.quit();
		
	}
}
