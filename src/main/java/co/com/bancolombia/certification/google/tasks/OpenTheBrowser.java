package co.com.bancolombia.certification.google.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;

public class OpenTheBrowser implements Task {
	
	private PageObject page;
	
	public OpenTheBrowser (PageObject page) {
		this.page= page;
	}
			
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenTheBrowser at(PageObject page) {		
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, page);
	}

}
