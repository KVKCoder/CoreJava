package RunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles/CucumberTags.feature", glue = {
		"StepDefiniton" }, monochrome = true, tags = "@Sanity"
)

public class CucumberTags_runner {

}
