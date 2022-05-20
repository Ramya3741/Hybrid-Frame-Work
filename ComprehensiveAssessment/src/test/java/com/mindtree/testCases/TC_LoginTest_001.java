package com.mindtree.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.utilities.HelperClass;

public class TC_LoginTest_001  extends BaseClass{
	@Test
	public void loginTest() throws InterruptedException
	{
	Test=report.createTest("Comprehensive Assessment ");
	LoginPage lp=new LoginPage(driver);
	Test.info("Navigating to Profile Page");
	lp.setLoginIcon();
	Thread.sleep(3000);
	lp.setprofile();
	Test.info("click on  Profile Icon");
	Thread.sleep(3000);
	lp.seteditbtn();
	Test.info("click on Edit Button ");
	Thread.sleep(3000);
	lp.set_mobile_update();;
	Test.info("Updating Mobile Number in profile Page");
	Thread.sleep(3000);
	HelperClass.captureScreenshots(driver);
	Test.info("Taken  a Screenshot ");
	lp.set_update_btn();
	Test.info("click on Update Button");
	Test.info("Successfully Completed");
	log.info("Successfully Login ");
	Test.log(Status.PASS, "Testcase-1  successfully Excuted");
	Thread.sleep(3000);
	driver.close();

	}
	

}
