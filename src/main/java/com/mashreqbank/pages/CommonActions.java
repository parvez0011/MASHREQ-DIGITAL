package com.mashreqbank.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.masherqbank.base.testBase;
import com.masherqbank.utility.TestUtil;

public class CommonActions extends testBase {
	
	String Pagetitle;	
	
	public CommonActions() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void validatePageTitle(String title) {
		TestUtil.waitTOSync();
		Pagetitle = driver.getTitle();
		Assert.assertEquals(Pagetitle, title , "[Assertion Fail] : Page title is expected to : "+Pagetitle +" but found to be : "+title);
		TestUtil.log("Page title is : "+Pagetitle);

}
	
}
