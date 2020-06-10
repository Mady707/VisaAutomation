package com.ghana.app.qa.testcases;

import java.io.IOException;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_EmergencyPageTest extends DriverInit {

	public GhanaNational_EmergencyPageTest() throws IOException,
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
	}
	
	@Test(priority = 4)
	public void EmergencyInfoTitleTest() throws InterruptedException, IOException 
	{	ghananationalAddressInfoPage.resi_Nextbtn.click();
		TestUtil.writeStringValue(27,1,1);
		
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(ghananationalemergencyInfo.emePageTitle);
		System.out.println("Title is : "+ghananationalemergencyInfo.getTextEmerPageTitle());
		Assert.assertEquals(ghananationalemergencyInfo.getTextEmerPageTitle(),TestUtil.readDataFromExcellString(27,2,0),"Title is not match");
		TestUtil.writeStringValue(27,2, 1);
	}
	
	@Test(priority = 5)
	public void emergencyContactDetailsTest() throws InterruptedException, IOException 
	{
		ghananationalemergencyInfo.emergencyFirstName(TestUtil.readDataFromExcellString(27,3,0));
		System.out.println("first name is : "+ghananationalemergencyInfo.getTextEmergencyFirstName());
		Assert.assertEquals(ghananationalemergencyInfo.getTextEmergencyFirstName(), TestUtil.readDataFromExcellString(27,3,0),"First name not match");
		TestUtil.writeStringValue(27,3,1);
		
		ghananationalemergencyInfo.emergencyMiddleName(TestUtil.readDataFromExcellString(27,4,0));
		Assert.assertEquals(ghananationalemergencyInfo.getTextEmergencyMiddleName(), TestUtil.readDataFromExcellString(27,4,0),"Middle name not ");
		TestUtil.writeStringValue(27,4,1);
		
		ghananationalemergencyInfo.emergencyLastName(TestUtil.readDataFromExcellString(27,5,0));
		Assert.assertEquals(ghananationalemergencyInfo.gettextEmergencyLastName(), TestUtil.readDataFromExcellString(27,5,0),"Last name from Emergency Contact page is not matched when compare with Test data");
		TestUtil.writeStringValue(27,5,1);	
	}

	@Test(priority = 6)
	public void selectRelationTest() throws InterruptedException, IOException 
	{
		ghananationalemergencyInfo.selectRelation();
		Assert.assertEquals(ghananationalemergencyInfo.getTextFromRelation(), TestUtil.readDataFromExcellString(27, 6, 0),"relation not match");
		TestUtil.writeStringValue(27,6,1);
	}
	
	@Test(priority =7)
	public void filladdressInfoTest1() throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		ghananationalemergencyInfo.passFlatNumber(TestUtil.readDataFromExcellString(27,7,0));
		Assert.assertEquals(ghananationalemergencyInfo.getTextFlatNumber(),TestUtil.readDataFromExcellString(27,7,0),"Flat number is not matched when match with Test Data");
		TestUtil.writeStringValue(27,7,1);
		Thread.sleep(2000);
		ghananationalemergencyInfo.passStreetName(TestUtil.readDataFromExcellString(27, 8, 0));
		Assert.assertEquals(ghananationalemergencyInfo.geTextStreetName(),TestUtil.readDataFromExcellString(27,8, 0),"Street name is not matched when match with Test Data");
		TestUtil.writeStringValue(27,8,1);
	}
	
	@Test(priority = 8)
	public void filladdressInfoTest2() throws InterruptedException, IOException 
	{
		ghananationalemergencyInfo.passLandmark(TestUtil.readDataFromExcellString(27,9,0));
		Assert.assertEquals(ghananationalemergencyInfo.getTextLandmark(), TestUtil.readDataFromExcellString(27,9,0),"land mark name is not matched when match with Test Data");
		TestUtil.writeStringValue(27,9,1);
		ghananationalemergencyInfo.passPincode(TestUtil.readDataFromExcellString(27,10,0));
		Assert.assertEquals(ghananationalemergencyInfo.getTextPincode(), TestUtil.readDataFromExcellString(27,10,0),"pincode is not matched when match with Test Data");
		TestUtil.writeStringValue(27,10,1);
	}
	
	@Test(priority = 9)
	public void filladdressInfoTest3() throws InterruptedException, IOException 
	{
		ghananationalemergencyInfo.passCityName(TestUtil.readDataFromExcellString(27, 11, 0));
		Assert.assertEquals(ghananationalemergencyInfo.getTextCityName(), TestUtil.readDataFromExcellString(27,11, 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(27,11,1);	
	}
	
	@Test(priority = 10)
	public void SelectCountry() throws IOException, InterruptedException
	{
	ghananationalemergencyInfo.selectCountryType();
	Assert.assertEquals(ghananationalemergencyInfo.getTextFromCountryType(), TestUtil.readDataFromExcellString(27, 13, 0),"Address Type is not matched when match with Test Data");
	TestUtil.writeStringValue(27,13,1);
	}

	@Test(priority =11)
	public void SelectState() throws IOException, InterruptedException
	{
		ghananationalemergencyInfo.selectStateType();
		Assert.assertEquals(ghananationalemergencyInfo.getTextFromStateType(), TestUtil.readDataFromExcellString(27, 12, 0),"Address Type is not matched when match with Test Data");
		TestUtil.writeStringValue(27,12,1);
	}	
		
	@Test(priority =12)
	public void PassContact() throws IOException, InterruptedException
	{
		ghananationalemergencyInfo.passContact(TestUtil.readDataFromExcellString(27, 14, 0));
		Assert.assertEquals(ghananationalemergencyInfo.getContact(), TestUtil.readDataFromExcellString(27, 14, 0),"City name is not matched when match with Test Data");
		TestUtil.writeStringValue(27,14,1);
	}
	@Test(priority =13)
	public void PassEmail() throws IOException, InterruptedException
	{	ghananationalemergencyInfo.passEmail(TestUtil.readDataFromExcellString(27, 15, 0));
		Thread.sleep(1000);
		Assert.assertEquals(ghananationalemergencyInfo.getEmail(),TestUtil.readDataFromExcellString(27, 15, 0),"Email is not match");
		TestUtil.writeStringValue(27,15,1);	
	}
	
	@Test(priority =14)
	public void SaveAndNext() throws IOException, InterruptedException
	{
		ghananationalemergencyInfo.emergencySaveAndContinuebtn.click();
		TestUtil.writeStringValue(27,16,1);	
	}
}
