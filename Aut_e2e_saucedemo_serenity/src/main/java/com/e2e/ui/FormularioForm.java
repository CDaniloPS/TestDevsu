package com.e2e.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class FormularioForm  extends PageObject {
    //Place Order
    public static By CHECKOUT_BUTTON= By.id("checkout");
    public static By NAME_FIELD= By.id("first-name");
    public static By LAST_NAME_FIELD= By.id("last-name");
    public static By CODE_POSTAL_FIELD= By.id("postal-code");
}
