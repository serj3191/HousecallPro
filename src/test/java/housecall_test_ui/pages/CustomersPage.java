package housecall_test_ui.pages;

import housecall_test_ui.utilities.Driver;
import housecall_test_ui.utilities.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class CustomersPage {

    public CustomersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[.='Activity feed'])[2]")
    private WebElement activityFeedField;

    @FindBy(xpath = "//p[contains(text(), 'Job created as Invoice')]")
    private WebElement createdJobMessage;

    public void verifyJobWasCreated(){
        Utilities.hold().until(ExpectedConditions.visibilityOf(activityFeedField));
        assertTrue(createdJobMessage.isDisplayed());
    }

}
