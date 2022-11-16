package org.mac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dobo {
	public static void main(String[] args) throws AWTException {
		
	//cut the name that u typed in a  search tab	
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\chro\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/webhp");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		Robot r = new Robot();
	
	WebElement d1 = driver.findElement(By.xpath("//input[@type='text']"));
	
	d1.sendKeys("velmurugan");
		
		a.doubleClick(d1).perform();
		a.contextClick(d1).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
