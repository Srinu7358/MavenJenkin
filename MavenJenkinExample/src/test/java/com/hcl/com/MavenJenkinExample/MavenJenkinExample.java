package com.hcl.com.MavenJenkinExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenJenkinExample {
	@Test
	  public void test12() throws IOException{
		try{
		  System.setProperty("webdriver.chrome.driver","D:/Drivers/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.softwaretestingmaterial.com");
			driver.close();
		}
		catch(Exception e){
			
		}
	  }
}
