package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();//chrom ile çalışılacak. Chrom kullanılacak
        driver.get("https:/www.google.com");// google ı açacak
        Thread.sleep(2000);// 2 sn bekleyecek
        driver.navigate().to("https:/www.facebook.com"); // facebook u açacak
        Thread.sleep(3000);// 3 sn bekleyecek
        driver.navigate().back();// google a geri dönecek.
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
