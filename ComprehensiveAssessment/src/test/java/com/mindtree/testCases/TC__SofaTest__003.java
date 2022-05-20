package com.mindtree.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.FabricSofaPage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.utilities.HelperClass;

public class TC__SofaTest__003 extends BaseClass{
	
	@Test
	public void SofaTest() throws InterruptedException
	{
		
		FabricSofaPage fsp=new FabricSofaPage(driver);
		log.info("Test Case 3  Excuted Started ");
		Test.info("Test Case 3 Excuted Started");
		fsp.saledropdown();
		Test.info("Selecting Sofa Set from drop down ");
		Thread.sleep(3000);
		fsp.sofaheader();
		log.info("Successfully Navigating to Sofa Set" );
		Test.info("Successfully Navigating to Sofa Set" );
		log.info("Successfully excuted Test Cases 3 ");
		Test.log(Status.PASS, "Sucessfully navigated to sofe Set ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
       HelperClass.captureScreenshots(driver);
	System.out.println(driver.getWindowHandles());
	Test.log(Status.PASS, "Testcase-3  successfully Excuted");
	driver.navigate().back();
	driver.close();
		
	}
}
