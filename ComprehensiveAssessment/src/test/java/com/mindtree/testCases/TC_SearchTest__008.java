package com.mindtree.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.SearchPage;
import com.mindtree.utilities.HelperClass;
public class TC_SearchTest__008 extends BaseClass{
	@Test
	public void SearchTest() throws InterruptedException
	{
		log.info("Test Case 8  Excuted Started ");
		Test.info("Test Case 8  Excuted Started ");
		Test.log(Status.PASS, "Testcase-8  Excution Start");
		Thread.sleep(3000);
		SearchPage SP=new SearchPage(driver);
		SP.setsearchele();
		Test.log(Status.PASS, "Searching for Blanket in the search box");
		HelperClass.captureScreenshots(driver);
		Test.log(Status.PASS,"Taken a Screenshot the Page for evidence");
		System.out.println(driver.getTitle());
		Test.log(Status.PASS, "Testcase-8  successfully Excuted");
	     driver.navigate().back();
	     driver.close();
	}
}
