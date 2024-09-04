package co.sqasa.task;

import co.sqasa.ui.SanAngelHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MakeClick implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(MakeClick.class.getName());

    private final String elementName;

    public MakeClick(String elementName) {
        this.elementName = elementName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Compra de ramos: {}", this.elementName);
        WaitUntil.the(SanAngelHomeUI.BUY_LINK, isCurrentlyVisible());
        Click.on(SanAngelHomeUI.BUY_LINK);
    }

    public static MakeClick on(String elementName) {
        return Tasks.instrumented(MakeClick.class, elementName);
    }
    
}
