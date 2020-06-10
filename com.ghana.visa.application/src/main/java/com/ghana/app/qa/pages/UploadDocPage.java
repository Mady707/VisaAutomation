package com.ghana.app.qa.pages;

import static com.ghana.app.qa.util.TestUtil.OSName;
import static com.ghana.app.qa.util.TestUtil.driverPath;
import static com.ghana.app.qa.util.TestUtil.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class UploadDocPage extends TestBase {

	public UploadDocPage() throws Exception, InterruptedException{
		PageFactory.initElements(driver, this);
	}

	//---------For Bussiness
	@FindBy(xpath="//input[@id='uploadBtn284178']")
	WebElement passport;
	@FindBy(xpath="//input[@id='uploadBtn284182']")
	WebElement LetterOfIntro;
	@FindBy(xpath="//input[@id='uploadBtn284185']")
	WebElement yellowfever;
	@FindBy(xpath="//input[@id='uploadBtn284192']")
	WebElement InvitationLetter;
	@FindBy(xpath="//input[@id='uploadBtn284193']")
	WebElement RefInGhanaID;
	@FindBy(xpath="//input[@id='uploadBtn284194']")
	WebElement SupportOfApplication;

	//For Tourist -----------

	@FindBy(xpath="//input[@id='uploadBtn284175']")
	WebElement TOURyellowfever;
	@FindBy(xpath="//input[@id='uploadBtn284172']")
	WebElement TOURpassport;
	@FindBy(xpath="//input[@id='uploadBtn284176']")
	WebElement TOURairticket;
	@FindBy(xpath="//input[@id='uploadBtn284174']")
	WebElement TOURBankStatment;
	@FindBy(xpath="//input[@id='uploadBtn284179']")
	WebElement TOURIDPoofGhana;
	@FindBy(xpath="//input[@id='uploadBtn284177']")
	WebElement TOURHotelReservation;
		
	//For Transit----------

	@FindBy(xpath="//input[@id='uploadBtn284198']")
	WebElement TranAirticket;

	// For Student-------------

	@FindBy(xpath="//input[@id='uploadBtn284199']")
	WebElement StudentPassport;
	@FindBy(xpath="//input[@id='uploadBtn284200']")
	WebElement Evidence;
	@FindBy(xpath="//input[@id='uploadBtn284201']")
	WebElement TCOfSchool;
	@FindBy(xpath="//input[@id='uploadBtn284204']")
	WebElement StudentLetterOfIntro;
	@FindBy(xpath="//input[@id='uploadBtn284205']")
	WebElement LetterOfIntroFromSchool;
	@FindBy(xpath="//input[@id='uploadBtn284206']")
	WebElement EvidenceOfGhanaSchool;
	@FindBy(xpath="//input[@id='uploadBtn284207']")
	WebElement StudentYellowFever;

	
	//For Employeee-----------

	@FindBy(xpath="//input[@id='uploadBtn284188']")
	WebElement ImmigrantQuata;
	@FindBy(xpath="//input[@id='uploadBtn284184']")
	WebElement EmpLetterOfIntro;
	@FindBy(xpath="//input[@id='uploadBtn284186']")
	WebElement EmpYellowFever;
	@FindBy(xpath="//input[@id='uploadBtn284187']")
	WebElement EmpApplicantCurriculum;
	@FindBy(xpath="//input[@id='uploadBtn284189']")
	WebElement EmpLetterOfAppointment;
	@FindBy(xpath="//input[@id='uploadBtn284190']")
	WebElement EmpSignContract;
	@FindBy(xpath="//input[@id='uploadBtn284195']")
	WebElement EmpLetterOfGhanaImmigration;
	@FindBy(xpath="//input[@id='uploadBtn284197']")
	WebElement EmpGhanRefID;
	@FindBy(xpath="//input[@id='uploadBtn284180']")
	WebElement EmpPassport;
	


	//For Diplomatic-----------

	@FindBy(xpath="//input[@id='uploadBtn287280']")
	WebElement DipNotVerbale;
	@FindBy(xpath="//input[@id='uploadBtn287311']")
	WebElement DipPassport;
	
	
	


	@FindBy(xpath="//strong[contains(text(),'Upload Documents')]")
	public WebElement uploadDocPageTitle;
	@FindBy(id="applicant_upload_document_form_btn")
	WebElement saveAndComtinueBtn;

	public String getTextUploadDocPageTitle(){
		return uploadDocPageTitle.getText();
	}

	public void UploadDocument(int row) throws InterruptedException, IOException
	{	driverPath = System.getProperty("user.dir");
	System.out.println("path==>" +driverPath);
	System.out.println("Uploading Document...");

	String type = TestUtil.readDataFromExcellString(0, row, 0);
	System.out.println("Uploading Document For ====>"+type );

	if(type.equals("Tourist/Short Visit Visa"))
	{				
		String Resi = TestUtil.readDataFromExcellString(0, row, 13);
		System.out.println("References Choice is ====>"+Resi );
		if(Resi.equals("I am invited by a Ghanaian Resident"))
		{	
			TOURIDPoofGhana.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
			Thread.sleep(3000);
			TOURyellowfever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
			Thread.sleep(3000);
			TOURpassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
			Thread.sleep(3000);
			TOURairticket.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
			Thread.sleep(3000);
			TOURBankStatment.sendKeys(driverPath+"\\DocumentAttach\\BankStatement.pdf");
			Thread.sleep(3000);		
		}
		else
		{			
			TOURHotelReservation.sendKeys(driverPath+"\\DocumentAttach\\HotelReservation.jpg");
			Thread.sleep(3000);
			TOURairticket.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
			Thread.sleep(3000);
			TOURIDPoofGhana.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
			Thread.sleep(3000);
			TOURpassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
			Thread.sleep(3000);
			TOURBankStatment.sendKeys(driverPath+"\\DocumentAttach\\BankStatement.pdf");
			Thread.sleep(3000);					
		}			
	}
	else if(type.equals("Business Visa"))
	{
		passport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		LetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		yellowfever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);
		InvitationLetter.sendKeys(driverPath+"\\DocumentAttach\\Invitation_Letter.pdf");
		Thread.sleep(3000);
		RefInGhanaID.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
		Thread.sleep(3000);
		//SupportOfApplication.sendKeys(driverPath+"\\DocumentAttach\\SupportedInGhana.png");
		//Thread.sleep(3000);
	}
	else if(type.equals("Student Visa"))
	{
		StudentPassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		Evidence.sendKeys(driverPath+"\\DocumentAttach\\EvidenceOfFees.pdf");
		Thread.sleep(3000);
		TCOfSchool.sendKeys(driverPath+"\\DocumentAttach\\TCOFSchool.jpg");
		Thread.sleep(3000);
		StudentLetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		LetterOfIntroFromSchool.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroSchool.jpg");
		Thread.sleep(3000);
		EvidenceOfGhanaSchool.sendKeys(driverPath+"\\DocumentAttach\\EvidenceOfAdmissionToSchool.jpg");
		Thread.sleep(3000);
		StudentYellowFever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);		
	}
	else if(type.equals("Transit Visa"))
	{
		TranAirticket.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
		Thread.sleep(3000);
	}
	else if (type.equals("Employee Visa"))
	{
		ImmigrantQuata.sendKeys(driverPath+"\\DocumentAttach\\ApprovingImmigrantQuota.jpg");
		Thread.sleep(3000);
		EmpLetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		EmpYellowFever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);
		EmpApplicantCurriculum.sendKeys(driverPath+"\\DocumentAttach\\Applicant’sCurriculumVitae.png");
		Thread.sleep(3000);
		EmpLetterOfAppointment.sendKeys(driverPath+"\\DocumentAttach\\LetterOfAppointment.pdf");
		Thread.sleep(3000);
		EmpSignContract.sendKeys(driverPath+"\\DocumentAttach\\SignedContract.png");
		Thread.sleep(3000);
		EmpLetterOfGhanaImmigration.sendKeys(driverPath+"\\DocumentAttach\\ApprovingImmigrantQuota.jpg");
		Thread.sleep(3000);
		EmpGhanRefID.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
		Thread.sleep(3000);
		EmpPassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		
	}

	else if (type.equals("Diplomatic/Service"))
	{
		DipNotVerbale.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
		Thread.sleep(3000);
		DipPassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);		
	}		
		System.out.println("Document Upload successfullll...");
	}

	// For UPLOAD DOCUMENT TEST 
	
	public void UploadDocument() throws InterruptedException, IOException
	{	driverPath = System.getProperty("user.dir");
	System.out.println("path==>" +driverPath);
	System.out.println("Uploading Document...");

	String type = TestUtil.readDataFromExcellString(5, 17, 0);
	System.out.println("Uploading Document For ====>"+type );

	if(type.equals("Tourist/Short Visit Visa"))
	{	
		TOURHotelReservation.sendKeys(driverPath+"\\DocumentAttach\\HotelReservation.jpg");
		Thread.sleep(3000);
		TOURyellowfever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);
		TOURpassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		TOURairticket.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
		Thread.sleep(3000);
		TOURBankStatment.sendKeys(driverPath+"\\DocumentAttach\\BankStatement.pdf");
		Thread.sleep(3000);	
	}
	else if(type.equals("Business Visa"))
	{
		passport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		LetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		yellowfever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);
		InvitationLetter.sendKeys(driverPath+"\\DocumentAttach\\Invitation_Letter.pdf");
		Thread.sleep(3000);
		RefInGhanaID.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
		Thread.sleep(3000);
		SupportOfApplication.sendKeys(driverPath+"\\DocumentAttach\\SupportedInGhana.png");
		Thread.sleep(3000);
	}
	else if(type.equals("Student Visa"))
	{
		StudentPassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		Evidence.sendKeys(driverPath+"\\DocumentAttach\\EvidenceOfFees.pdf");
		Thread.sleep(3000);
		TCOfSchool.sendKeys(driverPath+"\\DocumentAttach\\TCOFSchool.jpg");
		Thread.sleep(3000);
		StudentLetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		LetterOfIntroFromSchool.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroSchool.jpg");
		Thread.sleep(3000);
		EvidenceOfGhanaSchool.sendKeys(driverPath+"\\DocumentAttach\\EvidenceOfAdmissionToSchool.jpg");
		Thread.sleep(3000);
		StudentYellowFever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);		
	}
	else if(type.equals("Transit Visa"))
	{
		TranAirticket.sendKeys(driverPath+"\\DocumentAttach\\airticket.jpeg");
		Thread.sleep(3000);
	}
	else if (type.equals("Employee Visa"))
	{
		ImmigrantQuata.sendKeys(driverPath+"\\DocumentAttach\\ApprovingImmigrantQuota.jpg");
		Thread.sleep(3000);
		EmpLetterOfIntro.sendKeys(driverPath+"\\DocumentAttach\\LetterOfIntroduction.png");
		Thread.sleep(3000);
		EmpYellowFever.sendKeys(driverPath+"\\DocumentAttach\\YellowFeverVaccination.pdf");
		Thread.sleep(3000);
		EmpApplicantCurriculum.sendKeys(driverPath+"\\DocumentAttach\\Applicant’sCurriculumVitae.png");
		Thread.sleep(3000);
		EmpLetterOfAppointment.sendKeys(driverPath+"\\DocumentAttach\\LetterOfAppointment.pdf");
		Thread.sleep(3000);
		EmpSignContract.sendKeys(driverPath+"\\DocumentAttach\\SignedContract.png");
		Thread.sleep(3000);
		EmpLetterOfGhanaImmigration.sendKeys(driverPath+"\\DocumentAttach\\ApprovingImmigrantQuota.jpg");
		Thread.sleep(3000);
		EmpGhanRefID.sendKeys(driverPath+"\\DocumentAttach\\Ghana_IDProof.jpg");
		Thread.sleep(3000);
		EmpPassport.sendKeys(driverPath+"\\DocumentAttach\\IndianPassport.png");
		Thread.sleep(3000);
		
	}

	else if (type.equals("Diplomatic/Service"))
	{
		System.out.println("No Document Required");
	}		
		System.out.println("Document Upload successfullll...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getUploadDoc() throws InterruptedException{
		driverPath = System.getProperty("user.dir");
		System.out.println("path==>" +driverPath);
		System.out.println(OSName);
		if (OSName.equalsIgnoreCase("Mac"))
		{
			System.out.println(OSName);
			// enter the file path onto the file-selection input field
			//airticket.sendKeys(driverPath+"/DocumentAttach/Covering Letter for tourist.pdf");

		} else if (OSName.equalsIgnoreCase("Win")) {

			System.out.println(OSName);
			// enter the file path onto the file-selection input field
			//TestUtil.scrollUpHorizontalORVIsibilityOFElement(airticket);
			//airticket.sendKeys(driverPath+"\\DocumentAttach\\Covering Letter for tourist.pdf");
			Thread.sleep(3000);			
		} 
	}

	
	
	
	
	
	public void clicksaveAndContiBtn(){
		saveAndComtinueBtn.click();
	}
}
