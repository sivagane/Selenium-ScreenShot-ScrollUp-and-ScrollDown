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

public class GreensTechnologyScOverallReview {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	
	WebElement PrivPol = d.findElement(By.xpath("//a[text()=' Privacy Policy']"));
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].scrollIntoView(true)", PrivPol);
    
    TakesScreenshot tk=(TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\greens1.png");
    FileUtils.copyFile(src, des);
    		}
}
