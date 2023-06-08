package housecall_test_ui.steps;

import housecall_test_ui.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }


}
