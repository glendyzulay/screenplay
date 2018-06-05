package co.com.bancolombia.certification.google.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("Source Language Button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_BUTTON = Target.the("Target Language Button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE_ENGLISH = Target.the("Source Language English").located(By.xpath("//*[@id=\"gt-sl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'Japonés')]"));
	public static final Target TARGET_LANGUAGE_SPANISH = Target.the("Source Language Spanish").located(By.xpath("//*[@id=\"gt-tl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'Coreano')]"));
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source Language Text Area").located(By.id("source")); 
	public static final Target TRANSLATE_BUTTON = Target.the("Translate Button").located(By.id("gt-submit"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target Language Text Area").located(By.id("gt-res-dir-ctr"));
}
