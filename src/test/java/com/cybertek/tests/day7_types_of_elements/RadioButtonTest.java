package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {     //radio button test
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton=driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioButton=driver.findElement(By.cssSelector("#red"));

        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());

        //verify blue is selected red is not selected
        //blue ---> true
        Assert.assertTrue(blueRadioButton.isSelected(),"verify that blue is selected");
        //red --> false
        Assert.assertFalse(redRadioButton.isSelected(),"verfy red is not Selected");

        //how to click radio button?
        redRadioButton.click();

        //blue false
        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue is not  selected");
        //red --> true
        Assert.assertTrue(redRadioButton.isSelected(),"verfy red is Selected");

        Thread.sleep(2000);
        driver.quit();

    }

}
