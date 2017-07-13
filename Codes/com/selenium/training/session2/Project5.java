package com.selenium.training.session2;

import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project5 {

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

			WebElement dropDownSingle=driver.findElement(By.cssSelector("select[name=singledropdown]"));
			Select dropDownSingleSelect = new Select(dropDownSingle);
			dropDownSingleSelect.selectByVisibleText("Mercedes");
			Thread.sleep(2000);
			dropDownSingleSelect.selectByValue("Cars");
			Thread.sleep(2000);
			dropDownSingleSelect.selectByIndex(4);
			Thread.sleep(2000);
			dropDownSingleSelect.selectByVisibleText("Jaguar");
			Thread.sleep(2000);

			List<WebElement> options =dropDownSingleSelect.getOptions();
			System.out.println("Size: "+options.size());
			for(WebElement we : options)
			{
				if(we.isEnabled())
					System.out.println(we.getText());
				else
					System.out.println("DISABLED: "+we.getText());
			}
			System.out.println("Single drop down has multiple select: "+dropDownSingleSelect.isMultiple());

			WebElement dropDownMultiple=driver.findElement(By.cssSelector("select[name=multipledropdown]"));
			Select dropDownMultipleSelect= new Select(dropDownMultiple);
			dropDownMultipleSelect.selectByIndex(1);
			Thread.sleep(2000);
			dropDownMultipleSelect.selectByValue("Bikes");
			Thread.sleep(2000);
			dropDownMultipleSelect.selectByVisibleText("FZ");
			Thread.sleep(2000);
			dropDownMultipleSelect.selectByVisibleText("Pulsar");
			Thread.sleep(2000);
			System.out.println("First Selected: "+dropDownMultipleSelect.getFirstSelectedOption().getText());
			List<WebElement> allSelected=dropDownMultipleSelect.getAllSelectedOptions();
			System.out.println("All Selected: ");
			for(WebElement we : allSelected)
			{
				System.out.println(we.getText());
			}
			options =dropDownMultipleSelect.getOptions();
			System.out.println("Size: "+options.size());
			for(WebElement we : options)
			{
				if(we.isEnabled())
					System.out.println(we.getText());
				else
					System.out.println("DISABLED: "+we.getText());
			}
			System.out.println("Multiple drop down has multiple select: "+dropDownMultipleSelect.isMultiple());
			
			dropDownMultipleSelect.deselectAll();
			Thread.sleep(2000);
			dropDownMultipleSelect.selectByIndex(0);
			dropDownMultipleSelect.selectByIndex(1);
			dropDownMultipleSelect.selectByIndex(2);
			dropDownMultipleSelect.selectByIndex(3);
			dropDownMultipleSelect.selectByIndex(4);
			dropDownMultipleSelect.selectByIndex(5);
			dropDownMultipleSelect.selectByIndex(6);
			Thread.sleep(2000);
			dropDownMultipleSelect.deselectByIndex(1);
			Thread.sleep(2000);
			dropDownMultipleSelect.deselectByValue("Bikes");
			Thread.sleep(2000);
			dropDownMultipleSelect.deselectByVisibleText("FZ");
			Thread.sleep(2000);
			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}