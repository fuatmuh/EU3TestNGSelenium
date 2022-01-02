package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeTest {

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
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to swich frames
        //1.swich using by name or ID attribute of frame
        driver.switchTo().frame("mce_0_ifr");//içerdeki html kodunun içine giriyor.

        //clear before sendkeys
        driver.findElement(By.cssSelector("#tinymce")).clear();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");

        driver.switchTo().defaultContent();// içerideki html kodundan çıkıyor.

        //2.swichin with INdex
        driver.switchTo().frame(0);
        Thread.sleep(2000);

        //clear before sendkeys
        driver.findElement(By.cssSelector("#tinymce")).clear();

        //clear before sendkeys
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith with index");

        //second way to parent
        driver.switchTo().parentFrame();

        //3.using web element
        WebElement iframeWebElement=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframeWebElement);

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith with Web element");
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/nested_frames");


        driver.switchTo().frame("frame-top");//ilk önce frame topa git
        driver.switchTo().frame("frame-middle");// sonra midle a git
        System.out.println(driver.findElement(By.id("content")).getText());

        //goes back to top frame
        driver.switchTo().parentFrame();

        //swithing right with index
        driver.switchTo().frame(2);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        //go to main html to swich bottom
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("body")).getText());



    }

}
