package org.nhs.pages;

import org.nhs.utilities.BasePage;
import org.nhs.utilities.BrowserUtils;
import org.nhs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhereYouLive_Page extends BasePage {
    
 
    @FindBy (id = "label-wales")
    public WebElement wales;
    
 
    
    
    public void chooseCountry(String countryName) {
        WebElement radio_Country = null;
        String password = "";
        if (countryName.equalsIgnoreCase("wales")) {
            radio_Country = wales;
       
        } else {
     
            // other countries goes here...
        }
    
        BrowserUtils.waitForClickablility(radio_Country, 5);
        radio_Country.click();
        nextButton.click();
    }
}
