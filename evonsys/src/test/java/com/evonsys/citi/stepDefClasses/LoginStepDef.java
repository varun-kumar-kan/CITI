package com.evonsys.citi.stepDefClasses;

import com.evonsys.citi.base.Base;
import com.evonsys.citi.base.BaseCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base{
	@Given("I am on url {string}")
	public void i_am_on_url(String string) {
	    System.out.println(1);
	}

	@When("I enter gmail in search box")
	public void i_enter_gmail_in_search_box() {
		System.out.println(14);
	}

	@Then("I should see the gmail link")
	public void i_should_see_the_gmail_link() {
		System.out.println(21);
	}

}
