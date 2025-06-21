package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunction {

    WebDriver driver=new ChromeDriver();

    public void testUrl() {
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
      driver.manage().window().maximize();
        
    }

    public void enterCreds(String username, String password) {

        driver.findElement(By.id("input-email")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
    
    }

    public void clickOnLogin() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();

      
    }

    public String getLoginError() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))).getText();
    }
    
}
