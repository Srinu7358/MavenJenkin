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
		
			driver.findElement(By.xpath("//SPAN[@class='nav-cart-icon nav-sprite']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//A[@class='a-link-normal'][text()='Amazon.in homepage']")).click();
			
			driver.close();
		}
		catch(Exception e){
			
		}
	  }
}
