package co.com.bancolombia.certification.google.questions;

import java.util.List;

import org.openqa.selenium.WebElement;

import co.com.bancolombia.certification.google.userinterface.YoutubePage;
import net.serenitybdd.core.annotations.findby.By;
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
	
	/*public Integer answeredBy(Actor actor) {		
		int total = 0;
		System.out.println(Text.of(YoutubePage.LISTA_RESULTADOS).viewedBy(actor).asString());
		
		List<String> listado = Text.of(YoutubePage.LISTA_RESULTADOS).viewedBy(actor).asList();
		
		for (String productos : listado) {
			
			total++;			
		}	
		System.out.println(total);
		
		resultado = Text.of(YoutubePage.TOTAL_RESULTADOS).viewedBy(actor).asString();
		resultadoDiv = resultado.replace("Cerca de ", "").replace(" resultados","").replace(",", "");
		System.out.println(resultadoDiv);
		totalVideos = Integer.parseInt(resultadoDiv);
		return totalVideos;
	}*/
	
	
	public static TheList is() {
		return new TheList();		
	}

}
