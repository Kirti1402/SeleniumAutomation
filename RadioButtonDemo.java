package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		WebElement radio1=driver.findElement(By.id("bookFlights"));
		WebElement radio2=driver.findElement(By.id("redeemFlights"));
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
	}

}
