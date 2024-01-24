package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ElectronicsPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ShoppingCartPage;

public class PlaceOrderStep {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    HomePage homePage = new HomePage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Given("Mike on home page after opening nopCart mobile app")
    public void mike_on_home_page_after_opening_nop_cart_mobile_app() throws InterruptedException {
//        Thread.sleep(15000);
        homePage.click_on(homePage.READ_AND_ACCEPT_BUTTON);
    }
    @When("Mike click {string} from {string} list from home page")
    public void mike_click_from_list_from_home_page(String string, String string2) {
        homePage.scrollInSpecificAreaToViewText(homePage.HOME_CATEGORY, string);
        homePage.click_on(homePage.ELECTRONICS_BUTTON);
    }
    @When("Mike click to {string} product details page")
    public void mike_click_to_product_details_page(String string) {
        electronicsPage.scrollInToViewText(string);
        electronicsPage.click_on(electronicsPage.get_element_locator_by_text(string));
    }
    @When("Mike click plus button to increase Qty by {string}")
    public void mike_click_plus_button_to_increase_qty_by(String string) {
        productDetailsPage.scrollInToViewText(productDetailsPage.QUANTITY_SECTION_NAME);
        productDetailsPage.click_on(productDetailsPage.PLUS_BUTTON);
    }
    @Then("Mike click add to cart button to add the product in his cart")
    public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() {
        productDetailsPage.click_on(productDetailsPage.ADD_TO_CARD_BUTTON);
        Assert.assertEquals(productDetailsPage.get_text_of(productDetailsPage.CART_COUNT), "2");
    }
    @Given("Mike go to shopping cart by clicking top cart icon")
    public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() {

    }
    @When("Mike click checkout button from shopping cart page")
    public void mike_click_checkout_button_from_shopping_cart_page() {

    }
    @When("Mike select checkout as guest from shopping cart page")
    public void mike_select_checkout_as_guest_from_shopping_cart_page() {

    }
    @Then("Mike input all the details in checkout billing details page and click continue")
    public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() {

    }
    @Then("Mike select {string} as shipping method and click continue")
    public void mike_select_as_shipping_method_and_click_continue(String string) {

    }
    @Then("Mike select {string} as payment method and click continue")
    public void mike_select_as_payment_method_and_click_continue(String string) {

    }
    @Then("Mike click next button on payment information page")
    public void mike_click_next_button_on_payment_information_page() {

    }
    @Then("Mike click confirm button to place the order")
    public void mike_click_confirm_button_to_place_the_order() {

    }
    @Then("Verify order place successfully with popup message {string}")
    public void verify_order_place_successfully_with_popup_message(String string) {

    }

}