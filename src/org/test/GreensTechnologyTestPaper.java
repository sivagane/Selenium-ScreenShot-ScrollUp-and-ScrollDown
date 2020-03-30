package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologyTestPaper {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement TestPaper = d.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[6]"));
    TestPaper.click();
    
    Set<String> allwinh = d.getWindowHandles();
    List<String> li= new ArrayList();
    li.addAll(allwinh);
    String st = li.get(1);
    d.switchTo().window(st);
    
    
}
}
