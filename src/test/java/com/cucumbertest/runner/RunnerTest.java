package com.cucumbertest.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",plugin= {"pretty"}, glue= {"com.resonance.stepdefinitions"},dryRun=false)
public class RunnerTest extends AbstractTestNGCucumberTests {
	

}
