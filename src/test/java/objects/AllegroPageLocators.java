package objects;

import org.openqa.selenium.By;

public class AllegroPageLocators {

//  allegro.pl main page selectors
    public By searchInputLocator = By.xpath("//input[@type='search']");
    public By buyNowFilterButtonLocator = By.xpath("//div[@id='opbox-filters']//span[text()='kup teraz']");
    public By priceFromInputLocator = By.xpath("//input[@name='od']");
    public By priceWaitConditionLocator = By.xpath("//div[@class='_461260a']/i");
    public By articleLocator = By.xpath("(//div[@class='ecdefa6'])[1]");

//  article page selectors
    public By itemNameLocator = By.xpath("//div[@class='col-xm-12']/h1");
    public By addToBasketLocator = By.xpath("//a[@id='add-to-cart']");
    public By proceedToBasketButtonLocator = By.xpath("//button[@id='add-to-cart-si-precart']");

//  basket page selectors
    public By itemInBasketLocator = By.xpath("//div[@class='item-name']");

}
