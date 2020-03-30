package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqa1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
    d.get("http://toolsqa.com/");
    
    WebElement Sitemp = d.findElement(By.xpath("//a[text()='SITEMAP']"));
	
	JavascriptExecutor js=(JavascriptExecutor)d;
	js.executeScript("arguments[0].scrollIntoView(true)",Sitemp);
	Thread.sleep(3000);
	WebElement SelenTrai = d.findElement(By.xpath("(//span[text()='Selenium Training'])[1]"));
    js.executeScript("arguments[0].scrollIntoView(false)", SelenTrai);
}
}
