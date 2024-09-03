package co.sqasa.task;

import co.sqasa.ui.SanAngelHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.browserOn().the(SanAngelHomeUI.class);
    }

    public static NavigateToTask sanangelUrl() {
        return Tasks.instrumented(NavigateToTask.class);
    }
    
}
