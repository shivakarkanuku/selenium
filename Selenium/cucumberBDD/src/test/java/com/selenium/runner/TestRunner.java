package com.selenium.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
        ///home/shiva/Downloads/Git_Projects/BasicJavaCode/Selenium/cucumberBDD/src/test/resources/features/cucumber.feature
        
        features="src/test/resources/features",
        glue = "com.selenium.stepdefs",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber/report.json"},
        monochrome =true
)
public class TestRunner {


}
