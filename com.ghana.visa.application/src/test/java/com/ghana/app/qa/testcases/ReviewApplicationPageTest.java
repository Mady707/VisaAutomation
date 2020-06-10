package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.*;

public class ReviewApplicationPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public ReviewApplicationPageTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException, IOException 
	{
		homePage.clickOnApplyVisa();
		homePage.applyVisa2.click();
		visaCategoriesPage.launchAndGotoSignUP();
		signUpPage.selectNationality();
		signUpPage.selectVisaLocation();
		signUpPage.selectCountryOfResidence();
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
		signUpPage.enterCaptchaField();
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
		professionalinfopage.passNameofprofession(TestUtil.readDataFromExcellString(25, 3, 0));
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
		emergencyContactPage.emergencyFirstName(TestUtil.readDataFromExcellString(8,3,0));
		emergencyContactPage.emergencyMiddleName(TestUtil.readDataFromExcellString(8,5,0));
		emergencyContactPage.emergencyLastName(TestUtil.readDataFromExcellString(8,4,0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passFlatNumber(TestUtil.readDataFromExcellString(8,7,0));
		emergencyContactPage.passStreetName(TestUtil.readDataFromExcellString(8,8,0));
		emergencyContactPage.passLandmark(TestUtil.readDataFromExcellString(8,9,0));
		emergencyContactPage.passPincode(TestUtil.readDataFromExcellString(8,10,0));
		emergencyContactPage.passCityName(TestUtil.readDataFromExcellString(8,11,0));
		emergencyContactPage.selectCountryType();
		emergencyContactPage.selectStateType();
		emergencyContactPage.passContact(TestUtil.readDataFromExcellString(8,14,0));
		emergencyContactPage.passEmail(TestUtil.readDataFromExcellString(8,15,0));
		emergencyContactPage.emergencySaveAndContinuebtn.click();
	}

	@Test(priority = 6)
	public void fillTravelInfoPageTest() throws InterruptedException,IOException {
		Thread.sleep(3000);
		TestUtil.waitForElementToVisible(travelInfoPage.departureDate, 80);
		travelInfoPage.selectDateOfBirth();
		travelInfoPage.selectYear();
		travelInfoPage.selectMonth();
		travelInfoPage.selectDate();
		Thread.sleep(2000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.purpose_of_journey);	
		Thread.sleep(3000);
		travelInfoPage.clickPurpose_of_journey();
		Thread.sleep(1000);
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		Thread.sleep(2000);
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9,5,0));
		Thread.sleep(1000);
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.visaFees.click();
		Thread.sleep(1000);
		travelInfoPage.applicant_travel_information_form_btn.click();
	}

	@Test(priority = 7)
	public void fillReferencesPageTest() throws InterruptedException,IOException {
		Thread.sleep(3000);

		travelInfoPage.PriReferenceFirstName(TestUtil.readDataFromExcellString(9,16,0));
		travelInfoPage.PriReferenceMiddleName(TestUtil.readDataFromExcellString(9,17,0));
		travelInfoPage.PriReferenceLastName(TestUtil.readDataFromExcellString(9,18,0));
		travelInfoPage.passPriReferenceFlatNumber(TestUtil.readDataFromExcellString(9,19, 0));
		travelInfoPage.passPriReferenceStreetName(TestUtil.readDataFromExcellString(9,20,0));
		travelInfoPage.passPriReferenceLandmark(TestUtil.readDataFromExcellString(9,21,0));
		travelInfoPage.passPriReferencePincode(TestUtil.readDataFromExcellString(9,22,0));
		travelInfoPage.passPriReferenceCityName(TestUtil.readDataFromExcellString(9,23,0));
		travelInfoPage.selectPriReferenceCountryType();
		travelInfoPage.selectPriReferenceStateType();
		travelInfoPage.passPriReferenceContact(TestUtil.readDataFromExcellString(9,26,0));
		travelInfoPage.passPriReferenceEmail(TestUtil.readDataFromExcellString(9,27,0));

		travelInfoPage.SecReferencesFirstName(TestUtil.readDataFromExcellString(9,29,0));
		travelInfoPage.SecReferencesMiddleName(TestUtil.readDataFromExcellString(9,30,0));
		travelInfoPage.SecReferencesLastName(TestUtil.readDataFromExcellString(9,31,0));
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesFlatNumber(TestUtil.readDataFromExcellString(9,32,0));
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesStreetName(TestUtil.readDataFromExcellString(9,33,0));
		travelInfoPage.passSecReferencesLandmark(TestUtil.readDataFromExcellString(9,34,0));
		travelInfoPage.passSecReferencesPincode(TestUtil.readDataFromExcellString(9,35,0));
		travelInfoPage.passSecReferencesCityName(TestUtil.readDataFromExcellString(9,36,0));
		travelInfoPage.selectSecReferencesCountryType();
		travelInfoPage.selectSecReferencesStateType();
		travelInfoPage.passSecReferencesContact(TestUtil.readDataFromExcellString(9,39,0));
		travelInfoPage.passSecReferencesEmail(TestUtil.readDataFromExcellString(9,40,0));	
		travelInfoPage.SecReferencesSaveAndContinuebtn.click();	
	}

	@Test(priority = 8)
	public void documentPageTest() throws InterruptedException, IOException {
		uploadDocPage.UploadDocument();	
		uploadDocPage.clicksaveAndContiBtn();
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);
	}

	@Test(priority = 9)
	public void getTextPersonalInfoTest() throws InterruptedException,
	IOException {
	
		Assert.assertEquals(reviewApplicationPage.getTextReviewPageTtle(),TestUtil.readDataFromExcellString(11, 2, 0),"We are not navigate to review Application page from upload document");
		TestUtil.writeStringValue(11, 2, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.firstLastName);
		//System.out.println("applicationID==>Revie1" + applicationID);
		Assert.assertEquals(reviewApplicationPage.getTextFromfirstLastName(),(TestUtil.readDataFromExcellString(6, 5, 0) + " " + TestUtil.readDataFromExcellString(6, 6, 0)+ " " + TestUtil.readDataFromExcellString(6, 7, 0)),"Provided and Get firstName and lastname are not matched");
		TestUtil.writeStringValue(11, 3, 1);
		//TestUtil.dateAlter(birthDate);
		Assert.assertEquals(reviewApplicationPage.getTextBirthDate(),TestUtil.readDataFromExcellString(5, 14, 0),"Provided and Get Birthdate are not matched");
		TestUtil.writeStringValue(11, 4, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromBirthPlace(),TestUtil.readDataFromExcellString(6, 11, 0),"Provided and Get birthPlace are not matched");
		TestUtil.writeStringValue(11, 5, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.passportNumber);
		Assert.assertEquals(reviewApplicationPage.getTextFromPassportNumber(),TestUtil.readDataFromExcellString(6, 8, 0),"Provided and Get passportNumber are not matched");
		TestUtil.writeStringValue(11, 6, 1);
		//TestUtil.dateAlter(passportIssuedDate);
		Assert.assertEquals(reviewApplicationPage.getTextFromPassportIssuedDate(),TestUtil.readDataFromExcellString(6, 9, 0),"Provided and Get passportIssuedDate are not matched");
		TestUtil.writeStringValue(11, 7, 1);
		TestUtil.dateAlter(passportExpiryDate);
		Assert.assertEquals(reviewApplicationPage.getTextFromPassportExpiryDate(),TestUtil.readDataFromExcellString(6, 10, 0),"Provided and Get passportExpiryDate are not matched");
		TestUtil.writeStringValue(11, 8, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.gender);
		Assert.assertEquals(reviewApplicationPage.getTextGender(),TestUtil.readDataFromExcellString(5, 21, 0),"Provided and Get Gender are not matched");
		TestUtil.writeStringValue(11, 9, 1);
		Assert.assertEquals(reviewApplicationPage.getTextVisaLocation(),TestUtil.readDataFromExcellString(5, 10, 0),"Provided and Get Visa Location are not matched");
		TestUtil.writeStringValue(11, 10, 1);
		Assert.assertEquals(reviewApplicationPage.getTextVisaFees(),TestUtil.readDataFromExcellString(5, 9, 0),"Provided and Get Visa Fees are not matched");
		TestUtil.writeStringValue(11, 11, 1);
		Assert.assertEquals(reviewApplicationPage.getTextContact(),TestUtil.readDataFromExcellString(5, 11, 0),"Provided and Get Contact are not matched");
		TestUtil.writeStringValue(11, 12, 1);	
		Assert.assertEquals(reviewApplicationPage.getTextEmail(),TestUtil.readDataFromExcellString(5, 12, 0),"Provided and Get Email are not matched");
		TestUtil.writeStringValue(11, 13, 1);
		
		// softAssertion.assertAll();
	}

	@Test(priority = 10)
	public void getTextAddressInfoTest() throws InterruptedException,
	IOException {
		// Address Info
		Assert.assertEquals(reviewApplicationPage.getTextFromAddress(),(TestUtil.readDataFromExcellString(7, 4, 0) + ", "+ TestUtil.readDataFromExcellString(7, 5, 0) + ", " + TestUtil.readDataFromExcellString(7, 6, 0)),"Provided and Get address are not matched");
		TestUtil.writeStringValue(11, 14, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromAddressType(),addressType, "Provided and Get addressType are not matched");
		TestUtil.writeStringValue(11, 15, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.pinCode);
		Assert.assertEquals(reviewApplicationPage.getTextFrompinCode(),TestUtil.readDataFromExcellString(7, 7, 0),"Provided and Get pinCode are not matched");
		TestUtil.writeStringValue(11, 16, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromCityName(),TestUtil.readDataFromExcellString(7, 8, 0),"Provided and Get cityName are not matched");
		TestUtil.writeStringValue(11, 17, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromStateName(),TestUtil.readDataFromExcellString(7, 9, 0),"Provided and Get stateName are not matched");
		TestUtil.writeStringValue(11, 18, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromCountryName(),TestUtil.readDataFromExcellString(7, 10, 0),"Provided and Get countryName are not matched");
		TestUtil.writeStringValue(11, 19, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromNationality(),TestUtil.readDataFromExcellString(5, 7, 0),"Provided and Get nationality are not matched");
		TestUtil.writeStringValue(11, 20, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromFormerNationality(), formerNationality, "Provided and Get formerNationality are not matched");
		TestUtil.writeStringValue(11, 21, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromEmailId(),TestUtil.readDataFromExcellString(5, 12, 0),	"Provided and Get emailId are not matched");
		TestUtil.writeStringValue(11, 22, 1);
		Assert.assertEquals(reviewApplicationPage.getTextFromPhoneNumber(),TestUtil.readDataFromExcellString(5, 11, 0),	"Provided and Get phoneNumber are not matched");
		TestUtil.writeStringValue(11, 23, 1);
		
		// softAssertion.assertAll();

	}

	@Test(priority = 11)
	public void getTextEmergencyContactTest() throws InterruptedException,
	IOException {
		// Emergency contact
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerContactName(),(TestUtil.readDataFromExcellString(8, 3, 0) + " " + TestUtil.readDataFromExcellString(8, 5, 0)+ " " + TestUtil.readDataFromExcellString(8, 4, 0)),"Provided and Get Name are not matched");
		TestUtil.writeStringValue(11, 24, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromRelationShip(),(TestUtil.readDataFromExcellString(8, 6, 0)),"Provided and Get Relationship are not matched");
		TestUtil.writeStringValue(11, 25, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.emerPhoneNumber);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPhoneNumber(),TestUtil.readDataFromExcellString(8, 14, 0),"Provided and Get emerPhoneNumber are not matched");
		TestUtil.writeStringValue(11, 26, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.emerEmail);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerEmail(),TestUtil.readDataFromExcellString(8, 15, 0),"Provided and Get emerEmail are not matched");
		TestUtil.writeStringValue(11, 27, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmployerAddress(),TestUtil.readDataFromExcellString(8, 7, 0)+ " " + TestUtil.readDataFromExcellString(8, 8, 0)+ " " + TestUtil.readDataFromExcellString(8, 9, 0),"Provided and Get Address are not matched");
		TestUtil.writeStringValue(11, 28, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerPincode(),TestUtil.readDataFromExcellString(8, 10, 0),"Provided and Get emerPincode are not matched");
		TestUtil.writeStringValue(11, 29, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCityName(),TestUtil.readDataFromExcellString(8, 11, 0),"Provided and Get emerCityName are not matched");
		TestUtil.writeStringValue(11, 30, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerState(),TestUtil.readDataFromExcellString(8, 12, 0),"Provided and Get emerState are not matched");
		TestUtil.writeStringValue(11, 31, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromEmerCountry(),TestUtil.readDataFromExcellString(8, 13, 0),"Provided and Get emerCountry are not matched");
		TestUtil.writeStringValue(11, 32, 1);
		softAssertion.assertAll();

	}

	@Test(priority = 12)
	public void getTextTravelInfoTest() throws InterruptedException,
	IOException {
		// Travel Info
		//TestUtil.dateAlter(dateOfDeparture);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromDateOfDeparture(),TestUtil.readDataFromExcellString(9, 3, 0),"Provided and Get dateOfDeparture are not matched");
		TestUtil.writeStringValue(11, 33, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromtTicketNumber(), TestUtil.readDataFromExcellString(9, 5, 0),"Provided and Get emerTicketNumber are not matched");
		TestUtil.writeStringValue(11, 34, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromRoundTicket(), TestUtil.readDataFromExcellString(9, 4, 0),"Provided and Get emerRoundTicket are not matched");
		TestUtil.writeStringValue(11, 35, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.travellingBy);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromTravellingBy(), TestUtil.readDataFromExcellString(9, 6, 0),"Provided and Get emerTravellingBy are not matched");
		TestUtil.writeStringValue(11, 36, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromReachBy(), TestUtil.readDataFromExcellString(9, 7, 0),"Provided and Get emerReachBy are not matched");
		TestUtil.writeStringValue(11, 37, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromVisamode(), TestUtil.readDataFromExcellString(9, 9, 0),"Provided and Get emerVisamode are not matched");
		TestUtil.writeStringValue(11, 38, 1);
		
		// primary reference

		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryFirstLastName(),(TestUtil.readDataFromExcellString(9, 16, 0) + " " + TestUtil.readDataFromExcellString(9, 17, 0)+ " " + TestUtil.readDataFromExcellString(9, 18, 0)),"Provided and Get primaryFirstMiddleLastName are not matched");
		TestUtil.writeStringValue(11, 39, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryAddress(),(TestUtil.readDataFromExcellString(9, 19, 0)+ " " + TestUtil.readDataFromExcellString(9, 20, 0)+ " " + TestUtil.readDataFromExcellString(9, 21, 0)),"Provided and Get primaryAddress are not matched");
		TestUtil.writeStringValue(11, 40, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryPinCode(),TestUtil.readDataFromExcellString(9, 22, 0),"Provided and Get primaryPinCode are not matched");
		TestUtil.writeStringValue(11, 41, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCity(), TestUtil.readDataFromExcellString(9, 23, 0),"Provided and Get primaryCity are not matched");
		TestUtil.writeStringValue(11, 42, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryState(), TestUtil.readDataFromExcellString(9, 24, 0),"Provided and Get primaryState are not matched");
		TestUtil.writeStringValue(11, 43, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.primaryCountry);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryCountry(),TestUtil.readDataFromExcellString(9, 25, 0),"Provided and Get primaryCountry are not matched");
		TestUtil.writeStringValue(11, 44, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryRefrencePhoneNo(),TestUtil.readDataFromExcellString(9, 26, 0),"Provided and Get primaryRefrencePhoneNo are not matched");
		TestUtil.writeStringValue(11, 46, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromPrimaryRefrenceEmail(),TestUtil.readDataFromExcellString(9, 27, 0),"Provided and Get primaryRefrenceEmail are not matched");
		TestUtil.writeStringValue(11, 45, 1);
		// Secondary reference

		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryFirstLastName(),(TestUtil.readDataFromExcellString(9, 29, 0) + " " + TestUtil.readDataFromExcellString(9, 30, 0)+ " " + TestUtil.readDataFromExcellString(9, 31, 0)),"Provided and Get secondaryFirstMiddleLastName are not matched");
		TestUtil.writeStringValue(11, 47, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryAddress(),(TestUtil.readDataFromExcellString(9, 32, 0) + " " + TestUtil.readDataFromExcellString(9, 33, 0)+ " " + TestUtil.readDataFromExcellString(9, 34, 0)),"Provided and Get secondaryAddress are not matched");
		TestUtil.writeStringValue(11, 48, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryPinCode(),TestUtil.readDataFromExcellString(9, 35, 0),"Provided and Get primaryPinCode are not matched");
		TestUtil.writeStringValue(11, 49, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCity(),TestUtil.readDataFromExcellString(9, 36, 0),"Provided and Get secondaryCity are not matched");
		TestUtil.writeStringValue(11, 50, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryState(),TestUtil.readDataFromExcellString(9, 37, 0),"Provided and Get secondaryState are not matched");
		TestUtil.writeStringValue(11, 51, 1);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(reviewApplicationPage.secondaryCountry);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryCountry(),TestUtil.readDataFromExcellString(9, 38, 0),"Provided and Get secondaryCountry are not matched");
		TestUtil.writeStringValue(11, 52, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryRefrencePhoneNo(),TestUtil.readDataFromExcellString(9, 39, 0),"Provided and Get secondaryRefrencePhoneNo are not matched");
		TestUtil.writeStringValue(11, 54, 1);
		softAssertion.assertEquals(reviewApplicationPage.getTextFromSecondaryRefrenceEmail(),TestUtil.readDataFromExcellString(9, 40, 0),"Provided and Get secondaryRefrenceEmail are not matched");
		TestUtil.writeStringValue(11, 53, 1);
		softAssertion.assertAll();

	}
	@Test(priority = 13)
	public void Next() throws InterruptedException,
	IOException 
	{
		reviewApplicationPage.clickOnContinuebutton();
	}
	
	
}
