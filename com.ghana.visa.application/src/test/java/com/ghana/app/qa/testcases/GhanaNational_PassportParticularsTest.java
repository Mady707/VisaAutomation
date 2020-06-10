package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_PassportParticularsTest extends DriverInit{

	public GhanaNational_PassportParticularsTest() throws IOException,
	InterruptedException {
		super();
	}
	@Test(priority = 1)
	public void FillFormUpToSign() throws InterruptedException, IOException
	{
		ghanian_Nationaltest.New_National_verification();
		ghanian_Nationaltest.Fill_Form();
		GhanianNationalPage.register.click();
	}

	@Test(priority = 2)
	public void FillFormUpToPersonalInfo() throws InterruptedException, IOException
	{
		ghananationalPersonalInfo.QRCode.isDisplayed();
		ghananationalPersonalInfo.FemaleRadio.click();
		ghananationalPersonalInfo.Fname.sendKeys(TestUtil.readDataFromExcellString(24,2,0));
		ghananationalPersonalInfo.Mname.sendKeys(TestUtil.readDataFromExcellString(24,3,0));
		ghananationalPersonalInfo.Lname.sendKeys(TestUtil.readDataFromExcellString(24,4,0));
		ghananationalPersonalInfo.birthplace.sendKeys(TestUtil.readDataFromExcellString(24,6,0));
		ghananationalPersonalInfo.selectOccupation();
		ghananationalPersonalInfo.SaveAndNext.click();
	}

	@Test(priority = 3)
	public void PassAddressInfo() throws InterruptedException, IOException
	{	
		ghananationalAddressInfoPage.resi_address.sendKeys(TestUtil.readDataFromExcellString(26,3,0));
		ghananationalAddressInfoPage.resi_colony.sendKeys(TestUtil.readDataFromExcellString(26,4,0));
		ghananationalAddressInfoPage.resi_landmark.sendKeys(TestUtil.readDataFromExcellString(26,5,0));
		ghananationalAddressInfoPage.resi_pincode.sendKeys(TestUtil.readDataFromExcellString(26,6,0));
		ghananationalAddressInfoPage.resi_city.sendKeys(TestUtil.readDataFromExcellString(26,7,0));
		ghananationalAddressInfoPage.selectStateType();
		ghananationalAddressInfoPage.selectAddressType();
		ghananationalAddressInfoPage.resi_Nextbtn.click();

	}

	@Test(priority = 4)
	public void PassEmergencyInfo() throws InterruptedException, IOException
	{	
		ghananationalemergencyInfo.emergencyFirstName(TestUtil.readDataFromExcellString(27,3,0));
		ghananationalemergencyInfo.emergencyMiddleName(TestUtil.readDataFromExcellString(27,4,0));
		ghananationalemergencyInfo.emergencyLastName(TestUtil.readDataFromExcellString(27,5,0));
		ghananationalemergencyInfo.selectRelation();
		ghananationalemergencyInfo.passFlatNumber(TestUtil.readDataFromExcellString(27,7,0));
		ghananationalemergencyInfo.passStreetName(TestUtil.readDataFromExcellString(27, 8, 0));
		ghananationalemergencyInfo.passLandmark(TestUtil.readDataFromExcellString(27,9,0));
		ghananationalemergencyInfo.passPincode(TestUtil.readDataFromExcellString(27,10,0));
		ghananationalemergencyInfo.passCityName(TestUtil.readDataFromExcellString(27, 11, 0));
		ghananationalemergencyInfo.selectCountryType();
		ghananationalemergencyInfo.selectStateType();
		ghananationalemergencyInfo.passContact(TestUtil.readDataFromExcellString(27, 14, 0));
		ghananationalemergencyInfo.passEmail(TestUtil.readDataFromExcellString(27, 15, 0));
		ghananationalemergencyInfo.emergencySaveAndContinuebtn.click();	
	}


	@Test(priority = 5)
	public void TitlePassportParticularsVerify() throws IOException, InterruptedException
	{	
		ghananationalpassportParticularPage.getTitlePassportParticulars();
		Assert.assertEquals(ghananationalpassportParticularPage.getTitlePassportParticulars(),TestUtil.readDataFromExcellString(27,2,0),"Title is not match");
		TestUtil.writeStringValue(28,1,0);
	}

	@Test(priority = 6)
	public void SelectPassportIssueDate() throws IOException, InterruptedException
	{	
		ghananationalpassportParticularPage.selectPassPortIssue();
		ghananationalpassportParticularPage.selectYear();
		ghananationalpassportParticularPage.selectMonth();
		ghananationalpassportParticularPage.selectDate();
		TestUtil.writeStringValue(28,5,1);
	}

	@Test(priority = 7)
	public void SelectPassportDateOfExpiry() throws IOException, InterruptedException
	{	
		ghananationalpassportParticularPage.selectPassPortExpire();
		ghananationalpassportParticularPage.selectYearExpire();
		ghananationalpassportParticularPage.selectMonthExpire();
		ghananationalpassportParticularPage.selectDateExpire();
		TestUtil.writeStringValue(28,6,1);
	}

	@Test(priority = 8)
	public void SelectPassport_place() throws IOException, InterruptedException
	{	
		ghananationalpassportParticularPage.passPassportPlace(TestUtil.readDataFromExcellString(28,2,0));
		TestUtil.writeStringValue(28,2,1);
	}

	@Test(priority = 9)
	public void SelectPassportDateOfArrival() throws IOException, InterruptedException
	{	
		ghananationalpassportParticularPage.selectPassPortArrival();
		ghananationalpassportParticularPage.selectYearArrival();
		ghananationalpassportParticularPage.selectMonthArrival();
		ghananationalpassportParticularPage.selectDateArrival();
		TestUtil.writeStringValue(28,6,1);
		
		ghananationalpassportParticularPage.saveandNext.click();
	}
	
	
	
}
