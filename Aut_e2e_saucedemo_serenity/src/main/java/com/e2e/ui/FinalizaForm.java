package com.e2e.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
//@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
import org.openqa.selenium.WebElement;
public class FinalizaForm extends PageObject

{
String msg ="Thank you for your order!";
    public static By CONTINUE_BUTTON= By.id("continue");
    public static By CONFIRM_BUTTON= By.id("finish");
    public static By CONFIRM_TEXT= By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
    public static final Target COMPLETE_MESSAGE = Target.the("Thank you for your order!").located(CONFIRM_TEXT);
    public static By BACK_HOME_BUTTON= By.id("back-to-products");

}
