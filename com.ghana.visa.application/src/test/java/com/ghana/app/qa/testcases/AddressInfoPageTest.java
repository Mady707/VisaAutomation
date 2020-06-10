package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static org.testng.Assert.assertEquals;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class AddressInfoPageTest extends DriverInit {

	SoftAssert softAssertion = new SoftAssert();

	public AddressInfoPageTest() throws IOException, InterruptedException {
		super();
	}

	@Test(priority = 1)
	public void signUpAndFillPersonalInfo() throws InterruptedException, IOException {
		homePage.clickOnApplyVisa();
		homePage.applyVisa2.click();
		visaCategoriesPage.launchAndGotoSignUP();
		signUpPage.selectNationality();
		signUpPage.selectCountryOfResidence();
		signUpPage.selectVisaLocation();
		signUpPage.selectModeOfConsulate();
		signUpPage.SignUpNext1.click();
		signUpPage.termsCheckbox.click();
		TestUtil.scrollUpAtEndOFPage();
		signUpPage.SignUpNext2.click();
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.ScrolluptoUploadphoto);	
		TestUtil.uploadfile(SignUpPage.UploadphotoSignup , driverPath+"\\DocumentAttach\\Passport-size-photo.jpg");
		signUpPage.SelectPassportType();
		signUpPage.selectPortOfArrival();
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.selectDateOfBirth();
		signUpPage.selectYear();
		signUpPage.selectMonth();
		signUpPage.selectDate();
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		//signUpPage.enterCaptchaField();
		signUpPage.SignUp.click();

		// ----------------------Personal info page Test----------------------------------
		Thread.sleep(7000);
		//applicationID = personalInfoPage.getApplicationId();
		//System.out.println(applicationID);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(personalInfoPage.Femalegender);	
		personalInfoPage.clickOnGender();
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5, 0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6, 0));
		personalInfoPage.passLastName(TestUtil.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6, 11, 0));
		Thread.sleep(2000);
		personalInfoPage.selectCountryOfBirth();
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(6, 8, 0));
		personalInfoPage.passPlaceOfIssue(TestUtil.readDataFromExcellString(6, 14, 0));
		personalInfoPage.selectPassportIssueDate();
		Thread.sleep(2000);
		personalInfoPage.selectIssueYear();
		personalInfoPage.selectIssueMonth();
		personalInfoPage.selectIssueDate();
		Thread.sleep(2000);
		personalInfoPage.selectPassportExpiryDate();
		personalInfoPage.selectExpiryYear();
		personalInfoPage.selectExpiryMonth();
		personalInfoPage.selectExpiryDate();
		//personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(6, 9, 0));
		//personalInfoPage.selectPassExpiryDate(TestUtil.readDataFromExcellString(6, 10, 0));

	}
	
	@Test(priority = 2)
	public void SaveAndContinueFromPersonalInfoTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		personalInfoPage.clickOnSaveAndContinue();
		TestUtil.writeStringValue(7, 1, 1);
		Thread.sleep(4000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(addressInfoPage.addressInfoPageTitle);
		Assert.assertEquals(addressInfoPage.getTextAddressInfoPageTitle(), TestUtil.readDataFromExcellString(7, 2, 0),
				"it is not navigate to address info page after clicking on Continue and Save button from Personal Info page");
		TestUtil.writeStringValue(7, 2, 1);	
	}
		
	// ----------------------Address Info page
	// Test----------------------------------//
	/*	@Test(priority = 3)
	public void selectFormerNationalityTest() throws InterruptedException, IOException {

		Thread.sleep(2000);
		addressInfoPage.selectFormerNaitonality();
		Assert.assertEquals(addressInfoPage.getTextFromFormaernationaltity(), TestUtil.readDataFromExcellString(7, 3, 0),
				"it is not navigate to address info page after clicking on Continue and Save button from Personal Info page");
		TestUtil.writeStringValue(7, 3, 1);

	}*/
		
	@Test(priority =3)
	public void filladdressInfoTest1() throws InterruptedException, IOException {
		Thread.sleep(2000);
	
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4, 0));
		Assert.assertEquals(addressInfoPage.getTextFlatNumber(), TestUtil.readDataFromExcellString(7, 4, 0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 4, 1);
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5, 0));
		Assert.assertEquals(addressInfoPage.geTextStreetName(), TestUtil.readDataFromExcellString(7, 5, 0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 5, 1);
	}
	
	
	@Test(priority = 4)
	public void filladdressInfoTest2() throws InterruptedException, IOException {
		addressInfoPage.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		Assert.assertEquals(addressInfoPage.getTextLandmark(), TestUtil.readDataFromExcellString(7, 6, 0),
				"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 6, 1);
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		Assert.assertEquals(addressInfoPage.getTextPincode(), TestUtil.readDataFromExcellString(7, 7, 0),
				"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 7, 1);

	}
	@Test(priority = 5)
	public void filladdressInfoTest3() throws InterruptedException, IOException {
		addressInfoPage.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		Assert.assertEquals(addressInfoPage.getTextCityName(), TestUtil.readDataFromExcellString(7, 8, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 8, 1);	
	}
	
	@Test(priority = 6)
	public void SelectCountry() throws IOException, InterruptedException
	{addressInfoPage.selectCountryType();
	Assert.assertEquals(addressInfoPage.getTextFromCountryType(), TestUtil.readDataFromExcellString(7, 10, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(7, 10, 1);
	}

	@Test(priority = 6)
	public void SelectState() throws IOException, InterruptedException
	{addressInfoPage.selectStateType();
	Assert.assertEquals(addressInfoPage.getTextFromStateType(), TestUtil.readDataFromExcellString(7, 9, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(7, 9, 1);
	}

	@Test(priority = 7)
	public void selectAddressType() throws InterruptedException, IOException {
		addressInfoPage.selectAddressType();
		Assert.assertEquals(addressInfoPage.getTextFromAddressType(), TestUtil.readDataFromExcellString(7, 11, 0),
				"Address Type is not matched when match with Test Data");
		TestUtil.writeStringValue(7, 11, 1);
		addressInfoPage.savecontinue.click();
		TestUtil.writeStringValue(7, 12, 1);
	}
}

