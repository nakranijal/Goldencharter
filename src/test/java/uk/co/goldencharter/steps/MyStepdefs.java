package uk.co.goldencharter.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.goldencharter.pages.FuneralPlanPage;
import uk.co.goldencharter.pages.HomePage;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on OurFuneralplans link$")
    public void iClickOnOurFuneralplansLink() {
        new HomePage().clickOnOurFuneralPlanLink();
    }

    @Then("^I should navigate to funeralplans page successfully$")
    public void iShouldNavigateToFuneralplansPageSuccessfully() {
        Assert.assertEquals("Failed to navigate to FuneralPlanpage","Compare our funeral plans", new FuneralPlanPage()
                .getOurFuneralPlanText());
    }

    @And("^I accept cookie$")
    public void iAcceptCookie() {
        new HomePage().clickOnAcceptCookie();

    }
}
