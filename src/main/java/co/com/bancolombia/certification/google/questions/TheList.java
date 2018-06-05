package co.com.bancolombia.certification.google.questions;

import co.com.bancolombia.certification.google.userinterface.YoutubePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class TheList implements Question<Integer> {
	private Integer totalVideos;
	private String resultado, resultadoDiv;
	
	@Override
	public Integer answeredBy(Actor actor) {		
		System.out.println(Text.of(YoutubePage.TOTAL_RESULTADOS).viewedBy(actor).asString());
		resultado = Text.of(YoutubePage.TOTAL_RESULTADOS).viewedBy(actor).asString();
		resultadoDiv = resultado.replace("Cerca de ", "").replace(" resultados","").replace(",", "");
		System.out.println(resultadoDiv);
		totalVideos = Integer.parseInt(resultadoDiv);
		return totalVideos;
	}
	
	public static TheList is() {
		return new TheList();		
	}

}
