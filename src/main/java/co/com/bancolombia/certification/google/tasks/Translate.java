package co.com.bancolombia.certification.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.google.model.TranslateExpression;
import co.com.bancolombia.certification.google.userinterface.GoogleTranslatePage;
import co.com.bancolombia.certification.google.util.StringToTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Translate implements Task{
	
	private TranslateExpression translateExpression;
	
	public Translate(TranslateExpression translateExpression) {
		this.translateExpression = translateExpression;		
	}		
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_BUTTON));	
		actor.attemptsTo(Click.on(StringToTarget.getSourceLanguageTarget(translateExpression.getSourceLanguage())));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_BUTTON));
		actor.attemptsTo(Click.on(StringToTarget.getTargetLanguageSource(translateExpression.getTargetLanguage())));
		actor.attemptsTo(Enter.theValue(translateExpression.getTheWord()).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TRANSLATE_BUTTON));
	}

	public static Translate the(TranslateExpression translateExpression) {
		return instrumented(Translate.class, translateExpression);
	}
}
