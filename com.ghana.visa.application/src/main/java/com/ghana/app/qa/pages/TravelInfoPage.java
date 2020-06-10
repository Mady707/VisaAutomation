package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

public class TravelInfoPage extends TestBase {

	public TravelInfoPage() throws IOException, InterruptedException {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[contains(text(),'Travel Information')]")
	public WebElement travelInfoPageTitle;

	@FindBy(xpath= "//input[@id='ticket_number']")
	WebElement ticketNumber;



	@FindBy(xpath = "//div[@id='regular_div']//tr[2]//td[1]")
	public WebElement visaFees;



	@FindBy(xpath = "//input[@id='applicant_travel_information_form_btn']")
	public WebElement applicant_travel_information_form_btn;



	@FindBy(xpath = "//label[contains(text(),'Is this your First Time in Ghana?')]")
	public WebElement FirstTravelGhana;

	@FindBy(xpath = "//input[@id='last_visit']")
	public WebElement LastTravelDuration;


	@FindBy(xpath = "//input[@id='other_purpose']")
	public WebElement otherpurpose;


	public void passLastTravelDuration(String duration) {
		LastTravelDuration.sendKeys(duration);
	}

	public void passotherpurpose(String purpose) {
		otherpurpose.sendKeys(purpose);
	}

	//Duration of last travel

	
						
	@FindBy(xpath = "//*[@id='visit_to_ghana_dropdown']/div/div/input")
	//@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]")
	public WebElement lastvisit;

	@FindBy(xpath = "//ul[@id='select-options-drp_dwn']//li")
	public List<WebElement> totallastvisit;

	public void selectlastvisitDurationMulti(int row) throws IOException, InterruptedException 
	{
		System.out.println("In last duration ");
		Thread.sleep(2000);
		TestUtil.actionClassMethod(lastvisit);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (WebElement visit : totallastvisit){
			System.out.println("Read from Excel--"+TestUtil.readDataFromExcellString(5, row,11));
			if(visit.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, row,11)))
			{	System.out.println("Comparing...");
				visit.click();
				System.out.println("Read from after clicking--"+visit.getText());
			}
		}
	}



	//-----------TravelInfo Page 
	public String getTextTravelInfoPagetitle() throws InterruptedException {
		Thread.sleep(1000);
		return travelInfoPageTitle.getText();
	}

	//------------Date of Last Travel

	@FindBy(xpath = "//input[@id='last_travel']")
	public WebElement LastTravelClick;

	@FindBy(xpath = "//div[@id='last_travel_root']//select[@class='picker__select--year']")
	public WebElement LastTravelYear;

	@FindBy(xpath = "//div[@id='last_travel_root']//select[@class='picker__select--month']")
	public WebElement LastTravelMonth;

	//@CacheLookup
	@FindBy(xpath = "//div[@id='last_travel_root']//tr//td")
	public List<WebElement> LastTravelDate;



	public void selectDateOfLastTravel() throws InterruptedException {
		//new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='departure_date']")));
		TestUtil.actionClassMethod(LastTravelClick);
	}


	public void selectLastTravelYearMulti(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(5,row, 8);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='last_travel_root']//select[@class='picker__select--year']")));
		TestUtil.selectValuefromDropDown(LastTravelYear, yy);
	}
	public void selectLastTravelMonthMulti(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(5, row, 9);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='last_travel_root']//select[@class='picker__select--month']")));
		TestUtil.selectValuefromDropDown(LastTravelMonth, mm);
	}

	public void selectLastTravelDateMulti(int row) throws IOException, InterruptedException{
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='last_travel_root']//tr//td")));	
		for(WebElement Date: LastTravelDate){	
			String dd = TestUtil.readDataFromExcellString(5,row,10);
			if(Date.getText().equalsIgnoreCase(dd))
			{	Date.click();
			break;
			}	
		}
	}


	//------------Date of departure

	@FindBy(xpath= "//input[@id='departure_date']")
	public WebElement departureDate;

	@FindBy(xpath = "//div[@id='departure_date_root']//select[@class='picker__select--year']")
	public WebElement year;

	@FindBy(xpath = "//div[@id='departure_date_root']//select[@class='picker__select--month']")
	public WebElement month;

	//@CacheLookup
	@FindBy(xpath = "//div[@id='travel']//tr//td")
	public List<WebElement> date;

	public void selectDateOfBirth() throws InterruptedException {
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='departure_date']")));
		TestUtil.actionClassMethod(departureDate);
		System.out.println("1st click done");
	}
	public void selectYear() throws IOException, InterruptedException{
		TestUtil.selectValuefromDropDown(year,"2020");
	}
	public void selectMonth(){
		TestUtil.selectValuefromDropDown(month,"March");
	}

	public void selectDate(){
		for(WebElement Date: date){
			if(Date.getText().equalsIgnoreCase("1"))
			{	
				Date.click();
				break;
			}	
		}
	}

	//-------------purpose of journy

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	public WebElement purpose_of_journey;

	@FindBy(xpath = "//ul[@id='select-options-sel_purpose']//li")
	List<WebElement> totalOptionOfPurposeJourney;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	WebElement getTextpurpose_of_journey;

	public void clickPurpose_of_journey() throws InterruptedException, IOException {
		//	TestUtil.actionClassMethod(purpose_of_journey);
		TestUtil.clickOnElement(purpose_of_journey);
		System.out.println("totalOptionOfPurposeJourney=====>" +totalOptionOfPurposeJourney.size());

		for (WebElement perposeJourneyOptions : totalOptionOfPurposeJourney){	
			//System.out.println("perposeJourneyOptions text=====>" +perposeJourneyOptions.getText());	
			if (perposeJourneyOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 7, 0))){
				perposeJourneyOptions.click();
				System.out.println("getTextpurpose_of_journey=====>" +getTextpurpose_of_journey());	
			}
		}
	}

	public String getTextpurpose_of_journey(){	
		return getTextpurpose_of_journey.getAttribute("value");
	}

	//---------------Do u have round ticket
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]")
	WebElement RoundTicket;

	@FindBy(xpath = "//ul[@id='select-options-sel_roundTkt']//li")
	List<WebElement> totalRoundTicket;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")
	WebElement getTextRoundTicket;

	public void clickOnIsApplicantPossessionRoundTicket() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(RoundTicket);
		//System.out.println("Total round of ticket===>" +totalRoundTicket.size());
		for (WebElement ticket : totalRoundTicket){

			if (ticket.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 4, 0))){
				ticket.click();
				System.out.println("Round text===>" +getTextFromRoundTicket());				
			}		
		}		
	}
	public String getTextFromRoundTicket() throws InterruptedException{
		return getTextRoundTicket.getAttribute("value");
	}
	//-----------------Ticket Number	
	public void passTicketNumber(String ticketNO) {
		ticketNumber.sendKeys(ticketNO);
	}
	public String getTextTicketNumber() {
		return ticketNumber.getAttribute("value");
	}

	//------------------------- Travel By
	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")
	WebElement travelingBy;

	@FindBy(xpath = "//ul[@id='select-options-sel_travelBy']//li")
	List<WebElement> totalTravelingOption;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[5]/form[1]/div[1]/div[2]/div[1]/div[8]/div[1]/input[1]")
	WebElement getTextTravelingBy;

	public void clickOnTravelBy() throws IOException, InterruptedException {
		//TestUtil.actionClassMethod(travelingBy);
		TestUtil.clickOnElement(travelingBy);
		System.out.println("Total travel options are==>"+totalTravelingOption.size());
		Thread.sleep(1000);
		for (WebElement travelOptions:totalTravelingOption){
			Thread.sleep(1000);
			//System.out.println("travel options ===>" +travelOptions.getText() );
			if (travelOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 6, 0)))
				travelOptions.click();
			//System.out.println("Which option is selected==>" +getTextTravelingBy());
		}	
	}
	public String getTextTravelingBy(){
		return getTextTravelingBy.getAttribute("value");
	}





	//*********************Primary***************************************************

	@FindBy(xpath = "//input[@id='primary_ref_firstname']")
	WebElement priReference_firstname;
	@FindBy(xpath = "//input[@id='primary_ref_middlename']")
	WebElement priReference_middlename;
	@FindBy(xpath = "//input[@id='primary_ref_lastname']")
	WebElement priReference_lastname;
	@FindBy(xpath = "//input[@id='primary_ref_addressLine1']")
	public WebElement priReferenceaddressline1 ;
	@FindBy(xpath = "//input[@id='primary_ref_addressLine2']")
	public WebElement priReferenceaddressline2;
	@FindBy(xpath = "//input[@id='primary_ref_landmark']")
	public WebElement priReferencelandmark;
	@FindBy(xpath = "//input[@id='primaryPostalCode']")
	public WebElement priReferencepincode;
	@FindBy(xpath = "//input[@id='primary_ref_city']")
	public WebElement priReferencecity;
	@FindBy(xpath = "//input[@id='primary_ref_contact']")
	public WebElement priReferencecontact;
	@FindBy(xpath = "//input[@id='primary_ref_emailId']")
	public WebElement priReferenceemail ;

	public void PriReferenceFirstName(String eFirstName) {
		priReference_firstname.sendKeys(eFirstName);
	}

	public String getPriReferenceFirstName() {
		return priReference_firstname.getAttribute("value");
	}

	public void PriReferenceMiddleName(String middleName) {
		priReference_middlename.sendKeys(middleName);
	}

	public String getPriReferenceMiddleName() {
		return priReference_middlename.getAttribute("value");
	}

	public void PriReferenceLastName(String eLastName) {
		priReference_lastname.sendKeys(eLastName);
	}

	public String getPriReferenceLastName() {
		return priReference_lastname.getAttribute("value");
	}

	public void passPriReferenceFlatNumber(String FlatNo) throws InterruptedException {
		priReferenceaddressline1.sendKeys(FlatNo);
	}

	public String getPriReferenceFlatNumber() throws InterruptedException {
		return priReferenceaddressline1.getAttribute("value");
	}
	public void passPriReferenceStreetName(String StreetName) {
		priReferenceaddressline2.sendKeys(StreetName);
	}

	public String getPriReferenceStreetName() throws InterruptedException {
		return priReferenceaddressline2.getAttribute("value");
	}

	public void passPriReferenceLandmark(String Landmark) {
		priReferencelandmark.sendKeys(Landmark);
	}

	public String getPriReferenceLandmark() throws InterruptedException {
		return priReferencelandmark.getAttribute("value");
	}

	public void passPriReferencePincode(String Pincode) {
		priReferencepincode.sendKeys(Pincode);
	}

	public String getPriReferencePincode() throws InterruptedException {
		return priReferencepincode.getAttribute("value");
	}

	public void passPriReferenceCityName(String Cityname) {
		priReferencecity.sendKeys(Cityname);
	}
	public String getPriReferenceCityName() throws InterruptedException {
		return priReferencecity.getAttribute("value");
	}

	// For country---------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[11]/div[1]/input[1]")
	WebElement priReferenceCountryType;

	@FindBy(xpath = "//ul[@id='select-options-primary_ref_country']//li")
	List<WebElement> priReferencetotalCountryType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[11]/div[1]/input[1]")
	WebElement getpriReferenceCountryType;

	public void selectPriReferenceCountryType() throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(priReferenceCountryType);
	System.out.println("Total Country type===>"+ priReferencetotalCountryType.size());
	for (WebElement CountryType : priReferencetotalCountryType){
		//System.out.println("Total Country type===>"+ CountryType.getText());
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 25, 0))){
			CountryType.click();
		}
	}
	}

	public String getPriReferenceCountryType() throws InterruptedException{
		return getpriReferenceCountryType.getAttribute("value");
		//return CountryType.getText();
	}



	// for state-----------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[12]/div[1]/div[1]/input[1]")
	public WebElement priReferenceStateType;

	@FindBy(xpath = "//ul[@id='select-options-primary_ref_state']//li")
	public List<WebElement> priReferencetotalStateType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[12]/div[1]/div[1]/input[1]")
	public WebElement getpriReferenceStateType;


	public void selectPriReferenceStateType() throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(priReferenceStateType);
	System.out.println("Total State type===>"+ priReferencetotalStateType.size());
	for (WebElement StateType : priReferencetotalStateType){
		Thread.sleep(1000);
		//System.out.println("Total State type===>"+ StateType.getText());
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 24, 0))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}

	public String getPriReferenceStateType() throws InterruptedException{
		Thread.sleep(1000);
		return getpriReferenceStateType.getAttribute("value");
		//return StateType.getText();
	}

	public void passPriReferenceContact(String Contact) {
		priReferencecontact.sendKeys(Contact);
	}

	public String getPriReferenceContact() throws InterruptedException {
		return priReferencecontact.getAttribute("value");
	}

	public void passPriReferenceEmail(String Email) {
		priReferenceemail.sendKeys(Email);
	}

	public String getPriReferenceEmail() throws InterruptedException {
		return priReferenceemail.getAttribute("value");
	}



	//****************Secondary**************************************************************
	@FindBy(xpath = "//input[@id='secondary_ref_firstname']")
	WebElement SecReferences_firstname;
	@FindBy(xpath = "//input[@id='secondary_ref_middlename']")
	WebElement SecReferences_middlename;
	@FindBy(xpath = "//input[@id='secondary_ref_lastname']")
	WebElement SecReferences_lastname;
	@FindBy(xpath = "//input[@id='secondary_ref_addressLine1']")
	public WebElement SecReferencesaddressline1 ;
	@FindBy(xpath = "//input[@id='secondary_ref_addressLine2']")
	public WebElement SecReferencesaddressline2;
	@FindBy(xpath = "//input[@id='secondary_ref_landmark']")
	public WebElement SecReferenceslandmark;
	@FindBy(xpath = "//input[@id='secondaryPostalCode']")
	public WebElement SecReferencespincode;
	@FindBy(xpath = "//input[@id='secondary_ref_city']")
	public WebElement SecReferencescity;
	@FindBy(xpath = "//input[@id='secondary_ref_contact']")
	public WebElement SecReferencescontact;
	@FindBy(xpath = "//input[@id='secondary_ref_emailId']")
	public WebElement SecReferencesemail ;
	@FindBy(xpath = "//input[@id='applicant_references_information_form_btn']")
	public WebElement SecReferencesSaveAndContinuebtn;

	public void SecReferencesFirstName(String eFirstName) {
		SecReferences_firstname.sendKeys(eFirstName);
	}

	public String getSecReferencesFirstName() {
		return SecReferences_firstname.getAttribute("value");
	}

	public void SecReferencesMiddleName(String middleName) {
		SecReferences_middlename.sendKeys(middleName);
	}

	public String getSecReferencesMiddleName() {
		return SecReferences_middlename.getAttribute("value");
	}

	public void SecReferencesLastName(String eLastName) {
		SecReferences_lastname.sendKeys(eLastName);
	}

	public String getSecReferencesLastName() {
		return SecReferences_lastname.getAttribute("value");
	}

	public void passSecReferencesFlatNumber(String FlatNo) throws InterruptedException {
		SecReferencesaddressline1.sendKeys(FlatNo);
	}

	public String getSecReferencesFlatNumber() throws InterruptedException {
		return SecReferencesaddressline1.getAttribute("value");
	}
	public void passSecReferencesStreetName(String StreetName) {
		SecReferencesaddressline2.sendKeys(StreetName);
	}

	public String getSecReferencesStreetName() throws InterruptedException {
		return SecReferencesaddressline2.getAttribute("value");
	}

	public void passSecReferencesLandmark(String Landmark) {
		SecReferenceslandmark.sendKeys(Landmark);
	}

	public String getSecReferencesLandmark() throws InterruptedException {
		return SecReferenceslandmark.getAttribute("value");
	}

	public void passSecReferencesPincode(String Pincode) {
		SecReferencespincode.sendKeys(Pincode);
	}

	public String getSecReferencesPincode() throws InterruptedException {
		return SecReferencespincode.getAttribute("value");
	}

	public void passSecReferencesCityName(String Cityname) {
		SecReferencescity.sendKeys(Cityname);
	}
	public String getSecReferencesCityName() throws InterruptedException {
		return SecReferencescity.getAttribute("value");
	}

	// For country---------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[24]/div[1]/input[1]")
	WebElement SecReferencesCountryType;

	@FindBy(xpath = "//ul[@id='select-options-secondary_ref_country']//li")
	List<WebElement> SecReferencestotalCountryType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[24]/div[1]/input[1]")
	WebElement getSecReferencesCountryType;

	public void selectSecReferencesCountryType() throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(SecReferencesCountryType);
	System.out.println("Total Country type===>"+ SecReferencestotalCountryType.size());
	for (WebElement CountryType : SecReferencestotalCountryType){
		//System.out.println("Total Country type===>"+ CountryType.getText());
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 38, 0))){
			CountryType.click();
		}
	}
	}

	public String getSecReferencesCountryType() throws InterruptedException{
		return getSecReferencesCountryType.getAttribute("value");
		//return CountryType.getText();
	}



	// for state-----------------------

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
	public WebElement SecReferencesStateType;

	@FindBy(xpath = "//ul[@id='select-options-secondary_ref_state']//li")
	public List<WebElement> SecReferencestotalStateType;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[6]/form[1]/div[1]/div[25]/div[1]/div[1]/input[1]")
	public WebElement getSecReferencesStateType;


	public void selectSecReferencesStateType() throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(SecReferencesStateType);
	System.out.println("Total State type===>"+ SecReferencestotalStateType.size());
	for (WebElement StateType : SecReferencestotalStateType){
		Thread.sleep(1000);
		//System.out.println("Total State type===>"+ StateType.getText());
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(9, 37, 0))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}

	public String getSecReferencesStateType() throws InterruptedException{
		Thread.sleep(1000);
		return getSecReferencesStateType.getAttribute("value");
		//return StateType.getText();
	}

	public void passSecReferencesContact(String Contact) {
		SecReferencescontact.sendKeys(Contact);
	}

	public String getSecReferencesContact() throws InterruptedException {
		return SecReferencescontact.getAttribute("value");
	}

	public void passSecReferencesEmail(String Email) {
		SecReferencesemail.sendKeys(Email);
	}

	public String getSecReferencesEmail() throws InterruptedException {
		return SecReferencesemail.getAttribute("value");
	}

	public void clickSecReferencesContinueBtn() {
		SecReferencesSaveAndContinuebtn.click();
	}















































	//************************************************************************

	@FindBy(xpath = "//div[@id='nav-travel']//span[text()='Visit Family']")
	WebElement VisitFamily;

	@FindBy(xpath = "//input[@id='primary_ref_firstname']")
	WebElement primaryRefFirstname;

	@FindBy(id = "primary_ref_lastname")
	WebElement primary_ref_lastname;

	@FindBy(xpath = "//input[@id='primary_ref_address']")
	WebElement primary_ref_address;

	@FindBy(id = "primary_ref_pincode")
	WebElement primary_ref_pincode;

	@FindBy(xpath = "//input[@id='primary_ref_city']")
	WebElement primary_ref_city;

	@FindBy(xpath = "//input[@id='primary_ref_state']")
	WebElement primary_ref_state;

	@FindBy(xpath = "//input[@id='primary_ref_country']")
	WebElement primary_ref_country;

	@FindBy(xpath = "//input[@id='primary_ref_phone_number']")
	WebElement primary_ref_phone_number;

	@FindBy(xpath = "//input[@id='secondary_ref_firstname']")
	WebElement secondaryRefFirstname;

	@FindBy(id = "secondary_ref_lastname")
	WebElement secondary_ref_lastname;

	@FindBy(xpath = "//input[@id='secondary_ref_address']")
	WebElement secondary_ref_address;

	@FindBy(id = "secondary_ref_pincode")
	WebElement secondary_ref_pincode;

	@FindBy(xpath = "//input[@id='secondary_ref_city']")
	WebElement secondary_ref_city;

	@FindBy(xpath = "//input[@id='secondary_ref_state']")
	WebElement secondary_ref_state;

	@FindBy(xpath = "//input[@id='secondary_ref_country']")
	WebElement secondary_ref_country;

	@FindBy(xpath = "//input[@id='secondary_ref_phone_number']")
	WebElement secondary_ref_phone_number;

	@FindBy(id = "by_phone_checkbox")
	WebElement by_phone_checkbox;

	@FindBy(id = "by_email_checkbox")
	WebElement by_email_checkbox;

	@FindBy(id = "by_text_message_checkbox")
	WebElement by_text_message_checkbox;

	@FindBy(name = "other_way_checkbox")
	WebElement otherwaycheckbox;

	@FindBy(id = "txtReach")
	WebElement txtReach;

	@FindBy(xpath = "//form[@name='applicant_travel_information_form']//input[@value='Previous']")
	WebElement previous;



	public void passDateOfDeparture(String date) {
		//TestUtil.actionClassMethod(departureDate);
		TestUtil.clickOnElement(departureDate);
		departureDate.sendKeys(date);

	}
	public String getTextDateOfDeparture() throws InterruptedException {
		Thread.sleep(2000);
		return departureDate.getAttribute("value");
	}




	public void passPrimaryRefFirstname(String firstname) {
		primaryRefFirstname.sendKeys(firstname);
	}
	public String getTextPrimaryRefFirstname() {
		return primaryRefFirstname.getAttribute("value");
	}

	public void passPrimaryRefLastname(String lastName) {
		primary_ref_lastname.sendKeys(lastName);
	}
	public String getTextPrimaryRefLastname() {
		return primary_ref_lastname.getAttribute("value");
	}

	public void pass_Primary_ref_address(String adress) {
		primary_ref_address.sendKeys(adress);
	}
	public String getText_Primary_ref_address() {
		return primary_ref_address.getAttribute("value");
	}
	public void pass_primary_ref_pincode(String pincode) {
		primary_ref_pincode.sendKeys(pincode);
	}
	public String getText_primary_ref_pincode() {
		return primary_ref_pincode.getAttribute("value");
	}

	public void pass_primary_ref_city(String city) {
		primary_ref_city.sendKeys(city);
	}

	public String getText_primary_ref_city() {
		return primary_ref_city.getAttribute("value");
	}

	public void pass_primary_ref_state(String state) {
		primary_ref_state.sendKeys(state);
	}
	public String getText_primary_ref_state() {
		return primary_ref_state.getAttribute("value");
	}

	public void pass_primary_ref_country(String country) {
		primary_ref_country.sendKeys(country);
	}
	public String getText_primary_ref_country() {
		return primary_ref_country.getAttribute("value");
	}

	public void pass_primary_ref_phone_number(String phoneNo) {
		primary_ref_phone_number.sendKeys(phoneNo);
	}
	public String getText_primary_ref_phone_number() {
		return primary_ref_phone_number.getAttribute("value");
	}

	public void passsecondaryRefFirstname(String firstname) {
		secondaryRefFirstname.sendKeys(firstname);
	}
	public String getTextsecondaryRefFirstname() {
		return secondaryRefFirstname.getAttribute("value");
	}

	public void pass_secondary_ref_lastname(String lastName) {
		secondary_ref_lastname.sendKeys(lastName);
	}
	public String geText_secondary_ref_lastname() {
		return secondary_ref_lastname.getAttribute("value");
	}

	public void pass_secondary_ref_address(String adress) {
		secondary_ref_address.sendKeys(adress);
	}
	public String getText_secondary_ref_address() {
		return secondary_ref_address.getAttribute("value");
	}

	public void pass_secondary_ref_pincode(String pincode) {
		secondary_ref_pincode.sendKeys(pincode);
	}
	public String getText_secondary_ref_pincode() {
		return secondary_ref_pincode.getAttribute("value");
	}

	public void pass_secondary_ref_city(String city) {
		secondary_ref_city.sendKeys(city);
	}
	public String geText_secondary_ref_city() {
		return secondary_ref_city.getAttribute("value");
	}

	public void pass_secondary_ref_state(String state) {
		secondary_ref_state.sendKeys(state);
	}
	public String getText_secondary_ref_state() {
		return secondary_ref_state.getAttribute("value");
	}

	public void pass_secondary_ref_country(String country) {
		secondary_ref_country.sendKeys(country);
	}
	public String getText_secondary_ref_country() {
		return secondary_ref_country.getAttribute("value");
	}

	public void pass_secondary_ref_phone_number(String phoneNo) {
		secondary_ref_phone_number.sendKeys(phoneNo);
	}
	public String getText_secondary_ref_phone_number() {
		return secondary_ref_phone_number.getAttribute("value");
	}

	public void PassSecondaryRefDetails(String sec_firstname,
			String sec_lastName, String sec_adress, String sec_pincode,
			String sec_city, String sec_state, String sec_country,
			String sec_phoneNo) {
		secondaryRefFirstname.sendKeys(sec_firstname);
		secondary_ref_lastname.sendKeys(sec_lastName);
		secondary_ref_address.sendKeys(sec_adress);
		secondary_ref_pincode.sendKeys(sec_pincode);
		secondary_ref_city.sendKeys(sec_city);
		secondary_ref_state.sendKeys(sec_state);
		secondary_ref_country.sendKeys(sec_country);
		secondary_ref_phone_number.sendKeys(sec_phoneNo);
	}



	public void clickOnByPhoneCheckbox() {
		//TestUtil.actionClassMethod(by_phone_checkbox);
		TestUtil.clickOnElement(by_phone_checkbox);
	}
	public boolean verifyByPhoneCheckbox() {
		return by_phone_checkbox.isSelected();
	}
	public void clickOnByEmailCheckbox() {
		//TestUtil.actionClassMethod(by_email_checkbox);
		TestUtil.clickOnElement(by_email_checkbox);
	}
	public boolean verifyByEmailCheckbox() {
		return by_email_checkbox.isSelected();
	}
	public void clickOnByTextMessageCheckbox() {
		//TestUtil.actionClassMethod(by_text_message_checkbox);

		TestUtil.clickOnElement(by_text_message_checkbox);
	}
	public boolean verifyByTextMessageCheckbox() {
		return  by_text_message_checkbox.isSelected();
	}
	public void clickOnOtherWayCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(otherwaycheckbox);
	}
	public boolean verifyOnOtherWayCheckbox() {
		return otherwaycheckbox.isSelected();
	}
	public void passOtherWayToReach(String passWay ) {
		txtReach.sendKeys(passWay);
	}
	public String getTextOtherWayToReach() {
		return txtReach.getAttribute("value");
	}

	public void clickOnContinuebutton() {
		applicant_travel_information_form_btn.click();
	}

	public void clickOnPreviuosbutton() {
		previous.click();
	}








	public void selectYearMulti(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(5,row, 0);																																	
		new WebDriverWait(driver, 80).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(year));
		TestUtil.selectValuefromDropDown(year, yy);
	}
	public void selectMonthMulti(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(5, row, 1);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(month));
		TestUtil.selectValuefromDropDown(month, mm);
	}

	public void selectDateMulti(int row) throws IOException, InterruptedException{
		new WebDriverWait(driver, 70).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='travel']//tr//td")));	
		for(WebElement Date: date){	
			String dd = TestUtil.readDataFromExcellString(5,row,2);
			if(Date.getText().equalsIgnoreCase(dd))
			{	Date.click();
			break;
			}	
		}
	}

	public void clickPurpose_of_journeyMulti(int row) throws InterruptedException, IOException {
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(this.purpose_of_journey);
		TestUtil.clickOnElement(purpose_of_journey);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		for (WebElement perposeJourneyOptions : totalOptionOfPurposeJourney){	
			System.out.println("element are.."+perposeJourneyOptions.getText());
			if (perposeJourneyOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, row, 3))){
				System.out.println("comparing element...");
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				perposeJourneyOptions.click();
			}
		}
	}


	public void clickOnIsApplicantPossessionRoundTicketMulti(int row) throws IOException, InterruptedException {
		TestUtil.actionClassMethod(RoundTicket);
		for (WebElement ticket : totalRoundTicket){
			if (ticket.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, row, 4))){
				ticket.click();		
			}		
		}		
	}

	public void clickOnTravelByMulti(int row) throws IOException, InterruptedException {	
		TestUtil.clickOnElement(travelingBy);	
		Thread.sleep(1000);
		for (WebElement travelOptions:totalTravelingOption){
			Thread.sleep(1000);		
			if (travelOptions.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, row, 6)))
				travelOptions.click();		
		}	
	}



	public void selectPriReferenceCountryTypeMulti(int row) throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(priReferenceCountryType);
	for (WebElement CountryType : priReferencetotalCountryType){
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(6, row, 8))){
			CountryType.click();
		}
	}
	}
	public void selectPriReferenceStateTypeMulti(int row) throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(priReferenceStateType);
	for (WebElement StateType : priReferencetotalStateType){
		Thread.sleep(1000);
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(6, row, 9))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}

	public void selectSecReferencesCountryTypeMulti(int row) throws IOException, InterruptedException 
	{Thread.sleep(2000);
	TestUtil.actionClassMethod(SecReferencesCountryType);
	for (WebElement CountryType : SecReferencestotalCountryType){
		if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(6, row, 20))){
			CountryType.click();
		}
	}
	}

	public void selectSecReferencesStateTypeMulti(int row) throws IOException, InterruptedException 
	{ Thread.sleep(3000);
	TestUtil.actionClassMethod(SecReferencesStateType);
	for (WebElement StateType : SecReferencestotalStateType){
		Thread.sleep(1000);//System.out.println("Total State type===>"+ StateType.getText());
		if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(6, row, 21))){
			Thread.sleep(1000);
			StateType.click();
		}
	}
	}	
}
