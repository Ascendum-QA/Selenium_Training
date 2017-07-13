package com.selenium.training.session2;

import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project6 {

	public static String driverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("D:/Eclipse Workspace/SeleniumTraining/HTMLFile.html");
			Thread.sleep(2000);
			//Get Market Trend for QTP - row and col numbers static
			WebElement qtpTrend=driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
			System.out.println("QTP Trend: "+qtpTrend.getText());
			
			//Get Market Licensing for UFT - row and col numbers via variables
			int rowNum=4;
			int colNum=2;
			WebElement uftLicensing=driver.findElement(By.xpath("//table/tbody/tr["+rowNum+"]/td["+colNum+"]"));
			System.out.println("UFT Licensing: "+uftLicensing.getText());
			
			//Get Market trend of selenium when rows and columns are dynamic
			List <WebElement> headers=driver.findElements(By.xpath("//table/tbody/tr/th"));
			int trendHeaderIndex=0;
			for(int i=0;i<headers.size();i++)
			{
				if(headers.get(i).getText().contains("Trend"))
				{
					trendHeaderIndex=i+1;
				}
			}
			WebElement seleniumTrend=driver.findElement(By.xpath("//table/tbody/tr[td='Selenium']/td["+trendHeaderIndex+"]"));
			System.out.println("Selenium Trend: "+seleniumTrend.getText());
			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}