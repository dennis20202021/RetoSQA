package co.sqasa.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:active.sanangel.url")
public class SanAngelHomeUI extends PageObject {

    public static final Target BUY_LINK = Target
            .the("Buy link")
            .locatedBy("//a[contains(@href, 'https://sanangel.com.co/categoria/8-ramos-de-flores-para-cumpleanos/')]");

}
