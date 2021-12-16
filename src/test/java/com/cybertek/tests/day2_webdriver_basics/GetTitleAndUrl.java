package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        //setup driver
        WebDriverManager.chromedriver().setup();

        //how can I open a new page
        WebDriver driver=new ChromeDriver();

        //go tothe pahe
        driver.get("http://practice.cybertekschool.com");
        // Alt+ Enter direkt olarak değişkeni yazdırıyor.
        String title = driver.getTitle();

        System.out.println("title = " + title);

        String currentUrl = driver.getCurrentUrl(); // Alt + Enter
        System.out.println("currentUrl = " + currentUrl); //soutv kısayolu

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
