package org.nhs.pages;

import org.nhs.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paid_uc_page extends BasePage {
    
    
    @FindBy(xpath = "//*[@id=\"paidUniversalCredit_fieldset\"]/label[1]")
    public WebElement yesUniversalButton;
    @FindBy(xpath = "//*[@id=\"paidUniversalCredit_fieldset\"]/label[2]")
    public WebElement notYetButton;
    @FindBy(xpath = "//*[@id=\"paidUniversalCredit_fieldset\"]/label[3]")
    public WebElement differentBenefitButton;
  
    public void choosePaidUCType(String selection){
        
        switch (selection){
            case "yes":
                 yesUniversalButton.click();
                 break;
            case "no":
                notYetButton.click();
                break;
            case "different":
                differentBenefitButton.click();
        }
       
    }
}
