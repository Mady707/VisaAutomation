package com.ghana.app.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class GhanaNational_AddressInfoPage extends TestBase{

	public GhanaNational_AddressInfoPage() throws IOException,InterruptedException {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//strong[contains(text(),'Address in Ghana')]")
	public WebElement AddressInfoText;
	
	public String getAddressInfoText()
	{
		return AddressInfoText.getText();
	}
	
	
	@FindBy(xpath = "//input[@id='resi_address']")
	public WebElement resi_address;
	
	@FindBy(xpath = "//input[@id='resi_colony']")
	public WebElement resi_colony;
		
	@FindBy(xpath = "//input[@id='resi_landmark']")
	public WebElement resi_landmark;
	
	@FindBy(xpath = "//input[@id='resi_pincode']")
	public WebElement resi_pincode;
	
	@FindBy(xpath = "//input[@id='resi_city']")
	public WebElement resi_city;
	
	@FindBy(xpath = "//input[@id='applicant_address_info_form_btn']")
	public WebElement resi_Nextbtn;
	


	// for state-----------------------

		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]")
		public WebElement StateType;

		@FindBy(xpath = "//ul[@id='select-options-resi_state']//li")
		public List<WebElement> totalStateType;

		@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]")
		public WebElement getTextStateType;


		public void selectStateType() throws IOException, InterruptedException 
		{ Thread.sleep(3000);
		TestUtil.actionClassMethod(StateType);
		System.out.println("Total State type===>"+ totalStateType.size());
		for (WebElement StateType : totalStateType){
			Thread.sleep(1000);
			//System.out.println("Total State type===>"+ StateType.getText());
			if(StateType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(26, 8, 0))){
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

	
	//---For address type 

			@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]")
			public WebElement addresstype;

			@FindBy(xpath = "//ul[@id='select-options-sel_addresstype']//li")
			public List<WebElement> totaltotaladdressType;

			@FindBy(xpath = "/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]")
			public WebElement getTextaddresstype;
			
			public void selectAddressType() throws IOException, InterruptedException 
			{ 
			Thread.sleep(3000);
			TestUtil.actionClassMethod(addresstype);
			System.out.println("Total State type===>"+ totaltotaladdressType.size());
			for (WebElement addressType : totaltotaladdressType){
				Thread.sleep(1000);
				//System.out.println("Total State type===>"+ StateType.getText());
				if(addressType.getText().equalsIgnoreCase(TestUtil.readDataFromExcellString(26, 9, 0))){
					Thread.sleep(1000);
					addressType.click();
				}
			  }
			}

			public String getTextFromAddressType() throws InterruptedException{
				Thread.sleep(1000);
				return getTextaddresstype.getAttribute("value");
				//return StateType.getText();
			}
}
