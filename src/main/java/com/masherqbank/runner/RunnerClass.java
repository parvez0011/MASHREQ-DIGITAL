package com.masherqbank.runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.masherqbank.base.testBase;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles/", glue = "com.masherqbank.test", tags = {"@Homepage or @ContactUs"}, plugin = {"json:target/cucumber/report.json" , "html:target/site/cucumber-pretty"})
	 
	public class RunnerClass extends AbstractTestNGCucumberTests {
	
	testBase bst = new testBase();
	
	@BeforeClass
	public void intiateSession() {
		testBase.initialization();
	}
	 
	@AfterClass
	public void closeSession() {
//		bst.closeBrowsers();
	}
	
	}
