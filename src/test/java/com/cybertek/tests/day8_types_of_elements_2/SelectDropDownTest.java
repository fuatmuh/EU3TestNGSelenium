package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.bouncycastle.tsp.TSPUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;

public class SelectDropDownTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void test2() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/dropdown");
            WebElement dropdownElement = driver.findElement(By.id("state"));
            Select stateDropdown = new Select(dropdownElement);
            String expectedoption="Select a State";
            String actualOption=stateDropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedoption,"verify first selection");

            //how to select someting from dropdown


            Thread.sleep(2000);
            stateDropdown.selectByVisibleText("Virginia");

            expectedoption="Virginia";
            actualOption=stateDropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedoption,"verify Virginia selected");

            //2. select using index
            Thread.sleep(2000);
            stateDropdown.selectByIndex(51);

            expectedoption="Wyoming";
            actualOption=stateDropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedoption,"verify Wyoming selected");

            //3.Select by value

            Thread.sleep(2000);
            stateDropdown.selectByValue("TX");

            expectedoption="Texas";
            actualOption=stateDropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualOption,expectedoption,"verify Wyoming selected");

        }





    }


