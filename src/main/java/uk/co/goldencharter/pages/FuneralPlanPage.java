package uk.co.goldencharter.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.goldencharter.utility.Utility;

public class FuneralPlanPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public FuneralPlanPage() {
        PageFactory.initElements(driver, this);

    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Compare our funeral plans')]")
    WebElement   OurFuneralPlanText;

    public String getOurFuneralPlanText() {
        String message = getTextFromElement(OurFuneralPlanText);
        return message;

}}