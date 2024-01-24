package pages;

import org.openqa.selenium.By;

public class ProductDetailsPage extends BasePage{
    public String QUANTITY_SECTION_NAME = "Quantity";

    public By PLUS_BUTTON = By.xpath("//*[@text='+']");
    public By MINUS_BUTTON = By.xpath("//*[@text='-']");
    public By ADD_TO_CARD_BUTTON = By.xpath("//*[@text='ADD TO CART']");
    public By CART_COUNT = By.id("com.nopstation.nopcommerce.nopstationcart:id/counterText");
    public By CART_BUTTON = By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon");

}
