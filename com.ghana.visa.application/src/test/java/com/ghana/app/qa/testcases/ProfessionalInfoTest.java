package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.util.TestUtil.driverPath;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class ProfessionalInfoTest extends DriverInit{
	SoftAssert softAssertion = new SoftAssert();
	public ProfessionalInfoTest() throws IOException, InterruptedException {
		super();	
	}

	@Test(priority =1)
	public void FillFormUpToProfessionalInfo() throws InterruptedException, IOException
	{
		homePage.clickOnApplyVisa();
		homePage.applyVisa2.click();
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
		//--------------Address Info------------------
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

	@Test(priority =2)
	public void TitleOfProfessionalInfo() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(professionalinfopage.professiontitle);
		Assert.assertEquals(professionalinfopage.getTextProfessionalInfoPageTitle(), TestUtil.readDataFromExcellString(25, 1, 0),
				"it is not navigate to address info page after clicking on Continue and Save button from Personal Info page");
		TestUtil.writeStringValue(25, 1, 1);
		
	}

	@Test(priority =3)
	public void selectprofession() throws IOException, InterruptedException
	{
		professionalinfopage.selectprofessionType();
		Assert.assertEquals(professionalinfopage.getTextFromprofessionType(), TestUtil.readDataFromExcellString(25, 2, 0),
				"Address Type is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 2, 1);
	}
	/*
	@Test(priority =4)
	public void PassNameofprofession() throws IOException, InterruptedException
	{
		professionalinfopage.passNameofprofession(TestUtil.readDataFromExcellString(25, 3, 0));
		Assert.assertEquals(professionalinfopage.getNameofprofession(), TestUtil.readDataFromExcellString(25, 3, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 3, 1);
	}
	
	*/
	@Test(priority =5)
	public void filladdressInfoTest1() throws InterruptedException, IOException {
		Thread.sleep(2000);
		professionalinfopage.passFlatNumber(TestUtil.readDataFromExcellString(25, 4, 0));
		Assert.assertEquals(professionalinfopage.getTextFlatNumber(), TestUtil.readDataFromExcellString(25, 4, 0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 4, 1);
		Thread.sleep(2000);
		professionalinfopage.passStreetName(TestUtil.readDataFromExcellString(25, 5, 0));
		Assert.assertEquals(professionalinfopage.geTextStreetName(), TestUtil.readDataFromExcellString(25, 5, 0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 5, 1);
	}
	
	
	@Test(priority = 6)
	public void filladdressInfoTest2() throws InterruptedException, IOException {
		professionalinfopage.passLandmark(TestUtil.readDataFromExcellString(25, 6, 0));
		Assert.assertEquals(professionalinfopage.getTextLandmark(), TestUtil.readDataFromExcellString(25, 6, 0),
				"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 6, 1);
		professionalinfopage.passPincode(TestUtil.readDataFromExcellString(25, 7, 0));
		Assert.assertEquals(professionalinfopage.getTextPincode(), TestUtil.readDataFromExcellString(25, 7, 0),
				"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 7, 1);

	}
	@Test(priority = 7)
	public void filladdressInfoTest3() throws InterruptedException, IOException {
		professionalinfopage.passCityName(TestUtil.readDataFromExcellString(25, 8, 0));
		Assert.assertEquals(professionalinfopage.getTextCityName(), TestUtil.readDataFromExcellString(25, 8, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 8, 1);	
	}
	
	@Test(priority = 8)
	public void SelectCountry() throws IOException, InterruptedException
	{professionalinfopage.selectCountryType();
	Assert.assertEquals(professionalinfopage.getTextFromCountryType(), TestUtil.readDataFromExcellString(25, 10, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(25, 10, 1);
	}

	@Test(priority = 8)
	public void SelectState() throws IOException, InterruptedException
	{professionalinfopage.selectStateType();
	Assert.assertEquals(professionalinfopage.getTextFromStateType(), TestUtil.readDataFromExcellString(25, 9, 0),
			"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(25, 9, 1);
	}	
		
	@Test(priority =10)
	public void PassContact() throws IOException, InterruptedException
	{
		professionalinfopage.passContact(TestUtil.readDataFromExcellString(25, 11, 0));
		Assert.assertEquals(professionalinfopage.getContact(), TestUtil.readDataFromExcellString(25, 11, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 11, 1);	
	}
	@Test(priority =11)
	public void PassEmail() throws IOException, InterruptedException
	{
		professionalinfopage.passEmail(TestUtil.readDataFromExcellString(25, 12, 0));
		Assert.assertEquals(professionalinfopage.getEmail(), TestUtil.readDataFromExcellString(25, 12, 0),
				"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(25, 12, 1);
		professionalinfopage.saveandnext.click();
		TestUtil.writeStringValue(25, 13, 1);
		
		
	}
	
	
	
}
