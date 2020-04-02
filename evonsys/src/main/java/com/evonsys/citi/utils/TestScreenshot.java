package com.evonsys.citi.utils;

import java.awt.Color;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.evonsys.citi.base.Base;
import com.evonsys.citi.base.Base1;
import com.evonsys.citi.util.browserConfiguration.config.ObjectReader;

public class TestScreenshot extends Base {

	@Test
	public void test() throws IOException{
		//Base.extent.createTest("URL");
		//driver.get(ObjectReader.reader.getUrl());
		captureScreen("TestScreenshot", driver);
		test.log(Status.PASS, MarkupHelper.createLabel("passed the url", ExtentColor.GREEN)).addScreenCaptureFromPath("./screenshots");
		//Base.extent.flush();
	}
}
