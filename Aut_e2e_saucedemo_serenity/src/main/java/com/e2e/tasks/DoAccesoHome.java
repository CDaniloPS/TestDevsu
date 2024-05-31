package com.e2e.tasks;

import com.e2e.ui.HomeForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoAccesoHome implements Task {

	public String user;
	public String password;

    public DoAccesoHome() {
		this.user = "standard_user";
		this.password = "secret_sauce";
    }

    public static Performable withoptions(){
        return instrumented(DoAccesoHome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor)  {
        actor.attemptsTo(
                 Enter.theValue(user).into(HomeForm.USERNAME_FIELD),
				 Enter.theValue(password).into(HomeForm.PASSWORD_FILD),
            	 Click.on(HomeForm.LOGIN_BUTTON)
        );
    }
}