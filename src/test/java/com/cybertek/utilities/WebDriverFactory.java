package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class WebDriverFactory {

    //task:
    // Bu class standart yaptığımız işlemleri method şeklinde yazmamıza yarıyor.

    public static WebDriver getDriver(String browsertype){

        WebDriver driver=null;

        switch (browsertype.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "explorer":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                break;
        }
        return driver;
    }

}
