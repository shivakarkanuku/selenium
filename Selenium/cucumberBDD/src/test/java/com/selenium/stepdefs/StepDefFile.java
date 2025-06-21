package com.selenium.stepdefs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.LoginFunction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefFile {
    
    LoginFunction loginFunction=new LoginFunction();

     //  Given The login page link enter into that link
    @Given("The login page link enter into that link")
    public void The_login_page_link_enter_into_hat_link(){
        loginFunction.testUrl();
    }
    //     When User Enters the username: "<username>" and password: "<password>"
    @When("User Enters the username: {string} and password: {string}")
    public void User_Enters_the_username(String username,String password){
        loginFunction.enterCreds(username, password);

    }
    //     And Start to type your And step here Click on login button
    @When("Start to type your And step here Click on login button")
    public void LoginButton(){
        loginFunction.clickOnLogin();
        
    }

    //     Then User loggged into page or he/she will get the error message like " Warning: No match for E-Mail Address and/or Password."

    @Then("User loggged into page or he will get the error message like {string}")
    public void checkLoginFunctionality(String errorMsg){
    
        String err=loginFunction.getLoginError();
        Assert.assertEquals(errorMsg, err);
        
    }
    
}
