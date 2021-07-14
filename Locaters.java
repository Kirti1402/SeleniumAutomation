package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("kirti2714@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("mankrit21409");
		
		
	}

}
