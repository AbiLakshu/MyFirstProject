package org.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowLaunch {
public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
			
		try {
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("abi21@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("abi@123");
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
			}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally {
			driver.quit();
		}
}

}
