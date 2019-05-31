package com.masherqbank.test;

import java.util.List;

import com.mashreqbank.pages.HomePageActions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {

	HomePageActions homepage = new HomePageActions();

	@Then("^Verify Navigation bar is displayed to user$")
	public void verifyNavigationBarIsDisplayedToUser() {
		homepage.verifyNavigationBarForDesktop();
	}

	@Then("^Verify '(\\d+)' items displayed at navigation bar$")
	public void verifyItemsDisplayedAtNavigationBar(int arg1, DataTable navbarItems) throws Exception {
		homepage.validateNavigationBarItemsCount(arg1);
		homepage.validateNavigationBarItems(navbarItems);	
	}

	@Then("^User verify News box should be visible on home page$")
	public void verifyNewsBoxIsDisplayed() {
		homepage.verifyNewsBoxIsDisplayed();
	}
	
	@Then("^User verify the title of News box should be '(.*)'$")
	public void userVerifyNewsBoxTitle(String title) {
		homepage.userVerifyNewsBoxTitle(title);
	}
	
	@Then("^User verify 'Contact Us' is visible at homepage$")
	public void userVerifyContactUsAtFooter() {
		homepage.userVerifyContactUsAtFooter();
	}
	
	@When("^User click on Contact Us Page at footer$")
	public void userClickOnContactUsLink() {
		homepage.userClickOnContactUsLink();
	}
	
	@Then("^Verify user reached to Contact Us Page$")
	public void userVerifyContactUsForm() {
		homepage.userVerifyContactUsForm();
	}
	
}
