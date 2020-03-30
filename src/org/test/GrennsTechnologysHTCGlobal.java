package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrennsTechnologysHTCGlobal {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get(" http://greenstech.in/selenium-course-content.html");
	d.manage().window().maximize();
	WebElement HTC = d.findElement(By.xpath("(//a[@target='_blank'])[33]"));
    HTC.click();
    
    Set<String> allwinh = d.getWindowHandles();
    List<String>li=new ArrayList();
    li.addAll(allwinh);
    String htc = li.get(1);
    d.switchTo().window(htc);
    
    TakesScreenshot tk=(TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\green4.png");
    FileUtils.copyFile(src, des);
}
}
