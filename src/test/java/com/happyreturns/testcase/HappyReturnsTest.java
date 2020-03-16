package com.happyreturns.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.happyreturns.base.TestBase;

public class HappyReturnsTest extends TestBase {

	@Test
	public void happyReturnsTest() throws InterruptedException, IOException {
		
		WebElement happyReturnsLink_CSS = driver.findElement(By.cssSelector("h3[class='LC20lb DKV0Md']"));

		String value = "Happy Returns";
		String partialLinkText="Happy Returns makes returns beautiful for retailers, shoppers ...";
		
		log.debug("Inside HappyReturns Test");
		type("googleSearchBar_CSS", value);
		click("googleSearchBtn_CSS");
		Assert.assertTrue(happyReturnsLink_CSS.getText().contains(partialLinkText));
		
		log.debug("Link Successfully on google");

	}
}
