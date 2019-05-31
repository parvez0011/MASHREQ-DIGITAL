package com.mashreqbank.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.masherqbank.base.testBase;
import com.masherqbank.utility.TestUtil;

import cucumber.api.DataTable;


public class HomePageActions extends testBase{
	
	//Page factory - Object repository
	@FindBy(css = "nav.topNav.ng-scope")
	WebElement navigationBar;
	
	@FindBy(css = ".leftLinks li:not(.ng-hide) a") 
	List <WebElement> naviagtionBarItems;
	
	@FindBy(css = ".newsBox")
	WebElement newsBox;
	
	@FindBy(css = ".newsBox h3")
	WebElement newsBoxTitle;
	
	@FindBy(xpath = "//h5[contains(text(),'Contact Us')]//following-sibling::a")
	WebElement buystripOptionsAtFooter;
	
	@FindBy(css = "[id='form']")
	WebElement ContactUsForm;
	
	
	public HomePageActions() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void verifyNavigationBarForDesktop() {
		Assert.assertTrue(navigationBar.isDisplayed() , "[Assertion Fail] : Navigation bar is not displayed");
		TestUtil.log("[Assertion Pass] : Navigation bar is displayed");
	}
	
	public void validateNavigationBarItems(DataTable navBarItems) {
		List<List<String>> data = navBarItems.raw();
		int count = 0;
		for(WebElement a : naviagtionBarItems) {
			Assert.assertTrue(a.getText().equalsIgnoreCase(data.get(count).get(0).toString()) , "[Assertion Fail] : Navigation bar item is supposed to be : "+data.get(count).toString() + " but found : "+a.getText());
			TestUtil.log("[Assertion Pass] : Navigation bar item "+data.get(count).toString()+" found");
			count ++;
		}
	}
	
	public void validateNavigationBarItemsCount(int NavbarItemcount) {
		Assert.assertEquals(naviagtionBarItems.size(), NavbarItemcount , " Navigation bar item count is expected : "+NavbarItemcount +" but found : "+naviagtionBarItems.size());
		TestUtil.log("[Assertion Pass] : Navigation bar item count is : "+NavbarItemcount);
	}
	
	public void verifyNewsBoxIsDisplayed() {
		Assert.assertTrue(newsBox.isDisplayed() , "[Assertion Fail] : Masherqbank news box is not displayed on home page");
		TestUtil.log("[Assertion Pass] : Masherqbank news box is displayed on home page");
	}
	
	public void userVerifyNewsBoxTitle(String title) {
		Assert.assertTrue(newsBoxTitle.getText().equals(title), "[Assertion Pass] : Masherqbank New title is not displayed on homepage");
		TestUtil.log("[Assertion Pass] : Masherqbank New title is displayed on homepage");
	}

	public void userVerifyContactUsAtFooter() {
		Assert.assertTrue(buystripOptionsAtFooter.isDisplayed() , "[Assertion Fail] : Masherqbank Contact Us is displayed at footer of homepage");
		TestUtil.log("[Assertion Pass] : Masherqbank Contact Us is not displayed at footer of homepage");
	}
	
	public void userClickOnContactUsLink() {
		buystripOptionsAtFooter.click();
		TestUtil.log("[Info] : User click on Contact us link");
	}
	
	public void userVerifyContactUsForm() {
		Assert.assertTrue(ContactUsForm.isDisplayed() , "[Assertion Fail] : Contact Us form is not displayed");
		TestUtil.log("[Info] : Contact Us form is displayed");
	}
}
