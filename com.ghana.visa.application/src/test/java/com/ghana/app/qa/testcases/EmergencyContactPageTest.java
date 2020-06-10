package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class EmergencyContactPageTest extends DriverInit{

	SoftAssert softAssertion = new SoftAssert();

	public EmergencyContactPageTest() throws IOException, InterruptedException {
		super();
	}

	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException, IOException {
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
	//	signUpPage.enterCaptchaField();
		signUpPage.SignUp.click();
		// ----------------------Personal info page
	}
	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException {
		Thread.sleep(7000);
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
	}
	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException, IOException {
	// ----------------------Address Info page
		Thread.sleep(5000);
		personalInfoPage.clickOnSaveAndContinue();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4, 0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5, 0));
		addressInfoPage.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.selectCountryType();
		addressInfoPage.selectStateType();
		addressInfoPage.selectAddressType();
		addressInfoPage.savecontinue.click();
	}
		
	@Test(priority = 4)
	public void fillProffessionalinfoPageTest() throws InterruptedException, IOException {
	// ----------------------Proffesional Info page
		Thread.sleep(5000);
		professionalinfopage.selectprofessionType();
		//professionalinfopage.passNameofprofession(TestUtil.readDataFromExcellString(25, 3, 0));
		professionalinfopage.passFlatNumber(TestUtil.readDataFromExcellString(25, 4, 0));
		professionalinfopage.passStreetName(TestUtil.readDataFromExcellString(25, 5, 0));
		professionalinfopage.passLandmark(TestUtil.readDataFromExcellString(25, 6, 0));
		professionalinfopage.passPincode(TestUtil.readDataFromExcellString(25, 7, 0));
		professionalinfopage.passCityName(TestUtil.readDataFromExcellString(25, 8, 0));
		professionalinfopage.selectCountryType();
		professionalinfopage.selectStateType();
		professionalinfopage.passContact(TestUtil.readDataFromExcellString(25, 11, 0));
		professionalinfopage.passEmail(TestUtil.readDataFromExcellString(25, 12, 0));
		professionalinfopage.saveandnext.click();
	}
	
	@Test(priority = 5)
	public void EmergencyInfoTitleTest() throws InterruptedException, IOException 
	{	
		
		TestUtil.writeStringValue(8, 1, 1);
		emergencyContactPage.getTextEmerPageTitle();
		Assert.assertEquals(emergencyContactPage.getTextEmerPageTitle(), TestUtil.readDataFromExcellString(8, 2, 0),
				"it is not navigate to Emergency Contact page when compare with Test data");
		TestUtil.writeStringValue(8, 2, 1);
	}
	
	@Test(priority = 6)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException {
		emergencyContactPage.emergencyFirstName(TestUtil.readDataFromExcellString(8, 3, 0));
		Assert.assertEquals(emergencyContactPage.getTextEmergencyFirstName(), TestUtil.readDataFromExcellString(8, 3, 0),
				"First name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 3, 1);
		
		
		emergencyContactPage.emergencyMiddleName(TestUtil.readDataFromExcellString(8, 5, 0));
		Assert.assertEquals(emergencyContactPage.getTextEmergencyMiddleName(), TestUtil.readDataFromExcellString(8, 5, 0),
				"Middle name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 5, 1);
		
		emergencyContactPage.emergencyLastName(TestUtil.readDataFromExcellString(8, 4, 0));
		Assert.assertEquals(emergencyContactPage.gettextEmergencyLastName(), TestUtil.readDataFromExcellString(8, 4, 0),
				"Last name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 4, 1);
		
	}

	@Test(priority = 7)
	public void selectRelationTest() throws InterruptedException, IOException {
		emergencyContactPage.selectRelation();
		Assert.assertEquals(emergencyContactPage.getTextFromRelation(), TestUtil.readDataFromExcellString(8, 6, 0),
				"Contact number from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(8, 6, 1);
	}
	
	
	@Test(priority =8)
	public void filladdressInfoTest1() throws InterruptedException, IOException {
		Thread.sleep(2000);
		emergencyContactPage.passFlatNumber(TestUtil.readDataFromExcellString(8, 7, 0));
		Assert.assertEquals(emergencyContactPage.getTextFlatNumber(), TestUtil.readDataFromExcellString(8, 7, 0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 7, 1);
		Thread.sleep(2000);
		emergencyContactPage.passStreetName(TestUtil.readDataFromExcellString(8, 8, 0));
		Assert.assertEquals(emergencyContactPage.geTextStreetName(), TestUtil.readDataFromExcellString(8,8, 0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 8, 1);
	}
	
	@Test(priority = 9)
	public void filladdressInfoTest2() throws InterruptedException, IOException {
		emergencyContactPage.passLandmark(TestUtil.readDataFromExcellString(8, 9, 0));
		Assert.assertEquals(emergencyContactPage.getTextLandmark(), TestUtil.readDataFromExcellString(8, 9, 0),
				"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 9, 1);
		
		emergencyContactPage.passPincode(TestUtil.readDataFromExcellString(8,10, 0));
		Assert.assertEquals(emergencyContactPage.getTextPincode(), TestUtil.readDataFromExcellString(8, 10, 0),
				"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 10, 1);

	}
	@Test(priority = 10)
	public void filladdressInfoTest3() throws InterruptedException, IOException {
		emergencyContactPage.passCityName(TestUtil.readDataFromExcellString(8, 11, 0));
		Assert.assertEquals(emergencyContactPage.getTextCityName(), TestUtil.readDataFromExcellString(8,11, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue( 8, 11,1);	
	}
	
	@Test(priority = 11)
	public void SelectCountry() throws IOException, InterruptedException
	{emergencyContactPage.selectCountryType();
	Assert.assertEquals(emergencyContactPage.getTextFromCountryType(), TestUtil.readDataFromExcellString(8, 13, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(8, 13, 1);
	}

	@Test(priority = 12)
	public void SelectState() throws IOException, InterruptedException
	{emergencyContactPage.selectStateType();
	Assert.assertEquals(emergencyContactPage.getTextFromStateType(), TestUtil.readDataFromExcellString(8, 12, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(8, 12, 1);
	}	
		
	@Test(priority =13)
	public void PassContact() throws IOException, InterruptedException
	{
		emergencyContactPage.passContact(TestUtil.readDataFromExcellString(8, 14, 0));
		Assert.assertEquals(emergencyContactPage.getContact(), TestUtil.readDataFromExcellString(8, 14, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 14, 1);	
	}
	@Test(priority =14)
	public void PassEmail() throws IOException, InterruptedException
	{
		emergencyContactPage.passEmail(TestUtil.readDataFromExcellString(8, 15, 0));
		Assert.assertEquals(emergencyContactPage.getEmail(), TestUtil.readDataFromExcellString(8, 15, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(8, 15, 1);
		emergencyContactPage.emergencySaveAndContinuebtn.click();
		TestUtil.writeStringValue(8, 16, 1);			
	}
	
	
}
