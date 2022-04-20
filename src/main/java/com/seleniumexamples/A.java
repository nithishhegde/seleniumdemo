package com.seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://selenium file//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/alert.html");
		driver.findElement(By.xpath("/html/body/button")).click();
	}
}
