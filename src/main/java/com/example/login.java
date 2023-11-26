package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        driver .manage().window().maximize();
        WebElement button_Login=driver.findElement(By.cssSelector(".desktop-header-module--gap-auth-button--3UCSU > .ud-btn-secondary > span"));
        button_Login.click();
        WebElement email =driver.findElement(By.name("Email"));
        email.sendKeys("tuvn1234f@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("Demo@123a");
        WebElement button_SubmitLogin=driver.findElement(By.cssSelector(".user-profile-dropdown-module--dropdown-button-avatar--2jhme"));
        button_SubmitLogin.click();
    }
}

