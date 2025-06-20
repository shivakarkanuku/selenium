package com.selenium.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Logintest {

    WebDriver driver=new ChromeDriver();

    @Given("User is on login page")
    public void login(){

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    
   

//     When user enters the username as "student"

@When("user enters the username as {string}")   
 public void When_user_enters_the_username(String username){
    driver.findElement(By.id("username")).sendKeys(username);
 }
// And user enters the password as "Password123"
@When("user enters the password as {string}")
 public void enters_password(String password){
    driver.findElement(By.id("password")).sendKeys(password);
 }
// And click on submit button
@When("click on submit button")
 public void click_submit(){
    driver.findElement(By.id("submit")).click();

 }
// Then user successfully logged in to the page
@Then("user successfully logged in to the page")
 public void successfully_loggedin(){
    
    Assert.assertEquals("Logged In Successfully",driver.findElement(By.className("post-title")).getText());
 }
}
