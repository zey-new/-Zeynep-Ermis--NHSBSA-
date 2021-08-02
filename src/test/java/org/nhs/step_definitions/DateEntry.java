package org.nhs.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.nhs.utilities.ConfigurationReader;
import org.nhs.utilities.Pages;

import java.time.LocalDate;

public class DateEntry {
   
    
    Pages pages = new Pages();
    
    
    @Given("I am on the DoB page")
    public void i_am_on_the_DoB_page() {
    
        pages.StartPage().acceptCookieBanner.click();
        pages.StartPage().startButton.click();
        pages.WhereYouLive_Page().chooseCountry(ConfigurationReader.getProperty("country"));
    }
    
    @Then("I should navigate the partner page")
    public void i_should_navigate_the_partner_page() {
        Assert.assertTrue(pages.DOB_Page().pageTitle().contains("Do you live with a partner?"));
    }
    
    @Then("I should get warning message {string}")
    public void i_should_get_warning_message(String expectedErrorMessage) {
        try {
        
            Assert.assertEquals(expectedErrorMessage, pages.DOB_Page().errorMessage.getText());
        } catch (Exception e) {
        
            e.printStackTrace();
        }
    }
    @When("I enter a date for {int}")
    public void i_enter_a_date_for(Integer age) {
        String day = "",month="",year = "";
       
        LocalDate localDate = LocalDate.now();
        switch (age) {
            case 0:
                
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                
                break;
            case 15:
                localDate = localDate.minusYears(16).plusDays(1);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                break;
            case 16:
                localDate = localDate.minusYears(16);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                break;
            case 18:
                localDate = localDate.minusYears(19).plusDays(1);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                break;
            case 19:
                localDate = localDate.minusYears(19);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                break;
            case 120:
                localDate = localDate.minusYears(121).plusDays(1);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                break;
            case 121:
                localDate = localDate.minusYears(121);
                day=String.valueOf(localDate.getDayOfMonth());
                month=String.valueOf(localDate.getMonthValue());
                year=String.valueOf(localDate.getYear());
                
        }
        pages.DOB_Page().enterDate(day,month,year);
    }
    
    @Then("I should land following {string}")
    public void i_should_land_following(String endpoint) {
    
        Assert.assertTrue(pages.DOB_Page().getUrl().contains(endpoint));
    
    
    }
    
    
}
