package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.driverPath;

public class PersonalInfoPage extends TestBase {

	public PersonalInfoPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from personnel information page

	@FindBy(xpath = "//strong[contains(text(),'Personal Information')]")
	public WebElement personalInfoTitle;

	@FindBy(xpath = "//div[@id='p-info']//div[@class='row']//div[@class='col-md-12']//div//h6[contains(text())]")
	WebElement applicationId;

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='middlename']")
	WebElement middlename;

	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastname;


	@FindBy(xpath = "//input[@id='femaleRadio']")
	//@FindBy(xpath = "//input[@type='radio' and @value='FeMale']")
	// gender radio btn change value=Female, Male, Other
	public WebElement Femalegender;

	@FindBy(xpath = "//input[@id='maleRadio']")
	public WebElement Malegender;


	WebElement VisaFees;// li[@id='1']
	@FindBy(xpath = "//input[@id='passport_number']")
	WebElement passport_number;
	@FindBy(xpath = "//input[@id='date_of_issued']")
	WebElement date_of_issued;
	@FindBy(xpath = "//input[@id='passport_expiry']")
	WebElement date_of_expiry;
	@FindBy(xpath = "//input[@id='birth_place']")
	WebElement birth_place;
	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//button[text()='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//input[@id='applicant_personal_info_form_btn']")
	WebElement saveAndContinue;
	@FindBy(xpath = "//input[@id='passport_place']")
	WebElement placeIssue;
	//@FindBy(xpath = "//input[@id='applicant_personal_info_form_btn']")
	//public WebElement submit;



	public String getTextPersonalInfoPageTitle() throws InterruptedException {
		Thread.sleep(2000);
		return personalInfoTitle.getText();

	}

	public String getApplicantPageTitle() {
		return driver.getTitle();
	}

	public String getApplicationId() {
		return applicationId.getText().substring(16);
	}

	public void passFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}
	public String getTextFromFirstName() throws InterruptedException {
		return firstname.getAttribute("value");
	}

	public void passMiddleName(String middleName) {
		middlename.sendKeys(middleName);
	}
	public String getTextFromMiddleName() throws InterruptedException {

		return middlename.getAttribute("value");
	}


	public void passLastName(String lastName) {
		lastname.sendKeys(lastName);
		// return lastname.getText();
	}
	public String getTextFromLastName() throws InterruptedException {

		return lastname.getAttribute("value");
	}
	public void passPassportNumber(String passportNumber) {
		passport_number.sendKeys(passportNumber);
	}
	public String getTextFrompassPortNumber() throws InterruptedException {
		return passport_number.getAttribute("value");
	}

	public void clickOnGender() throws InterruptedException {
		Thread.sleep(1000);
		TestUtil.actionClassMethod(Femalegender);
	}


	public void verifiedGenderSelected() throws InterruptedException {
		genderRadioButton = Femalegender.isSelected();
		System.out.println("genderRadioButton==>" + genderRadioButton);
	}

	public void selectPassIssueDate(String PassIssueDate) throws InterruptedException {

		//TestUtil.actionClassMethod(date_of_issued);
		TestUtil.clickOnElement(date_of_issued);
		date_of_issued.sendKeys(PassIssueDate); // Enter date in required format
	}

	public String getTextFromPassIssueDate() throws InterruptedException {
		return date_of_issued.getAttribute("value");
	}
	public void selectPassExpiryDate(String PassExpiryDate) throws InterruptedException {

		//TestUtil.actionClassMethod(date_of_expiry);
		TestUtil.clickOnElement(date_of_expiry);
		date_of_expiry.sendKeys(PassExpiryDate); // Enter date in required
		// format
	}
	public String getTextFromPassExpiryDate() throws InterruptedException {

		return date_of_expiry.getAttribute("value");
	}
	public void passPlaceOfBirth(String birthPlace) {
		birth_place.sendKeys(birthPlace);
	}

	public void passPlaceOfIssue(String Placeissue) {
		placeIssue.sendKeys(Placeissue);
	}


	public String getTextFromPassPlaceOfBirth() throws InterruptedException {

		return birth_place.getAttribute("value");
	}

	public String getTextFromPassPlaceOfIssue() throws InterruptedException {

		return placeIssue.getAttribute("value");
	}


	public void clickOnSaveAndContinue() {
		saveAndContinue.click();
	}


	///---------PlaceOfBirthCountry---------------------------
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[9]/div[1]/input[1]")
	WebElement CountryOfBirth;

	@FindBy(xpath = "//ul[@id='select-options-CountryofBirth_value']//li")
	List<WebElement> Birthcountrys;

	public int totalCountryBirthCount() {
		return Birthcountrys.size();
	}

	public void selectCountryOfBirth() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(CountryOfBirth);
		System.out.println("Total Birth countries are=>" + Birthcountrys.size());
		for (WebElement country : Birthcountrys) {
			if (country.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(6, 12, 0))) {
				country.click();
				System.out.println("country click done");
				Thread.sleep(5000);
				// System.out.println("selected Nationality from list =>"+getFromSelectedNationality());
				break;
			}
		}
	}





	///---------Formaer Nationality--------------------------
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[1]/div[11]/div[1]/input[1]")
	WebElement FormaerNationality;

	@FindBy(xpath = "//ul[@id='select-options-formerNationality_value']//li")
	List<WebElement> Formaercountrys;



	// For date of issue---------------

	@FindBy(xpath = "//input[@id='date_of_issued']")
	WebElement IssuePassoportdate;

	@FindBy(xpath = "//div[@id='date_of_issued_root']//select[@class='picker__select--year']")
	public WebElement Issueyear;

	@FindBy(xpath = "//div[@id='date_of_issued_root']//select[@class='picker__select--month']")
	public WebElement Issuemonth;

	//	@CacheLookup
	@FindBy(xpath = "//div[@id='date_of_issued_root']//tr//td")
	public List<WebElement> Issuedate;

	public void selectPassportIssueDate() throws InterruptedException {
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(IssuePassoportdate));
		TestUtil.actionClassMethod(IssuePassoportdate);
	}

	public void selectIssueYear() throws IOException, InterruptedException{
		TestUtil.selectValuefromDropDown(Issueyear, "2015");
	}
	public void selectIssueMonth(){
		TestUtil.selectValuefromDropDown(Issuemonth, "January");
	}

	public void selectIssueDate(){
		for(WebElement Date: Issuedate){
			if(Date.getText().equalsIgnoreCase("10"))
			{	
				Date.click();
				break;
			}	
		}
	}

	// For date of expire -------------------

	@FindBy(xpath = "//input[@id='passport_expiry']")
	WebElement ExpiryPassportdate;

	@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--year']")
	public WebElement Expiryyear;

	@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--month']")
	public WebElement Expirymonth;

	@CacheLookup
	@FindBy(xpath = "//div[@id='passport_expiry_root']//tr//td")
	public List<WebElement> Expirydate;

	public void selectPassportExpiryDate() throws InterruptedException {
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(ExpiryPassportdate));
		TestUtil.actionClassMethod(ExpiryPassportdate);
	}

	public void selectExpiryYear() throws IOException, InterruptedException{
		TestUtil.selectValuefromDropDown(Expiryyear, "2035");
	}
	public void selectExpiryMonth(){
		TestUtil.selectValuefromDropDown(Expirymonth, "January");
	}

	public void selectExpiryDate(){


		for(WebElement Date: Expirydate){
			if(Date.getText().equalsIgnoreCase("10"))
			{	
				Date.click();
				break;
			}	
		}
	}


	public void SelectGenderMulti(int row) throws IOException, InterruptedException
	{
		String FEMALE = TestUtil.readDataFromExcellString(1, row, 0);
		if (FEMALE.equals("Female"))
		{
			Thread.sleep(7000);
			TestUtil.scrollUpHorizontalORVIsibilityOFElement(this.Femalegender);
			TestUtil.actionClassMethod(Femalegender);
		} 
		else
		{
			Thread.sleep(7000);
			TestUtil.scrollUpHorizontalORVIsibilityOFElement(this.Malegender);
			TestUtil.actionClassMethod(Malegender);
		}

	}

	public void selectCountryOfBirthMulti(int row) throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(CountryOfBirth);
		for (WebElement country : Birthcountrys) {
			if (country.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(1, row, 8))) {
				country.click();
				Thread.sleep(5000);
				break;
			}
		}
	}

	public void selectFormaerNationalityMulti(int row) throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(FormaerNationality);
		for (WebElement country : Formaercountrys) {
			if (country.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(1, row, 10))) {
				country.click();
				Thread.sleep(5000);
				break;
			}
		}
	}


	public void selectIssueYearMulti(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(1,row, 14);
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Issueyear));
		TestUtil.selectValuefromDropDown(Issueyear, yy);
	}
	public void selectIssueMonthMulti(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(1, row, 15);
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Issuemonth));
		TestUtil.selectValuefromDropDown(Issuemonth, mm);
	}

	public void selectIssueDateMulti(int row) throws IOException, InterruptedException{

		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='date_of_issued_root']//tr//td")));

		for(WebElement Date: Issuedate){	
			String dd = TestUtil.readDataFromExcellString(1,row,16);
			if(Date.getText().equalsIgnoreCase(dd))
			{	
				Thread.sleep(1000);
				Date.click();
				break;
			}	
		}
	}


	public void selectExpiryYearMulti(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(1,row, 17);
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Expiryyear));
		TestUtil.selectValuefromDropDown(Expiryyear, yy);
	}
	public void selectExpiryMonthMulti(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(1, row, 18);
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Expirymonth));
		TestUtil.selectValuefromDropDown(Expirymonth, mm);
	}


	public void selectExpiryDateMulti(int row) throws IOException, InterruptedException
	{
		List<WebElement> d1 = driver.findElements(By.xpath("//div[@id='passport_expiry_root']//tr//td"));
		try {
			for(WebElement Date: d1)
			{
				String dd = TestUtil.readDataFromExcellString(1,row,19);
				if(Date.getText().equalsIgnoreCase(dd))
				{	System.out.println("comparing......");
				Date.click();
				break;
				}	
			}
		} catch (Exception e) {
			List<WebElement> d11 = driver.findElements(By.xpath("//div[@id='passport_expiry_root']//tr//td"));
			for(WebElement Date: d11)
			{
				String dd = TestUtil.readDataFromExcellString(1,row,19);
				if(Date.getText().equalsIgnoreCase(dd))
				{	System.out.println("comparing......");
				Date.click();
				break;
				}	
			}
		}
	}
}


