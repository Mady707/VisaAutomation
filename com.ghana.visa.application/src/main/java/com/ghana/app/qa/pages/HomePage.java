package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ghana.app.qa.base.TestBase;

public class HomePage extends TestBase {

	
	public HomePage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	   
				@FindBy(xpath="//button[contains(text(),'Apply Visa')]")
				public WebElement applyVisa;
				
				@FindBy(xpath="//div[@class='text-center card-footer alert-primary']//a[@class='mb-0'][contains(text(),'Click Here')]")
				public WebElement applyVisa2;
			
				@FindBy(xpath="//button[text()='Partially/Filled Application']")
				public WebElement partiallyFilledApplication;
				
				@FindBy(xpath="//button[text()='Visa Payment']")
				public WebElement visaPayment;
				
				@FindBy(xpath="//button[text()='Visa Status']")
				public WebElement visaStatus;
				
				@FindBy(xpath="//div[contains(text(),'Ghanian Nationals')]")
				public WebElement ghanianNational;
				
				@FindBy(xpath="//span[contains(text(),'New National')]")
				public WebElement NewGhanian;
				
				@FindBy(xpath="//button[text()='Print Visa Application']")
				public WebElement printVisaApplication;
				
				public String validateHomePageTitle(){
					return driver.getTitle();
				}
				
				public void clickOnApplyVisa() throws IOException, InterruptedException{
					Thread.sleep(2000);
					applyVisa.click();
					//return new VisaCategoriesPage();
				}
				
				
				
}
