package org.mac;

import java.lang.invoke.SwitchPoint;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pop {

	// drop down

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\sindhuja\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Macrons\\chro");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/automation-practice-form/");

		driver.manage().window().maximize();

		WebElement state = driver.findElement(By.xpath("//div[text()='Select State']"));

		Select s = new Select(state);

		List<WebElement> alloption = s.getOptions();
		
		int a = alloption.size();
		
		System.out.println("alloptions size:"+a);
		
		System.out.println("\n normal forloop");
		
		for (int i = 0; i <alloption.size(); i=i+2) {
			
			WebElement options = alloption.get(i);
			System.out.println(options.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
