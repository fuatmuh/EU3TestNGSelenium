package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();
        //driver.get("https://cybertekschool.com");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https:/wwwgoogle.com");

        System.out.println("hello");
        System.out.println("hello 2 deneme");
        System.out.println("hello 2 ci gonderim");
        System.out.println("hello 3. gonderimimmmmmmmm");







    }

}
