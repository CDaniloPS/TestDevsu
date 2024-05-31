package com.e2e.ui;

import net.thucydides.core.annotations. DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class HomeForm extends PageObject {
    public static By USERNAME_FIELD= By.id("user-name");
    public static By PASSWORD_FILD= By.id("password");
    public static By LOGIN_BUTTON= By.id("login-button");
}
