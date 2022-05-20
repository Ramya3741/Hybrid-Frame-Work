package com.mindtree.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.StudyPage;
import com.mindtree.utilities.HelperClass;

public class TC_StudyTest_002  extends BaseClass{
	
	@Test

	public void StudyTest() throws InterruptedException
	{
		log.info("Test Case 2  Excuted Started ");
		Test.info("Test Case 2  Excuted Started");
		Thread.sleep(3000);
		StudyPage sp=new StudyPage(driver);

	sp.setstdydropdown();
	Test.info("Navigating to Study Drop down");
	Thread.sleep(3000);
    sp.setstudychair();
    Test.info("Selecting Study Chair");
    HelperClass.captureScreenshots(driver);
    Test.info("Taken a Screenshot ");
    log.info("Successfully navigated to Study Chair");
    Test.log(Status.PASS, "Successfully navigated to Study Chair");
    
    Test.log(Status.PASS, "Testcase-2  successfully Excuted");
	Thread.sleep(3000);
	log.info("Successfully excuted Test Cases 2 ");
	Test.info("Successfully excuted Test Cases 2 ");

	driver.close();
}
}

