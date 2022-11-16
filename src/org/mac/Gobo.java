package org.mac;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gobo {
// multiple clicks 
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\chro\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		Robot r = new Robot();	
		
		WebElement clk = driver.findElement(By.xpath("//div[@id='heading20']"));
		
		clk.click();
		
		WebElement clk1 = driver.findElement(By.xpath("(//a[text()='TCS Interview Question '])[1]"));
		
		clk1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
