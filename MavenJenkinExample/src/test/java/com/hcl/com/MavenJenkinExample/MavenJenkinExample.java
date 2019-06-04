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
		  System.setProperty("webdriver.chrome.driver","D:/Drivers/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.jcrew.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//A[@name='&lpos=nav_topnav>home>>sale>'][text()='sale']")).click();
			driver.findElement(By.xpath("//A[@name='&lpos=nav_topnav>genderLanding>>kids>'][text()='kids']")).click();
			driver.findElement(By.xpath("//A[@name='&lpos=nav_topnav>genderLanding>>men>'][text()='Men']")).click();
			
			driver.close();
		}
		catch(Exception e){
			
		}
	  }
}
