package com.ghana.app.qa.testcases;
import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class HighCommissionPageRejectTest extends DriverInit{

SoftAssert softAssertion = new SoftAssert();
	
	public HighCommissionPageRejectTest() throws IOException, InterruptedException {
		super();

	}
	// Brothers 27,
	
	@Test(priority = 1)
	public void signUpAndFillSignUpPage() throws InterruptedException,
			IOException {
		homePage.clickOnApplyVisa();
		visaCategoriesPage.clickOnVisaType();
		signUpPage.SelectPassportType();
		signUpPage.selectNationality();
		Thread.sleep(1000);
		signUpPage.selectPortOfArrival();
		signUpPage.selectVisaType();
		signUpPage.selectVisaLocation();
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		signUpPage.enterCaptchaField();
		TestUtil.clickOnElement(signUpPage.selectOneRadioButton());
		TestUtil.clickOnElement(signUpPage.termsCheckboxselect());
		TestUtil.clickOnElement(signUpPage.clickOnSelectAll());
		//signUpPage.selectDateOfBirth(TestUtil.readDataFromExcellString(5, 14, 0));
		signUpPage.continueBtn();

	}

	@Test(priority = 2)
	public void fillFormAndPaymentTest() throws InterruptedException, IOException {
		// ----------------------Personal info page //
		// Test----------------------------------//
		Thread.sleep(1000);
		applicationID = personalInfoPage.getApplicationId();
		System.out.println(applicationID);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(6, 5,
				0));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(6, 6,
				0));
		personalInfoPage.passLastName(TestUtil
				.readDataFromExcellString(6, 7, 0));
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(
				6, 8, 0));
		personalInfoPage.clickOnGender();
		personalInfoPage.verifiedGenderSelected();
		personalInfoPage.selectPassIssueDate(TestUtil.readDataFromExcellString(
				6, 9, 0));
		personalInfoPage.selectPassExpiryDate(TestUtil
				.readDataFromExcellString(6, 10, 0));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(6,
				11, 0));
		personalInfoPage.clickOnSaveAndContinue();
	}

	@Test(priority = 3)
	public void fillAddressinfoPageTest() throws InterruptedException,
			IOException {
		// ----------------------Address Info page //
		// Test----------------------------------//
		addressInfoPage.selectFormerNaitonality();
		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(7, 4,
				0));
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(7, 5,
				0));
		addressInfoPage
				.passLandmark(TestUtil.readDataFromExcellString(7, 6, 0));
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(7, 7, 0));
		addressInfoPage
				.passCityName(TestUtil.readDataFromExcellString(7, 8, 0));
		addressInfoPage.passStateName(TestUtil
				.readDataFromExcellString(7, 9, 0));
		addressInfoPage.passCountryName(TestUtil.readDataFromExcellString(7,
				10, 0));
		addressInfoPage.selectAddressType();
		addressInfoPage.clickSaveAndContinuebtn();
	}

	@Test(priority = 4)
	public void fillEmergencyPageTest() throws InterruptedException,
			IOException {
		emergencyContactPage.emergencyFirstName(TestUtil
				.readDataFromExcellString(8, 3, 0));
		emergencyContactPage.emergencyLastName(TestUtil
				.readDataFromExcellString(8, 4, 0));
		emergencyContactPage.emergencyContactNumber(TestUtil
				.readDataFromExcellString(8, 6, 0));
		emergencyContactPage.selectRelation();
		emergencyContactPage.passEmergency_profession(TestUtil
				.readDataFromExcellString(8, 7, 0));
		emergencyContactPage.passEmployerOrSchoolName(TestUtil
				.readDataFromExcellString(8, 8, 0));
		emergencyContactPage.pass_EmployerOrSchooladdress(TestUtil
				.readDataFromExcellString(8, 9, 0));
		emergencyContactPage.pass_Emergency_Pincode(TestUtil
				.readDataFromExcellString(8, 10, 0));
		emergencyContactPage.paa_Emergency_city(TestUtil
				.readDataFromExcellString(8, 11, 0));
		emergencyContactPage.pass_Emergency_State(TestUtil
				.readDataFromExcellString(8, 12, 0));
		emergencyContactPage.pass_Emergency_Country(TestUtil
				.readDataFromExcellString(8, 13, 0));
		emergencyContactPage.pass_emergency_employer_phone_number(TestUtil
				.readDataFromExcellString(8, 14, 0));
		emergencyContactPage.clickEmeContinueBtn();
	}

	@Test(priority = 5)
	public void fillTravelInfoPageTest() throws InterruptedException,
			IOException {

		travelInfoPage.passDateOfDeparture(TestUtil.readDataFromExcellString(9,
				3, 0));
		travelInfoPage.clickOnIsApplicantPossessionRoundTicket();
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(9, 5,
				0));
		travelInfoPage.clickOnTravelBy();
		travelInfoPage.clickPurpose_of_journey();
		travelInfoPage.passPrimaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 8, 0));
		travelInfoPage.passPrimaryRefLastname(TestUtil
				.readDataFromExcellString(9, 9, 0));
		travelInfoPage.pass_Primary_ref_address(TestUtil
				.readDataFromExcellString(9, 10, 0));
		travelInfoPage.pass_primary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 11, 0));
		travelInfoPage.pass_primary_ref_city(TestUtil.readDataFromExcellString(
				9, 12, 0));
		travelInfoPage.pass_primary_ref_state(TestUtil
				.readDataFromExcellString(9, 13, 0));
		travelInfoPage.pass_primary_ref_country(TestUtil
				.readDataFromExcellString(9, 14, 0));
		travelInfoPage.pass_primary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 15, 0));
		travelInfoPage.passsecondaryRefFirstname(TestUtil
				.readDataFromExcellString(9, 16, 0));
		travelInfoPage.pass_secondary_ref_lastname(TestUtil
				.readDataFromExcellString(9, 17, 0));
		travelInfoPage.pass_secondary_ref_address(TestUtil
				.readDataFromExcellString(9, 18, 0));
		travelInfoPage.pass_secondary_ref_pincode(TestUtil
				.readDataFromExcellString(9, 19, 0));
		travelInfoPage.pass_secondary_ref_city(TestUtil
				.readDataFromExcellString(9, 20, 0));
		travelInfoPage.pass_secondary_ref_state(TestUtil
				.readDataFromExcellString(9, 21, 0));
		travelInfoPage.pass_secondary_ref_country(TestUtil
				.readDataFromExcellString(9, 22, 0));
		travelInfoPage.pass_secondary_ref_phone_number(TestUtil
				.readDataFromExcellString(9, 23, 0));
		travelInfoPage.clickOnByPhoneCheckbox();
		travelInfoPage.clickOnContinuebutton();

	}

	@Test(priority=6, description="Here verifying confirmation message and click on ok btn ")
	public void documentPageAndPaymentPageTest() throws InterruptedException, IOException {

		uploadDocPage.getUploadDoc();
		uploadDocPage.clicksaveAndContiBtn();
		TestUtil.writeStringValue(11, 1, 1);
		Thread.sleep(1000);
		reviewApplicationPage.clickOnContinuebutton();
		visaPaymentPage.clickOnCheckoutBtn();
		visaPaymentPage.passCardNo();
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateMonth(), month);
		TestUtil.selectValuefromDropDown(visaPaymentPage.selectExpiryDateYear(), year);
		visaPaymentPage.passCvvNo();
		System.out.println( "verifyClickOnSubmitBtnTest2");
		visaPaymentPage.clickOnMakePaymentBtn();
		visaPaymentPage.clickOnSubmitbtn();
		visaPaymentPage.clickOnOKtbtn();
		visaPaymentPage.clickOnDonetbtn();
		System.out.println( "applicationID after payment==>visa" +applicationID);
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);
		
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}	
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		System.out.println( "applicationID CN==>" +applicationID);

	} 


	@Test(priority = 7 , description = "This test will approve the application from CN")
	public void getApproveFromCN() throws InterruptedException{
		TestUtil.clickOnElement();
		applicantDashBoardPage.clickOnDocumentVeri();
		cNDocumentVerificaton.selectAllCheckBoxes();
		cNDocumentVerificaton.clickOnApprove();
		Thread.sleep(3000);
		cNDocumentVerificaton.clickOnConfirmFromApprove();
		Thread.sleep(5000);
		TestUtil.toCloseNewTab();
		Thread.sleep(3000);
		TestUtil.toSwitchBetweenWindows(0);
		Thread.sleep(3000);
	}
	
	@Test(priority = 8, description = "This test will verify login functinality of HighCommission with valid creadentials and click on Login button")
	public void loginIntoHighCommission() throws InterruptedException, IOException {
		Thread.sleep(3000);	
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}
		Assert.assertEquals(driver.getTitle(), TestUtil.readDataFromExcellString(19, 1, 0), "Consulate login page is not displayed");
		TestUtil.writeStringValue(19, 1, 1);
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameHCD"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordHCD"));
		TestUtil.writeStringValue(19, 2, 1);
		highAndConsulateLoginPage.clickOnLoginButton();				
	}

	@Test(priority=9, description = "This test will verify the title of HighCommission page after login" )
	public void verifHighCommissionPageTitle() throws IOException, InterruptedException{
		Assert.assertEquals(		
				hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to High Commission dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(19, 3, 1);
	}

	@Test(priority = 10, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnConfirmedAirTicketWindowClose() throws InterruptedException, IOException {
		TestUtil.clickOnElement();
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(), 	TestUtil.readDataFromExcellString(22, 1, 0),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		TestUtil.writeStringValue(22, 1, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow1();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(),  TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		TestUtil.writeStringValue(22, 2, 1);
		System.out.println("1");

	}	

	@Test(priority = 11, description = "click On Confirm Air Ticket and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page  ")
	public void clickOnConfirmedAirTicketWindow() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnConfirmAirTicket();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfConfirmedAirTicketWindow(),TestUtil.readDataFromExcellString(22, 1, 0),
				"Confirmed air ticket window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Confirmed air ticket)");
		Thread.sleep(2000);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(),  TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Confirmed Air Ticket Window");
		TestUtil.writeStringValue(22, 3, 1);
		System.out.println("2");
	}

	@Test(priority = 12, description = "click On Photo and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOnPhotoClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), TestUtil.readDataFromExcellString(22, 4, 0),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		TestUtil.writeStringValue(22, 4, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow2();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(),  TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		TestUtil.writeStringValue(22, 5, 1);
		System.out.println("4");
	}

	@Test(priority = 13, description = "click On Photo and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOnPhoto() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnPhoto();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfRecentPhotoWindow(), TestUtil.readDataFromExcellString(22, 4, 0),
				"Recent passport size photo window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Recent passport size photo)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Recent passport size photo");
		TestUtil.writeStringValue(22, 6, 1);
		System.out.println("3");
	}

	@Test(priority = 14, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnYellowFevervaccinationClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), TestUtil.readDataFromExcellString(22, 7, 0),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		TestUtil.writeStringValue(22, 7, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow3();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		TestUtil.writeStringValue(22, 8, 1);
	}

	@Test(priority = 15, description = "click On Yellow Fever vaccination and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnYellowFevervaccination() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnYellowFevervaccination();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfYellowFeverWindow(), TestUtil.readDataFromExcellString(22, 7, 0),
				"Yellow fever vaccination window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Yellow fever vaccination)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Yellow fever vaccination");
		TestUtil.writeStringValue(22, 9, 1);
	}

	@Test(priority = 16, description = "click On Covering Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnCoveringLetterClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), TestUtil.readDataFromExcellString(22, 10, 0),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		TestUtil.writeStringValue(22, 10, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow4();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(22, 11, 1);
	}

	@Test(priority = 17, description = "click On Covering Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnCoveringLetter() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnCoveringLetter();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfCoveringLetterWindow(), TestUtil.readDataFromExcellString(22, 10, 0),
				"Covering letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Covering letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(22, 12, 1);
	}


	@Test(priority = 18, description = "click On Id Proof Reference and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnIdProofReferenceClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), TestUtil.readDataFromExcellString(22, 13, 0),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		TestUtil.writeStringValue(22, 13, 1);
		Thread.sleep(3000);
		hCDDocumentVerificationPage.closeButtonToCloseWindow6();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		TestUtil.writeStringValue(22, 14, 1);
	}

	@Test(priority = 19, description = "click On Id Proof Reference and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnIdProofReference() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnIdProofReference();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfIDProofOfReferenceWindow(), TestUtil.readDataFromExcellString(22, 13, 0),
				"ID proof of reference window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(ID proof of reference)");
		Thread.sleep(2000);
		TestUtil.writeStringValue(22, 13, 1);
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from ID proof of reference");
		TestUtil.writeStringValue(22, 15, 1);
	}

	@Test(priority = 20, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetterClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(), TestUtil.readDataFromExcellString(22, 13, 0),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		TestUtil.writeStringValue(22, 16, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow7();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(22, 17, 1);
	}

	@Test(priority = 21, description = "click On Original Invitation Letter and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnOriginalInvitationLetter() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnOriginalInvitationLetter();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfOriginalInvitationLetterWindow(),TestUtil.readDataFromExcellString(22, 16, 0),
				"Original invitation letter window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Original invitation letter)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Document Verification");
		TestUtil.writeStringValue(22, 18, 1);
	}

	@Test(priority = 22, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using close button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisaClose() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(),
				TestUtil.readDataFromExcellString(22, 16, 0),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		TestUtil.writeStringValue(22, 19, 1);
		hCDDocumentVerificationPage.closeButtonToCloseWindow8();	
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		TestUtil.writeStringValue(22, 20, 1);
	}

	@Test(priority = 23, description = "click On Proof Of Transit Visa and verified window is opened or Not and then close window using (X) button and navigate to Document Verification page")
	public void clickOnProofOfTransitVisa() throws InterruptedException, IOException {
		Thread.sleep(2000);
		hCDDocumentVerificationPage.clickOnProofOfTransitVisa();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfProofOfTransitValidVisaWindow(), TestUtil.readDataFromExcellString(22, 19, 0),
				"Proof of transit valid visa window is displayed upon clikcing on Confirmed air ticket tab from Attached Docuement section(Proof of transit valid visa)");
		hCDDocumentVerificationPage.crossButtonToCloseWindow();
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"Document Verification page is not displayed upon clicking on Close button from Proof of transit valid visa");
		TestUtil.writeStringValue(22, 21, 1);
	}

	
	@Test(priority = 24  , description = "This test will verify whether check boxes is selected or not on Document verification")
	public void selectAllCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		hCDGeneralVerificationPage.clickOnDocumentVeri();
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.verifyAllCheckBox();
		System.out.println("selectedBoxDoc" +selectedBoxDocAll);
		Assert.assertTrue(selectedBoxDocAll,
				"Check Boxes is not selected upon clicking on [Select All Check] only select all button from Document Verification page");		
		Assert.assertTrue(selectedCheckBoxOnDocSingle,
				"All check Boxes is not selected upon clicking on [Select All Check] from Document Verification page");
	
	}
	@Test(priority = 25, description = "This test will verify whether check boxes is selected (one by one)or not on Document verification")
	public void selectOneByOneCheckBoxAndVerify() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hCDDocumentVerificationPage.selectAllCheckBoxes();
		hCDDocumentVerificationPage.selectOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		hCDDocumentVerificationPage.verifyOneByOneCheckBox();
		System.out.println("selectedBoxDoc" +selectedCheckBoxOnDocSingle);
		Assert.assertTrue(selectedCheckBoxOnDocSingle,
				"Check Boxes is not selected upon clicking on [One By One Check] from Document Verification page");
	
	}

	@Test(priority = 26, description = "Click On Reject And Verify Pop Text and then click on Cancel, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText() throws InterruptedException, IOException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		Assert.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), TestUtil.readDataFromExcellString(22, 22, 0),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		TestUtil.writeStringValue(22, 22, 1);
		hCDDocumentVerificationPage.clickOnCancelFromRejectPop();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),  TestUtil.readDataFromExcellString(20, 35, 0),
				"Document Verification page is not displayed upon clicking on Cancel button from Confirmation popup");
		TestUtil.writeStringValue(22, 23, 1);

	}

	@Test(priority =27, description = "Click On Reject And Verify Pop Text and then click on Cross, Verify that on which page navigated")
	public void clickOnRejectAndVerifyPopText1() throws InterruptedException, IOException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnReject();
		Assert.assertEquals(hCDDocumentVerificationPage.textFromRejectConfirmationPop(), TestUtil.readDataFromExcellString(22, 22, 0),
				"Confirmation popup is not displayed upon clicking on Reject from Document Verification");
		Thread.sleep(3000);
		hCDDocumentVerificationPage.clickOnCloseFromRejectConfir();
		Assert.assertEquals(hCDDocumentVerificationPage.titleOfCNDocumentVerificatonPage(),TestUtil.readDataFromExcellString(20, 35, 0),
				"Document Verification page is not displayed upon clicking on Cross button from Confirmation popup");
		TestUtil.writeStringValue(22, 24, 1);
	}

	@Test(priority =28, description = "Application is verified and approved")
	public void passComment() throws IOException, InterruptedException {
		Thread.sleep(3000);
		hCDDocumentVerificationPage.passComment(TestUtil.readDataFromExcellString(20, 25, 0));
		hCDDocumentVerificationPage.addCooment();
		hCDDocumentVerificationPage.getTextFromAddedComment();
		Assert.assertEquals(hCDDocumentVerificationPage.getTextFromAddedComment(), TestUtil.readDataFromExcellString(20, 25, 0),
				"Latest passed comment is not matched after getting text from comment section");
	
	}
	
	@Test(priority =29, description = "This test will reject the application")
	public void rejectTheApplicationFromHCDTest() throws IOException, InterruptedException {
		hCDDocumentVerificationPage.clickOnReject();
		Thread.sleep(3000);
		hCDDocumentVerificationPage.passInReason(TestUtil.readDataFromExcellString(20, 25, 0));
		hCDDocumentVerificationPage.getTextFromRejectPopButton();
		hCDDocumentVerificationPage.clickOnRejectFromConfirmation();
		TestUtil.writeStringValue(22, 26, 1);
		Assert.assertEquals(hCDDashboardPage.getTextRejectedBucket(), getTextFromRejectButtonFromHCD, "We are not in Reject bucket of HCD");
		TestUtil.writeStringValue(22, 27, 1);	
		Assert.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application in HCD for Reject Application");
		TestUtil.clickOnElement();

	}

	@Test(priority = 30, description = "Reject application is present in Reject Bucket and click on it")
	public void clickOnRejectApplicationFromRejectBucketTest() throws InterruptedException, IOException {
		
		hCDDashboardPage.clickOnOpenButtonFromApproveHCDBucket();		
		Assert.assertEquals(hCDApplicantInfoPage.getTitleOfHCDGGeneralVerifi(), TestUtil.readDataFromExcellString(20, 1, 0),
				"We are not navigate to Applicant Dashboard page upon clicking on New Application from Applicant Dashboard");
		TestUtil.writeStringValue(22, 29, 1);	
		hCDApplicantInfoPage.clickOnCancelButton();
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to HCD dashboard page after clicking on back button from Applicant Dashboard at HCD");
		TestUtil.writeStringValue(22, 30, 1);	
		TestUtil.clickOnElement();
		hCDDashboardPage.cancelButtonRejectBucketCN();		
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to HCD dashboard page after clicking on back button from Applicant Dashboard at HCD");
		TestUtil.writeStringValue(22, 32, 1);	
		TestUtil.clickOnElement();
		hCDDashboardPage.crossButtonPopApplicationSentToRejectBucket();
		Assert.assertEquals(hCDDashboardPage.titleofHCDDashBoard(), TestUtil.readDataFromExcellString(19, 3, 0),
				"We are not navigate to consulate dashboard page after enetering valid creadentials");
		TestUtil.writeStringValue(22, 31, 1);

	
		
	}
	@Test(priority = 31, description = "This test will verify whether application is in Approve bucket of CN after got approve from HCD")
	public void verifyApplicationInApproveBucketInCN() throws InterruptedException, IOException {
		
		TestUtil.toCloseNewTab();
		TestUtil.toSwitchBetweenWindows(0);
		System.out.println("Last");
		Thread.sleep(3000);	
		TestUtil.toOpenNewTab();
		TestUtil.toSwitchBetweenWindows(1);	
		if (prop.getProperty("server").equalsIgnoreCase("Global")) {
			driver.get(prop.getProperty("GhanaWebConsulateGlobalURL"));				 
		} else if (prop.getProperty("server").equalsIgnoreCase("Local")) {
			driver.get(prop.getProperty("GhanaWebConsulateLocalURL"));	
			//driver.get(prop.getProperty("GhanaWebURL"));
		}	
		highAndConsulateLoginPage.passUserName(prop.getProperty("UserNameCN"));
		highAndConsulateLoginPage.passPassword(prop.getProperty("PassWordCN"));
		highAndConsulateLoginPage.clickOnLoginButton();
		Thread.sleep(3000);	
		Assert.assertEquals(consulatedashBoardPage.textRejectedApplicationBucket(), getTextFromRejectButtonFromHCD,
				"Application is not present in Reject Bucket Application from HCD ");
		Assert.assertEquals(TestUtil.getTextFromApplicationID(), applicationID,
				"Application is not matched with each other so it did not click on Application");
		TestUtil.clickOnElement();
		TestUtil.writeStringValue(22, 33, 1);
		System.out.println("Application is approved by HCD");

	}
	
}


