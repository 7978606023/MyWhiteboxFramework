package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

//factory design pattern

    public static WebDriver getDriver(String browserName){
        WebDriver driver;

        switch(browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anubhav\\IdeaProjects\\WblAutomationFramework\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anubhav\\IdeaProjects\\WblAutomationFramework\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anubhav\\IdeaProjects\\WblAutomationFramework\\resources\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }
        return driver;
        }

    }
