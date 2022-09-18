package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

    @Given("sample feature file is ready")
    public void sample_feature_file_is_ready() {
        System.out.println("Given: ----------------");
    }
    @When("I run the feature file")
    public void i_run_the_feature_file() {
        System.out.println("When: ------------------");
    }
    @Then("run should be successful")
    public void run_should_be_successful() {
        System.out.println("Then: -------------------");
    }
}
