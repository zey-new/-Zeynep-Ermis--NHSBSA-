package org.nhs.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    
    private static final Logger logger = LogManager.getLogger();
    
    @FindBy(id = "next-button")
    public WebElement nextButton;
    
    @FindBy(id = "label-yes")
    public WebElement yesButton;
    @FindBy(id = "label-no")
    public WebElement noButton;
    
    
    
    
    public BasePage() {
        
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    public String pageTitle(){
        return Driver.getDriver().getTitle();
    }
    
    
    public String getUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
    
    public void select(String selection){
        switch (selection) {
            case "yes":
                yesButton.click();
                break;
            case "no":
                noButton.click();
        }
    }
    
    
}




