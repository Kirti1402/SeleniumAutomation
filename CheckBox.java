package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		
		List <WebElement> Checkboxes =  driver.findElements(By.xpath("//input[@class='cb1-element']"));
	    
	    int size =Checkboxes.size();
	   
	    for(int i = 0; i<size; i++) {
	    	//if(i==0 || i==3) {
	        Checkboxes.get(i).click();
	       // }
	    }
	    
	    
	   driver.findElement(By.id("check1")).click();
	   List<WebElement> text= driver.findElements(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/ul/li[1]/text()"));
	   System.out.println(text);
	    
	}
	
}
	

