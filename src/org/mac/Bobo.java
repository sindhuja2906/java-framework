package org.mac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bobo {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		// taking screenshot amazon search page

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\chro\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		TakesScreenshot dt = (TakesScreenshot) driver;

		WebElement scr = driver.findElement(By.name("field-keywords"));
		
		scr.sendKeys("iphone");
		Thread.sleep(2000);
		File sc = dt.getScreenshotAs(OutputType.FILE);

		File f = new File(
				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\screen\\amazon search.png");
		FileUtils.copyFile(sc, f);

	}

}
