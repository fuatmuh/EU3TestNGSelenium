package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AcrionsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void hoverTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1=driver.findElement(By.tagName("img"));

        //Actions ----> class that contains all the user interactions

        Actions actions=new Actions(driver);

        //perform () ---> perform the action complate the action
        //moveToElement
        Thread.sleep(2000);
        actions.moveToElement(img1).perform();

        WebElement viewLink=driver.findElement(By.linkText("View profile"));

        Assert.assertTrue(viewLink.isDisplayed(),"verify view link is displayed");
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //driver.manage().window().maximize();

        //onetrust-accept-btn-handler
        //WebElement cookies=driver.findElement(By.xpath("//*[.='Accept and Close']"));
        WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Thread.sleep(3000);

        Actions actions=new Actions(driver);



        WebElement source =driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void dragAndDropSecondWay() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //driver.manage().window().maximize();

        //onetrust-accept-btn-handler
        //WebElement cookies=driver.findElement(By.xpath("//*[.='Accept and Close']"));
        WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Thread.sleep(3000);

        Actions actions=new Actions(driver);



        WebElement source =driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        Thread.sleep(2000);
        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().perform();





    }

}
