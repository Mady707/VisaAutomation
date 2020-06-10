package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;


@Listeners(com.ghana.app.qa.listener.Listener.class)
public class Ghanian_National_SignUpLoginPage extends TestBase {

	public Ghanian_National_SignUpLoginPage() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}
	//Ghana National SignupForm//
	//button[@class='btn btn-primary btn-rounded waves-effect waves-light']
	@FindBy(xpath ="//button[@id='btnP']")
	public WebElement ghananational;
	
	@FindBy(xpath ="//a[contains(text(),'Register new Ghana National here')]")
	public WebElement newghanauser;
	
	
	@FindBy(xpath = "//strong[contains(text(),'Signup Ghana National')]")
	public WebElement SignupText;
	
	@FindBy(xpath = "//input[@id='passport_number']")
	public WebElement passportnum;
	
	@FindBy(xpath = "//input[@id='phone_number']")
	public WebElement phnum;
	
	@FindBy(xpath = "//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='date_of_birth']")
	public WebElement DOB;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement pswd;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	public WebElement cnfmPswd;
	
	@FindBy(id = "text_captcha")
	public WebElement usercaptatext;
	
	@FindBy(xpath = "//input[@id='usercaptchacode']")
	public WebElement usercaptchacode;
	
	@FindBy(xpath ="//div [@id='rc-anchor-container']")
	public WebElement captchaclick;	
	
	@FindBy(xpath= "//a[@class='btn btn_signup float-right btn-deep-orange btn-rounded ml-auto waves-effect z-depth-0']")
	public WebElement register;
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-light-green btn-rounded waves-effect z-depth-0')]")
	public WebElement previous;
	
	//---------------FOR datepicker
		@FindBy(xpath = "//input[@id='date_of_birth']")
		WebElement dateofbirth;

		@FindBy(xpath = "//select[@class='picker__select--year']")
		public WebElement year;

		@FindBy(xpath = "//select[@class='picker__select--month']")
		public WebElement month;
		
		@CacheLookup
		@FindBy(xpath = "//tr//td")
		public List<WebElement> date;
		
		public void selectDateOfBirth() throws InterruptedException {
			TestUtil.actionClassMethod(dateofbirth);
		}
		
		public void selectYear() throws IOException, InterruptedException{
			TestUtil.selectValuefromDropDown(year, "1992");
		}
		public void selectMonth(){
			TestUtil.selectValuefromDropDown(month, "January");
		}

		public void selectDate(){
			for(WebElement Date: date){
				if(Date.getText().equalsIgnoreCase("2"))
				{	
					Date.click();
					break;
				}	
			}
		}
		//Ghana National SignupForm//
		
		public void enterCaptchaField() throws InterruptedException {
			Thread.sleep(1000);
			String captcha = usercaptatext.getText();
			System.out.println("Captcha text is : "+captcha);
			usercaptchacode.sendKeys(captcha);
		}
		
		public String SignuUptext(){
			return SignupText.getText();
		}
	
		//Ghana National Login Form//
		
			@FindBy(xpath = "//input[@id='txt_appn_id_prt']")
			public WebElement LUsername;
			
			@FindBy(xpath = "//input[@id='enteredpass']")
			public WebElement Lpswd;
			
			@FindBy(xpath = "//button[contains(text(),'Cancel')]")
			public WebElement Lcancle;
			
			@FindBy(xpath = "//button[@id='btn_partial']")
			public WebElement Lsubmit;
			
	
	

}
