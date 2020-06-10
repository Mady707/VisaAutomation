package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.util.TestUtil.*;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class VisaPaymentPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();

	public VisaPaymentPageTest() throws IOException, InterruptedException {
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
		//signUpPage.captchaclick.click();
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

	@Test(priority=9, description="Here verifying confirmation message and click on ok btn ")
	public void verifyClickOnSubmitBtnTest() throws InterruptedException, IOException{
		//visaPaymentPage.getTextsubmitBtn();	
		reviewApplicationPage.clickOnContinuebutton();
		TestUtil.writeStringValue(12, 1, 1);
		// We are on payment page and verifing title of Payment
		Assert.assertEquals(visaPaymentPage.getTextPaymentPageTitle(), TestUtil.readDataFromExcellString(12, 2, 0),"it is not navigate to payment info page");	
		TestUtil.writeStringValue(12, 2, 1);
		visaPaymentPage.makeVisapaymentBtn();
		

		System.out.println(">>>>>>>>>>>Razer Pay>>>>>>>>>>");
		TestUtil.switchToFrameByIndex(0);
		visaPaymentPage.netbankingpayment.click();
		TestUtil.writeStringValue(12, 4, 1);
		
		
		
		visaPaymentPage.HDFCbank.click();
		TestUtil.writeStringValue(12, 5, 1);
		
		visaPaymentPage.Submit.click();
		TestUtil.writeStringValue(12, 6, 1);

		System.out.println("****For Suucess********");
		TestUtil.toSwitchBetweenWindows(2);
		//TestUtil.switchToFrameByWebElement(visaPaymentPage.Success);
		visaPaymentPage.Success.click();
		TestUtil.writeStringValue(12, 7, 1);

		System.out.println("------For Receipt-----");
		TestUtil.toSwitchBetweenWindows(0);
		Thread.sleep(2000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(visaPaymentPage.OK);
		visaPaymentPage.OK.click();
		TestUtil.writeStringValue(12, 8, 1);
		Thread.sleep(2000);
		visaPaymentPage.DONE.click();
		TestUtil.writeStringValue(12, 9, 1);

		//		visaPaymentPage.passCardNo();
		//		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		//		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		//		visaPaymentPage.passCvvNo();
		//		TestUtil.writeStringValue(12, 4, 1);
		//		visaPaymentPage.clickOnMakePaymentBtn();
		//		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 5, 0),"it is not navigate to Send PARes to TermUrl after clicking on MakePayment button");	
		//		TestUtil.writeStringValue(12, 5, 1);
		//		visaPaymentPage.clickOnSubmitbtn();
		//		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 6, 0),"it is not navigate to Payment after clicking on Submit button");	
		//		TestUtil.writeStringValue(12, 6, 1);
		//		visaPaymentPage.clickOnOKtbtn();
		//		System.out.println("================================>" +driver.getTitle());
		//		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(12, 7, 0),"it is not navigate to Track Application after clicking on OK button");	
		//		TestUtil.writeStringValue(12, 7, 1);
		//		visaPaymentPage.clickOnDonetbtn();
		//		Thread.sleep(2000);
		//		Assert.assertEquals(homePage.validateHomePageTitle(), TestUtil.readDataFromExcellString(5, 1, 0),"We are not navigate to Home page after payment");
		//		TestUtil.writeStringValue(12, 8, 1);
		//		System.out.println( "visa applicationID after payment==>" +applicationID);

	}

}
