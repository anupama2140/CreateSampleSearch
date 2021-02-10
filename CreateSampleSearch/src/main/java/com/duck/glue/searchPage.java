package com.duck.glue;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.GherkinKeyword;
import com.duck.base.TestBase;
import com.duck.pageclass.searchByName;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class searchPage extends TestBase{
	 private  TestBase base;

	    public searchPage(TestBase base) {
	        this.base = base;
	    }
	    
	    @Given("^I navigate to the browser search page$")
	    public void iNavigateToTheBrowserSearchPage() throws Throwable {
	    	searchByName.navigateToBrowserSearch();
	    	System.out.println("Navigated Browser Search Page");
	    }


		@Then("^I scroll to see ducks wiki page$")
	    public void iShouldSeeTheWikiPage() throws Throwable {
			searchByName.scrollToSeeWikiPageLink();
			 Assert.assertEquals(base.Driver.findElement(By.xpath("//span[contains(text(),'Duck - Wikipedia')]")).isDisplayed(), true);
	    }


	    @And("^I scroll to see ducks image link$")
	    public void iScrollToSeeImageLink() throws Throwable {
	       searchByName.scrollToSeeDuckImagesLink();
	  
	    }
	    
}
