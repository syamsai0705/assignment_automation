package com.base;

import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class BrowserDriverFactory {

    @Getter
    public static WebDriver driver;

    public static void setDriver(String browser){

        switch (browser){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("--disable-web-security");
                options.addArguments("--user-data-dir=C:/Users/jagad/AppData/Local/Google/Chrome/User Data/Profile 4");
                options.addArguments("--disable-blink-features=AutomationControlled");
                System.out.println("Browser cache cleared");


                driver = new ChromeDriver(options);
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }

    }


}
