package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles/SampleFeature1.feature", glue = {
		"StepDefiniton" }, monochrome = true, plugin = { "pretty", "html: target/HTML_Reports/SampleFeature1.html", "junit: target/XML_Reports/SampleFeature1.xml",
				"json: target/JSON_Reports/SampleFeature1.json"}

)

public class SampleFeature1_runner {

}
