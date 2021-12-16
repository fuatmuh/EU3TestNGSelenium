package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make full scren
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //WebElement emailInput=driver.findElement(By.name("email"));
        //emailInput.sendKeys("mike@cybertekschool.com");

        driver.findElement(By.name("email")).sendKeys("mike@cybertekschool.com"); //yukarıdaki iki satırla aynı işi yapıyor.Önemli!!!!!

        //pu some email ans sign up button

        //WebElement signupButton=driver.findElement(By.name("wooden_spoon"));
        //signupButton.click();

        driver.findElement(By.name("wooden_spoon")).click();//yukarıdaki iki satırla aynı işi yapıyor.Önemli!!!!! isim genelde dynamic olmuyor. Dolayısıyla name metodunu kullanarak findelement kullanılabilir.


    }
}
