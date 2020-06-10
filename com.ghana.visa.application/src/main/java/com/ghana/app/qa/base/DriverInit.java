package com.ghana.app.qa.base;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ghana.app.qa.pages.EmergencyContactPage;
import com.ghana.app.qa.pages.EvacuationOfGhanians;
import com.ghana.app.qa.pages.GhanaNational_AddressInfoPage;
import com.ghana.app.qa.pages.GhanaNational_EmergencyPage;
import com.ghana.app.qa.pages.GhanaNational_PassportParticularPage;
import com.ghana.app.qa.pages.GhanaNational_PersonalInfo;
import com.ghana.app.qa.pages.Ghanian_National_SignUpLoginPage;
import com.ghana.app.qa.pages.HCDApplicantInfoPage;
import com.ghana.app.qa.pages.HCDDashboardPage;
import com.ghana.app.qa.pages.HCDDocumentVerificationPage;
import com.ghana.app.qa.pages.HCDGeneralVerificationPage;
import com.ghana.app.qa.pages.HCDInterviewSchedule;
import com.ghana.app.qa.pages.ConsulatedashBoardPage;
import com.ghana.app.qa.pages.HighAndConsulateLoginPage;
import com.ghana.app.qa.pages.AddressInfoPage;
import com.ghana.app.qa.pages.HomePage;
import com.ghana.app.qa.pages.ApplicantDashBoardPage;
import com.ghana.app.qa.pages.CNAddressInfo;
import com.ghana.app.qa.pages.CNDocumentVerificaton;
import com.ghana.app.qa.pages.CNInterviewSchedule;
import com.ghana.app.qa.pages.CNTravelInfo;
import com.ghana.app.qa.pages.HotelReferencesPage;
import com.ghana.app.qa.pages.MultipleApplicationPage;
import com.ghana.app.qa.pages.PartiallyFilledApplicationPage;
import com.ghana.app.qa.pages.PersonalInfoPage;
import com.ghana.app.qa.pages.ProfessionalInfoPage;
import com.ghana.app.qa.pages.ReviewApplicationPage;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.pages.StudentReferencePage;
import com.ghana.app.qa.pages.TravelInfoPage;
import com.ghana.app.qa.pages.UploadDocPage;
import com.ghana.app.qa.pages.VisaCategoriesPage;
import com.ghana.app.qa.pages.VisaPaymentPage;
import com.ghana.app.qa.pages.VisaStatusPage;
import com.ghana.app.qa.testcases.Ghanian_National_SignUpLoginTest;
import com.ghana.app.qa.testcases.HomePageTest;
import com.ghana.app.qa.util.TestUtil;


public class DriverInit extends TestBase {

	public DriverInit() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static TestUtil testUtil;
	public static HomePage homePage;
	public static HomePageTest homepagetest;
	public static PartiallyFilledApplicationPage partiallyFilledApplicationPage;
	public static VisaStatusPage visaStatusPage;
	public static VisaCategoriesPage visaCategoriesPage;
	public static SignUpPage signUpPage;
	public static PersonalInfoPage personalInfoPage;
	public static AddressInfoPage addressInfoPage;
	public static EmergencyContactPage emergencyContactPage;
	public static ProfessionalInfoPage professionalinfopage;
	public static TravelInfoPage travelInfoPage;
	public static HotelReferencesPage hotelRefrencePage;
	public static StudentReferencePage studentReferencesPage;
	public static UploadDocPage uploadDocPage;
	public static ReviewApplicationPage reviewApplicationPage;
	public static VisaPaymentPage visaPaymentPage;
	public static MultipleApplicationPage multipleapplicationPage;
	// Ghana National
	public static Ghanian_National_SignUpLoginPage GhanianNationalPage;
	public static Ghanian_National_SignUpLoginTest ghanian_Nationaltest;
	public static GhanaNational_PersonalInfo ghananationalPersonalInfo;
	public static GhanaNational_AddressInfoPage ghananationalAddressInfoPage;
	public static GhanaNational_EmergencyPage ghananationalemergencyInfo;
	public static GhanaNational_PassportParticularPage ghananationalpassportParticularPage;
	public static EvacuationOfGhanians evacuation;
	
	// Consulate side
	public static HighAndConsulateLoginPage highAndConsulateLoginPage;
	public static ConsulatedashBoardPage consulatedashBoardPage;
	public static ApplicantDashBoardPage applicantDashBoardPage;
	public static CNAddressInfo cNAddressInfo;
	public static CNTravelInfo cNTravelInfo;
	public static CNDocumentVerificaton cNDocumentVerificaton;
	public static CNInterviewSchedule cNInterviewSchedule;
	//HighCommission side
	public static HCDDashboardPage hCDDashboardPage;	
	public static HCDGeneralVerificationPage hCDGeneralVerificationPage;
	public static HCDApplicantInfoPage hCDApplicantInfoPage;
	public static HCDDocumentVerificationPage hCDDocumentVerificationPage;
	public static HCDInterviewSchedule hCDInterviewSchedule;

	@BeforeClass
	public void setUp() throws Exception {

		initialization();	
		testUtil = new TestUtil();
		homePage = new HomePage();
		homepagetest = new HomePageTest();
		partiallyFilledApplicationPage = new PartiallyFilledApplicationPage();
		visaStatusPage = new VisaStatusPage();
		visaCategoriesPage = new VisaCategoriesPage();
		signUpPage = new SignUpPage();
		personalInfoPage = new PersonalInfoPage();
		addressInfoPage = new AddressInfoPage ();
		emergencyContactPage = new EmergencyContactPage() ;	
		professionalinfopage = new ProfessionalInfoPage();
		travelInfoPage = new TravelInfoPage ();
		hotelRefrencePage = new HotelReferencesPage();
		studentReferencesPage = new StudentReferencePage(); 
		uploadDocPage = new UploadDocPage() ;
		reviewApplicationPage = new ReviewApplicationPage();
		visaPaymentPage = new VisaPaymentPage();
		multipleapplicationPage = new MultipleApplicationPage();
		// Ghana National
		GhanianNationalPage = new Ghanian_National_SignUpLoginPage();
		ghanian_Nationaltest = new Ghanian_National_SignUpLoginTest();
		ghananationalPersonalInfo = new GhanaNational_PersonalInfo();
		ghananationalAddressInfoPage = new GhanaNational_AddressInfoPage();
		ghananationalemergencyInfo = new GhanaNational_EmergencyPage();
		ghananationalpassportParticularPage = new GhanaNational_PassportParticularPage();
		evacuation = new EvacuationOfGhanians(); 

		
		
		// Consulate side
		highAndConsulateLoginPage = new HighAndConsulateLoginPage();
		consulatedashBoardPage = new ConsulatedashBoardPage();
		applicantDashBoardPage = new ApplicantDashBoardPage();
		cNAddressInfo = new CNAddressInfo();
		cNTravelInfo = new CNTravelInfo();
		cNDocumentVerificaton = new CNDocumentVerificaton();
		cNInterviewSchedule = new CNInterviewSchedule();
		//High Commission
		hCDDashboardPage = new HCDDashboardPage();
		hCDGeneralVerificationPage =new HCDGeneralVerificationPage();	
		hCDApplicantInfoPage = new HCDApplicantInfoPage();
		hCDDocumentVerificationPage = new HCDDocumentVerificationPage();
		hCDInterviewSchedule = new HCDInterviewSchedule(); 		
	}	
	/*@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
*/
}
