package tests;

import config.ConfigurationUITests;
import org.testng.annotations.Test;

public class AllegroUITest extends AbstractUITest {

    @Test(dataProvider = "itemDetailsProvider", dataProviderClass= ConfigurationUITests.class)
    public void should_basket_contain_selected_item(String itemName, String minPrice) {

        allegroPageAction.searchDesiredValue(itemName);
        allegroPageAction.inputPriceFrom(minPrice);
        allegroPageAction.filterBuyNowOption();
        allegroPageAction.accessArticle();
        allegroPageAction.retrieveItemName();
        allegroPageAction.addToBasket();
        allegroPageAction.shouldBasketContainItem();
    }



}
