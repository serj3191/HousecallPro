package housecall_test_ui.pages;

import housecall_test_ui.utilities.Driver;
import housecall_test_ui.utilities.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
    private final String LOGIN_URL = "https://pro.housecallpro.com/pro/log_in";

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement loginButton;

    public void login(String email, String password){
        Driver.getDriver().get(LOGIN_URL);
        Utilities.hold().until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
