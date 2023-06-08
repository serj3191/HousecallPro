package housecall_test_ui.pages;

import housecall_test_ui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static housecall_test_ui.utilities.Utilities.clickElement;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@data-testid='tracked-button'])[1]")
    private WebElement newButton;

    @FindBy(xpath = "//ul[@role='menu']/li")
    private List<WebElement> newOptions;

    public void createNewJob(){
        clickElement(newButton);
        clickElement(newOptions.get(0));
    }
}
