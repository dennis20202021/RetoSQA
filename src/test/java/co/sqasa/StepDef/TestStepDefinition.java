package co.sqasa.StepDef;

import co.sqasa.task.MakeClick;
import co.sqasa.task.NavigateTo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TestStepDefinition {

    @Given("^(.*) navega al sitio web$")
    public void robertNavegarAlSitioWebHttpsSanangelComCo(String personName) {
        theActorCalled(personName).wasAbleTo(
            NavigateTo.sanangelUrl()
        );
    }

    @When("^Realiza clic en (.*)$")
    public void realizeClickOn(String elementName) {
        theActorInTheSpotlight().attemptsTo(
            MakeClick.on(elementName)
        );
    }
    
}
