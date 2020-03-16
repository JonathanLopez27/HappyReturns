package com.happyreturns.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.happyreturns.base.TestBase;



public class TestUtil extends TestBase {

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();

		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(srcFile,
				new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName));

	}

}
