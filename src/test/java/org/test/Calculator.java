package org.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {
    
	public static void main(String[] args) throws MalformedURLException {
	  
     // Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "Appium");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "9");
        dc.setCapability("udid", "7HJF9SWS6D4DCACE");
        dc.setCapability("deviceName", "OPPO A31");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.coloros.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        
 	    URL url = new URL("http://0.0.0.0:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url,dc);
         		
		WebElement one = driver.findElement(By.id("com.coloros.calculator:id/digit_1"));
		WebElement plus1 = driver.findElement(By.id("com.coloros.calculator:id/op_add"));
		WebElement two = driver.findElement(By.id("com.coloros.calculator:id/digit_2"));
		
		WebElement equalTo = driver.findElement(By.id("com.coloros.calculator:id/eq"));
		
		WebElement clr = driver.findElement(By.id("com.coloros.calculator:id/clr"));
		
		WebElement three = driver.findElement(By.id("com.coloros.calculator:id/digit_3"));
		WebElement plus2 = driver.findElement(By.id("com.coloros.calculator:id/op_add"));
		WebElement twoo = driver.findElement(By.id("com.coloros.calculator:id/digit_2"));

		one.click();
		plus1.click();
		two.click();
		
		equalTo.click();
		clr.click();
		
		three.click();
		plus2.click();
		twoo.click();
		
		System.out.println("Success");
	
	}
}
