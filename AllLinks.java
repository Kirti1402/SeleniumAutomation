package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		List<WebElement> alltags=(List<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println("Total tags are" + alltags.size());
		
		for(int i=0;i<alltags.size();i++)
		{
			System.out.println("All tags are "+ alltags.get(i).getAttribute("href"));
			System.out.println("All tags are "+ alltags.get(i).getText());
			
			
		}

	}

}
