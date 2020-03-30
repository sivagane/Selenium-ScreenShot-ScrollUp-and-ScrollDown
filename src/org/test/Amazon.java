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

public class Amazon {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium ScreenShot ScrollUp and ScrollDown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	WebElement Search = d.findElement(By.id("twotabsearchtextbox"));
    Search.sendKeys("Motorola");
    
    WebElement SearchBtn = d.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
    SearchBtn.click();
    Thread.sleep(3000);
    WebElement MotoPearl = d.findElement(By.xpath("(//a[@target='_blank'])[25]"));
    
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].click()",MotoPearl);
    Set<String> allwinh = d.getWindowHandles();
    List<String> li=new ArrayList();
    li.addAll(allwinh);
    String Moto = li.get(1);
    d.switchTo().window(Moto);
    
    TakesScreenshot tk=(TakesScreenshot)d;
    File src = tk.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\jegan\\OneDrive\\Pictures\\Screenshot\\amazon.png");
    FileUtils.copyFile(src, des);
}
}
