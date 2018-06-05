package co.com.bancolombia.certification.google.tasks;

import co.com.bancolombia.certification.google.model.FindExpression;
import co.com.bancolombia.certification.google.userinterface.YoutubePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

public class Find implements Task{
	
	private FindExpression findExpression;
	
	public Find (FindExpression findExpression) {
		this.findExpression = findExpression;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(findExpression.getSong());
		actor.attemptsTo(Enter.theValue(findExpression.getSong()).into(YoutubePage.SONG_TEXT_AREA));
		actor.attemptsTo(Click.on(YoutubePage.BUTTON_FIND));		
	}
	
	public static Find the(FindExpression findExpression) {
		return instrumented(Find.class, findExpression);
	}

}
