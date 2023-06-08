package housecall_test_ui.pages;

import housecall_test_ui.models.Customer;
import housecall_test_ui.utilities.Driver;
import housecall_test_ui.utilities.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static housecall_test_ui.utilities.Utilities.*;

public class NewJobPage {

    public NewJobPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[.='+ New customer'])/..")
    private WebElement createNewCustomerButton;

    @FindBy(id = "item-name")
    private WebElement lineItemName;

    @FindBy(id = "qty")
    private WebElement lineItemQuantity;

    @FindBy(id = "unit-price")
    private WebElement lineItemPrice;

    @FindBy(xpath = "//*[.='Private notes']/button")
    private WebElement privateNotesButton;

    @FindBy(xpath = "//textarea[@data-testid='private-notes-textfield']")
    private WebElement privateNotesInputField;

    @FindBy(xpath = "(//span[.='Save job'])[2]/.")
    private WebElement saveJobButton;

//    add new customer
    @FindBy(name = "first_name")
    private WebElement firstName;

    @FindBy(name = "last_name")
    private WebElement lastName;

    @FindBy(name = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;



    public void createNewCustomer(){
        Customer customer = new Customer();
        clickElement(createNewCustomerButton);
        Utilities.hold().until(ExpectedConditions.visibilityOf(firstName));
        typeText(firstName, customer.getFirstName());
        typeText(lastName, customer.getLastName());
        typeText(email, customer.getEmail());
        typeText(mobileNumber, customer.getMobilPhone());
        submitButton.click();
    }

    public void addLineItem(){
        Utilities.hold().until(ExpectedConditions.visibilityOf(lineItemName));
        typeText(lineItemName,fake().job().field());
        clearAndTypeText(lineItemQuantity,fake().regexify("\\d\\.\\d{2}"));
        clearAndTypeText(lineItemPrice,fake().regexify("\\d{3}\\.\\d{2}"));
    }

    public void addPrivateNotes(){
        clickElement(privateNotesButton);
        Utilities.hold().until(ExpectedConditions.visibilityOf(privateNotesInputField));
        typeText(privateNotesInputField,fake().harryPotter().quote());
    }

    public void saveJob(){
        clickElement(saveJobButton);
    }
}
