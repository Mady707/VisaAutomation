package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.base.TestBase;
import com.ghana.app.qa.util.TestUtil;

public class ContactPageTest extends DriverInit {

	public ContactPageTest() throws IOException, InterruptedException {
		super();
	}
	
	
	@Test(dataProvider="getData")
    public void contactPageVerify(String fname, String lname, String email, String subject, String message) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id='ff_2_names_1[first_name]']")).sendKeys(fname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ff_2_names_1[last_name]']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='ff_2_email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ff_2_subject']")).sendKeys(subject);
		driver.findElement(By.xpath("//textarea[@id='ff_2_message']")).sendKeys(message);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'ff-btn-md wpf_has_custom_css')]")).click();
		Thread.sleep(7000);
	}
	
	@DataProvider
	public Object[][] getData() throws IOException{
		
		Object data[][] = PracticeData.readUniqueData("Contact");
		
		return  data;
		
		
	}
}
