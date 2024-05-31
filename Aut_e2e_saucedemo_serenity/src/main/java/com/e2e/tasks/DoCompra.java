package com.e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.e2e.ui.ProductForms;


public class DoCompra  implements Task {
    public static Performable withActor(){
        return instrumented(DoCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductForms.ADD_ITEM_1),
                Click.on(ProductForms.ADD_ITEM_2)
        );
    }
}
