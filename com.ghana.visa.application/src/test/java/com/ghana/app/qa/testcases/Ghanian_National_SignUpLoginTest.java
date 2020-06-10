package com.ghana.app.qa.testcases;

import static com.ghana.app.qa.util.TestUtil.driverPath;

import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.pages.SignUpPage;
import com.ghana.app.qa.util.TestUtil;

public class Ghanian_National_SignUpLoginTest extends DriverInit{

	public Ghanian_National_SignUpLoginTest() throws IOException, InterruptedException {
		super();

	}
	@Test(priority = 1)
	public void New_National_verification() throws IOException, InterruptedException
	{ 	
	GhanianNationalPage.ghananational.click();
	TestUtil.scrollUpHorizontalORVIsibilityOFElement(GhanianNationalPage.newghanauser);
	GhanianNationalPage.newghanauser.click();
	//homePage.NewGhanian.click();
	Assert.assertEquals(GhanianNationalPage.SignuUptext(),TestUtil.readDataFromExcellString(23, 1, 0));
	TestUtil.writeStringValue(23,1,1);
	}
/*
	@Test(priority = 2)
	public void Previous_verification() throws IOException, InterruptedException
	{	GhanianNationalPage.previous.click();
	Thread.sleep(2000);
	System.out.println("SignUp page is verified and title is : "+homePage.validateHomePageTitle());
	GhanianNationalPage.ghananational.click();
	Thread.sleep(1000);
	TestUtil.scrollUpHorizontalORVIsibilityOFElement(GhanianNationalPage.newghanauser);
	GhanianNationalPage.newghanauser.click();
	//homePage.NewGhanian.click();
	TestUtil.writeStringValue(23,2,1);
	}
*/
	@Test(priority = 3)
	public void Fill_Form() throws IOException, InterruptedException
	{	
		System.out.println("waiting for upload");
		//TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.ScrolluptoUploadphoto);	
		//TestUtil.uploadfile(SignUpPage.UploadphotoSignup , driverPath+"\\DocumentAttach\\FemalePassport-size-photo.jpg");
		
		GhanianNationalPage.passportnum.sendKeys(TestUtil.readDataFromExcellString(23,3,0));
		TestUtil.writeStringValue(23,3,1);
		GhanianNationalPage.phnum.sendKeys(TestUtil.readDataFromExcellString(23,4,0));
		TestUtil.writeStringValue(23,4,1);
		GhanianNationalPage.email.sendKeys(TestUtil.readDataFromExcellString(23,5,0));
		TestUtil.writeStringValue(23,5,1);
		GhanianNationalPage.selectDateOfBirth();
		GhanianNationalPage.selectYear();
		GhanianNationalPage.selectMonth();
		GhanianNationalPage.selectDate();
		GhanianNationalPage.pswd.sendKeys(TestUtil.readDataFromExcellString(23,8,0));
		TestUtil.writeStringValue(23,8,1);
		GhanianNationalPage.cnfmPswd.sendKeys(TestUtil.readDataFromExcellString(23,9,0));
		TestUtil.writeStringValue(23,9,1);
		
		//GhanianNationalPage.captchaclick.click();
		//GhanianNationalPage.enterCaptchaField();
		TestUtil.writeStringValue(23,10,1);

	}
	@Test(priority = 4)
	public void RegisterandGotoPersonal() throws InterruptedException, IOException {
		GhanianNationalPage.register.click();
		TestUtil.writeStringValue(23,11,1);
		System.out.println("Ghana National Login Page is ==>"+ghananationalPersonalInfo.ghanaPersonalPageText());
	
	}

	

}
