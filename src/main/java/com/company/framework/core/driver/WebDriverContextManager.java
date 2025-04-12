
package com.company.framework.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverContextManager {
    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static void initializeDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        threadLocalDriver.set(driver);
    }

    public static WebDriver getDriver() {
        return threadLocalDriver.get();
    }

    public static void quitDriver() {
        getDriver().quit();
        threadLocalDriver.remove();
    }
}
