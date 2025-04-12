
package com.company.framework.pages;

import com.company.framework.core.actions.FluentElementInteractionBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
    private final WebDriver driver;

    private final By inputUsername = By.id("username");
    private final By inputPassword = By.id("password");
    private final By buttonLogin = By.id("loginBtn");

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        FluentElementInteractionBuilder.initialize()
            .usingDriver(driver)
            .sendText(inputUsername, username)
            .sendText(inputPassword, password)
            .clickElement(buttonLogin)
            .execute();
    }
}
