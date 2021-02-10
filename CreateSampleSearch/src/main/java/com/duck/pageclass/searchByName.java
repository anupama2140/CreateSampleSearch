package com.duck.pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.duck.objectrepo.browserClass;

public class searchByName extends browserClass{
	
	static JavascriptExecutor js = (JavascriptExecutor) Driver;
	
	public static void navigateToBrowserSearch() throws Exception{
		try {
			Driver.navigate().to("https://www.google.com/search?q=ducks");
			Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Driver.manage().window().maximize();
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

	public static void scrollToSeeWikiPageLink() throws Exception{
		try {
			Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    js.executeScript("window.scrollBy(0,2000)");
		    Driver.findElement(By.xpath("//span[contains(text(),'Duck - Wikipedia')]"));
		    if(!Driver.findElement(By.xpath("//span[contains(text(),'Duck - Wikipedia')]")).isDisplayed()) {
		    	js.executeScript("window.scrollBy(0,2000)");
		    }
		   
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void scrollToSeeDuckImagesLink() throws Exception{
		try {
			Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			js.executeScript("window.scrollBy(0,2000)");
			if(Driver.findElement(By.xpath("//*[@id=\"bzMwOe\"]/div/div/div/div[1]/a[1]/div[2]")).isDisplayed()) {
				Driver.findElement(By.xpath("//*[@id=\"bzMwOe\"]/div/div/div/div[1]/a[1]/div[2]")).click();
				Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			}

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
