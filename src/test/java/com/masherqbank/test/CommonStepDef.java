package com.masherqbank.test;

import com.masherqbank.base.testBase;
import com.mashreqbank.pages.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDef extends testBase {
	
	CommonActions commonActions = new CommonActions();
	
	public CommonStepDef() {
		super();
	}
	
	@Given("^User is on homepage of Masherqbank$")
	public void launchApplication() {
		super.launchApplication();
	}
	
	@Then("^Validate the page title is '(.*)'$")
	public void validatePageTitle(String pageTitle) {
		commonActions.validatePageTitle(pageTitle);
	}
}
