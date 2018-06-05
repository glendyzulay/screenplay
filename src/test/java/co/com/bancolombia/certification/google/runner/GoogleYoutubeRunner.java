package co.com.bancolombia.certification.google.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= "src/test/resources/features/youtube.feature",
		glue = "co.com.bancolombia.certification.google.stepdefinitions"
)
public class GoogleYoutubeRunner {

}
