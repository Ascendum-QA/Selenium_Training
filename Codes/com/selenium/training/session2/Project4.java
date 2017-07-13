package com.selenium.training.session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {

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
			
			System.out.println("Radio Button Group 1:");
			List <WebElement> radioGroup1=driver.findElements(By.cssSelector("input[name=gender]"));
			System.out.println(radioGroup1.get(0).getAttribute("value")+ " is selected: " +radioGroup1.get(0).isSelected());
			if(radioGroup1.get(1).getAttribute("value").equalsIgnoreCase("femALe"))
			{
				System.out.println(radioGroup1.get(1).getAttribute("value"));
				radioGroup1.get(1).click();
				Thread.sleep(3000);
			}
			for(WebElement we : radioGroup1)
			{
				System.out.println("Value: "+we.getAttribute("value")+" | Is Selected: "+we.isSelected());
			}
			System.out.println("Radio Button Group 2:");
			List <WebElement> radioGroup2=driver.findElements(By.cssSelector("input[name=age-group]"));
			for(WebElement we : radioGroup2)
			{
				we.click();
				Thread.sleep(2000);
				System.out.println("Value: "+we.getAttribute("value")+" | Is Selected: "+we.isSelected());
			}
			System.out.println("Checkbox:");
			List <WebElement> checkBox=driver.findElements(By.cssSelector("input[name=company]"));
			for(WebElement we : checkBox)
			{
				if(we.isEnabled())
				{
					if(we.isSelected())
					{
						we.click();
						Thread.sleep(3000);
						System.out.println("Value: "+we.getAttribute("value")+" | Is Selected: "+we.isSelected());
					}
					else
					{
						System.out.println("Value: "+we.getAttribute("value")+" | Is Selected: "+we.isSelected());
					}
				}
				else
				{
					System.out.println("DISABLED: Value: "+we.getAttribute("value")+" | Is Selected: "+we.isSelected());
				}
			}
			
			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}