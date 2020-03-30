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

public class FlipkartAmount {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	WebElement Close = d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	Close.click();
	WebElement Search = d.findElement(By.name("q"));
    Search.sendKeys("Mi Phones");
    
    WebElement SearchBtn = d.findElement(By.className("vh79eN"));
    SearchBtn.click();
    Thread.sleep(3000);
    WebElement Ph = d.findElement(By.xpath("(//div[@class='_3wU53n'])[5]"));
    Ph.click();
    
    Set<String> allwinh = d.getWindowHandles();
    List<String> li=new ArrayList();
    li.addAll(allwinh);
    String Phone = li.get(1);
    d.switchTo().window(Phone);
    WebElement Cart = d.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
    Cart.click();
    TakesScreenshot tk=(TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\flipkart1.png");
    FileUtils.copyFile(src, des);
}
}
