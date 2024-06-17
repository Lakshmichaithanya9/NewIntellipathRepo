package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (

        features = {"src/test/Resource/featureFile"},
        glue = {"stepDefinitionFile"},
        plugin ={"pretty"},
        tags= "@explicit1"

)

public class featureRunner {

}
