package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class EvacuationOfGhanians extends TestBase{

	public EvacuationOfGhanians() throws IOException, InterruptedException {
		super();
	}

	@FindBy(xpath = "//div[@class='container']//div[1]//div[1]//button[1]")
	public WebElement ClickHereToRegister;


	// Personal Info

	@FindBy(id = "firstName")
	public WebElement FirstName;

	@FindBy(id = "middlename")
	public WebElement MiddleName;

	@FindBy(id = "lastName")
	public WebElement LastName;


	public void passFirstName(String first) { FirstName.sendKeys(first);}
	public void passMiddleName(String middle) { MiddleName.sendKeys(middle);}	
	public void passLastName(String last) {	LastName.sendKeys(last);}
	
	// Contact Info
	@FindBy(id = "Email")
	public WebElement Email;

	@FindBy(id = "MobilePhone")
	public WebElement MobileNumber;

	@FindBy(id = "Whatappno")
	public WebElement WPNumber;

	public void passEmail(String email) {	Email.sendKeys(email);}	
	public void passMobile(String mobile) {	MobileNumber.sendKeys(mobile);}	
	public void passwhatsappNumber(String wp) {	WPNumber.sendKeys(wp);}
	

	// Address
	@FindBy(id = "Street1")
	public WebElement flat;

	@FindBy(id = "Street2")
	public WebElement colony;

	@FindBy(id = "Landmark")
	public WebElement landmark ;

	@FindBy(id = "City")
	public WebElement city;

	@FindBy(id = "ZipCode")
	public WebElement zip ;

	@FindBy(id = "Country")
	public WebElement country ;

	@FindBy(id = "State")
	public WebElement state;


	public void passFlat(String flat1) {	flat.sendKeys(flat1);}
	public void passColony(String colony1) {	colony.sendKeys(colony1);}
	public void passLandmark(String landmark1) {	landmark.sendKeys(landmark1);}
	public void passCity(String city1) {	city.sendKeys(city1);}
	public void passZip(String zip1) {	zip.sendKeys(zip1);}
	public void passCountry(String country1) {	country.sendKeys(country1);}
	public void passState(String state1) {	state.sendKeys(state1);}
	

	// Dates all

	//1........	
	@FindBy(id = "dateSelect")
	public WebElement TravelFromGhana;

	@FindBy(xpath = "//div[@id='dateSelect_root']//select[@class='picker__select--year']")
	public WebElement travelYear ;

	@FindBy(xpath = "//div[@id='dateSelect_root']//select[@class='picker__select--month']")
	public WebElement travelMonth ;

	@FindBy(xpath = "//div[@id='dateSelect_root']//tr//td")
	public List<WebElement> travelDay;


	public void selectDateTravelFromGhana() throws InterruptedException {
		TestUtil.actionClassMethod(TravelFromGhana);
	}
	
	public void selectYearTravelFromGhana(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(0,row, 8);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(travelYear));
		TestUtil.selectValuefromDropDown(travelYear, yy);
	}
	
	public void selectMonthTravelFromGhana(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(0, row, 9);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(travelMonth));
		TestUtil.selectValuefromDropDown(travelMonth, mm);
	}
	
	public void selectDateTravelFromGhana(int row) throws IOException, InterruptedException{
		
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='dateSelect_root']//tr//td")));
		for(WebElement Date: travelDay){			
			String dd = TestUtil.readDataFromExcellString(0,row,10);
			if(Date.getText().equalsIgnoreCase(dd))
			{	Date.click();
			break;
			}	
		}
	}	
		
	//2............

	@FindBy(id = "originaldate")
	public WebElement ReturnToGhana ;

	@FindBy(xpath = "//div[@id='originaldate_root']//select[@class='picker__select--year']")
	public WebElement ReturnYear;

	@FindBy(xpath = "//div[@id='originaldate_root']//select[@class='picker__select--month']")
	public WebElement ReturnMonth ;

	@FindBy(xpath = "//div[@id='originaldate_root']//tr//td")
	public List<WebElement> ReturnDay ;

	public void selectDateReturnToGhana() throws InterruptedException {
		TestUtil.actionClassMethod(ReturnToGhana);
	}
	
	public void selectYearReturnToGhana(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(0,row, 8);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(travelYear));
		TestUtil.selectValuefromDropDown(ReturnYear, yy);
	}
	
	
	public void selectMonthReturnToGhana(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(0, row, 9);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(travelMonth));
		TestUtil.selectValuefromDropDown(ReturnMonth, mm);
	}
	
	public void selectDateReturnToGhana(int row) throws IOException, InterruptedException{
		
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='originaldate_root']//tr//td")));
		for(WebElement Date: ReturnDay){			
			String dd = TestUtil.readDataFromExcellString(0,row,10);
			if(Date.getText().equalsIgnoreCase(dd))
			{	Date.click();
			break;
			}	
		}
	}		
	
	// payment
	
	@FindBy(xpath = "//label[@class='custom-control-label']")
	public WebElement AbilityToPay;

	@FindBy(id = "message_text")
	public WebElement ReasonForInability;

	public void passabilityTopay()    {	AbilityToPay.click();}
	public void passReason(String inability) {	ReasonForInability.sendKeys(inability);}
		
	// Documents

	@FindBy(id = "PageofPassport")
	public WebElement passport ;

	@FindBy(id = "ReturnTicket")
	public WebElement returnTicket ;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm waves-effect waves-light']")
	public WebElement Register;

	@FindBy(id = "cancelCustomer")
	public WebElement Cancle;

}
