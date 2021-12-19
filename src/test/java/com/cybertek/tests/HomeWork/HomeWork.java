package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomeWork {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        username.sendKeys("Tester");
        password.sendKeys("test");

        WebElement loginbutton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginbutton.click();

        Thread.sleep(2000);

        WebElement checkAllButton=driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAllButton.click();


        WebElement uncheckboxButton=driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        uncheckboxButton.click();

        WebElement checkboxany=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
        checkboxany.click();
        WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));

        deleteButton.click();

        String pagesourcetext= driver.getPageSource();
        String firstCheckbox="ctl00_MainContent_orderGrid_ctl02_OrderSelector";

        if(pagesourcetext.contains(firstCheckbox)){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");
        }









    }
}
