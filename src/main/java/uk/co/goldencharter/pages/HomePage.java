package uk.co.goldencharter.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.goldencharter.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='our-funeral-plans-btn']")
    WebElement OurFuneralPlanLink;

    @CacheLookup
    @FindBy(xpath ="//body/div[@id='cookiefirst-root']/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]" )
    WebElement aaaeptCookieButton;

    public void clickOnOurFuneralPlanLink() {
        clickOnElement(OurFuneralPlanLink);

    }
    public void clickOnAcceptCookie(){
        clickOnElement(aaaeptCookieButton);
    }
}


