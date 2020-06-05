package CucumberOption;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/feature",
		glue="stepDefination",
		plugin= {"pretty","html:target/cucumber","json:target/a.json","junit:target/b.xml"}
		)

public class TestRunner {
	

}
