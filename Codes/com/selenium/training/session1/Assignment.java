package com.selenium.training.session1;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static String chromeDriverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get("https://www.bing.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement bingSearchBox=driver.findElement(By.id("sb_form_q"));
			bingSearchBox.sendKeys("Volvo");
			WebElement bingSearchButton=driver.findElement(By.className("b_searchboxSubmit"));
			bingSearchButton.submit();
			Thread.sleep(2000);
			WebElement volvoWikiLink=driver.findElement(By.partialLinkText("Wikipedia"));
			volvoWikiLink.click();
			Thread.sleep(2000);
			
			WebElement wikiSearchBox=driver.findElement(By.name("search"));
			wikiSearchBox.sendKeys("Volvo");
			WebElement wikiSearchButton=driver.findElement(By.name("go"));
			wikiSearchButton.click();
			Thread.sleep(2000);
			String wikiPageURLAfterSearch=driver.getCurrentUrl();
			String wikiPageTitleAfterSearch=driver.getTitle();
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			String wikiPageURLBeforeSearch=driver.getCurrentUrl();
			String wikiPageTitleBeforeSearch=driver.getTitle();
			
			if(wikiPageTitleBeforeSearch.equals(wikiPageTitleAfterSearch))
			{
				System.out.println("Title compare after search: Successful");
				System.out.println("Before Search Title: "+wikiPageTitleBeforeSearch);
				System.out.println("After Search Title: "+wikiPageTitleAfterSearch);
			}
			else
			{
				System.out.println("Title compare after search: Un-Successful");
				System.out.println("Before Search Title: "+wikiPageTitleBeforeSearch);
				System.out.println("After Search Title: "+wikiPageTitleAfterSearch);
			}
			if(wikiPageURLBeforeSearch.equals(wikiPageURLAfterSearch))
			{
				System.out.println("URL compare after search: Successful");
				System.out.println("Before Search URL: "+wikiPageURLBeforeSearch);
				System.out.println("After Search URL: "+wikiPageURLAfterSearch);
			}
			else
			{
				System.out.println("URL compare after search: Un-Successful");
				System.out.println("Before Search URL: "+wikiPageURLBeforeSearch);
				System.out.println("After Search URL: "+wikiPageURLAfterSearch);
			}
			
			driver.navigate().to("http://sourcebits.com/search/cricbuzz");
			Thread.sleep(2000);
			
			WebElement cricbuzzLink=driver.findElement(By.linkText("Cricbuzz"));
			cricbuzzLink.click();
			Thread.sleep(2000);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/Eclipse Workspace/SeleniumTraining/Page.html"));
			bw.write(driver.getPageSource());
			bw.close();
			System.out.println("D:/Eclipse Workspace/SeleniumTraining/Page.html");
			
			
			driver.quit();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}