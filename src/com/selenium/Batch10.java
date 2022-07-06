package com.selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Batch10 {

	public static void main ( String [] args) throws InterruptedException {
		// To load Browser and Path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarav\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		// To launch Browser 
		WebDriver driver = new ChromeDriver();
		String URL = "http://demo.automationtesting.in/Alerts.html";
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();
		}
	}
		
