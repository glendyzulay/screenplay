package co.com.bancolombia.certification.google.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.google.model.FindExpression;
import co.com.bancolombia.certification.google.model.PageExpression;
import co.com.bancolombia.certification.google.model.TranslateExpression;
import co.com.bancolombia.certification.google.questions.TheList;
import co.com.bancolombia.certification.google.questions.TheResult;
import co.com.bancolombia.certification.google.tasks.Find;
import co.com.bancolombia.certification.google.tasks.GoTo;
import co.com.bancolombia.certification.google.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.google.tasks.Translate;
import co.com.bancolombia.certification.google.userinterface.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor glendy = Actor.named("Glendy");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setup() {
		glendy.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that (.*) opens her browser at (.*)$")
	public void thatTheUserOpensHerBrowserAtThePage(String name, String webpage) throws Exception {
	    glendy.wasAbleTo(OpenTheBrowser.at(googleHomePage));
	    
	}

	@Given("^She goes to (.*)$")
	public void TheUserGoesTo(String googleApp) throws Exception {
		glendy.wasAbleTo(GoTo.theApp(new PageExpression(googleApp)));
	
	}

	@When("^She translate the word (.*) from (.*) to (.*)$")
	public void TheUserTranslateTheWordFromTo(String word, String sourceLanguage, String targetLanguage) throws Exception {
		glendy.attemptsTo(Translate.the(new TranslateExpression(sourceLanguage, targetLanguage, word)));
	}

	@Then("^She should see the word (.*) in the screen$")
	public void TheUserShouldSeeTheWordInTheScreen(String expectedWord) throws Exception {
		glendy.should(seeThat(TheResult.is(), equalTo(expectedWord)));
	}
	
	@When("^She searches the song (.*)$")
	public void TheUserFindTheSong(String theSong) throws Exception {
		glendy.attemptsTo(Find.the(new FindExpression(theSong)));
	    
	}

	@Then("^She should see at least (\\d+) video listed$")
	public void she_should_see_at_least_video_listed(Integer cantidadVideos) throws Exception {
		glendy.should(seeThat(TheList.is(),greaterThan(cantidadVideos)));
	}
}
