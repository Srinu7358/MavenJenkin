package com.hcl.com.MavenJenkinExample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenJenkinExample {
	@Test
	  public void test12() throws IOException{
		try{
		  System.setProperty("webdriver.chrome.driver","C:/Users/GATEWAY/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/your-account");
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//A[@name='&lpos=nav_topnav>c>>kids>'][text()='kids']")).click();
			//driver.findElement(By.xpath("//A[@name='&lpos=nav_topnav>embedHeader>>women>'][text()='Women']")).click();
			
			driver.close();
		}
		catch(Exception e){
			
		}
	  }
}
