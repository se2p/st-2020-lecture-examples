package week6;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleSteps {

    private Example example;
    private String result;

    @Given("I open the example")
    public void givenIOpenTheExample() {
        example = new Example();
    }

    @When("I call foo")
    public void whenICallFoo() {
        result = example.foo();
    }

    @Then("I should receive $bar")
    public void thenIShouldReceiveBar(String bar) {
        assertEquals(result, bar);
    }
}
