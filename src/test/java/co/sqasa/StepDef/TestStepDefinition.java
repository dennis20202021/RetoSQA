package co.sqasa.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.sqasa.task.NavigateToTask;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TestStepDefinition {

    @Managed
    WebDriver driver = new ChromeDriver();

    Actor daniel = Actor.named("Daniel");

    @Before
    public void setUpActor() {
        daniel.can(BrowseTheWeb.with(driver));
    }

    @Given("^Robert navega al sitio web$")
    public void robertNavegarAlSitioWebHttpsSanangelComCo() {
        daniel.wasAbleTo(
            NavigateToTask.sanangelUrl()
        );
    }
}
