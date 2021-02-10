package com.duck.glue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import org.openqa.selenium.chrome.ChromeDriver;

import com.duck.base.TestBase;

public class Hook extends TestBase {

	private TestBase base;

	public Hook(TestBase base) {
		this.base = base;
	}

	@Before
	public void InitializeTest(Scenario scenario) {

		System.out.println("Opening the browser : Firefox");
	}

	@After
	public void TearDownTest(Scenario scenario) {
		if (scenario.isFailed()) {
			System.out.println(scenario.getName());
		}
		System.out.println("Closing the browser");
		base.Driver.quit();
	}

}
