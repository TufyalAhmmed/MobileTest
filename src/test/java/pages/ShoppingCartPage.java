package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{
    public String COUNTRY_BD_TEXT = "Bangladesh";
    public By COUNTRY_OPTIONS = By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner");
    public By  COUNTRY_BD= By.xpath("//*[@text='Bangladesh']");


}
