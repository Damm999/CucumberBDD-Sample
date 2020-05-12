package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/featureFilesExtended/" },
		glue = {"steps" },
		monochrome = true, 
		tags = {},
		plugin = { "pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-report.html"})
public class MainRunnerExtended extends AbstractTestNGCucumberTests{


}
