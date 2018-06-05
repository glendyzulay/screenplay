package co.com.bancolombia.certification.google.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class YoutubePage {
	public static final Target SONG_TEXT_AREA = Target.the("Song Text Area").located(By.xpath("//div[@id='search-input']/input"));
	public static final Target BUTTON_FIND = Target.the("Button Find").located(By.id("search-icon-legacy"));
	public static final Target TOTAL_RESULTADOS = Target.the("List Total Result").located(By.id("result-count"));
}
