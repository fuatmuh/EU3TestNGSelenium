package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {



    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        // 1. yöntem benim için.    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java");
        // 1. yöntem benim için.    driver.findElement(By.xpath("//input[@value='Go']")).click();

        // 1. yöntem benim için.    System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText());

        WebElement searchbox =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchbox.sendKeys("Java");

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result =driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String resultTex = result.getText();

        System.out.println("resultTex = " + resultTex);

        String expectedresult="1-48 of over 6,000 results for";

        if(expectedresult.equals(resultTex)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
        System.out.println("expectedresult = " + expectedresult);
        System.out.println("resultTex = " + resultTex);
        //driver.quit();
    }
}
