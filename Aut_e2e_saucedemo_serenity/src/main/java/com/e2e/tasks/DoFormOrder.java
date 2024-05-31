package com.e2e.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.e2e.ui.FormularioForm;

public class DoFormOrder implements Task {
    
	public String name;
	public String lastname;
	public String postalcode;

    public DoFormOrder() {
		this.name = "test user";
		this.lastname = "Test01";
		this.postalcode = "170176";
    }

    public static Performable withoptions(){
        return instrumented(DoFormOrder.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)  {
        actor.attemptsTo(
				 Click.on(FormularioForm.CHECKOUT_BUTTON),
                 Enter.theValue(name).into(FormularioForm.NAME_FIELD),
				 Enter.theValue(lastname).into(FormularioForm.LAST_NAME_FIELD),
				 Enter.theValue(postalcode).into(FormularioForm.CODE_POSTAL_FIELD)
        );
    }
}