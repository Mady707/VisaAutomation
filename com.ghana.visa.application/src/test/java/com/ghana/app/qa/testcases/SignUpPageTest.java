package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.driverPath;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;


//@Listeners(com.ghana.app.qa.extentreport.ExtentReportListener.class)
public class SignUpPageTest extends DriverInit {
	SoftAssert softAssertion = new SoftAssert();
	private int totalApplicationLocationExpected;
	
	public SignUpPageTest() throws IOException, InterruptedException {
		super();		
	}

	@Test(priority = 1)
	public void selectNationalityTest() throws InterruptedException, IOException {
		homepagetest.verifyVisaCategoriesTest();
		signUpPage.selectNationality();
		Assert.assertEquals(signUpPage.totalCountryCount(), totalCountryListInReq,
				"Countries values are not matched when compare the requirement conutry and get value from application");
		//Assert.assertEquals(TestUtil.readDataFromExcellString(5, 7, 0), signUpPage.getFromSelectedNationality(), "Nationality selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 7,1);
		System.out.println("Verification done for selectNationalityTest!!! \n");
	}
	
	@Test(priority = 2)
	public void selectCountryResidence() throws InterruptedException, IOException{
		Thread.sleep(2000);
		signUpPage.selectCountryOfResidence();
		Assert.assertEquals(signUpPage.totalCountryResidenceActual(),totalCountryResidenceexpected,
				"Total Country Residence matched when compare the requirement and get value from application");
		//Assert.assertEquals(signUpPage.getTextFromSelectCountryResidence(), TestUtil.readDataFromExcellString(5, 15, 0),  "Country Residence selected values is not displayed when selected from drop down and comapare with test data");	
		TestUtil. writeStringValue(5, 15,1);
		System.out.println("Verification done for Select Country Residence!!! \n");
	}

	@Test(priority = 3)
	public void selectApplicationLocation() throws InterruptedException, IOException {
		Thread.sleep(2000);
		signUpPage.selectVisaLocation();
		Assert.assertEquals(signUpPage.totalVisaLocationActual(), totalVisaLocationExpected,
				"Total Application Location values are not matched when compare the requirement and get value from application");
		//Assert.assertEquals(signUpPage.getTextFromSelectVisaLocation(),TestUtil.readDataFromExcellString(5, 10, 0), "Application Location selected values is not displayed when selected from drop down and comapare with test data");	
		TestUtil. writeStringValue(5, 10,1);
		System.out.println("Verification done for select Application Location!!! \n");
	}
	
	

	
	@Test(priority = 4)
	public void selectModeOfConsulateTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		signUpPage.selectModeOfConsulate();
		Assert.assertEquals(signUpPage.totalModeOfConsulateActual(), totalModeOfConsulateExpected,
				"Total Mode Of Consulate values are not matched when compare the requirement and get value from application");
		//Assert.assertEquals(signUpPage.getTextFromSelectVisaLocation(),TestUtil.readDataFromExcellString(5, 10, 0), "Application Location selected values is not displayed when selected from drop down and comapare with test data");	
		TestUtil. writeStringValue(5,22,1);
		System.out.println("Verification done for select Mode Of Consulate!!! \n");
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test(priority = 5)
	public void SignUPNext1Verification() throws IOException, InterruptedException
	{
		signUpPage.SignUpNext1.click();
		System.out.println("Click on Next..");
		Assert.assertEquals(signUpPage.letssignuUptext(),TestUtil.readDataFromExcellString(5, 16, 0));
		TestUtil. writeStringValue(5, 16,1);
		System.out.println("Verification done for Lets Sign You Up After clicking on first next button!!! \n");
	}	
	
	@Test(priority = 6)
	public void Terms_condition() throws IOException, InterruptedException{
		signUpPage.termsCheckbox.click();
		System.out.println("Click on Terms & Condition and Next...");
		//Assert.assertTrue(signUpPage.verifySelected(), "Check(Terms And Condition) box is selected ");
		TestUtil. writeStringValue(5,18,1);
		System.out.println("Verification done for Terms And Condition!!! \n");
	}

	@Test(priority = 7)
	public void SignUPNext2Verification() throws IOException, InterruptedException
	{	
	TestUtil.scrollUpAtEndOFPage();
	signUpPage.SignUpNext2.click();
	System.out.println("Click on Next...");
	Assert.assertEquals(signUpPage.letssignuUptext(),TestUtil.readDataFromExcellString(5, 19, 0));
	TestUtil. writeStringValue(5, 19,1);
	System.out.println("Verification done for Lets Sign You Up After clicking on Second next button!!! \n");
	}	
	
