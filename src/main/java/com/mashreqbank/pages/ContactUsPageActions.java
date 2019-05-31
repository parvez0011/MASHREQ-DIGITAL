package com.mashreqbank.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.masherqbank.base.testBase;
import com.masherqbank.utility.TestUtil;

public class ContactUsPageActions {

	@FindBy(id = "btnSubmit")
	WebElement submitButton;
	
	@FindBy(xpath = "//select[@name='reachoutforproduct']/parent::div[contains(@class,'has-error has-feedback')]")
	WebElement formErrorMessage;
	
	@FindBy(css = "select#reachoutforproduct option")
	List<WebElement> reachOutProdcutDropdown;
	
	@FindBy(css = "#product option[selected = 'selected']")
	WebElement selectSubProductDefaultValue;
	
	@FindBy(id = "need")
	WebElement selectProductDropdown;
	
	@FindBy(css = "#product option")
	List<WebElement> subProductOption;
	
	@FindBy(css = "#mobile")
	WebElement mobileNoTextBox;
	
	@FindBy(css = "#mobile.ng-invalid-minlength")
	WebElement MobileNumberError;
	
	
	
	public ContactUsPageActions() {
		PageFactory.initElements(testBase.driver, this);
	}
	
	public void userClickOnSubmitBtn() {
		submitButton.click();
		TestUtil.log("[Info] : User click on submit button");
	}
	
	public void userVerifyErrorOnContactUsForm() {
		Assert.assertTrue(formErrorMessage.isDisplayed() , "[Assertion Fail] : Error message is not displayed for I am looking in to field");
		TestUtil.log("[Assertion Pass] : Error message is displayed for I am looking in to field");
	}
	
	public void userVerifyReachOutProductionOptionCount(int count) {		
		Assert.assertEquals(reachOutProdcutDropdown.size()-1, count , "[Asssertion Fail] : Total choices in dropdown expected : "+count+" but found to be different");
		TestUtil.log("[Asssertion Pass] : Total choices in dropdown are : "+count);
	}
	
	public void userVerifyDefaultValueOfSelectSubProduct(String DefaultValue) {
		Assert.assertEquals(selectSubProductDefaultValue.getText().trim(), DefaultValue.trim(), "[Asssertion Fail] : Default value of  dropdown expected : "+DefaultValue+" but found to be "+selectSubProductDefaultValue.getText());
		TestUtil.log("[Assertion Pass] : Default value of select sub product is "+DefaultValue);
	}
	
	public void selectValueFromProductDropdown(String dropdownValue) {
		TestUtil.selectDropdownValueByText(selectProductDropdown, dropdownValue);
		TestUtil.log("[Assertion Pass] : User selected value : "+dropdownValue+" from product dropdown");
	}
	
	public void verifySelectSubProductOptionCount(int size) {
		Assert.assertEquals(subProductOption.size()-1, size , "[Asssertion Fail] : Total choices in dropdown expected : "+size+" but found to be different");
		TestUtil.log("[Asssertion Fail] : Total choices in dropdown are : "+size);
	}
	
	public void verifySelectSubProductionOptions(String Option) {
		boolean flag = false;
		for(WebElement a : subProductOption) {
			if(a.getText().equalsIgnoreCase(Option)) {
				flag = true;
			}
		}
		Assert.assertTrue(flag , "[Assertion Fail] : Option : "+Option +" is not displayed in select sub product dropdown");
		TestUtil.log("[Assertion Pass] : Option : "+Option +" is displayed in select sub product dropdown");
	}
	
	public void enterMobileNumber(int number) {
		mobileNoTextBox.click();
		mobileNoTextBox.clear();
		mobileNoTextBox.sendKeys(String.valueOf(number));
		TestUtil.log("[Info] : User Enter the Mobile Number : "+number);
	}
	
	public void userVerifyErrorForInCorrectMobileNo() {
		Assert.assertTrue(MobileNumberError.isDisplayed() , "[Assertion Fail] : Error message is not displayed for mobile number with digit less that 7");
		TestUtil.log("[Assertion Pass] : Error message is displayed for mobile number with digit less that 7");
	}
	
	public void userVerifyNoErrorMesageForCorrectMobileNo() {
		Assert.assertFalse(TestUtil.elementBoolean(MobileNumberError) , "[Assertion Fail] : Error message is displayed for mobile number with 7 digits");
		TestUtil.log("[Assertion Pass] : Error message is not displayed for mobile number with 7 digits");
	}
	
}
