package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class ProfessionalInfoPage extends TestBase {

	public ProfessionalInfoPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[contains(text(),'Profession/Occupation')]")
	public WebElement professiontitle;
	
	@FindBy(xpath = "//input[@id='other_profession']")
	public WebElement professionname;

	@FindBy(xpath = "//input[@id='profession_addressline1']")
	public WebElement addressline1 ;
	
	@FindBy(xpath = "//input[@id='profession_addressline2']")
	public WebElement addressline2;
	
	@FindBy(xpath = "//input[@id='profession_landmark']")
	public WebElement landmark;
	
	@FindBy(xpath = "//input[@id='profession_pincode']")
	public WebElement pincode;
	
	@FindBy(xpath = "//input[@id='profession_city']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='profession_contact']")
	public WebElement contact;
	
	@FindBy(xpath = "//input[@id='profession_email']")
	public WebElement email ;

	
	
	
	
	@FindBy(xpath = "//input[@id='applicant_profession_info_form_btn']")
	public WebElement saveandnext;
	
	public String getTextProfessionalInfoPageTitle(){
		return professiontitle.getText();
	}

	public void passNameofprofession(String name) throws InterruptedException {
		professionname.sendKeys(name);
	}

	public String getNameofprofession() throws InterruptedException {
		return professionname.getAttribute("value");
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

	//---for select profession--------------------
	
		@FindBy(xpath = "//form[@id='applicant_profession_info_form']//div[@class='col-md-6']//input[@class='select-dropdown form-control']")
		WebElement professionType;
		
		@FindBy(xpath = "//ul[@id='select-options-profession_type']//li")
		List<WebElement> totalprofessionType;

		@FindBy(xpath = "//form[@id='applicant_profession_info_form']//div[@class='col-md-6']//input[@class='select-dropdown form-control']")
		WebElement getTextprofessionType;
		
		public void selectprofessionType() throws IOException, InterruptedException 
		{	Thread.sleep(2000);
			TestUtil.actionClassMethod(professionType);
			System.out.println("Total profession type===>"+ totalprofessionType.size());
			for (WebElement professionType : totalprofessionType){
				//System.out.println("Total Country type===>"+ CountryType.getText());
				if(professionType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(25, 2, 0))){
					professionType.click();
				}
			}
		}
		public String getTextFromprofessionType() throws InterruptedException{
			return getTextprofessionType.getAttribute("value");
		}


		// For country---------------------
					
		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/form[1]/div[1]/div[10]/div[1]/input[1]")
		WebElement CountryType;
		
		@FindBy(xpath = "//ul[@id='select-options-profession_country']//li")
		List<WebElement> totalCountryType;
		
		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/form[1]/div[1]/div[10]/div[1]/input[1]")
		WebElement getTextCountryType;
		
		public void selectCountryType() throws IOException, InterruptedException 
		{Thread.sleep(2000);
			TestUtil.actionClassMethod(CountryType);
			System.out.println("Total Country type===>"+ totalCountryType.size());
			for (WebElement CountryType : totalCountryType){
				//System.out.println("Total Country type===>"+ CountryType.getText());
				if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(25, 10, 0))){
					CountryType.click();
				}
			}
		}
		
		public String getTextFromCountryType() throws InterruptedException{
			return getTextCountryType.getAttribute("value");
			//return CountryType.getText();
		}



		// for state-----------------------
						 		
		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/form[1]/div[1]/div[11]/div[1]/input[1]")
		public WebElement StateType;
		
		@FindBy(xpath = "//ul[@id='select-options-profession_state']//li")
		public List<WebElement> totalStateType;

		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/form[1]/div[1]/div[11]/div[1]/input[1]")
		public WebElement getTextStateType;
		

		public void selectStateType() throws IOException, InterruptedException 
		{ Thread.sleep(3000);
			TestUtil.actionClassMethod(StateType);
			System.out.println("Total State type===>"+ totalStateType.size());
			for (WebElement StateType : totalStateType){
				Thread.sleep(1000);
				//System.out.println("Total State type===>"+ StateType.getText());
				if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(25, 9, 0))){
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
	
	public void selectprofessionTypeMulti(int row) throws IOException, InterruptedException 
	{	Thread.sleep(2000);
		TestUtil.actionClassMethod(professionType);
		for (WebElement professionType : totalprofessionType){
			if(professionType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(3, row, 0)))
			{
				professionType.click();	
				Thread.sleep(2000);
				String val = getTextprofessionType.getAttribute("value");
				System.out.println("value is ----"+val);
				if(val.equals("Other"))
				{ 	System.out.println("In the other....");
					this.passNameofprofession(TestUtil.readDataFromExcellString(3, row, 1));
				}
				
			}
		}
	}
	
	
	public void selectCountryTypeMulti(int row) throws IOException, InterruptedException 
	{Thread.sleep(2000);
		TestUtil.actionClassMethod(CountryType);
		for (WebElement CountryType : totalCountryType){
			if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(3, row, 7))){
				CountryType.click();
			}
		}
	}
	
	public void selectStateTypeMulti(int row) throws IOException, InterruptedException 
	{ Thread.sleep(3000);
		TestUtil.actionClassMethod(StateType);
		for (WebElement StateType : totalStateType){
			Thread.sleep(1000);
			if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(3, row, 8))){
				Thread.sleep(1000);
				StateType.click();
			}
		}
	}
	
	
	
	//------------ Company in GHANA---------------------	
	
		@FindBy(xpath = "//input[@id='profession_inviting_company']")
		public WebElement CompanyNameGhana ;
		@FindBy(xpath = "//input[@id='profession_inviting_addressLine1']")
		public WebElement CompanyAddress ;
		@FindBy(xpath = "//input[@id='profession_inviting_landmark']")
		public WebElement CompanyLandmark ;
		@FindBy(xpath = "//input[@id='professionPostalCode']")
		public WebElement CompanyPinCode ;
		@FindBy(xpath = "//input[@id='profession_inviting_city']")
		public WebElement CompanyCity ;
		
		
		public void passCompanyNameGhana(String name) {
			CompanyNameGhana.sendKeys(name);
		}
		public void passCompanyAddress(String address) {
			CompanyAddress.sendKeys(address);
		}
		public void passCompanyLandmark(String landmark) {
			CompanyLandmark.sendKeys(landmark);
		}
		public void passCompanyCity(String city) {
			CompanyCity.sendKeys(city);
		}
		public void passCompanyPinCode(String pin) {
			CompanyPinCode.sendKeys(pin);
		}
		
	
		@FindBy(xpath = "//body/main/div[@class='container buttonHide']/div[@class='row']/div[@class='col-sm-12 mt-5']/div[@class='wizard-container mt-5']/div[@id='wizard']/div[@class='tab-content mt-5']/div[@id='pr-info']/form[@id='applicant_profession_info_form']/div[@class='form-row']/div[20]/div[1]/input[1]")
		public WebElement CompanyCountryType ;
		@FindBy(xpath = "//ul[@id='select-options-profession_inviting_country']//li")
		public List<WebElement> totalCompanyCountryType;
	
		public void selectCompanyCountryTypeMulti(int row) throws IOException, InterruptedException 
		{Thread.sleep(2000);
			TestUtil.actionClassMethod(CompanyCountryType);
			for (WebElement CountryType : totalCompanyCountryType){
				if(CountryType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(3, row, 16))){
					CountryType.click();
				}
			}
		}
		
		@FindBy(xpath = "//body/main/div[@class='container buttonHide']/div[@class='row']/div[@class='col-sm-12 mt-5']/div[@class='wizard-container mt-5']/div[@id='wizard']/div[@class='tab-content mt-5']/div[@id='pr-info']/form[@id='applicant_profession_info_form']/div[@class='form-row']/div[21]/div[1]/input[1]")
		public WebElement CompanyStateType ;
		@FindBy(xpath = "//ul[@id='select-options-profession_inviting_state']//li")
		public List<WebElement> totalCompanyStateType;
		
		
		public void selectCompanyStateTypeMulti(int row) throws IOException, InterruptedException 
		{ Thread.sleep(3000);
			TestUtil.actionClassMethod(CompanyStateType);
			for (WebElement StateType : totalCompanyStateType){
				Thread.sleep(1000);
				if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(3, row, 17))){
					Thread.sleep(1000);
					StateType.click();
				}
			}
		}
	
}
