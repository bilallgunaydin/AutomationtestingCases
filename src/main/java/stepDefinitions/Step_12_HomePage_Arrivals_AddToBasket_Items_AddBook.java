package stepDefinitions;

import PageObjectModel.Test_12_HomePage_Arrivals_AddToBasket_Items_AddBook;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_12_HomePage_Arrivals_AddToBasket_Items_AddBook {
    Test_12_HomePage_Arrivals_AddToBasket_Items_AddBook test_12_homePage_arrivals_addToBasket_items_addBook = new Test_12_HomePage_Arrivals_AddToBasket_Items_AddBook();
    @And("Click on textbox value under quantity in Check out page to add or subtract books.")
    public void click_on_textbox_value_under_quantity_in_check_out_page_to_add_or_subtract_books() {
        test_12_homePage_arrivals_addToBasket_items_addBook.setUpdateElement();
    }
    @And("Now click on Update Basket to reflect those changes")
    public void now_click_on_update_basket_to_reflect_those_changes() {
        test_12_homePage_arrivals_addToBasket_items_addBook.clickUpdate();
    }
    @Then("User has the feasibility to Update Basket at the time of check out.")
    public void user_has_the_feasibility_to_update_basket_at_the_time_of_check_out()  {
        test_12_homePage_arrivals_addToBasket_items_addBook.assertMyMessage();
        Driver.tearDown();
    }
}
