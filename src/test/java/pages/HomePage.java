package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public By READ_AND_ACCEPT_BUTTON = By.xpath("//*[@text='I READ & I ACCEPT']");
    public By CATEGORY_BUTTON = By.xpath("//*[@text='Category']");

    public By HOME_CATEGORY = By.id("com.nopstation.nopcommerce.nopstationcart:id/rvHomeCategories");
    public By ELECTRONICS_BUTTON = By.xpath("//*[@text='Electronics']");
}