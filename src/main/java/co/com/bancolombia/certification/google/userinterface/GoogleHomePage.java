package co.com.bancolombia.certification.google.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com.co")
public class GoogleHomePage extends PageObject {
	
	public static final Target GOOGLE_LOGO = Target.the("Google Logo").located(By.id("hplogo"));

}
