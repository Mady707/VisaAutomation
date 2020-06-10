package com.ghana.app.qa.testcases;


import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ghana.app.qa.base.DriverInit;
import com.ghana.app.qa.util.TestUtil;

public class GhanaWebSiteBrokenLinkTest extends DriverInit {

	public GhanaWebSiteBrokenLinkTest() throws IOException, InterruptedException {
		super();
	}

	@Test(priority=1)
	public void findBrokenLinkOnTorenzoMainPage() throws IOException, InterruptedException{

		System.out.println("jenkins test");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size()); 
		for(int i=0; i<links.size(); i++) {
			// TestUtil.clickOnElement(links.get(i));
			// driver.navigate().back();
			WebElement element = links.get(i);
			String url=element.getAttribute("href");
			Thread.sleep(1000);
			verifyLink(url); 
		} 
	}

	public static void verifyLink(String urlLink) {
		try {

			URL link = new URL(urlLink);

			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();

			httpConn.setConnectTimeout(2000);

			httpConn.connect();

			if(httpConn.getResponseCode()== 200) { 
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
			if(httpConn.getResponseCode()== 404) {
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
		}

		catch (Exception e) {

		}
	} 

}

