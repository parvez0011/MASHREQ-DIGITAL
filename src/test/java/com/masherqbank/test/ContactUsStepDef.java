package com.masherqbank.test;

import com.mashreqbank.pages.ContactUsPageActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsStepDef {

	ContactUsPageActions contactUsPage = new ContactUsPageActions();

	@When("^User click on Submit button of contact us form$")
	public void userClickOnSubmitBtn() {
		contactUsPage.userClickOnSubmitBtn();
	}

	@Then("^Verify Error is displayed for I am looking to text box$")
	public void userVerifyErrorOnContactUsForm() {
		contactUsPage.userVerifyErrorOnContactUsForm();
	}

	@Then("^User Verify I am looking to… field is a dropdown with '(\\d+)' choices$")
	public void userVerifyReachOutProductionOptionCount(int count) {
		contactUsPage.userVerifyReachOutProductionOptionCount(count);
	}

	@Then("^User verify The '(.*)' field is initially empty$")
	public void userVerifyDefaultValueOfSelectSubProduct(String defaultValue){
		contactUsPage.userVerifyDefaultValueOfSelectSubProduct(defaultValue);	
	}

	@When("^User Select the '(.*)' from Product dropdown$")
	public void selectValueFromProductDropdown(String option){
		contactUsPage.selectValueFromProductDropdown(option);
	}

	@Then("^User Verify Select Sub products have '(\\d+)' options including '(.*)'$")
	public void user_Verify_Select_Sub_products_have_options_including_Home_Loan_UAE_Resident(int arg1, String option) {
		contactUsPage.verifySelectSubProductOptionCount(arg1);
		contactUsPage.verifySelectSubProductionOptions(option);
	}
	
	@When("^User enter the mobile number '(\\d+)'$")
	public void enterMobileNumber(int mobileNumber){
		contactUsPage.enterMobileNumber(mobileNumber);
	}

	@Then("^User Verify Error is displayed when user enter less than 7 digit in mobile number$")
	public void userVerifyErrorForInCorrectMobileNo() {
		contactUsPage.userVerifyErrorForInCorrectMobileNo();
	}

	@Then("^User Verify No Error is displayed when user enter 7 digit number$")
	public void userVerifyNoErrorMesageForCorrectMobileNo() {
		contactUsPage.userVerifyNoErrorMesageForCorrectMobileNo();
	}
}
