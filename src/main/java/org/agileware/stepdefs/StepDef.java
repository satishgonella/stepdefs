package org.agileware.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	@Given("something$")
	public void given() {
		System.out.println("Given");
	}
	
	@When("an event occurs")
	public void when() {
		System.out.println("When");
	}
	
	@Then("something else happens")
	public void then() {
		System.out.println("Then");
	}
}
