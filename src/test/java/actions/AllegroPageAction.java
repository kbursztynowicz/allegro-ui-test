package actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.*;


public class AllegroPageAction extends AbstractPageAction {

    String selectedItemName;

    public void searchDesiredValue(String itemName) {
        WebElement searchInput = driver.findElement(allegroPageLocators.searchInputLocator);
        searchInput.sendKeys(itemName);
        searchInput.submit();
    }

//  this methods selects 'buy now' option from the panel on the left
    public void filterBuyNowOption() {
        WebElement buyNowFilterButton = wait
                .until(ExpectedConditions.elementToBeClickable(allegroPageLocators.buyNowFilterButtonLocator));
        buyNowFilterButton.click();
    }

//  this method fills min price in a proper element and waits for another element to be present in order to wait until
//  results are filtered correctly
    public void inputPriceFrom(String minPrice) {
        WebElement priceFromInput = wait
                .until(ExpectedConditions.elementToBeClickable(allegroPageLocators.priceFromInputLocator));
        priceFromInput.sendKeys(minPrice);
        wait.until(ExpectedConditions.presenceOfElementLocated(allegroPageLocators.priceWaitConditionLocator));
    }

    public void accessArticle() {
        refreshElementAndClick(allegroPageLocators.articleLocator);
    }

    public void retrieveItemName() {
        this.selectedItemName = wait
                .until(ExpectedConditions.visibilityOfElementLocated(allegroPageLocators.itemNameLocator))
                .getText().trim();
    }

    public void addToBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(allegroPageLocators.addToBasketLocator))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(allegroPageLocators.proceedToBasketButtonLocator))
                .click();
    }

    public void shouldBasketContainItem() {
       assertThat(selectedItemName)
                .containsIgnoringCase(wait.until(ExpectedConditions
                        .presenceOfElementLocated(allegroPageLocators.itemInBasketLocator)).getText());
    }




}
