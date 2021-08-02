package org.nhs.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.nhs.utilities.Pages;

import java.util.Map;

public class Eligibility {

    Pages pages = new Pages();
    Map<String, String> criteria;


    @Given("I am a person from {string}")
    public void i_am_a_person_from(String countryName) {

        pages.StartPage().acceptCookieBanner.click();
        pages.StartPage().startButton.click();
        pages.WhereYouLive_Page().chooseCountry(countryName);


    }


    @When("I fill the DoB fields")
    public void iFillTheDoBFields(Map<String, String> dob) {

        pages.DOB_Page().enterDate(dob.get("DoB day"), dob.get("DoB month"), dob.get("DoB year"));


    }

    @When("based on following criteria")
    public void based_on_following_criterias(Map<String, String> criteria) {

        this.criteria = criteria;

    }

    @And("fill out partner page")
    public void wOPartner() {
        pages.PartnerPage().select(criteria.get("w/o partner"));
        pages.PartnerPage().nextButton.click();
    }

    @And("fill out tax credits page")
    public void benefitsUTaxCredits() {

        pages.Claim_benefits_tax_credits_Page().select(criteria.get("benefits/u tax credits"));
        pages.Claim_benefits_tax_credits_Page().nextButton.click();


    }

    @And("fill out universal credit page")
    public void paidUElseUniversalCredit() {

        pages.Paid_uc_page().choosePaidUCType(criteria.get("paid/u/else universal credit"));
        pages.Paid_uc_page().nextButton.click();
    }

    @And("child,LCW or LCWRA")
    public void childLCWOrLCWRA() {

        pages.UC_claim_page().select(criteria.get("child, LCW or LCWRA with universal credit"));
        pages.UC_claim_page().nextButton.click();
    }

    @And("take home pay")
    public void takeHomePay() {
        pages.UC_take_home_pay_page().select(criteria.get("take home pay"));
        pages.UC_take_home_pay_page().nextButton.click();
    }
    @Then("I should get a result message saying that {string}")
    public void i_should_get_a_result_message_saying_that(String expectedResultMessage) {

        Assert.assertTrue(pages.resultClaimingQualifyingPensionCreditPage().pageTitle().contains(expectedResultMessage));

    }
}