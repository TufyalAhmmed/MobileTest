package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

import static utilities.DriverSetup.*;

public class Hooks {
    @Before
    public void openBrowser() throws MalformedURLException {
        setAndroidDriver();
    }

    @After
    public void closeBrowser(Scenario scenario){
        quiteAndroidDriver(scenario);
    }
}