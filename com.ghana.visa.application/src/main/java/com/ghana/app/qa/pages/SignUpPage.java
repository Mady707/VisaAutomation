package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.ghana.app.qa.testdata.ConstantVariable.*;
import static com.ghana.app.qa.util.TestUtil.driverPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;
import com.liferay.portal.kernel.xml.XPath;

public class SignUpPage extends TestBase {

	// public ArrayList<String> passportype;
	public SignUpPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	// elements from signup page


	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public static WebElement Home;

	@FindBy(xpath = "//div[@class='row form-row']//div[1]//div[1]//input[1]")
	public static WebElement PassportType;

	@FindBy(xpath = "//ul[@id='select-options-passport_type_value']//li")
	List<WebElement> totalPassportType;

	@FindBy(xpath = "//ul[@id='select-options-countryOfResidence']//li")
	List<WebElement> CountryResidenceCount;

	// Diplomatic, Service, Special, Ordinary
	@FindBy(id = "passport_type_value")
	WebElement PassportTypeName;

	@FindBy(xpath = "//div[@class='mb-12 md-form']//input[@class='select-dropdown form-control']")
	WebElement Nationality;

	@FindBy(xpath = "//input[@type='text' and @class='select-dropdown form-control']")
	List<WebElement> getTextnationality;

	@FindBy(xpath = "//ul[@id='select-options-country_value']//li")
	List<WebElement> countrys;

	@FindBy(xpath = "//ul[@id='ul_nationality']//li[text()='India']")
	WebElement selectNationality;

	@FindBy(xpath = "//span[text()='Select Visa Type']")
	WebElement clickvisaFees;

	@FindBy(xpath = "//ul[@id='ul_visa_type']//li")
	List<WebElement> totalVisaFees;

	@FindBy(id = "visa_type")
	WebElement getTextSelectedVisaFees;

	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Single entry(3 months) visa Rs.8500.0']")
	WebElement selectVisaFees;//

	@FindBy(xpath = "//body/main/div[@class='container']/section[@class='mt-5 wow fadeIn']/div[@class='row']/div[@class='col-md-12']/div/div[@class='card']/div[@class='card-body px-lg-5']/form[@id='signup_form']/div/div[3]/div[1]/input[1]")
	WebElement VisaLocation;

	@FindBy(xpath = "//body/main/div[@class='container']/section[@class='mt-5 wow fadeIn']/div[@class='row']/div[@class='col-md-12']/div/div[@class='card']/div[@class='card-body px-lg-5']/form[@name='signup_form']/div/div[3]/div[1]/input[1]")
	WebElement countryResidence;

	@FindBy(id = "select-options-visa_location")
	WebElement selectVisaLocation;

	@FindBy(id = "country_residence")
	WebElement selectCountryResidenceLocation;

	@FindBy(xpath = "//ul[@id='select-options-visa_location']//li")
	List<WebElement> VisaLocationCount;

	@FindBy(xpath = "//ul[@id='ul_country_residence']//li[text()='Laos']")
	List<WebElement> ClickResidenceCount;

	@FindBy(xpath = "//form[@id='applicant_personal_info_form']//span[text()='Mumbai']")
	WebElement clickVisaLocation;

	@FindBy(id = "nationality_search")
	WebElement nationalitySearchField;

	@FindBy(xpath = "//div[@class='row form-row']//div[2]//div[1]//input[1]")
	WebElement PortofArrival;

	@FindBy(id = "//div[@class='row form-row']//div[2]//div[1]//input[1]")
	@CacheLookup
	WebElement getTextPortofArrival;

	@FindBy(xpath = "//ul[@id='select-options-arrival_port_value']//li")
	List<WebElement> totalPortOfArrival;

	@FindBy(xpath = "//ul[@id='img_category_options']//li[text()='Ghana Airport']")
	WebElement selectPortofArrival;

	@FindBy(xpath = "//input[@id='phone_number']")
	WebElement PhoneNumber;



