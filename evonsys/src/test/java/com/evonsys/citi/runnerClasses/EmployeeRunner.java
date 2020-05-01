package com.evonsys.citi.runnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/com/evonsys/citi/featureFiles/HCM_Login.feature"
		,glue = "com.evonsys.citi.stepDefClasses"
		,tags = {"@t"}
		,strict = true
		//,dryRun = true
		)

public class EmployeeRunner {
	
}
