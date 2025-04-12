
package com.company.framework.tests;

import com.company.framework.core.driver.WebDriverContextManager;
import com.company.framework.pages.LoginPageObject;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeMethod
    public void setup() {
        WebDriverContextManager.initializeDriver();
    }

    @Test
    public void validLoginTest() {
        WebDriverContextManager.getDriver().get("https://example.com/login");
        new LoginPageObject(WebDriverContextManager.getDriver())
            .login("admin@example.com", "password123");
    }

    @AfterMethod
    public void tearDown() {
        WebDriverContextManager.quitDriver();
    }
}