	@FindBy(id = "useremail")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='dateofbirth']")
	WebElement DOB;

	@FindBy(id = "renter_email")
	WebElement reenterEmailId;

	@FindBy(xpath = "//input[@id='customCheck1']")
	WebElement customCheck1;

	@FindBy(xpath = "//input[@id='customRadio3']")
	WebElement visaTypeCheckBox;

	@FindBy(xpath = "//input[@id='usercaptchacode']")
	WebElement usercaptchacode;

	@FindBy(id = "text_captcha")
	WebElement usercaptatext;


	@FindBy(xpath="//div[@id='rc-anchor-container']")
	public WebElement captchaclick;



	@FindBy(xpath = "//label[@class='form-check-label']")
	public WebElement termsCheckbox;

	@FindBy(xpath = "//label[@class='form-check-label']")
	public WebElement termsCheckbox1;

	@FindBy(xpath = "//a[@class='btn btn-signup btn-deep-orange btn-rounded ml-auto waves-effect z-depth-0 button mt-3 float-right']")
	public WebElement SignUpNext1;

	@FindBy(xpath = "//button[@name='terms']")
	public WebElement SignUpNext2;

	@FindBy(xpath = "//a[@class='btn btn-signup btn-deep-orange btn-rounded ml-auto waves-effect z-depth-0 button']")
	public WebElement SignUp;

	@FindBy(xpath = "//input[@id='customCheck3' and @type='checkbox']")
	WebElement basicDoccheckbox;

	@FindBy(xpath = "//h5[@class='card-header text-center py-4']")
	WebElement letssignuUp;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//input[@id='selectAllCheck']")
	public static WebElement AllcheckBox;

	@FindBy(xpath = "//input[@id='customRadio3']")
	WebElement singleRadioButton;

	@FindBy(xpath = "//div[@class ='custom-control custom-checkbox']")
	List<WebElement> checkBoxesClick;

	@FindBy(xpath = "//div[@class ='custom-control custom-radio custom-control-inline']")
	List<WebElement> selectRadioButton;
	
	
	
	@FindBy(xpath = "//*[@id='signup_form']/div[3]/div[1]/div[2]/div/div[1]/span/label/span")
	public static WebElement ScrolluptoUploadphoto;
	
	@FindBy(xpath = "//*[@id='signup_form']/div[3]/div[1]/div[2]/div/div[1]/span/label/span")
	public static WebElement UploadphotoSignup;
	
	@FindBy(id= "myImg")
	public static WebElement Uploadphoto_update;
	
	
	@FindBy(className = "//a[@class='btn yes btn-primary']")
	public static WebElement UploadApply;
	
	
	@FindBy(xpath = "//label[contains(text(),'I am invited by a Ghanaian Resident')]")
	public static WebElement GhanianResidence;

	@FindBy(xpath = "//label[contains(text(),'I have a hotel reservation')]")
	public static WebElement HotelReservation;

	public String letssignuUptext() {
		return letssignuUp.getText();
	}

	public String validateSignUpPageTitle() {
		return driver.getTitle();
	}
	public String getTextPassportTypeName() {
		return PassportTypeName.getAttribute("value");
	}

	public int sizePassportType() {
		return totalPassportType.size();
	}
	public String getFromSelectedNationality() {
		return getTextnationality.get(0).getText();
	}

	public int totalCountryCount() {
		return countrys.size();
	}
	public String getTextFromVisaType() {
		return getTextSelectedVisaFees.getText();
	}

	public int totalVisaFeeCountActual() {
		return totalVisaFees.size();
	}
	public String getTextFromSelectVisaLocation() {
		System.out.println("=====================>"+ selectVisaLocation.getText());
		return selectVisaLocation.getText();
	}

	public String getTextFromSelectCountryResidence() {
		return selectCountryResidenceLocation.getText();
	}

	public int totalVisaLocationActual() {
		return VisaLocationCount.size();
	}

	public int totalCountryResidenceActual() {
		return CountryResidenceCount.size();
	}

	public void SelectPassportType() throws IOException, InterruptedException {
		TestUtil.actionClassMethod(PassportType);
		System.out.println("Total size of passport type==>"+ sizePassportType());
		ArrayList<String> passNo = new ArrayList<String>();
		for (WebElement PassportType : totalPassportType) {
			passNo.add(PassportType.getText());
			if (PassportType.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 6, 0))) {
				PassportType.click();
				//System.out.println("See which passport type is selected str 1 selected=>"+ getTextPassportTypeName());
			}
		}
	}

	public void selectPassportType(String str) throws IOException,
	InterruptedException {
		TestUtil.actionClassMethod(PassportType);
		System.out.println("Total size of passport type==>"+ sizePassportType());
		ArrayList<String> passNo = new ArrayList<String>();
		for (WebElement PassportType : totalPassportType) {
			passNo.add(PassportType.getText());
			if (PassportType.getText().equalsIgnoreCase(str)) {
				PassportType.click();
				//System.out.println("See which passport type is selected str 1 selected=>" + getTextPassportTypeName());
			}
		}
		System.out.println("Values from Arraylist==>" + passNo.get(0));
	}


	public void selectNationality() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(Nationality);
		System.out.println("Total countries are=>" + countrys.size());
		for (WebElement country : countrys) {
			if (country.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 7, 0))) {
				country.click();
				System.out.println("country click done");
				Thread.sleep(5000);
				// System.out.println("selected Nationality from list =>"+getFromSelectedNationality());
				break;
			}
		}
	}


	@FindBy(xpath = "//body/main/div[@class='container']/section[@class='mt-5 wow fadeIn']/div[@class='row']/div[@class='col-md-12']/div/div[@class='card']/div[@class='card-body px-lg-5']/form[@id='signup_form']/div/div[4]/div[1]/input[1]")
	public WebElement ModeOfConsulate;

	@FindBy(xpath = "//ul[@id='select-options-visa_submission_mode']//li")
	List<WebElement> ModeOfConsulatelist;

	public int totalModeOfConsulateActual() {
		return ModeOfConsulatelist.size();
	}

	public void selectModeOfConsulate() throws InterruptedException,IOException 
	{
		Thread.sleep(3000);
		TestUtil.actionClassMethod(ModeOfConsulate);
		System.out.println("Total ModeOfConsulate are=>" + ModeOfConsulatelist.size());
		for (WebElement Mode : ModeOfConsulatelist) {
			if (Mode.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, 22, 0))) {
				Mode.click();
				Thread.sleep(2000);
				//System.out.println("See which country str 1 selected=>"+ getFromSelectedNationality());
				break;
			}
		}
	}

	public void selectVisaType() throws InterruptedException, IOException {
		TestUtil.actionClassMethod(clickvisaFees);
		System.out.println("Total visa fee count=>>" + totalVisaFees.size());
		for (WebElement visaFee : totalVisaFees) {
			Thread.sleep(1000);
			// System.out.println("Total visa fee printed=>>" + visaFee.getText());
			if (visaFee.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(5, 9, 0))) {
				visaFee.click();
				Thread.sleep(2000);
			}
		}
	}

	public void selectVisaTypeMulti(String str) throws InterruptedException,
	IOException {
		TestUtil.actionClassMethod(clickvisaFees);
		System.out.println("Total visa fee count=>>" + totalVisaFees.size());
		for (WebElement visaFee : totalVisaFees) {
			Thread.sleep(1000);
			// System.out.println("Total visa fee printed=>>" +visaFee.getText());
			if (visaFee.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 9, 0))) {
				visaFee.click();
				Thread.sleep(2000);
			}
		}
	}

	public void selectCountryOfResidence() throws InterruptedException,
	IOException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(countryResidence);
		System.out.println("Total Country Residence count ==>"+ totalCountryResidenceActual());
		for (WebElement con : CountryResidenceCount) {
			if (con.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 15, 0))) {
				con.click();
				Thread.sleep(2000);
				// System.out.println("Selected Country Residence from list ====>" + getTextFromSelectCountryResidence());
			}
		}
	}


	public void selectVisaLocation() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(VisaLocation);
		System.out.println("Total Application location count ==>"+ totalVisaLocationActual());
		for (WebElement visa : VisaLocationCount) {
			if (visa.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 10, 0))) {
				visa.click();
				Thread.sleep(2000);
				//System.out.println("selected Application location from list ===>"+ getTextFromSelectVisaLocation());
			}
		}
	}

	public void selectPortOfArrival() throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(PortofArrival);
		System.out.println("totalPortOfArrival => " + totalPortOfArrival.size());
		for (WebElement portOfArrivale : totalPortOfArrival) {
			if (portOfArrivale.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(5, 8, 0))) {
				portOfArrivale.click();
				Thread.sleep(2000);
				// System.out.println("See which port of arrival type is selected==>"+ getTextFromPortofArrival());

				break;
			}
		}
	}

	public String getTextFromPortofArrival() {
		return getTextPortofArrival.getText();
	}

	public int totalPortArrival() {
		return totalPortOfArrival.size();
	}

	public void passPhoneNo(String phoneNo) {
		PhoneNumber.sendKeys(phoneNo);
	}

	public String getTextFromPhoneFiled() throws IOException,InterruptedException {
		Thread.sleep(1000);
		return PhoneNumber.getAttribute("value");
	}


	public String getBirthDate() throws InterruptedException {
		return dateofbirth.getAttribute("value");
	}


	public void passEmailId(String EmailId) throws InterruptedException {
		emailId.sendKeys(EmailId);
	}

	public String getTextFromEmailField() throws InterruptedException {
		return emailId.getAttribute("value");
	}

	public void passReEmailId(String EmailId) {
		reenterEmailId.sendKeys(EmailId);
	}

	public String getTextFromReEmailField() throws InterruptedException {
		return reenterEmailId.getAttribute("value");
	}

	public void visaTypeRadioBtn() {
		visaTypeCheckBox.click();
	}

	public void enterCaptchaField() throws InterruptedException {
		Thread.sleep(1000);
		String captcha = usercaptatext.getText();
		System.out.println("Captcha text is : " + captcha);
		usercaptchacode.sendKeys(captcha);
	}

	public void cancelBtn() {
		Cancel.click();
	}

	public void continueBtn() {
		SignUp.click();
	}

	public WebElement termsCheckboxselect() {
		return termsCheckbox;
	}

	public boolean verifyTermsCheckboxselect() {
		System.out.println("value===>" + termsCheckbox.isSelected());
		return termsCheckbox.isSelected();
	}

	public boolean verifySelected() {
		return termsCheckbox1.isSelected();
	}

	public WebElement clickOnSelectAll() {
		return AllcheckBox;
	}

	public boolean verifyclickOnSelectAll() {
		return AllcheckBox.isSelected();
	}

	public void clickOnCheckBoxes() {
		for (WebElement we : checkBoxesClick) {
			System.out.println("checkBoxesClick==>" + checkBoxesClick.size());
			TestUtil.actionClassMethod(we);
		}
	}

	public void verifyCheckBoxIsSelected() throws InterruptedException {
		int j = checkBoxesClick.size();
		Thread.sleep(1000);
		for (int i = 0; i < j; i++) {
			selectedBoxOnSignUp = checkBoxesClick.get(i).isSelected();
		}
		System.out.println("selectedBoxOnSignUp1==>" + selectedBoxOnSignUp);
	}

	public WebElement selectOneRadioButton() {
		return singleRadioButton;
	}

	public boolean verifySelectOneRadioButton() {
		return singleRadioButton.isSelected();
	}

	public WebElement selectRadioButton() {
		return selectRadioButton.get(1);

		/*
		 * try { for (WebElement we : selectRadioButton) { Thread.sleep(1000);
		 * //TestUtil.actionClassMethod(we);
		 * 
		 * System.out.println(
		 * "========================================================>Redio");
		 * //we.click(); // Thread.sleep(1000); //TestUtil.clickOnElement(we); }
		 * 
		 * } catch (Exception e) {
		 * System.out.println("all check boxes click done");
		 * 
		 * }
		 */
	}

	public void verifyRadioButtonSelected() {
		int size = selectRadioButton.size();
		for (int i = 0; i < size; i++) {
			boolean selectedRadioButtonOnSignUp = selectRadioButton.get(i)
					.isSelected();
			System.out.println("selectedRadioButtonOnSignUp==>"+ selectedRadioButtonOnSignUp);
		}
	}

	public String titleOfTheSignUPPage() {
		return driver.getTitle();
	}

	//---------------FOR datepicker
	@FindBy(id = "dateofbirth")
	WebElement dateofbirth;

	@FindBy(xpath = "//select[@class='picker__select--year']")
	public WebElement year;

	@FindBy(xpath = "//select[@class='picker__select--month']")
	public WebElement month;

	//@CacheLookup
	@FindBy(xpath = "//table[@id='dateofbirth_table']//tr//td")
	public List<WebElement> date;

	public void selectDateOfBirth() throws InterruptedException {
		//new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(dateofbirth));
		TestUtil.scrollUpHorizontalORVIsibilityOFElement(dateofbirth);
		TestUtil.actionClassMethod(dateofbirth);
	}

	public void selectYear() throws IOException, InterruptedException{
		//System.out.println("Excel Year is : "+TestUtil.readDataFromExcellString(5, 25, 0));
		TestUtil.selectValuefromDropDown(year, "1992");
	}
	public void selectMonth(){
		TestUtil.selectValuefromDropDown(month, "January");
	}

	public void selectDate(){
		for(WebElement Date: date){
			if(Date.getText().equalsIgnoreCase("5"))
			{	
				Date.click();
				break;
			}	
		}
	}



	public void UploadProfilePhotoMulti(int row) throws IOException, InterruptedException
	{
		String FEMALE = TestUtil.readDataFromExcellString(1, row, 0);
		if (FEMALE.equals("Female"))
		{
			//TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.UploadphotoSignup);
			//SignUpPage.UploadphotoSignup.click();	
			//TestUtil.uploadfile(SignUpPage.UploadphotoSignup , driverPath+"\\DocumentAttach\\FemalePassport-size-photo.jpg");
			//SignUpPage.UploadApply.click();
			
		} 
		else
		{	Thread.sleep(2000);
			new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(UploadphotoSignup));
			//TestUtil.actionClassMethod(SignUpPage.UploadphotoSignup);
			//TestUtil.scrollUpHorizontalORVIsibilityOFElement(SignUpPage.UploadphotoSignup);
			//SignUpPage.UploadphotoSignup.click();
			
			//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			TestUtil.uploadfile(SignUpPage.UploadphotoSignup ,driverPath+"\\DocumentAttach\\MalePassport-size-photo1.jpg");
			Thread.sleep(4000);
			SignUpPage.UploadApply.click();
		}

	}

	public void selectNationalityMulti(int row) throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(Nationality);
		for (WebElement country : countrys) {
			if (country.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0, row, 1))) {
				country.click();
				Thread.sleep(5000);
				break;
			}
		}
	}

	public void selectCountryOfResidenceMulti(int row) throws InterruptedException,IOException {
		Thread.sleep(2000);
		TestUtil.actionClassMethod(countryResidence);
		for (WebElement con : CountryResidenceCount) {
			if (con.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0, row, 2))) {
				con.click();
				Thread.sleep(2000);	
			}
		}
	}

	public void selectVisaLocationMulti(int row) throws InterruptedException, IOException {
		Thread.sleep(2000);
		TestUtil.clickOnElement(VisaLocation);
		//TestUtil.actionClassMethod(VisaLocation);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (WebElement visa : VisaLocationCount) {
			if (visa.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0, row, 3))) {
				
				visa.click();
				Thread.sleep(2000);
			}
		}
	}

	public void selectModeOfConsulateMulti(int row) throws InterruptedException,IOException 
	{	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(4000);
		TestUtil.actionClassMethod(ModeOfConsulate);
		for (WebElement Mode : ModeOfConsulatelist) {
			if (Mode.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0,row, 4))) {
				Mode.click();
				Thread.sleep(2000);
				break;
			}
		}
	}

	public void SelectPassportTypeMulti(int row) throws IOException, InterruptedException {
		TestUtil.actionClassMethod(PassportType);
		ArrayList<String> passNo = new ArrayList<String>();
		for (WebElement PassportType : totalPassportType) {
			passNo.add(PassportType.getText());
			if (PassportType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0,row, 5))) {
				PassportType.click();
			}
		}
	}

	public void selectPortOfArrivalMulti(int row) throws InterruptedException, IOException {
		Thread.sleep(2000);
		//TestUtil.scrollUpHorizontalORVIsibilityOFElement(PortofArrival);
		TestUtil.actionClassMethod(PortofArrival);
		for (WebElement portOfArrivale : totalPortOfArrival) {
			if (portOfArrivale.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(0, row, 6))) {
				portOfArrivale.click();
				Thread.sleep(2000);
				break;
			}
		}
	}


	public void selectYearMulti(int row) throws IOException, InterruptedException{
		String yy = TestUtil.readDataFromExcellString(0,row, 8);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(year));
		
		TestUtil.selectValuefromDropDown(year, yy);
	}
	public void selectMonthMulti(int row) throws IOException, InterruptedException{
		String mm = TestUtil.readDataFromExcellString(0, row, 9);
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(month));

		TestUtil.selectValuefromDropDown(month, mm);
	}

	public void selectDateMulti(int row) throws IOException, InterruptedException{
		
		new WebDriverWait(driver, 50).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='dateofbirth_table']//tr//td")));

		for(WebElement Date: date){			
			String dd = TestUtil.readDataFromExcellString(0,row,10);
			if(Date.getText().equalsIgnoreCase(dd))
			{	Date.click();
			break;
			}	
		}
	}	
}
