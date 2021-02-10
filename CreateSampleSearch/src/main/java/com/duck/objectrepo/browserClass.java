package com.duck.objectrepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.duck.base.TestBase;

public class browserClass extends TestBase{
	
	@FindBy(xpath = "//*[@id=\\\"rso\\\"]/div[3]/div/div[1]/a/h3/span")
	WebElement duckLinks;
	
	@FindBy(xpath = "//span[contains(text(),'Duck - Wikipedia')]")
	WebElement ducksWiki;
	
	@FindBy(xpath = "//*[@id=\\\"bzMwOe\\\"]/div/div/div/div[1]/a[1]/div[2]")
	WebElement imagesForDuck;
	
}
