package com.ghana.app.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class VisaCategoriesPage extends TestBase {
	
	public VisaCategoriesPage()throws IOException, InterruptedException{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[@class='font-weight-bold']")
	public WebElement visaCategorisText;
	
	@FindBy(xpath="//h4[contains(text(),'Tourist/Short Visit Visa')]")
	public 	WebElement touristVisa;
	
	@FindBy(xpath="//div[@class='card-footer text-center alert-teal']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement touristVisabutton;
	
	@FindBy(xpath="//h4[contains(text(),'Business Visa')]")
	public WebElement businessVisa;
	
	@FindBy(xpath="//div[@class='card-footer text-center alert-orange']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement businessVisabutton;
		
	@FindBy(xpath="//h4[contains(text(),'Transit Visa')]")
	public WebElement transitVisa;
				    
	@FindBy(xpath="//div[@class='card-footer text-center alert-green']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement transitVisabutton;
	
	@FindBy(xpath="//h4[contains(text(),'Employee Visa')]")
	public WebElement employmentVisa;
	
	@FindBy(xpath="//div[@class='card-footer text-center alert-purple']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement employmentVisabutton;

	@FindBy(xpath="//h4[contains(text(),'Student Visa')]")
	public WebElement studentVisa;
	
	@FindBy(xpath="//div[@class='card-footer text-center alert-success']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement studentVisabutton;
	
	@FindBy(xpath="//h4[contains(text(),'Diplomatic/Service')]")
	public WebElement DiplomaticVisa;
	
	@FindBy(xpath="//div[@class='card-footer text-center alert-warning']//a[@class='mb-0'][contains(text(),'Click Here')]")
	public WebElement DiplomaticVisabutton;
	
	public String validateVisaTypeTitle(){
		return driver.getTitle();
	}
	
	public String visaCategorisText(){
		return visaCategorisText.getText();
	}
	
	public String touristVisaText(){
		return touristVisa.getText();
	}

	public String businessVisaText(){
		return businessVisa.getText();
	}
	
	public String transitVisaText(){
		return transitVisa.getText();
	}
	
	public String employmentVisaText(){
		return employmentVisa.getText();
	}
	
	public String studentVisaText(){
		return studentVisa.getText();
	}
	
	public String DiplomaticVisaText(){
		return	DiplomaticVisa.getText();
	}

	public void clickOnVisaType(){
		touristVisabutton.click();
	}
	

	public void launchAndGotoSignUP() throws InterruptedException, IOException {	
		String type = TestUtil.readDataFromExcellString(5, 17, 0);
		System.out.println("Visa Type is ====>"+type );
		
		if(type.equals("Tourist/Short Visit Visa")){
			Assert.assertEquals(this.touristVisaText(),type,"Verification of Tourist/Short Visit visa button");
			touristVisabutton.click();
			TestUtil. writeStringValue(5, 17,1);   
		}
		else if(type.equals("Business Visa")){
			Assert.assertEquals(this.businessVisaText(),type,"Verification of Business Visa button");
			businessVisabutton.click();
			TestUtil. writeStringValue(5, 17,1); 
		}
		else if(type.equals("Student Visa")){
			Assert.assertEquals(this.studentVisaText(),type,"Verification of Student Visa button");
			studentVisabutton.click();
			TestUtil. writeStringValue(5, 17,1); 
		}
		else if(type.equals("Transit Visa")){
			Assert.assertEquals(this.transitVisaText(),type,"Verification oftransit Visa button");
			transitVisabutton.click();
			TestUtil. writeStringValue(5, 17,1); 
		}
		else if (type.equals("Employee Visa")){
			Assert.assertEquals(this.employmentVisaText(),type,"Verification of Employee Visa button");
			employmentVisabutton.click();	
			TestUtil. writeStringValue(5, 17,1); 
		}
		else if (type.equals("Diplomatic/Service")){
			Assert.assertEquals(this.DiplomaticVisaText(),type,"Verification of Diplomatic/Service Visa button");
			DiplomaticVisabutton.click();	
		}	
	}

	
	public void launchAndGotoSignUPMulti(int row) throws InterruptedException, IOException {	
		String type = TestUtil.readDataFromExcellString(0, row, 0);
		System.out.println("Visa Type is ====>"+type );
		
		if(type.equals("Tourist/Short Visit Visa")){
			Assert.assertEquals(this.touristVisaText(),type,"Verification of Tourist/Short Visit visa button");
			touristVisabutton.click(); 
		}
		else if(type.equals("Business Visa")){
			Assert.assertEquals(this.businessVisaText(),type,"Verification of Business Visa button");
			businessVisabutton.click();
		}
		else if(type.equals("Student Visa")){
			Assert.assertEquals(this.studentVisaText(),type,"Verification of Student Visa button");
			studentVisabutton.click();
		}
		else if(type.equals("Transit Visa")){
			Assert.assertEquals(this.transitVisaText(),type,"Verification oftransit Visa button");
			transitVisabutton.click();
		}
		else if(type.equals("Employee Visa")){
			Assert.assertEquals(this.employmentVisaText(),type,"Verification of Employee Visa button");
			employmentVisabutton.click();	
		}
		
		else if(type.equals("Diplomatic/Service")){
			Assert.assertEquals(this.DiplomaticVisaText(),type,"Verification of Diplomatic/Service Visa button");
			DiplomaticVisabutton.click();	
		}		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
