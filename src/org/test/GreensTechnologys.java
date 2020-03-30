package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologys {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://www.greenstechnologys.com/");
	d.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)d;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\green.png");
    FileUtils.copyFile(src, des);
}
}
