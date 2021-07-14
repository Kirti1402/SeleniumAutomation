package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		//scroll down
		WebElement radio=driver.findElement(By.xpath("//div[@id='field20']"));
		Actions action=new Actions(driver);
		action.moveToElement(radio);
		action.perform();
		//check and uncheck the checkbox
		driver.findElement(By.xpath("//input[@name='interest_market_c']")).click();
		driver.findElement(By.xpath("//input[@name='interest_market_c']")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
