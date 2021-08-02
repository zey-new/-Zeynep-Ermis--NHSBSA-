package org.nhs.pages;


import org.nhs.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {
    
    @FindBy(id = "next-button")
    public WebElement startButton;
    
    @FindBy(id = "nhsuk-cookie-banner__link_accept")
    public WebElement acceptCookieBanner;
    
    
    
    
    public void clickStart() {
        
        startButton.click();
        
    }
}


