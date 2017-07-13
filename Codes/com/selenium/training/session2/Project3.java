package com.selenium.training.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {

	public static String driverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.bing.com/");

			WebElement searchBox=driver.findElement(By.cssSelector("input.b_searchbox"));
			searchBox.sendKeys("ascendum");
			Thread.sleep(3000);
			searchBox.clear();
			Thread.sleep(3000);
			searchBox=driver.findElement(By.cssSelector("input#sb_form_q"));
			searchBox.sendKeys("ascendum 2");
			Thread.sleep(3000);
			searchBox.clear();
			Thread.sleep(3000);
			searchBox=driver.findElement(By.cssSelector("input.b_searchbox#sb_form_q"));
			searchBox.sendKeys("ascendum 3");
			Thread.sleep(3000);
			searchBox.clear();
			Thread.sleep(3000);
			searchBox=driver.findElement(By.cssSelector("input[name=q]"));
			searchBox.sendKeys("ascendum 4");
			Thread.sleep(3000);
			searchBox.clear();
			Thread.sleep(3000);
			searchBox=driver.findElement(By.cssSelector("input[name=q][type*=arc][id^=sb_fo][class$=chbox]"));
			searchBox.sendKeys("ascendum 5");
			Thread.sleep(3000);
			searchBox.clear();
			Thread.sleep(3000);


			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}