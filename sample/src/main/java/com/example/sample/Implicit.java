package com.example.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit {
	public static void main(String args[])
	{
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	}
}
