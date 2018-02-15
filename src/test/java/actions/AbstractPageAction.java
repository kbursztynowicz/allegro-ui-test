package actions;

import config.ConfigurationUITests;
import objects.AllegroPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageAction {

    AllegroPageLocators allegroPageLocators;
    WebDriver driver;
    WebDriverWait wait;

    public AbstractPageAction() {
        this.allegroPageLocators = new AllegroPageLocators();
        this.driver = ConfigurationUITests.driver();
        this.wait = new WebDriverWait(driver, 2);
    }

    public void openPage(String baseURL){
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    public void closeDriver(){
        driver.close();
    }

    public void refreshElementAndClick(By by) {
        int attempts=0;
        while(attempts<2) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
                break;
            } catch (StaleElementReferenceException e) { }
            attempts++;
        }
    }





}
