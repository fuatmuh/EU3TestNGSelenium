package com.cybertek.tests.HomeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    public WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = WebDriverFactory.getDriver("chrome"); // initialize our driver objec
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        // Login to WebPage
        WebElement userNameBox = driver.findElement(By.id("ctl00_MainContent_username"));
        userNameBox.sendKeys("Tester");
        WebElement passwordBox = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$password']"));
        passwordBox.sendKeys("test");
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

    }

    @AfterMethod
    public void closeBrowser(){
        //driver.close();
    }

    @Test
    public void deletePersonTest2() throws InterruptedException {
        //click on the check box where the name is Clare Jefferson
        String name = "Clare Jefferson";
        String locatorCheckBoxOfPerson = "//*[contains(text(),'" + name + "')]/..//input";

        WebElement checkBoxOfPerson = driver.findElement(By.xpath(locatorCheckBoxOfPerson));
        checkBoxOfPerson.click();
        Thread.sleep(1000);

        //click on the delete button
        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();
        Thread.sleep(1000);

        //Assertion-Put all the web elements for names in a list
        String eachNameLocator = "//input[@type='checkbox']/../../td[2]";
        List<WebElement> allNames1 = driver.findElements(By.xpath(eachNameLocator));

        //Create an empty arraylist to get text of web elements inside allNames1
        ArrayList<String> allNames2 = new ArrayList<>();

        //get text of each element from allNames1 and put them to allNames2
        for (int i = 0; i < allNames1.size(); i++) {
            allNames2.add(allNames1.get(i).getText());
        }

        //Do the verification
        Assert.assertFalse(allNames2.contains(name));



    }


}
