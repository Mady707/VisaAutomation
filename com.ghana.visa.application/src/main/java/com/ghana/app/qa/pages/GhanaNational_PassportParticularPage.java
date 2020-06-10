package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_PassportParticularPage extends TestBase{

	public GhanaNational_PassportParticularPage() throws IOException,
	InterruptedException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[contains(text(),'Passport Particulars')]")
	public WebElement titleofPassportParticulars;
	
	 public String getTitlePassportParticulars()
	 {
		 return titleofPassportParticulars.getText();
	 }
	
	//------passport issued
	@FindBy(xpath = "//input[@id='passport_issued']")
	public WebElement passportissued;

	@FindBy(xpath = "//div[@id='passport_issued_root']//select[@class='picker__select--year']")
	public WebElement year;

	@FindBy(xpath = "//div[@id='passport_issued_root']//select[@class='picker__select--month']")
	public WebElement month;

	@CacheLookup
	@FindBy(xpath = "//div[@id='passport_issued_root']//tr//td")
	public List<WebElement> date;

	public void selectPassPortIssue() throws InterruptedException {
		TestUtil.actionClassMethod(passportissued);
	}

	public void selectYear() throws IOException, InterruptedException{
		TestUtil.selectValuefromDropDown(year, "2015");
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

	//------passport Date Expiry
		@FindBy(xpath = "//input[@id='passport_expiry']")
		public WebElement passportExpire;

		@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--year']")
		public WebElement yearExpire;

		@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--month']")
		public WebElement monthExpire;

		@CacheLookup
		@FindBy(xpath = "//div[@id='passport_expiry_root']//tr//td")
		public List<WebElement> dateExpire;

		public void selectPassPortExpire() throws InterruptedException {
			TestUtil.actionClassMethod(passportExpire);
		}

		public void selectYearExpire() throws IOException, InterruptedException{
			TestUtil.selectValuefromDropDown(year, "2035");
		}
		
		public void selectMonthExpire(){
			TestUtil.selectValuefromDropDown(month, "January");
		}

		public void selectDateExpire(){
			for(WebElement Date: date)
			{	
				if(Date.getText().equalsIgnoreCase("2"))
				{	Date.click();
					break;
				}	
			}
		}

		//------passport Date Arrival
		
				@FindBy(xpath = "//input[@id='passport_expiry']")
				public WebElement passportArrival;

				@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--year']")
				public WebElement yearArrival;

				@FindBy(xpath = "//div[@id='passport_expiry_root']//select[@class='picker__select--month']")
				public WebElement monthArrival;

				@CacheLookup
				@FindBy(xpath = "//div[@id='passport_expiry_root']//tr//td")
				public List<WebElement> dateArrival;

				public void selectPassPortArrival() throws InterruptedException {
					TestUtil.actionClassMethod(passportExpire);
				}

				public void selectYearArrival() throws IOException, InterruptedException{
					TestUtil.selectValuefromDropDown(year,"2022");
				}
				
				public void selectMonthArrival(){
					TestUtil.selectValuefromDropDown(month,"January");
				}

				public void selectDateArrival(){
					for(WebElement Date: date){
						if(Date.getText().equalsIgnoreCase("2"))
						{	
							Date.click();
							break;
						}	
					}
				}
		
		@FindBy(xpath = "//input[@id='passport_place']")
		public WebElement passport_place;
		
		public void passPassportPlace(String passport )
		{
			passport_place.sendKeys(passport);		
		}
			
		
		@FindBy(xpath = "//input[@id='applicant_passport_info_form_btn']")
		public WebElement saveandNext;
		
}
