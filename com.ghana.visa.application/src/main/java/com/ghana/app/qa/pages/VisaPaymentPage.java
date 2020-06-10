package com.ghana.app.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.ghana.app.qa.testdata.ConstantVariable.*;

import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

import freemarker.core.ReturnInstruction.Return;

public class VisaPaymentPage extends TestBase {

	public VisaPaymentPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(text(),'Do You Want To Submit Application?')]")
	WebElement confimationMessage;

	@FindBy(xpath = "//strong[contains(text(),'Payment')]")
	WebElement paymentPageTitle;

	@FindBy(id = "btn_submit_to_consulate")
	WebElement submitBtn;
	
	
	
	@FindBy(xpath = "//input[@class='btn btn-fill btn-deep-orange btn-rounded btn-wd']")
	WebElement makeVisapayment;
	
	@FindBy(xpath = "//input[@id='rzp-button11']")
	public WebElement PayerYes;
	@FindBy(xpath = "//input[@id='rzp-button1']")
	public WebElement PayerNo;
	@FindBy(xpath = "//input[@id='payment_name']")
	public WebElement PayerName;
	@FindBy(xpath = "//input[@id='payment_email']")
	public WebElement PayerEmail;
	@FindBy(xpath = "//input[@id='payment_phone_no']")
	public WebElement PayerContact;
	@FindBy(xpath = "//button[@id='rzp-button12']")
	public WebElement PayerSubmit;
	
	
	
	public void passName(String name) throws InterruptedException {
		PayerName.sendKeys(name);
	}
	public void passEmail(String email) throws InterruptedException {
		PayerEmail.sendKeys(email);
	}
	public void passContact(String contact) throws InterruptedException {
		PayerContact.sendKeys(contact);
	}
	
	
	
	
	
	
	
	 
	@FindBy(xpath = "//div[@id='merchant-name']")
	public WebElement TorenzoPayTitle;
	
	
	@FindBy(xpath = "//button[@id='footer']")
	public WebElement Proceed;
	
	
	@FindBy(xpath = "//*[@id='form-common']/div/div[1]/div[3]/div/div/div[2]/h3[2]")
	public WebElement PaymentMethod;
	
	
	
	@FindBy(xpath = "//button[@method='netbanking']")
	public WebElement netbankingpayment;
	//    //div[@class="payment-option item" and @tab='netbanking']     
	//    //button[@method='netbanking']
	
	
	@FindBy(id = "bank-item-HDFC")
	public WebElement HDFCbank;
	
	@FindBy(xpath = "//button[@id='footer']")
	public WebElement Pay;
	
	@FindBy(xpath = "//*[@id='fee-wrap']/div/div[2]")
	public WebElement Continue;
	
	@FindBy(xpath = "//button[@class='success']")
	public WebElement Success;
	
	@FindBy(xpath = "//button[@class='btn btn-light-green btn-rounded waves-effect waves-light']")
	public WebElement DONE;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-rounded waves-effect waves-light']")
	public WebElement OK;
	
	
	
	@FindBy(xpath = "//button[@class='btn btn-light-green btn-rounded waves-effect waves-light']")
	public WebElement DiplomaticDONE;
	
	
	
	
	@FindBy(xpath = "//input[@name='creditCardNumber']")
	WebElement cardNofield;
	
	@FindBy(xpath = "//select[@id='expiryMonthCreditCard']")
	WebElement monthId;
	@FindBy(xpath = "//select[@id='expiryYearCreditCard']")
	WebElement yearId;
	@FindBy(xpath = "//a[@id='SubmitBillShip']")
	WebElement makePaymentbtn;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submittbtn;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement OKtbtn;
	
	@FindBy(xpath = "//input[@id='CVVNumberCreditCard']")
	WebElement cvvNofield;
	
	@FindBy(xpath = "//div[@id='nav-payment']//input[@value='Previous']")
	WebElement previousBtn;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement okBtn;
	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement DoneBtn;
	
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][contains(text(),'Cancel')]")
	WebElement cancelBtn;

	public String getTextPaymentPageTitle() {
		return paymentPageTitle.getText();
	}

	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	public void makeVisapaymentBtn() {
		makeVisapayment.click();
	}
	
	public void passCardNo() {
		cardNofield.sendKeys("4012001037141112");
	}
	public void passCvvNo() {
		cvvNofield.sendKeys("123");;
	}
	public void clickOnMakePaymentBtn() {
		makePaymentbtn.click();
		
	}
	public void clickOnSubmitbtn() {
		submittbtn.click();
		
	}
	public void clickOnOKtbtn() {
		OKtbtn.click();
		}
	public void clickOnDonetbtn() {
		DoneBtn.click();
		}
	
	public void getTextsubmitBtn() throws InterruptedException {
		Thread.sleep(3000);
		String value   = submitBtn.getAttribute("value");
		System.out.println("value==>" +value);
		newApplication = value.replaceAll(value, "New Application");
		System.out.println("newApplication==>" +newApplication);
		
	}

	public void clickOnPreviousBtn() {
		previousBtn.click();

	}
	public WebElement selectExpiryDateMonth() {
		return monthId;
	}
	
	public WebElement selectExpiryDateYear() {
		return yearId;
	}
	//div[@class='tabcontent OPTCRDC resp-tab-content resp-tab-content-active']//a[@id='SubmitBillShip']//span[@class='primary-button-text'][contains(text(),'Make Payment')]
	public void verifyConfirmationPop() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if ((confimationMessage.getText()).equalsIgnoreCase("Do You Want To Submit Application?")) {
				okBtn.click();
			}

		} catch (Exception e) {
			cancelBtn.click();
			System.out.println("here confirmation message not match");
			// TODO: handle exception
		}

	}

}
