package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input#username")).sendKeys("kirti2714@gmail.com");
		//below line not working
		String text=driver.findElement(By.cssSelector("input#username")).getText();
		System.out.println(text);
	      System.out.println("Page title is : " + driver.getTitle());
	      driver.get("https://login.salesforce.com/?locale=eu");
	      driver.quit();
	}
	
}
