package co.com.bancolombia.certification.google.model;


public class TranslateExpression {
	
	private String sourceLanguage;
	private String targetLanguage;
	private String theWord;
		
	public TranslateExpression(String sourceLanguage, String targetLanguage, String theWorld) {
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
		this.theWord = theWorld;
	}	
	
	public String getSourceLanguage() {
		return sourceLanguage;
	}
	
	public String getTargetLanguage() {
		return targetLanguage;
	}

	public String getTheWord() {
		return theWord;
	}	
}
