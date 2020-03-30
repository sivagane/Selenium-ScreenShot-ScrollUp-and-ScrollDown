package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologyScRecentOpenings {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement NewOpening = d.findElement(By.xpath("(//span[@class='red_text'])[7]"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)",NewOpening);
    
    TakesScreenshot tk= (TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\greens2.png");
    
    FileUtils.copyFile(src, des);
}
}
