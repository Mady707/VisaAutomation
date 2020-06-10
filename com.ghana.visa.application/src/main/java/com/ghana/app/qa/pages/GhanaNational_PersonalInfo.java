package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_PersonalInfo extends TestBase {
	
	public GhanaNational_PersonalInfo() throws IOException, InterruptedException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[contains(text(),'Personal Information')]")
	public WebElement personalInfoText;
	
	@FindBy(xpath = "//div[@id='qrcode']//canvas")
	public WebElement QRCode;
	 
	@FindBy(xpath = "//div[@id='nav-person']//div[@class='col_md_2 mb-3']")
	public WebElement ORNumber;
	
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	public WebElement  FemaleRadio;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement Fname;
	
	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement Mname;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lname;
	
	@FindBy(xpath = "//input[@id='date_of_birth']")
	public WebElement DateOfbirth;
	
	@FindBy(xpath = "//input[@id='birth_place']")
	public WebElement birthplace;
		
	@FindBy(xpath = "//div[@id='nav-person']//div[contains(@class,'col-md-6')]//div//div[@class='row']//input[@class='btn btn-lg btnPrevious previous6']")
	public WebElement previous;
	
	@FindBy(id = "applicant_personal_info_form_btn")
	public WebElement SaveAndNext;
	
	
	public String ghanaPersonalPageText(){
		return driver.getTitle();
	}

	public String Barcodetext(){
		return ORNumber.getText();
	}

	public String ghanapersonalinfotext() {
		return personalInfoText.getText();
	}
	
	//-----------Occupation
	@FindBy(xpath = "//form[@id='ghanaNational_personal_info_form']//input[@class='select-dropdown form-control']")
	public WebElement Occupation;
	@FindBy(xpath = "//ul[@id='select-options-profession_type']//li")
	public List<WebElement> SelectOccupation;
	
	public void selectOccupation() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TestUtil.actionClassMethod(Occupation);
		System.out.println("Total countries are=>" + SelectOccupation.size());
		for (WebElement Occupation : SelectOccupation) {
			if (Occupation.getText().equalsIgnoreCase(
					TestUtil.readDataFromExcellString(24, 8, 0))) {
				Occupation.click();
				System.out.println("Occupation click done");
				Thread.sleep(5000);
				// System.out.println("selected Nationality from list =>"+getFromSelectedNationality());
				break;
			}
		}
	}
	

}
