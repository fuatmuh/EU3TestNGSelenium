package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void clickWithJS() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");

        WebElement uploadButton=driver.findElement(By.id("file-upload"));

        //sending file with sendkeys method
        uploadButton.sendKeys("C:\\Users\\fuat_\\Desktop\\file.txt");

        driver.findElement(By.id("file-submit")).click();

        String actualFileName=driver.findElement(By.id("uploaded-files")).getText();

        Assert.assertEquals(actualFileName,"file.txt");


    }

}
