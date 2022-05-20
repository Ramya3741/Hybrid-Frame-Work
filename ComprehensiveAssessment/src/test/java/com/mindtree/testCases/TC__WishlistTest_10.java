package com.mindtree.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.mindtree.pageObject.WishPage;

public class TC__WishlistTest_10  extends  BaseClass{
	@Test
	public void WishlistTest() throws InterruptedException
	{
		
		log.info("Test Case 10  Excuted Started ");
        WishPage wp=new WishPage(driver);
         wp.wishlist();
        Thread.sleep(3000);
        Test.info("Successfully navigated to Wish list Page");
		log.info("Successfully navigated to wish list  Page");
		Test.log(Status.PASS, "Successfully navigated to Bulk Order Page");
        driver.navigate().back();
        

}
}