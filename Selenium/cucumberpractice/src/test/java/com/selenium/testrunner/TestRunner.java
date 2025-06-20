package com.selenium.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/com/selenium/Features",
        glue = "com.selenium.stepdefinition",
        plugin = {"pretty","html:target/cucumber-report.html"},
        monochrome =true
)
public class TestRunner {


}
