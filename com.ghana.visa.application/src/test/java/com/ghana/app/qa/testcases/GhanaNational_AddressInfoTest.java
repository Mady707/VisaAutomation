package com.ghana.app.qa.testcases;

import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_AddressInfoTest extends DriverInit {

	public GhanaNational_AddressInfoTest() throws IOException,
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
		//ghananationalPersonalInfo.FemaleRadio.click();
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
		ghananationalAddressInfoPage.getAddressInfoText();
		Assert.assertEquals((TestUtil.readDataFromExcellString(26,2,0)),ghananationalAddressInfoPage.getAddressInfoText());
		TestUtil.writeStringValue(26,2,1);
		
		ghananationalAddressInfoPage.resi_address.sendKeys(TestUtil.readDataFromExcellString(26,3,0));
		TestUtil.writeStringValue(26,3,1);
		
		ghananationalAddressInfoPage.resi_colony.sendKeys(TestUtil.readDataFromExcellString(26,4,0));
		TestUtil.writeStringValue(26,4,1);
		
		ghananationalAddressInfoPage.resi_landmark.sendKeys(TestUtil.readDataFromExcellString(26,5,0));
		TestUtil.writeStringValue(26,5,1);
		ghananationalAddressInfoPage.resi_pincode.sendKeys(TestUtil.readDataFromExcellString(26,6,0));
		TestUtil.writeStringValue(26,6,1);	
		
		ghananationalAddressInfoPage.resi_city.sendKeys(TestUtil.readDataFromExcellString(26,7,0));
		TestUtil.writeStringValue(26,7,1);	
		
	}

	@Test(priority = 4)
	public void PassState() throws InterruptedException, IOException
	{
	ghananationalAddressInfoPage.selectStateType();
	TestUtil.writeStringValue(26,8,1);
	}
	@Test(priority = 5)
	public void PassAddressType() throws InterruptedException, IOException
	{ 	ghananationalAddressInfoPage.selectAddressType();
		TestUtil.writeStringValue(26,9,1);
		ghananationalAddressInfoPage.resi_Nextbtn.click();
	}
}
