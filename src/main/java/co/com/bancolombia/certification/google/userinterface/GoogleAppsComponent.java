package co.com.bancolombia.certification.google.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APS = Target.the("Google Apps Button").locatedBy("//*[@id=\"gbwa\"]/div[1]/a");
	public static final Target GOOGLE_MAS = Target.the("More Lync").locatedBy("//*[@id=\"gbwa\"]/div[2]/a[1]");
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Button").locatedBy("//*[@id=\"gb51\"]/span[1]");
	public static final Target YOUTUBE = Target.the("Button Youtube").locatedBy("//*[@id=\"gb36\"]/span[1]");

}
