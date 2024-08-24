package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsOne {
    @Given("I login to Google")
    public void iLoginToGoogle() throws InterruptedException {
        System.out.println("Logged into Google");
        Thread.sleep(2000);
        System.out.println("I have waited for 2 Seconds");
    }

    @When("I Search for Manasvini")
    public void iSearchForManasvini() {
    }

    @Then("Manasvini Profile should be displayed")
    public void manasviniProfileShouldBeDisplayed() {
    }
}
