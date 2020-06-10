package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class TravelInfoPageTest extends DriverInit 
{
	SoftAssert softAssertion = new SoftAssert();

	public TravelInfoPageTest() throws IOException, InterruptedException 
	{
		super();
	}

	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException, IOException 
	{
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
	}
	// ----------------------Personal info page
	@Test(priority = 2)
	public void fillPersonalPageTest() throws InterruptedException, IOException 
	{
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
	public void fillAddressinfoPageTest() throws InterruptedException, IOException 
	{
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
	public void fillProffessionalinfoPageTest() throws InterruptedException, IOException
	{
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
	public void fillEmmergencyinfoPageTest() throws InterruptedException, IOException 
	{
		// ----------------------Emmergency Info page
		Thread.sleep(5000);
		emergencyContactPage.emergencyFirstName(TestUtil.readDataFromExcellString(8, 3, 0));
		emergencyContactPage.emergencyMiddleName(TestUtil.readDataFromExcellString(8, 5, 0));
		emergencyContactPage.emergencyLastName(TestUtil.readDataFromExcellString(8, 4, 0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passFlatNumber(TestUtil.readDataFromExcellString(8, 7, 0));
		emergencyContactPage.passStreetName(TestUtil.readDataFromExcellString(8, 8, 0));
		emergencyContactPage.passLandmark(TestUtil.readDataFromExcellString(8, 9, 0));
		emergencyContactPage.passPincode(TestUtil.readDataFromExcellString(8,10, 0));
		emergencyContactPage.passCityName(TestUtil.readDataFromExcellString(8, 11, 0));
		emergencyContactPage.selectCountryType();
		emergencyContactPage.selectStateType();
		emergencyContactPage.passContact(TestUtil.readDataFromExcellString(8, 14, 0));
		emergencyContactPage.passEmail(TestUtil.readDataFromExcellString(8, 15, 0));
	}

	@Test(priority = 6)
	public void ContinueAndSaveEmergTest() throws InterruptedException,
	IOException {
		emergencyContactPage.emergencySaveAndContinuebtn.click();
		TestUtil.writeStringValue(9, 1, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.travelInfoPageTitle);	
		Thread.sleep(3000);
		travelInfoPage.getTextTravelInfoPagetitle();
		Assert.assertEquals(travelInfoPage.getTextTravelInfoPagetitle(),TestUtil.readDataFromExcellString(9, 2, 0),"it is not navigate to travel info page when compared with Test Data");
		TestUtil.writeStringValue(9, 2, 1);
	}

	@Test(priority = 7)
	public void passDateOfDepartureTest() throws InterruptedException,IOException 
	{
		//TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.departureDate);	
		Thread.sleep(3000);
		TestUtil.waitForElementToVisible(travelInfoPage.departureDate, 80);
		travelInfoPage.selectDateOfBirth();
		travelInfoPage.selectYear();
		travelInfoPage.selectMonth();
		travelInfoPage.selectDate();
	//	TestUtil.writeStringValue(9, 3, 1);
	}

	@Test(priority = 8)
	public void clickPurpose_of_journeyTest() throws InterruptedException,IOException {
		Thread.sleep(2000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.purpose_of_journey);	
		Thread.sleep(3000);
		travelInfoPage.clickPurpose_of_journey();
		Assert.assertEquals(travelInfoPage.getTextpurpose_of_journey(),TestUtil.readDataFromExcellString(9, 7, 0),"purpose of journey is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 7, 1);
	}

	@Test(priority = 9)
	public void clickOnIsApplicantPossessionRoundTicketTest()throws InterruptedException, IOException {
		Thread.sleep(1000);
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		Assert.assertEquals(travelInfoPage.getTextFromRoundTicket(),TestUtil.readDataFromExcellString(9, 4, 0),"it is not navigate to travel info page when compared with Test Data");
		TestUtil.writeStringValue(9, 4, 1);
	}

	@Test(priority = 10)
	public void passTicketNumberTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,0));
		Assert.assertEquals(travelInfoPage.getTextTicketNumber(),TestUtil.readDataFromExcellString(9, 5, 0),"Ticket number is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 5, 1);
	}

	@Test(priority = 11)
	public void clickOnTravelByTest() throws InterruptedException, IOException {
		Thread.sleep(1000);
		travelInfoPage.clickOnTravelBy();
		Assert.assertEquals(travelInfoPage.getTextTravelingBy(),TestUtil.readDataFromExcellString(9, 6, 0),"Travel by option is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 6, 1);
	}

	@Test(priority = 12)
	public void VisaFeesTestandNext() throws InterruptedException, IOException {
		travelInfoPage.visaFees.click();
		Thread.sleep(1000);
		TestUtil.writeStringValue(9, 9, 1);
		Thread.sleep(1000);
		travelInfoPage.applicant_travel_information_form_btn.click();
		TestUtil.writeStringValue(9, 8, 1);
	} 
	
//-------------PrimaryReference
	@Test(priority = 13)
	public void PriReferenceContactDetailsTest() throws InterruptedException, IOException {
		travelInfoPage.PriReferenceFirstName(TestUtil.readDataFromExcellString(9,16, 0));
		Assert.assertEquals(travelInfoPage.getPriReferenceFirstName(), TestUtil.readDataFromExcellString(9,16, 0),
				"First name from Reference page is not matched when compare with Test data");
		TestUtil.writeStringValue(9,16,1);
		
		
		travelInfoPage.PriReferenceMiddleName(TestUtil.readDataFromExcellString(9,17, 0));
		Assert.assertEquals(travelInfoPage.getPriReferenceMiddleName(), TestUtil.readDataFromExcellString(9,17, 0),
				"Middle name from Reference page is not matched when compare with Test data");
		TestUtil.writeStringValue(9,17, 1);
		
		travelInfoPage.PriReferenceLastName(TestUtil.readDataFromExcellString(9,18,0));
		Assert.assertEquals(travelInfoPage.getPriReferenceLastName(), TestUtil.readDataFromExcellString(9,18,0),
				"Last name from Reference page is not matched when compare with Test data");
		TestUtil.writeStringValue(9,18,1);
		
	}
	
	@Test(priority =14)
	public void fillPriReferenceaddressInfoTest1() throws InterruptedException, IOException {
		Thread.sleep(2000);
		travelInfoPage.passPriReferenceFlatNumber(TestUtil.readDataFromExcellString(9,19, 0));
		Assert.assertEquals(travelInfoPage.getPriReferenceFlatNumber(), TestUtil.readDataFromExcellString(9,19, 0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(9,19,1);
		Thread.sleep(2000);
		travelInfoPage.passPriReferenceStreetName(TestUtil.readDataFromExcellString(9,20,0));
		Assert.assertEquals(travelInfoPage.getPriReferenceStreetName(), TestUtil.readDataFromExcellString(9,20,0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,20,1);
	}
	
	@Test(priority = 15)
	public void fillPriReferenceaddressInfoTest2() throws InterruptedException, IOException {
		travelInfoPage.passPriReferenceLandmark(TestUtil.readDataFromExcellString(9,21,0));
		Assert.assertEquals(travelInfoPage.getPriReferenceLandmark(), TestUtil.readDataFromExcellString(9,21,0),"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,21,1);
		
		travelInfoPage.passPriReferencePincode(TestUtil.readDataFromExcellString(9,22,0));
		Assert.assertEquals(travelInfoPage.getPriReferencePincode(), TestUtil.readDataFromExcellString(9,22,0),"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(9,22,1);

	}
	@Test(priority = 16)
	public void fillPriReferenceaddressInfoTest3() throws InterruptedException, IOException {
		travelInfoPage.passPriReferenceCityName(TestUtil.readDataFromExcellString(9,23,0));
		Assert.assertEquals(travelInfoPage.getPriReferenceCityName(), TestUtil.readDataFromExcellString(9,23,0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,23,1);	
	}
	
	@Test(priority = 17)
	public void SelectPriReferenceCountry() throws IOException, InterruptedException
	{travelInfoPage.selectPriReferenceCountryType();
	Assert.assertEquals(travelInfoPage.getPriReferenceCountryType(), TestUtil.readDataFromExcellString(9, 25, 0),"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(9, 25, 1);
	}

	@Test(priority = 18)
	public void SelectPriReferenceState() throws IOException, InterruptedException
	{travelInfoPage.selectPriReferenceStateType();
	Assert.assertEquals(travelInfoPage.getPriReferenceStateType(), TestUtil.readDataFromExcellString(9,24, 0),"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(9,24 , 1);
	}	
		
	@Test(priority =19)
	public void PassPriReferenceContact() throws IOException, InterruptedException
	{
		travelInfoPage.passPriReferenceContact(TestUtil.readDataFromExcellString(9, 26, 0));
		Assert.assertEquals(travelInfoPage.getPriReferenceContact(), TestUtil.readDataFromExcellString(9,26 , 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,26 , 1);	
	}
	@Test(priority =20)
	public void PassPriReferenceEmail() throws IOException, InterruptedException
	{
		travelInfoPage.passPriReferenceEmail(TestUtil.readDataFromExcellString(9, 27, 0));
		Assert.assertEquals(travelInfoPage.getPriReferenceEmail(), TestUtil.readDataFromExcellString(9,27 , 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,27 , 1);
	
	}
	
	
	//--------------------Secondary References 
	@Test(priority = 21)
	public void SecReferencesContactDetailsTest() throws InterruptedException, IOException {
		travelInfoPage.SecReferencesFirstName(TestUtil.readDataFromExcellString(9, 29, 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesFirstName(), TestUtil.readDataFromExcellString(9,29 , 0),
				"First name from Reference page is not matched when compare with Test data");
		TestUtil.writeStringValue(9,29 , 1);
		
		
		travelInfoPage.SecReferencesMiddleName(TestUtil.readDataFromExcellString(9,30 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesMiddleName(), TestUtil.readDataFromExcellString(9,30 , 0),
				"Middle name from Reference page is not matched when compare with Test data");
		TestUtil.writeStringValue(9, 30, 1);
		
		travelInfoPage.SecReferencesLastName(TestUtil.readDataFromExcellString(9, 31, 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesLastName(), TestUtil.readDataFromExcellString(9,31 , 0),
				"Last name from Referencepage is not matched when compare with Test data");
		TestUtil.writeStringValue(9, 31, 1);
		
	}
	
	@Test(priority =22)
	public void fillSecReferencesaddressInfoTest1() throws InterruptedException, IOException {
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesFlatNumber(TestUtil.readDataFromExcellString(9, 32, 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesFlatNumber(), TestUtil.readDataFromExcellString(9,32 , 0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(9,32 , 1);
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesStreetName(TestUtil.readDataFromExcellString(9,33 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesStreetName(), TestUtil.readDataFromExcellString(9,33, 0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,33 , 1);
	}
	
	@Test(priority = 23)
	public void fillSecReferencesaddressInfoTest2() throws InterruptedException, IOException {
		travelInfoPage.passSecReferencesLandmark(TestUtil.readDataFromExcellString(9,34 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesLandmark(), TestUtil.readDataFromExcellString(9,34 , 0),"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(9, 34, 1);
		
		travelInfoPage.passSecReferencesPincode(TestUtil.readDataFromExcellString(9,35, 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesPincode(), TestUtil.readDataFromExcellString(9,35 , 0),"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(9,35 , 1);

	}
	@Test(priority = 24)
	public void fillSecReferencesaddressInfoTest3() throws InterruptedException, IOException {
		travelInfoPage.passSecReferencesCityName(TestUtil.readDataFromExcellString(9,36 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesCityName(), TestUtil.readDataFromExcellString(9,36, 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue( 9,36 ,1);	
	}
	
	@Test(priority = 25)
	public void SelectSecReferencesCountry() throws IOException, InterruptedException
	{travelInfoPage.selectSecReferencesCountryType();
	Assert.assertEquals(travelInfoPage.getSecReferencesCountryType(), TestUtil.readDataFromExcellString(9,38 , 0),"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(9,38 , 1);
	}

	@Test(priority = 26)
	public void SelectSecReferencesState() throws IOException, InterruptedException
	{travelInfoPage.selectSecReferencesStateType();
	Assert.assertEquals(travelInfoPage.getSecReferencesStateType(), TestUtil.readDataFromExcellString(9,37 , 0),"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(9, 37, 1);
	}	
		
	@Test(priority =27)
	public void PassSecReferencesContact() throws IOException, InterruptedException
	{
		travelInfoPage.passSecReferencesContact(TestUtil.readDataFromExcellString(9,39 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesContact(), TestUtil.readDataFromExcellString(9, 39, 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(9,39 , 1);	
	}
	@Test(priority =28)
	public void PassSecReferencesEmail() throws IOException, InterruptedException
	{
		travelInfoPage.passSecReferencesEmail(TestUtil.readDataFromExcellString(9,40 , 0));
		Assert.assertEquals(travelInfoPage.getSecReferencesEmail(), TestUtil.readDataFromExcellString(9,40 , 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(9, 40, 1);
		travelInfoPage.SecReferencesSaveAndContinuebtn.click();
		TestUtil.writeStringValue(9, 41, 1);			
	}
}




























/*
	@Test(priority = 13)
	public void passPrimaryRefFirstnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		Assert.assertEquals(travelInfoPage.getTextPrimaryRefFirstname(),
				TestUtil.readDataFromExcellString(9, 8, 0),
				"First name of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 8, 1);

	}

	@Test(priority = 14)
	public void passPrimaryRefLastnameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefLastname(TestUtil.readDataFromExcellString(9, 9, 0));
		Assert.assertEquals(travelInfoPage.getTextPrimaryRefLastname(),
				TestUtil.readDataFromExcellString(9, 9, 0),
				"Last name of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 9, 1);

	}

	@Test(priority = 15)
	public void passPrimaryRefMiddlenameTest() throws InterruptedException,
			IOException {
		travelInfoPage.passPrimaryRefMiddlename(TestUtil.readDataFromExcellString(9, , 0));
		Assert.assertEquals(travelInfoPage.getTextPrimaryRefMiddlename(),
				TestUtil.readDataFromExcellString(9, , 0),
				"Middle name of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, , 1);

	}
	

	
	
	@Test(priority = 16)
	public void pass_Primary_ref_addressTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_Primary_ref_address(TestUtil.readDataFromExcellString(9, 10, 0));
		Assert.assertEquals(travelInfoPage.getText_Primary_ref_address(),
				TestUtil.readDataFromExcellString(9, 10, 0),
				"Address of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 10, 1);

	}
	@Test(priority = 17)
	public void pass_Primary_ref_address1Test() throws InterruptedException,
			IOException {
		travelInfoPage.pass_Primary_ref_address1(TestUtil.readDataFromExcellString(9, , 0));
		Assert.assertEquals(travelInfoPage.getText_Primary_ref_address1(),
				TestUtil.readDataFromExcellString(9, , 0),
				"Address of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, , 1);

	}

	
	
	
	
	@Test(priority = 18)
	public void pass_primary_ref_pincodeTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_pincode(TestUtil.readDataFromExcellString(9, 11, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_pincode(),
				TestUtil.readDataFromExcellString(9, 11, 0),
				"Pincode of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 11, 1);

	}

	@Test(priority = 15)
	public void pass_primary_ref_cityTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(9, 12, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_city(),
				TestUtil.readDataFromExcellString(9, 12, 0),
				"City of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 12, 1);

	}

	@Test(priority = 16)
	public void pass_primary_ref_stateTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_state(TestUtil.readDataFromExcellString(9, 13, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_state(),
				TestUtil.readDataFromExcellString(9, 13, 0),
				"State of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 13, 1);

	}

	@Test(priority = 17)
	public void pass_primary_ref_countryTest() throws InterruptedException,
			IOException {
		travelInfoPage.pass_primary_ref_country(TestUtil.readDataFromExcellString(9, 14, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_country(),
				TestUtil.readDataFromExcellString(9, 14, 0),
				"Country of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 14, 1);

	}

	@Test(priority = 18)
	public void pass_primary_ref_phone_numberTest()throws InterruptedException, IOException {

		travelInfoPage.pass_primary_ref_phone_number(TestUtil.readDataFromExcellString(9, 15, 0));
		Assert.assertEquals(travelInfoPage.getText_primary_ref_phone_number(),
				TestUtil.readDataFromExcellString(9, 15, 0),
				"Contact number of reference one is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 15, 1);
	}

	@Test(priority = 19)
	public void pass_firstName_SecRef() throws InterruptedException,IOException {
		travelInfoPage.passsecondaryRefFirstname(TestUtil.readDataFromExcellString(9, 16, 0));
		Assert.assertEquals(
				travelInfoPage.getTextsecondaryRefFirstname(),
				TestUtil.readDataFromExcellString(9, 16, 0),
				"First name number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 16, 1);

	}

	@Test(priority = 20)
	public void pass_LastName_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_lastname(TestUtil.readDataFromExcellString(9, 17, 0));
		Assert.assertEquals(travelInfoPage.geText_secondary_ref_lastname(),
				TestUtil.readDataFromExcellString(9, 17, 0),
				"Last name number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 17, 1);

	}

	@Test(priority = 21)
	public void pass_Address_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_address(TestUtil.readDataFromExcellString(9, 18, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_address(),
				TestUtil.readDataFromExcellString(9, 18, 0),
				"Address number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 18, 1);

	}

	@Test(priority = 22)
	public void pass_Pincode_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_pincode(TestUtil.readDataFromExcellString(9, 19, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_pincode(),
				TestUtil.readDataFromExcellString(9, 19, 0),
				"Pincode number of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 19, 1);

	}

	@Test(priority = 23)
	public void pass_City_SecRef() throws InterruptedException, IOException {

		travelInfoPage.pass_secondary_ref_city(TestUtil.readDataFromExcellString(9, 20, 0));
		Assert.assertEquals(travelInfoPage.geText_secondary_ref_city(),
				TestUtil.readDataFromExcellString(9, 20, 0),
				"City name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 20, 1);

	}

	@Test(priority = 24)
	public void pass_State_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_state(TestUtil.readDataFromExcellString(9, 21, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_state(),
				TestUtil.readDataFromExcellString(9, 21, 0),
				"State name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 21, 1);

	}

	@Test(priority = 25)
	public void pass_Country_SecRef() throws InterruptedException, IOException {
		travelInfoPage.pass_secondary_ref_country(TestUtil.readDataFromExcellString(9, 22, 0));
		Assert.assertEquals(travelInfoPage.getText_secondary_ref_country(),
				TestUtil.readDataFromExcellString(9, 22, 0),
				"Country name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 22, 1);

	}

	@Test(priority = 26)
	public void pass_secondary_ref_phone_number() throws InterruptedException,
			IOException {
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil.readDataFromExcellString(9, 23, 0));
		Assert.assertEquals(
				travelInfoPage.getText_secondary_ref_phone_number(),
				TestUtil.readDataFromExcellString(9, 23, 0),
				"Conatct name of reference two is not matched when compared with Test Data");
		TestUtil.writeStringValue(9, 23, 1);
	}

	@Test(priority = 27)
	public void verifyCheckBoxTest() throws InterruptedException, IOException {
		travelInfoPage.clickOnByPhoneCheckbox();
		System.out.println("travelInfoPage.verifyByPhoneCheckbox()"
				+ travelInfoPage.verifyByPhoneCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByPhoneCheckbox(),
				"Phone Check box is not selected");
		travelInfoPage.clickOnByTextMessageCheckbox();
		System.out.println("travelInfoPage.verifyByTextMessageCheckbox()"
				+ travelInfoPage.verifyByTextMessageCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByTextMessageCheckbox(),
				"By Text Message Check box is not selected");
		travelInfoPage.clickOnByEmailCheckbox();
		System.out.println("travelInfoPage.verifyByEmailCheckbox()"
				+ travelInfoPage.verifyByEmailCheckbox());
		Assert.assertTrue(travelInfoPage.verifyByEmailCheckbox(),
				"By Email Check box is not seletced");
		travelInfoPage.passOtherWayToReach(TestUtil.readDataFromExcellString(9,
				24, 0));
		Assert.assertEquals(travelInfoPage.getTextOtherWayToReach(),
				TestUtil.readDataFromExcellString(9, 24, 0),
				"Other waay to contact is not matched with TestData");
	}
*/
