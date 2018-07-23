package co.com.bancolombia.certification.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.google.model.PageExpression;
import co.com.bancolombia.certification.google.userinterface.GoogleAppsComponent;
import co.com.bancolombia.certification.google.util.StringToTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class GoTo implements Task {
	
	private PageExpression pageExpression;
	
	public GoTo(PageExpression pageExpression) {
		this.pageExpression = pageExpression;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APS));	
		actor.attemptsTo(Click.on(StringToTarget.getGoogleAppTarget(pageExpression.getGoogleApp())));	    
	}

	public static GoTo theApp(PageExpression pageExpression) {
		return instrumented(GoTo.class, pageExpression);
	}
}
