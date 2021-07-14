package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopulationText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		String Text=driver.findElement(By.xpath("//span[@rel='current_population']")).getText();
		System.out.println(Text);
		driver.findElement(By.xpath("//h1[text()=' Current World Population']"));
		
	}

}
