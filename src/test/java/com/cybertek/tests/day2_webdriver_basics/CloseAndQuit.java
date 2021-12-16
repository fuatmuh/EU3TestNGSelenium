package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(2000);

        driver.close(); //sadece tek sekmeli web page i kapatır.

        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        driver.quit();// herşeyi kapat
    }

}
