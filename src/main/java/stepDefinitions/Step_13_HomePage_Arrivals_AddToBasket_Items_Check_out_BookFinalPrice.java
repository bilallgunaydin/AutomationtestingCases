package stepDefinitions;

import PageObjectModel.Test_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice;
import Utilities.Driver;
import io.cucumber.java.en.Then;

public class Step_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice {
    Test_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice test_13_homePage_arrivals_addToBasket_items_check_out_bookFinalPrice = new Test_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice();
    @Then("User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out")
    public void user_has_the_feasibility_to_find_the_total_price_of_the_books_at_to_find_the_total_price_of_the_books_at_the_time_of_check_out()  {
        test_13_homePage_arrivals_addToBasket_items_check_out_bookFinalPrice.assertMyMessage();
        Driver.tearDown();
    }
}
