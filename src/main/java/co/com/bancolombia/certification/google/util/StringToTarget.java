package co.com.bancolombia.certification.google.util;

import co.com.bancolombia.certification.google.userinterface.GoogleAppsComponent;
import co.com.bancolombia.certification.google.userinterface.GoogleTranslatePage;
import net.serenitybdd.screenplay.targets.Target;

public class StringToTarget {

	public static Target getSourceLanguageTarget(String sourceLanguage) {
	
		switch (sourceLanguage) {
			case "English": 
				return GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH;
			default:
				return GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH;
		}
				
	}
	
	public static Target getTargetLanguageSource(String targetLanguage) {
		
		switch (targetLanguage) {
			case "Spanish": 
				return GoogleTranslatePage.TARGET_LANGUAGE_SPANISH;
			default:
				return GoogleTranslatePage.TARGET_LANGUAGE_SPANISH;
		}
				
	}
	
	public static Target getGoogleAppTarget(String googleApp) {
		
		switch (googleApp) {
			case "Youtube": 
				return GoogleAppsComponent.YOUTUBE;
			case "Google Translate": 
				return GoogleAppsComponent.GOOGLE_TRANSLATE;
			default:
				return GoogleAppsComponent.YOUTUBE;
		}
				
	}
	
}
