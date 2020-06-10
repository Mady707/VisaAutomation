package com.ghana.app.qa.testcases;



import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanNational_PersonalInfoTest extends DriverInit {

	public GhanNational_PersonalInfoTest() throws IOException,InterruptedException {
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
	public void VerifyPersonalPage() throws IOException, InterruptedException
	{ 
	ghananationalPersonalInfo.ghanapersonalinfotext();
	Assert.assertEquals(TestUtil.readDataFromExcellString(24,10,0), ghananationalPersonalInfo.ghanapersonalinfotext());
	System.out.println("Personal Page is verified!!!!");
	TestUtil.writeStringValue(24,10,1);
	}
	
	@Test(priority = 3)
	public void FillForm() throws IOException, InterruptedException
	{ 
		ghananationalPersonalInfo.QRCode.isDisplayed();
		//System.out.println("BarCode is generated and number is ==> "+ghananationalPersonalInfo.Barcodetext());
		TestUtil.writeStringValue(24,7,1);
		ghananationalPersonalInfo.FemaleRadio.click();
		TestUtil.writeStringValue(24,1,1);
		ghananationalPersonalInfo.Fname.sendKeys(TestUtil.readDataFromExcellString(24,2,0));
		TestUtil.writeStringValue(24,2,1);
		ghananationalPersonalInfo.Mname.sendKeys(TestUtil.readDataFromExcellString(24,3,0));
		TestUtil.writeStringValue(24,3,1);
		ghananationalPersonalInfo.Lname.sendKeys(TestUtil.readDataFromExcellString(24,4,0));
		TestUtil.writeStringValue(24,4,1);
		ghananationalPersonalInfo.birthplace.sendKeys(TestUtil.readDataFromExcellString(24,6,0));
		TestUtil.writeStringValue(24,6,1);
	}
	
	@Test(priority = 4)
	public void selectOccupationTest() throws InterruptedException, IOException
	{
		ghananationalPersonalInfo.selectOccupation();
		TestUtil. writeStringValue(24, 8,1);
		System.out.println("Verification done for selectOccupationTest!!! \n");
	}
	@Test(priority = 5)
	public void SaveandCont() throws InterruptedException, IOException
	{
		ghananationalPersonalInfo.SaveAndNext.click();
		TestUtil. writeStringValue(24,9,1);
	}
}
