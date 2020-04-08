package com.evonsys.citi.runnerClasses;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/evonsys/citi/featureFiles"
		,glue = "com.evonsys.citi.stepDefClasses"
		)

public class LoginRunner{// extends AbstractTestNGCucumberTests{
 /*private TestNGCucumberRunner testNGCucumberRunner;
 
 @BeforeClass(alwaysRun = true)
public void setUp(){
	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
 }
 
 @Test(dataProvider = "feature")
 public void feature(CucumberFeatureWrapper cucumberFeature){
	 testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
 }
 
 @DataProvider
 public Object[][] feature(){
	 return testNGCucumberRunner.provideFeatures();
 }
 
 @AfterClass(alwaysRun = true)
 public void tearDown(){
	 testNGCucumberRunner.finish();
 }
 */
}
