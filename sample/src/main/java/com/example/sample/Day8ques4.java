package com.example.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8ques4 {


	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		WebElement key=driver.findElement(By.name("q"));
		key.sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String t1=driver.getTitle();
		String idl=driver.getWindowHandle();
		System.out.println(t1);
		System.err.println(idl);
		
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		WebElement key2=driver.findElement(By.name("q"));
		key2.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String t2=driver.getTitle();
		String idl2=driver.getWindowHandle();
		System.out.println(t2);
		System.err.println(idl2);
		
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		WebElement key3=driver.findElement(By.name("q"));
		key3.sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String t3=driver.getTitle();
		String idl3=driver.getWindowHandle();
		System.out.println(t3);
		System.err.println(idl3);

		
		//to print total tabs opened
		Set<String> total=driver.getWindowHandles();
		System.out.println("Total tabs "+total.size());
		}
}
