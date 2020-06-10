package com.ghana.app.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class Mutiple_Application extends DriverInit  {
	SoftAssert softAssertion = new SoftAssert();
	public Mutiple_Application() throws IOException, InterruptedException {
		super();
	}

	int i;
	@Test(priority = 1)
	public void TestMethod()
	{
		for(i=3;i<=3;i++)
		{
			try{	
				signUpAndFillSignUpPage(); // 1			
				fillPersonalPageTest(); //2
				fillAddressinfoPageTest(); //3
				fillProffessionalinfoPageTest(); //4
				fillEmmergencyinfoPageTest(); //5
				fillTravelInfoPageTest(); // 6
				fillReferencesPageTest(); //7
				documentPageTest(); // 8
				verifyClickOnSubmitBtnTest(); //9
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public void signUpAndFillSignUpPage() throws InterruptedException, IOException  //1
	{	
		System.out.println("---------------- FORM NUMBER IS : "+TestUtil.readDataFromExcellString(0, i, 14)+" ------------------"); ;
		Thread.sleep(2000);
		// homePage.clickOnApplyVisa(); // uncomment it when u use dev URL
		homePage.applyVisa2.click();
		visaCategoriesPage.launchAndGotoSignUPMulti(i);
		signUpPage.selectNationalityMulti(i);
		signUpPage.selectCountryOfResidenceMulti(i);
		signUpPage.selectVisaLocationMulti(i);
		Thread.sleep(2000); 
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(signUpPage.ModeOfConsulate);
		signUpPage.selectModeOfConsulateMulti(i);
		signUpPage.SignUpNext1.click();
		signUpPage.termsCheckbox.click();
		TestUtil.scrollUpAtEndOFPage();
		signUpPage.SignUpNext2.click();	
		//signUpPage.UploadProfilePhotoMulti(i);
		signUpPage.SelectPassportTypeMulti(i);
		signUpPage.selectPortOfArrivalMulti(i);
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(0, i, 7));
		signUpPage.selectDateOfBirth();
		signUpPage.selectYearMulti(i);
		signUpPage.selectMonthMulti(i);		
		signUpPage.selectDateMulti(i);
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(0, i, 11));
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(0, i, 12));
		this.ReferenceClick(i);	
		signUpPage.SignUp.click();
	}

	public void fillPersonalPageTest() throws InterruptedException, IOException  //2 
	{
		personalInfoPage.SelectGenderMulti(i);
		personalInfoPage.passFirstName(TestUtil.readDataFromExcellString(1, i, 1));
		personalInfoPage.passMiddleName(TestUtil.readDataFromExcellString(1, i, 2));
		personalInfoPage.passLastName(TestUtil.readDataFromExcellString(1, i, 3));
		personalInfoPage.passPlaceOfBirth(TestUtil.readDataFromExcellString(1, i, 7));
		Thread.sleep(2000);
		personalInfoPage.selectCountryOfBirthMulti(i);
		personalInfoPage.selectFormaerNationalityMulti(i);
		personalInfoPage.passPassportNumber(TestUtil.readDataFromExcellString(1, i, 12));
		personalInfoPage.passPlaceOfIssue(TestUtil.readDataFromExcellString(1, i, 13));

		personalInfoPage.selectPassportIssueDate();
		Thread.sleep(2000);
		personalInfoPage.selectIssueYearMulti(i);
		personalInfoPage.selectIssueMonthMulti(i);
		personalInfoPage.selectIssueDateMulti(i);
		Thread.sleep(2000);

		personalInfoPage.selectPassportExpiryDate();
		Thread.sleep(2000);
		personalInfoPage.selectExpiryYearMulti(i);
		personalInfoPage.selectExpiryMonthMulti(i);
		personalInfoPage.selectExpiryDateMulti(i);
		Thread.sleep(2000);

		personalInfoPage.clickOnSaveAndContinue();
	}

	public void fillAddressinfoPageTest() throws InterruptedException, IOException  //3
	{
		Thread.sleep(5000);

		addressInfoPage.passFlatNumber(TestUtil.readDataFromExcellString(2, i, 0));
		Thread.sleep(2000);
		addressInfoPage.passStreetName(TestUtil.readDataFromExcellString(2, i, 1));
		Thread.sleep(2000);
		addressInfoPage.passLandmark(TestUtil.readDataFromExcellString(2, i, 2));
		Thread.sleep(2000);
		addressInfoPage.passPincode(TestUtil.readDataFromExcellString(2, i, 3));
		Thread.sleep(2000);
		addressInfoPage.passCityName(TestUtil.readDataFromExcellString(2, i, 4));
		Thread.sleep(1000);
		addressInfoPage.selectCountryTypeMulti(i);
		Thread.sleep(1000);
		addressInfoPage.selectStateTypeMulti(i);
		Thread.sleep(1000);
		addressInfoPage.selectAddressTypeMulti(i);
		Thread.sleep(2000);
		addressInfoPage.savecontinue.click();
	}

	public void fillProffessionalinfoPageTest() throws InterruptedException, IOException //4
	{
		Thread.sleep(5000);
		professionalinfopage.selectprofessionTypeMulti(i);
		professionalinfopage.passFlatNumber(TestUtil.readDataFromExcellString(3, i, 2));
		professionalinfopage.passStreetName(TestUtil.readDataFromExcellString(3, i, 3));
		professionalinfopage.passLandmark(TestUtil.readDataFromExcellString(3, i, 4));
		professionalinfopage.passPincode(TestUtil.readDataFromExcellString(3, i, 5));
		professionalinfopage.passCityName(TestUtil.readDataFromExcellString(3, i, 6));
		professionalinfopage.selectCountryTypeMulti(i);
		professionalinfopage.selectStateTypeMulti(i);
		professionalinfopage.passContact(TestUtil.readDataFromExcellString(3, i, 9));
		professionalinfopage.passEmail(TestUtil.readDataFromExcellString(3, i, 10));

		String type = TestUtil.readDataFromExcellString(0, i, 0);
		System.out.println("Checking Visa Type for Company Details====>"+type );
		if(type.equals("Business Visa")||type.equals("Employee Visa"))
		{
			professionalinfopage.passCompanyNameGhana(TestUtil.readDataFromExcellString(3, i, 11));
			professionalinfopage.passCompanyAddress(TestUtil.readDataFromExcellString(3, i, 12));
			professionalinfopage.passCompanyLandmark(TestUtil.readDataFromExcellString(3, i, 13));
			professionalinfopage.passCompanyPinCode(TestUtil.readDataFromExcellString(3, i, 14));
			professionalinfopage.passCompanyCity(TestUtil.readDataFromExcellString(3, i, 15));
			professionalinfopage.selectCompanyCountryTypeMulti(i);
			professionalinfopage.selectCompanyStateTypeMulti(i);
		}	
		professionalinfopage.saveandnext.click();
	}

	public void fillEmmergencyinfoPageTest() throws InterruptedException, IOException  //5
	{
		Thread.sleep(5000);
		emergencyContactPage.emergencyFirstName(TestUtil.readDataFromExcellString(4,i,0));
		emergencyContactPage.emergencyMiddleName(TestUtil.readDataFromExcellString(4,i,1));
		emergencyContactPage.emergencyLastName(TestUtil.readDataFromExcellString(4,i,2));
		emergencyContactPage.selectRelationMulti(i);
		emergencyContactPage.passFlatNumber(TestUtil.readDataFromExcellString(4,i,4));
		emergencyContactPage.passStreetName(TestUtil.readDataFromExcellString(4,i,5));
		emergencyContactPage.passLandmark(TestUtil.readDataFromExcellString(4,i,6));
		emergencyContactPage.passPincode(TestUtil.readDataFromExcellString(4,i,7));
		emergencyContactPage.passCityName(TestUtil.readDataFromExcellString(4,i,8));
		emergencyContactPage.selectCountryTypeMulti(i);
		emergencyContactPage.selectStateTypeMulti(i);
		emergencyContactPage.passContact(TestUtil.readDataFromExcellString(4,i,11));
		emergencyContactPage.passEmail(TestUtil.readDataFromExcellString(4,i,12));
		emergencyContactPage.emergencySaveAndContinuebtn.click();
	}

	public void fillTravelInfoPageTest() throws InterruptedException,IOException //6
	{ 
		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		TestUtil.clickOnElement(travelInfoPage.departureDate);
		// travelInfoPage.selectDateOfBirth();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		travelInfoPage.selectYearMulti(i);
		travelInfoPage.selectMonthMulti(i);
		travelInfoPage.selectDateMulti(i);

		TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.travelInfoPageTitle);	
		Thread.sleep(5000);	
		this.VisaFees(i);
		Thread.sleep(1000);	

		TestUtil.scrollUpHorizontalORVIsibilityOFElement(travelInfoPage.purpose_of_journey);	
		Thread.sleep(1000);
		travelInfoPage.clickPurpose_of_journeyMulti(i);
		Thread.sleep(2000);	

		String type = TestUtil.readDataFromExcellString(5, i, 3);
		System.out.println("Checking For OTHER visa type====>"+type );
		if(type.equals("Other"))
		{
			travelInfoPage.passotherpurpose(TestUtil.readDataFromExcellString(5,i,13));	
			Thread.sleep(1000);
		}

		Thread.sleep(5000);	
		travelInfoPage.selectlastvisitDurationMulti(i);
		travelInfoPage.passLastTravelDuration(TestUtil.readDataFromExcellString(5,i,12));			
		travelInfoPage.clickOnIsApplicantPossessionRoundTicketMulti(i);
		Thread.sleep(2000);
		travelInfoPage.passTicketNumber(TestUtil.readDataFromExcellString(5,i,5));
		Thread.sleep(1000);
		travelInfoPage.clickOnTravelByMulti(i);

		String yes = TestUtil.readDataFromExcellString(5, i, 7);
		System.out.println("First travel?????" +yes);
		if(yes.equals("YES"))
		{
			System.out.println("First travel of applicant !!!");
		}
		else
		{	
			travelInfoPage.FirstTravelGhana.click();
			travelInfoPage.selectDateOfLastTravel();
			travelInfoPage.selectLastTravelYearMulti(i);
			travelInfoPage.selectLastTravelMonthMulti(i);
			travelInfoPage.selectLastTravelDateMulti(i);					
		}

		Thread.sleep(1000);
		travelInfoPage.applicant_travel_information_form_btn.click();
	}

	public void fillReferencesPageTest() throws InterruptedException,IOException  // 7
	{
		Thread.sleep(3000);
		String type = TestUtil.readDataFromExcellString(0, i, 0);
		System.out.println("Checking Visa Type for Filling REFERENCES ====>"+type );
		if(type.equals("Tourist/Short Visit Visa"))
		{			
			String Resi = TestUtil.readDataFromExcellString(0, i, 13);
			System.out.println("References Choice is ====>"+Resi );
			if(Resi.equals("I am invited by a Ghanaian Resident"))				
			{	
				this.PriSecReferences();
			}
			else
			{	
				hotelRefrencePage.passHotelName(TestUtil.readDataFromExcellString(8, i, 0));
				hotelRefrencePage.passFlatNumber(TestUtil.readDataFromExcellString(8, i, 1));
				hotelRefrencePage.passStreetName(TestUtil.readDataFromExcellString(8, i, 2));
				hotelRefrencePage.passLandmark(TestUtil.readDataFromExcellString(8, i, 3));
				hotelRefrencePage.passPincode(TestUtil.readDataFromExcellString(8, i, 4));
				hotelRefrencePage.passCityName(TestUtil.readDataFromExcellString(8, i, 5));
				hotelRefrencePage.selectCountryTypeMulti(i);
				hotelRefrencePage.selectStateTypeMulti(i);
				hotelRefrencePage.passContact(TestUtil.readDataFromExcellString(8, i, 8));
				hotelRefrencePage.passEmail(TestUtil.readDataFromExcellString(8, i, 9));
				hotelRefrencePage.clickHotelContinueBtn();		
			}		
		}	
		else if(type.equals("Student Visa"))
		{	
			Thread.sleep(3000);
			studentReferencesPage.passSchoolName(TestUtil.readDataFromExcellString(7, i, 0));
			studentReferencesPage.passFlatNumber(TestUtil.readDataFromExcellString(7, i, 1));
			studentReferencesPage.passStreetName(TestUtil.readDataFromExcellString(7, i, 2));
			studentReferencesPage.passLandmark(TestUtil.readDataFromExcellString(7, i, 3));
			studentReferencesPage.passPincode(TestUtil.readDataFromExcellString(7, i, 4));
			studentReferencesPage.passCityName(TestUtil.readDataFromExcellString(7, i, 5));
			studentReferencesPage.selectCountryTypeMulti(i);
			studentReferencesPage.selectStateTypeMulti(i);
			studentReferencesPage.passContact(TestUtil.readDataFromExcellString(7, i, 8));
			studentReferencesPage.passEmail(TestUtil.readDataFromExcellString(7, i, 9));
			studentReferencesPage.clickStudentContinueBtn();	
		}	
		else if(type.equals("Diplomatic/Service"))
		{	this.PriSecReferences();
		}
		else if(type.equals("Business Visa"))
		{	this.PriSecReferences();		
		}
		else if(type.equals("Transit Visa"))
		{	this.PriSecReferences();	
		}
		else if(type.equals("Employee Visa"))
		{	this.PriSecReferences();		
		}
	}

	public void documentPageTest() throws InterruptedException, IOException { //8
		uploadDocPage.UploadDocument(i);	
		uploadDocPage.clicksaveAndContiBtn();
		Thread.sleep(1000);
	}

	public void verifyClickOnSubmitBtnTest() throws InterruptedException, IOException // 9
	{
		reviewApplicationPage.clickOnContinuebutton();
		visaPaymentPage.makeVisapaymentBtn();

		String type = TestUtil.readDataFromExcellString(0, i, 0);
		System.out.println("Checking Visa Type for completing PAYMENT ====>"+type );
		if(type.equals("Diplomatic/Service"))
		{
			visaPaymentPage.DiplomaticDONE.click();
		}
		else
		{	
			String yes = TestUtil.readDataFromExcellString(9, i, 0);
			if(yes.equals("YES"))
			{
				visaPaymentPage.PayerYes.click();
				Payment();
			}
			else
			{
				visaPaymentPage.PayerNo.click();
				visaPaymentPage.passName(TestUtil.readDataFromExcellString(9, i, 1));;
				visaPaymentPage.passEmail(TestUtil.readDataFromExcellString(9, i, 2));
				visaPaymentPage.passContact(TestUtil.readDataFromExcellString(9, i, 3));
				TestUtil.scrollUpHorizontalORVIsibilityOFElement(visaPaymentPage.PayerSubmit);	
				visaPaymentPage.PayerSubmit.click();
				Payment();
			}
		}
		System.out.println("Visa Form Completed For "+type+" !!!!!!!!!!!!!!!!\n");
	}	

	// Methods..........................

	public void PriSecReferences() throws IOException, InterruptedException
	{	
		Thread.sleep(1000);
		//Primarey References
		travelInfoPage.PriReferenceFirstName(TestUtil.readDataFromExcellString(6,i,0));
		travelInfoPage.PriReferenceMiddleName(TestUtil.readDataFromExcellString(6,i,1));
		travelInfoPage.PriReferenceLastName(TestUtil.readDataFromExcellString(6,i,2));
		travelInfoPage.passPriReferenceFlatNumber(TestUtil.readDataFromExcellString(6,i,3));
		travelInfoPage.passPriReferenceStreetName(TestUtil.readDataFromExcellString(6,i,4));
		travelInfoPage.passPriReferenceLandmark(TestUtil.readDataFromExcellString(6,i,5));
		travelInfoPage.passPriReferencePincode(TestUtil.readDataFromExcellString(6,i,6));
		travelInfoPage.passPriReferenceCityName(TestUtil.readDataFromExcellString(6,i,7));
		travelInfoPage.selectPriReferenceCountryTypeMulti(i);
		travelInfoPage.selectPriReferenceStateTypeMulti(i);
		travelInfoPage.passPriReferenceContact(TestUtil.readDataFromExcellString(6,i,10));
		travelInfoPage.passPriReferenceEmail(TestUtil.readDataFromExcellString(6,i,11));
		// Secondary References
		travelInfoPage.SecReferencesFirstName(TestUtil.readDataFromExcellString(6,i,12));
		travelInfoPage.SecReferencesMiddleName(TestUtil.readDataFromExcellString(6,i,13));
		travelInfoPage.SecReferencesLastName(TestUtil.readDataFromExcellString(6,i,14));
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesFlatNumber(TestUtil.readDataFromExcellString(6,i,15));
		Thread.sleep(2000);
		travelInfoPage.passSecReferencesStreetName(TestUtil.readDataFromExcellString(6,i,16));
		travelInfoPage.passSecReferencesLandmark(TestUtil.readDataFromExcellString(6,i,17));
		travelInfoPage.passSecReferencesPincode(TestUtil.readDataFromExcellString(6,i,18));
		travelInfoPage.passSecReferencesCityName(TestUtil.readDataFromExcellString(6,i,19));
		travelInfoPage.selectSecReferencesCountryTypeMulti(i);
		travelInfoPage.selectSecReferencesStateTypeMulti(i);
		travelInfoPage.passSecReferencesContact(TestUtil.readDataFromExcellString(6,i,22));
		travelInfoPage.passSecReferencesEmail(TestUtil.readDataFromExcellString(6,i,23));	
		travelInfoPage.SecReferencesSaveAndContinuebtn.click();				
	}

	public void ReferenceClick(int row) throws IOException, InterruptedException
	{
		// For References Click
		String type = TestUtil.readDataFromExcellString(0, row, 0);
		System.out.println("Checking visa type for REFERENCES CLICK ====> "+type );
		if(type.equals("Tourist/Short Visit Visa"))
		{			
			String Resi = TestUtil.readDataFromExcellString(0, row, 13);
			System.out.println("References Choice is ====>"+Resi );
			if(Resi.equals("I am invited by a Ghanaian Resident"))
			{	TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.GhanianResidence);
			SignUpPage.GhanianResidence.click();
			}
			else
			{	TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.HotelReservation);
			SignUpPage.HotelReservation.click();
			}		
		}	
	}

	public void VisaFees(int row) throws IOException, InterruptedException
	{
		String type = TestUtil.readDataFromExcellString(0, row, 0);
		System.out.println("Checking visa type for VISA FEES ====>"+type );
		if(type.equals("Diplomatic/Service"))
		{
			System.out.println("Charges For Diplomatic Visa is 0.INR");	
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(1000);
		}
		else
		{	

			new WebDriverWait(driver, 80).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(travelInfoPage.visaFees));

			System.out.println("Fees value is ---"+travelInfoPage.visaFees.isSelected());

			travelInfoPage.visaFees.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(1000);
			System.out.println("Fees value is visible after selecting the fees??  ---"+travelInfoPage.visaFees.isDisplayed());
			System.out.println("Fees value is Selected after selecting the fees??  ---"+travelInfoPage.visaFees.isSelected());
		}
	}

	public void Payment() throws InterruptedException, IOException
	{
		System.out.println(">>>>>>>>>>>Torenzo Pay>>>>>>>>>>");
		TestUtil.switchToFrameByIndex(0); 
		Thread.sleep(3000);
		boolean proceed =visaPaymentPage.Proceed.isDisplayed();
		System.out.println("Proceed button display??? --->> "+proceed);
		if(proceed == true)
		{
			visaPaymentPage.Proceed.click();
		}
		else
		{
				System.out.println("Payment method available....");
		}
		Thread.sleep(3000);
		visaPaymentPage.netbankingpayment.click();
		Thread.sleep(2000);
		visaPaymentPage.HDFCbank.click();
		Thread.sleep(2000);
		visaPaymentPage.Pay.click();
		visaPaymentPage.Continue.click();

		System.out.println("****For Success********");
		Thread.sleep(2000);
		TestUtil.toSwitchBetweenWindows(2);
		visaPaymentPage.Success.click();

		System.out.println("------For Receipt-----");
		Thread.sleep(2000);
		TestUtil.toSwitchBetweenWindows(0);
		Thread.sleep(2000);
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(visaPaymentPage.OK);
		visaPaymentPage.OK.click();
		Thread.sleep(2000);
		visaPaymentPage.DONE.click();
		Thread.sleep(2000);	
	}
}
