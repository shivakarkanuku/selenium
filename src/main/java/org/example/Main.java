package org.example;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
    
        // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("che");
        // Thread.sleep(3000);
        // driver.findElement(By.xpath("//li[@class='livecl city_selected']/a")).click();
        // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("h");
        // List<WebElement> destList=driver.findElements(By.xpath("//li[@class='livecl']/a"));

        // for(WebElement a:destList){
        //     if(a.getText().contains("Hyd")){
        //             System.out.println(a.getText());
        //             a.click();
        // //     }
            
        // // }
        // // WebElement drpdown= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));

        // // Select select=new Select(drpdown);

        // // select.selectByVisibleText("USD");
        // Thread.sleep(3000);
        // // // driver.close();

        // driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        // List<WebElement> cal=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td/a"));

        // System.out.println(cal.size());

        // for(WebElement c:cal){
        //     System.out.println(c.getText());
        //     if(c.getText().equals("10")){
        //         System.out.println(c.getText());

        //         c.click();
        //     }
        // }
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
    }
}