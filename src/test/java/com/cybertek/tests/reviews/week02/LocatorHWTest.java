package com.cybertek.tests.reviews.week02;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHWTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        //WebElement searchbox= driver.findElement(By.id("gh-ac")); //to duplicate Ctrl+D
        WebElement searchbox= driver.findElement(By.name("_nkw"));

        String expectedSearchItem="Selenium";
        searchbox.sendKeys(expectedSearchItem);
        //WebElement searchbutton= driver.findElement(By.id("gh-btn"));
        //searchbutton.click();
        driver.findElement(By.id("gh-btn")).click();


        System.out.println("Result: " + driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText());
        Thread.sleep(2000);
        //driver.close();





    }
}
