package com.ghana.app.qa.pages;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class EmergencyContactPage extends TestBase {

	public EmergencyContactPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// element id for emergency contact

	@FindBy(xpath = "//h5[contains(text(),'Travel Information')]")
	WebElement travelInfoPageTitle;

	@FindBy(xpath = "//strong[contains(text(),'Emergency Contact')]")
	public WebElement emePageTitle;
	@FindBy(xpath = "//input[@id='emergency_firstname']")
	WebElement emergency_firstname;
	@FindBy(xpath = "//input[@id='emergency_middlename']")
	WebElement emergency_middlename;
	@FindBy(xpath = "//input[@id='emergency_lastname']")
	WebElement emergency_lastname;
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement Relationship;
	@FindBy(xpath = "//ul[@id='select-options-sel_relation']//li")
	List<WebElement> totalRelation;
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[5]/div[1]/input[1]")
	WebElement getTextFromrelation;

	@FindBy(xpath = "//input[@id='emergency_flat_no']")
	public WebElement addressline1 ;

	@FindBy(xpath = "//input[@id='emergency_street']")
	public WebElement addressline2;

	@FindBy(xpath = "//input[@id='emergency_landmark']")
	public WebElement landmark;

	@FindBy(xpath = "//input[@id='emergency_pincode']")
	public WebElement pincode;

	@FindBy(xpath = "//input[@id='emergency_city']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='emergency_phone_number']")
	public WebElement contact;

	@FindBy(xpath = "//input[@id='emergency_emailId']")
	public WebElement email ;

	@FindBy(xpath = "//input[@id='applicant_emergency_contact_form_btn']")
	public WebElement emergencySaveAndContinuebtn;


	//--------------Methods

	public String getTextEmerPageTitle() {

		return emePageTitle.getText();
	}

	public void emergencyFirstName(String eFirstName) {
		emergency_firstname.sendKeys(eFirstName);
	}

	public String getTextEmergencyFirstName() {
		return emergency_firstname.getAttribute("value");
	}

	public void emergencyMiddleName(String middleName) {
		emergency_middlename.sendKeys(middleName);
	}

	public String getTextEmergencyMiddleName() {
		return emergency_middlename.getAttribute("value");
	}

	public void emergencyLastName(String eLastName) {
		emergency_lastname.sendKeys(eLastName);
	}

	public String gettextEmergencyLastName() {
		return emergency_lastname.getAttribute("value");
	}

	public void passFlatNumber(String FlatNo) throws InterruptedException {
		addressline1.sendKeys(FlatNo);
	}

	public String getTextFlatNumber() throws InterruptedException {
		return addressline1.getAttribute("value");
	}
	public void passStreetName(String StreetName) {
		addressline2.sendKeys(StreetName);
	}

	public String geTextStreetName() throws InterruptedException {
		return addressline2.getAttribute("value");
	}

	public void passLandmark(String Landmark) {
		landmark.sendKeys(Landmark);
	}

	public String getTextLandmark() throws InterruptedException {
		return landmark.getAttribute("value");
	}

	public void passPincode(String Pincode) {
		pincode.sendKeys(Pincode);
	}

	public String getTextPincode() throws InterruptedException {
		return pincode.getAttribute("value");
	}

	public void passCityName(String Cityname) {
		city.sendKeys(Cityname);
	}
	public String getTextCityName() throws InterruptedException {
		return city.getAttribute("value");
	}

	//--------------Relation
	public void selectRelation() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(Relationship);
		System.out.println("Total relation count=====>" + totalRelation.size());
		for (int i = 0; i < totalRelation.size(); i++) {
			// System.out.println("Total relation count=====>"
			// +totalRelation.get(i).getText());
			if (totalRelation.get(i).getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, 6, 0))) {
				totalRelation.get(i).click();
				System.out.println("Selected relation text here=====>"
						+ getTextFromRelation());
			}
		}
	}

	public String getTextFromRelation() {
		return getTextFromrelation.getAttribute("value");
	}

	// For country---------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[12]/div[1]/input[1]")
	WebElement CountryType;

	@FindBy(xpath = "//ul[@id='select-options-emergency_country']//li")
	List<WebElement> totalCountryType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[12]/div[1]/input[1]")
	WebElement getTextCountryType;

	public void selectCountryType() throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(CountryType);
	System.out.println("Total Country type===>"+ totalCountryType.size());
	for (WebElement CountryType : totalCountryType){
		//System.out.println("Total Country type===>"+ CountryType.getText());
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, 13, 0))){
			CountryType.click();
		}
	}
	}

	public String getTextFromCountryType() throws InterruptedException{
		return getTextCountryType.getAttribute("value");
		//return CountryType.getText();
	}



	// for state-----------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[13]/div[1]/input[1]")
	public WebElement StateType;

	@FindBy(xpath = "//ul[@id='select-options-emergency_state']//li")
	public List<WebElement> totalStateType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[4]/form[1]/div[1]/div[13]/div[1]/input[1]")
	public WebElement getTextStateType;


	public void selectStateType() throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(StateType);
	System.out.println("Total State type===>"+ totalStateType.size());
	for (WebElement StateType : totalStateType){
		Thread.sleep(1000);
		//System.out.println("Total State type===>"+ StateType.getText());
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(8, 12, 0))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}

	public String getTextFromStateType() throws InterruptedException{
		Thread.sleep(1000);
		return getTextStateType.getAttribute("value");
		//return StateType.getText();
	}

	public void passContact(String Contact) {
		contact.sendKeys(Contact);
	}

	public String getContact() throws InterruptedException {
		return contact.getAttribute("value");
	}

	public void passEmail(String Email) {
		email.sendKeys(Email);
	}

	public String getEmail() throws InterruptedException {
		return email.getAttribute("value");
	}

	public void clickEmeContinueBtn() {
		emergencySaveAndContinuebtn.click();
	}






	public void selectRelationMulti(int row) throws IOException, InterruptedException {
		TestUtil.actionClassMethod(Relationship);	
		for (int i = 0; i < totalRelation.size(); i++) {
			if (totalRelation.get(i).getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(4, row, 3))) {
				totalRelation.get(i).click();
			}
		}
	}

	public void selectCountryTypeMulti(int row) throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(CountryType);
	for (WebElement CountryType : totalCountryType){
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(4, row, 9))){
			CountryType.click();
		}
	}
	}

	public void selectStateTypeMulti(int row) throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(StateType);
	for (WebElement StateType : totalStateType){
		Thread.sleep(1000);
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(4, row, 10))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}














}

