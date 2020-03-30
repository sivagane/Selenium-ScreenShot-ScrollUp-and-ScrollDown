package org.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart1stiPhone {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	WebElement Close = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
    Close.click();
    
    WebElement Search = d.findElement(By.name("q"));
    Search.sendKeys("iphone");
    
    WebElement SearchBtn = d.findElement(By.className("vh79eN"));
    SearchBtn.click();
    Thread.sleep(3000);
    WebElement iph1 = d.findElement(By.xpath("(//a[@target='_blank'])[2]"));
    iph1.click();
    
    Set<String> allwinh = d.getWindowHandles();
    List<String> li= new ArrayList();
    li.addAll(allwinh);
    String IP1 = li.get(1);
    d.switchTo().window(IP1);
    
    TakesScreenshot tk=(TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\flipkart.png");
    FileUtils.copyFile(src, des);
}
}
