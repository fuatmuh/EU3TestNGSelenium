package com.cybertek.tests.reviews.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_YahooPractice {
    /*
    open the web page
    go to the https://www.yahoo.com/
    verify title
    expectedTitle="Yahoo"
    actualTitle=webPage
     */


    public static void main(String[] args) {
        //setup driver
        WebDriverManager.chromedriver().setup();

        //how can I open a new page
        WebDriver driver=new ChromeDriver();

        //go tothe pahe
        driver.get("https://www.yahoo.com");

        String expectedTitle="Yahoo";
        String actualTitle=driver.getTitle();

        System.out.println("expectedTitle= " + expectedTitle);
        System.out.println("actualTitle= " + actualTitle);


    }
}