	@Test(priority = 8)
	public void UploadPhoto() throws IOException, InterruptedException
	{	
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.ScrolluptoUploadphoto);	
		TestUtil.uploadfile(SignUpPage.UploadphotoSignup , driverPath+"\\DocumentAttach\\Passport-size-photo.jpg");
		TestUtil. writeStringValue(5,20,1);
		
	}
	
	@Test(priority = 9)
	public void selectPassportTypeTest() throws InterruptedException, IOException {	
		signUpPage.SelectPassportType();
		Assert.assertEquals(totalPassportTypeInReq, signUpPage.sizePassportType(), "Passport values are not matched when compare the requirement conutry and get value from application");
		Assert.assertEquals(TestUtil.readDataFromExcellString(5, 6, 0), signUpPage.getTextPassportTypeName(), "Passport selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 6,1);
		ArrayList<String> expectedPassport = new ArrayList<String>();	
		System.out.println("Verification done for passport type!!! \n");
	}
	
	@Test(priority = 10)
	public void selectPortOfArrivalTest() throws InterruptedException, IOException {
		Thread.sleep(2000);
		signUpPage.selectPortOfArrival();
		Thread.sleep(5000);
		Assert.assertEquals(signUpPage.totalPortArrival(), totalPortArrivalInReq,
		"Total port of arrival values are not matched when compare the requirement conutry and get value from application");
		//Assert.assertEquals(TestUtil.readDataFromExcellString(5, 8, 0), signUpPage.getTextFromPortofArrival(), "Port Of Arrival selected values is not displayed when selected from drop down and comapare with test data");
		TestUtil. writeStringValue(5, 8,1);
		System.out.println("Verification done for select Port Of Arrival Test!!! \n");
	}
	
	@Test(priority = 11)
	public void passPhoneNoTest() throws InterruptedException, IOException {
		System.out.println("Mobile number==>" +TestUtil.readDataFromExcellString(5, 11, 0));
		signUpPage.passPhoneNo(TestUtil.readDataFromExcellString(5, 11, 0));
		Assert.assertEquals(signUpPage.getTextFromPhoneFiled(), TestUtil.readDataFromExcellString(5, 11, 0),  "Pass phone number and get phone number is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 11,1);
		System.out.println("Verification done for passPhoneNoTest!!! \n");
	}
	
	@Test(priority = 12)
	public void selectDateOfBirthTest() throws InterruptedException, IOException {
		Thread.sleep(3000);
		//System.out.println("Birth date====>"+TestUtil.readDataFromExcellString(5, 14, 0));
		
		
		signUpPage.selectDateOfBirth();
		signUpPage.selectYear();
		//TestUtil.writeStringValue(5,25,1);
		signUpPage.selectMonth();
		//TestUtil.writeStringValue(5,24,1);
		signUpPage.selectDate();
		//TestUtil.writeStringValue(5,23,1);
		System.out.println("succfully done");
		
		//	Assert.assertEquals(signUpPage.getBirthDate(), TestUtil.readDataFromExcellString(5, 14, 0),  "Pass Birth date and get Birth date  is not matched while comparing from TestData");
		//TestUtil. writeStringValue(5, 14,1);
		//signUpPage.clickOnSelectAll();
		//System.out.println("Verification done for select Date OfBirth Test!!! \n");
	}
		
	@Test(priority = 13)
	public void passEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passEmailId(TestUtil.readDataFromExcellString(5, 12, 0));
		Assert.assertEquals(signUpPage.getTextFromEmailField(), TestUtil.readDataFromExcellString(5, 12, 0),  "Pass Email-Id and get Email-Id is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 12,1);
		System.out.println("Verification done for pass EmailId Test!!! \n");
	}
	@Test(priority = 14)
	public void passReEmailIdTest() throws InterruptedException, IOException {
		signUpPage.passReEmailId(TestUtil.readDataFromExcellString(5, 13, 0));
		Assert.assertEquals(signUpPage.getTextFromReEmailField(), TestUtil.readDataFromExcellString(5, 13, 0),  "Pass Email-Id and get Email-Id is not matched while comparing from TestData");
		TestUtil. writeStringValue(5, 13,1);
		System.out.println("Verification done for pass ReEmailId Test!!! \n");
	}
/*	
	@Test(priority = 15)
	public void enterCaptchaFieldTest() throws InterruptedException, IOException {
		signUpPage.captchaclick.click();
		
		//signUpPage.enterCaptchaField();
		signUpPage.SignUp.click();
		
	}*/
}