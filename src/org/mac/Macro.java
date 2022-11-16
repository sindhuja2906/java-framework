package org.mac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Macro {

	public static void main(String[] args) throws InterruptedException {

		//shopclues multiple tab select
		
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\chro\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[23]"));
		
		a.moveToElement(move).perform();
		
		move.click();
		
		WebElement m1 = driver.findElement(By.xpath("//strong[text()='Refurbished Smartphones']"));
	
		a.moveToElement(m1).perform();
		
		m1.click();

		
		WebElement m2 = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		
		a.moveToElement(m2).perform();
		
		m2.click();
		
		
		
	}
}
