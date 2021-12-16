package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) {

        //open chrome browser
        WebDriver driver=new WebDriverFactory().getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl=driver.getCurrentUrl();

        //save expected url before clicking url
        //click on Retrieve password
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that url did not change
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();





    }
}
