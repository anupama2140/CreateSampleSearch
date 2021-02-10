package com.duck.runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestRunner;
import com.duck.pageclass.searchByName;

public class Runner {

	public static void main(String[] args) throws Exception {

		Runner(args);
		System.out.println("Automation execution completed successfully");
		System.exit(0);
	}

	public static void Runner(String[] args) throws Exception {
		searchByName.navigateToBrowserSearch();
		searchByName.scrollToSeeWikiPageLink();
		searchByName.scrollToSeeDuckImagesLink();

	}

}
