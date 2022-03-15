package com.resonance.stepdefinitions;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {
	int x,y,result;
	@Given("User has entered two numbers")
	public void user_has_entered_two_numbers() {
	    System.out.println("Enter two numbers seprated by space");
	    Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	    y=sc.nextInt();
	}

	@When("We add those numbers")
	public void we_add_those_numbers() {
		result=x+y;
	    
	}

	@Then("User can see addtion result")
	public void user_can_see_addtion_result() {
	   System.out.println("Addition is:"+result);
	}


}
