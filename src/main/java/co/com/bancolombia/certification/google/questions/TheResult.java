package co.com.bancolombia.certification.google.questions;

import co.com.bancolombia.certification.google.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		System.out.println(Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA).viewedBy(actor).asString());
		return Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA).viewedBy(actor).asString();
	}

	public static TheResult is() {
		
		return new TheResult();
	}

}
