package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");//burası bir metoddan çağırılıyor.
        driver.get("http://practice.cybertekschool.com/forgot_password");//site linki çağırılıyor.

        //enter any email.
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@smith.com");

        String excepectedUrl="http://practice.cybertekschool.com/email_sent";

        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();

        if(excepectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        System.out.println("expectedUrl= "+ excepectedUrl);
        System.out.println("actualUrl= "+ actualUrl);

        driver.quit();

        //verify that url changed to http://practice.cybertekschool.com/email_sent

    }
}
