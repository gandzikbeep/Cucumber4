package stepDefinition;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utilities.Screenshots;

import java.io.IOException;
import java.util.logging.Logger;

public class Hooks extends Base {

    public  WebDriver driver;


    @Before()
    public void setup() throws IOException {
        System.out.println("_____________________HOOKS - BEFORE_____________");
        driver = Base.getDriver();
    }


    @After()
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println("_____________________HOOKS - AFTER______________");

        if (scenario.isFailed()) {
            Screenshots screenshots = new Screenshots(driver);
            screenshots.newScr(scenario);
            System.out.println("scennario FAIl - take a scr");
        }
        System.out.println("Quit driver");

        driver.quit();
    }

}
