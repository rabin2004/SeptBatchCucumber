package stepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features="C:\\Users\\User\\eclipse-workspace\\SeptBatchCucumber"
					+ "\\src\\test\\java\\features",
					glue="stepDefination",
					plugin= {"pretty","html:target/report_html/cucumberHTMLreport.html"
							,"json:target/report_json/cucumberJSONreport.json"},
					monochrome=true
//					,tags="@newScenario"
//					,tags="@Release2.0" // specifically running the tags
//					,tags="@Release1.0 or @Release2.0" // running both tags
//					,tags="@Regression and @E2E" // scenario with both tag will execute
					,tags="@Regression and not @E2E"
					)

public class RunnerClass { // runner class -> Junit

}
