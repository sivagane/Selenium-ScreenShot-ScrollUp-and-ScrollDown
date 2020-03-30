package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://toolsqa.com/");
	
	WebElement Sitemp = d.findElement(By.xpath("//a[text()='SITEMAP']"));
	
	JavascriptExecutor js=(JavascriptExecutor)d;
	js.executeScript("arguments[0].scrollIntoView(true)",Sitemp);
	
	
}
}
