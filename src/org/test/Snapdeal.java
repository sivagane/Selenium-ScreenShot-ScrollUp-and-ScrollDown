package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.snapdeal.com/");
	
	WebElement Search = d.findElement(By.id("inputValEnter"));
    Search.sendKeys("HP Laptop");
    
    WebElement SearchBtn = d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
    SearchBtn.click();
    Thread.sleep(3000);
    TakesScreenshot ts=(TakesScreenshot)d;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\Snapdeal.png");
    FileUtils.copyFile(src, des);
}
}
