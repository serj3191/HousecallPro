package housecall_test_ui.steps;

import housecall_test_ui.pages.CustomersPage;
import housecall_test_ui.pages.LoginPage;
import housecall_test_ui.pages.MainPage;
import housecall_test_ui.pages.NewJobPage;
import housecall_test_ui.utilities.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTheJobTest {

    private LoginPage loginPage = new LoginPage();
    private MainPage mainPage = new MainPage();
    private NewJobPage newJobPage = new NewJobPage();
    private CustomersPage customersPage = new CustomersPage();

    @When("user logs in to application")
    public void user_logs_in_to_application() {
        loginPage.login(PropertyReader.getProperty("email"),PropertyReader.getProperty("password"));
    }

    @And("user selects Job from New menu")
    public void userSelectsJobFromNewMenu() {
        mainPage.createNewJob();
    }

    @And("user adds new job")
    public void userAddsNewJob() {
        newJobPage.createNewCustomer();
        newJobPage.addLineItem();
        newJobPage.addPrivateNotes();
        newJobPage.saveJob();

    }

    @Then("user verifies in Activity feed that job was created")
    public void userVerifiesInActivityFeedThatJobWasCreated() {
        customersPage.verifyJobWasCreated();
    }

}
