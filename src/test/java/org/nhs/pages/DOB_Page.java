package org.nhs.pages;

import org.nhs.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DOB_Page extends BasePage {

    @FindBy(id ="dob-day")
    public WebElement DOB_day;
    
    @FindBy(id ="dob-month")
    public WebElement DOB_month;
    
    @FindBy(id ="dob-year")
    public WebElement DOB_year;
    
    @FindBy(xpath ="//*[@id=\"error-summary\"]//span")
    public WebElement errorMessage;
    
  
  
    
    public void enterDate(String day,String month,String year){
        DOB_day.sendKeys(day);
        DOB_month.sendKeys(month);
        DOB_year.sendKeys(year);
        System.out.println(DOB_year.getText());
        nextButton.click();
    }
    


    
}
