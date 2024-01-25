package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{
    public By CHECKOUT_BUTTON = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut");
    public By CHECKOUT_AS_GUEST_BUTTON = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");

    public By ADDRRESS_FIRST_NAME = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
    public By ADDRESS_LAST_NAME = By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
    public By ADDRESS_EMAIL = By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
    public By ADDRESS_COUNTRY = By.id("android:id/text1");
    public By ADDRESS_COUNTRY_SELECT = By.xpath("//*[@text='Bangladesh']");
    public By ADDRESS_STATE = By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinnerLayout");
    public By ADDRESS_STATE_SELECT = By.xpath("//*[@text=\"ঢাকা\"]");
    public By COMPANY_NAME = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
    public By CITY_NAME = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity");
    public By STREET_ADDRESS = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
    public By STREET_ADDRESS2 = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2");
    public By ZIP_CODE = By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
    public By PHONE_NUMBER = By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone");
    public By FAX = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax");
    public By CONTINUE_BUTTON = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
    public By SHIPPING_CONTINUE_BUTTON = By.xpath("(//*[@resource-id='com.nopstation.nopcommerce.nopstationcart:id/btnContinue'])[2]");
    public By NEXT_DAY_AIR = By.xpath("(//*[@text='Next Day Air'])[2]/parent::android.widget.RelativeLayout");
    public By MONEY_ORDER = By.xpath("//*[@text='Check / Money Order']");
    public By NEXT_BUTTON = By.xpath("//android.widget.Button[@text='Next']");
    public By CONFIRM_BUTTON = By.id("com.nopstation.nopcommerce.nopstationcart:id/checkoutButton");
    public By POPUP_MESSAGE = By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message");
    public By ShippingList = By.xpath("(//android.widget.ScrollView)[2]");

}
