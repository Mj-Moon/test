package Tutorial;


import java.io.IOException;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;

public class Facebook {

	public static void main(String[] args)throws InterruptedException,IOException,Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Monika\\chromedriver_win32\\chromedriver.exe");
		browser.waitForVisible("[name=__CONFIRM__]");
		browser.keys("Escape"); // Dismiss "notifications" dialog box.

		var confirmButtonSelector = "[name=__CONFIRM__]";
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	
		driver.getTitle();
driver.findElement(By.name("email")).sendKeys("monika.jaingabu@gmail.com"); 
driver.findElement(By.name("pass")).sendKeys("jaijinendra1"); 

driver.findElement(By.xpath("//*[@type='submit'][1]")).click();
Alert alert = driver.switchTo().alert();


alert.accept();


 driver.findElement(By.xpath("//*[text()='Monika']")).click();
 Thread.sleep(5000);
Screen s = new Screen();
s.click("photos.PNG");


}}
