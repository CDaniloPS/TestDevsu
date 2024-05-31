package com.e2e.glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import com.e2e.tasks.*;
import com.e2e.ui.HomeForm;

@Slf4j
public class BuyInSaucedemoGlue {

    @Managed
    WebDriver driver;
    private WebDriver navegador;
    private Actor guest = Actor.named("Guest");
    private HomeForm homeForm = new HomeForm();

    @Given("what standard_user enter to the home page")
    public void whatstandard_userEnterToTheHomePage() {
    	guest.can(BrowseTheWeb.with(navegador));
    	guest.wasAbleTo(Open.browserOn(homeForm));
        guest.attemptsTo(
                DoAccesoHome.withoptions()
        );
    }
    @When("he add two products to the cart")
    public void heAddTwoProductsToTheCart() {
       	guest.attemptsTo(
                DoCompra.withActor()
        );
    }
    @And("he view to the cart")
    public void heViewToTheCart(){
    	guest.attemptsTo(
                DoVerCarrito.withActor()
        );
    }
    @Then("he complete the purchase form")
    public void heCompleteThePurchaseForm() throws InterruptedException {
    	Thread.sleep(800);
    	guest.attemptsTo(
                DoFormOrder.withoptions()
        );
    }
    @And("he finish Checkout")
    public void heFinishCheckout() throws InterruptedException{
        Thread.sleep(800);
    	guest.attemptsTo(
                DoFinaliza.withoptions()
        );
        Thread.sleep(1200);
        guest.attemptsTo(
                DoConfirma.withoptions()
        );
        Thread.sleep(1400);
    }

}
