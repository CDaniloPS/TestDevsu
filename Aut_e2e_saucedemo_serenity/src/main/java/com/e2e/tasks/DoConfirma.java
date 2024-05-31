package com.e2e.tasks;

import com.e2e.ui.FinalizaForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoConfirma implements Task {
    public static Performable withoptions(){
        return instrumented(DoConfirma.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
    	String mensaje = "Thank you for your order!";
    	actor.attemptsTo(
                Click.on(FinalizaForm.CONFIRM_BUTTON)
        );
    }
}