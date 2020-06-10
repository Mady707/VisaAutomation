package com.ghana.app.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_LoginTest extends DriverInit {

	public GhanaNational_LoginTest() throws IOException, InterruptedException {
		super();
	}	

	
	@Test(priority = 1)
	public void Loginform_previousButton() throws IOException, InterruptedException
	{ 	
		Thread.sleep(2000);
		GhanianNationalPage.ghananational.click();
		Thread.sleep(2000);
		GhanianNationalPage.Lcancle.click();
		System.out.println("Home page is verified and title is : "+homePage.validateHomePageTitle());
		TestUtil.writeStringValue(23,27,1);
		Thread.sleep(2000);
		GhanianNationalPage.ghananational.click();
		

	}

	@Test(priority = 2)
	public void Loginform() throws IOException, InterruptedException
	{	Thread.sleep(2000);
		GhanianNationalPage.LUsername.sendKeys(TestUtil.readDataFromExcellString(23,28,0));
		TestUtil.writeStringValue(23,28,1);
		GhanianNationalPage.Lpswd.sendKeys(TestUtil.readDataFromExcellString(23,29,0));
		TestUtil.writeStringValue(23,29,1);
		GhanianNationalPage.Lsubmit.click();
		TestUtil.writeStringValue(23,30,1);
		Thread.sleep(2000);
		//Assert.assertEquals(ghananationalPersonalInfo.ghanapersonalinfotext(),TestUtil.readDataFromExcellString(23, 31, 0));
		//TestUtil.writeStringValue(23,31,1);
	}

	 
	
	
	
}
