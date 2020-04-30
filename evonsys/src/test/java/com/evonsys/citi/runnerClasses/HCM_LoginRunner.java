package com.evonsys.citi.runnerClasses;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src//test//java//com//evonsys//citi//featureFiles"
		,glue = "com.evonsys.citi.stepDefClasses"
		,tags={"@PegaLogin"}
		)

@Test
public class HCM_LoginRunner extends AbstractTestNGCucumberTests{
 /*

private TestNGCucumberRunner testNGCucumberRunner;
 
 @BeforeClass(alwaysRun = true)
public void setUpClass(){
	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
 }
 
 @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider= "features")
 public void feature(CucumberFeatureWrapper cucumberFeature){
	 testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
 }
 
 @DataProvider
 public Object[][] features(){
	 return testNGCucumberRunner.provideFeatures();
 }
 
 @AfterClass(alwaysRun = true)
 public void tearDown(){
	 testNGCucumberRunner.finish();
 }
 */
}
