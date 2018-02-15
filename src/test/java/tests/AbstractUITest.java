package tests;

import actions.AllegroPageAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public abstract class AbstractUITest {

    AllegroPageAction allegroPageAction;

    @BeforeClass
    @Parameters({"baseURL"})
    public void testSetup(String baseURL) {
        this.allegroPageAction = new AllegroPageAction();
        allegroPageAction.openPage(baseURL);
    }

    @AfterClass
    public void testTearDown(){
        allegroPageAction.closeDriver();
    }
}
