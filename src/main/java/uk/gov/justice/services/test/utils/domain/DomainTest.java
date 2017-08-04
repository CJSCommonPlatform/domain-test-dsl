package uk.gov.justice.services.test.utils.domain;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/resources/domain-features", format = {"pretty",
        "json:target/cucumber.json"}, tags = {"~@ignore"})
public class DomainTest {
}
