package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class testClass {

	public static void main ( String [] args) throws Throwable {
		// To load Browser and Path
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sarav\\eclipse-workspace\\SeleniumProject\\Driver\\msedgedriver.exe");
		// To launch Browser 
		WebDriver driver = new EdgeDriver();
		String URL = "https://www.snapdeal.com/";
		// To call URL
		driver.get(URL);
		Thread.sleep(2000);
		JavascriptExecutor Text = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		WebElement PP = driver.findElement(By.xpath("//a[@class='underLineOnHover']"));
		WebElement top = driver.findElement(By.xpath("(//div[@class='top-hooks-icon'])[1]"));
		Text.executeScript("arguments[0].scrollIntoView(true)",PP);
		Thread.sleep(1000);
		Text.executeScript("arguments[0].scrollIntoView(false)",top);
		Thread.sleep(2000);
}
}
