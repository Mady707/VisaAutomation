package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class HotelReferencesPage extends TestBase{

	public HotelReferencesPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@id='primary_ref_firstname']")
	public WebElement HotelName;
	
	@FindBy(xpath = "//input[@id='primary_ref_addressLine1']")
	public WebElement addressline1 ;

	@FindBy(xpath = "//input[@id='primary_ref_addressLine2']")
	public WebElement addressline2;

	@FindBy(xpath = "//input[@id='primary_ref_landmark']")
	public WebElement landmark;

	@FindBy(xpath = "//input[@id='primaryPostalCode']")
	public WebElement pincode;

	@FindBy(xpath = "//input[@id='primary_ref_city']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='primary_ref_contact']")
	public WebElement contact;

	@FindBy(xpath = "//input[@id='primary_ref_emailId']")
	public WebElement email ;

	@FindBy(xpath = "//input[@id='applicant_references_information_form_btn']")
	public WebElement HotelSaveAndContinuebtn;
	
	
	
	public void passHotelName(String name) throws InterruptedException {
		HotelName.sendKeys(name);
	}
	public void passFlatNumber(String FlatNo) throws InterruptedException {
		addressline1.sendKeys(FlatNo);
	}
	public void passStreetName(String StreetName) {
		addressline2.sendKeys(StreetName);
	}
	public void passLandmark(String Landmark) {
		landmark.sendKeys(Landmark);
	}
	public void passPincode(String Pincode) {
		pincode.sendKeys(Pincode);
	}
	public void passCityName(String Cityname) {
		city.sendKeys(Cityname);
	}
	public void passContact(String Contact) {
		contact.sendKeys(Contact);
	}
	public void passEmail(String Email) {
		email.sendKeys(Email);
	}
	public void clickHotelContinueBtn() {
		HotelSaveAndContinuebtn.click();
	}


	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[9]/div[1]/input[1]")
	WebElement CountryType;

	@FindBy(xpath = "//ul[@id='select-options-primary_ref_country']//li")
	List<WebElement> totalCountryType;
	
	public void selectCountryTypeMulti(int row) throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(CountryType);
	for (WebElement CountryType : totalCountryType){
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, row, 6))){
			CountryType.click();
			}
		}
	}

	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[10]/div[1]/div[1]/input[1]")
	public WebElement StateType;

	@FindBy(xpath = "//ul[@id='select-options-primary_ref_state']//li")
	public List<WebElement> totalStateType;
	
	public void selectStateTypeMulti(int row) throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(StateType);
	for (WebElement StateType : totalStateType){
		Thread.sleep(1000);
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, row, 7))){
			Thread.sleep(1000);
			StateType.click();
			}
		}
	}
	
	
	
	
	
	
}
