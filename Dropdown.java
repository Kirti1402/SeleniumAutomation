package demo;

/*
 * Before handling dropdown in Selenium and controlling drop-down boxes, we must do following two things:
Import the package org.openqa.selenium.support.ui.Select
Instantiate the drop-down box as an object, Select in Selenium WebDriver
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement dropdown=driver.findElement(By.name("employees_c"));
		Select select= new Select(dropdown);
		select.selectByVisibleText("1 - 10 employees");
		
		select.selectByIndex(5);
		select.selectByValue("level3");
			

	}

}
