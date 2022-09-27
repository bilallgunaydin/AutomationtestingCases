package stepDefinitions;

import PageObjectModel.Test_11_HomePage_Arrivals_AddToBasket_Items_Removebook;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class Step_11_HomePage_Arrivals_AddToBasket_Items_Removebook {
    Test_11_HomePage_Arrivals_AddToBasket_Items_Removebook test_11_home_Page_arrivals_addToBasket_items_removebook = new Test_11_HomePage_Arrivals_AddToBasket_Items_Removebook();
    @And("Now click on Remove this icon in Check out page which removes that book from the grid.")
    public void now_click_on_remove_this_icon_in_check_out_page_which_removes_that_book_from_the_grid() {
        test_11_home_Page_arrivals_addToBasket_items_removebook.removeBook();
    }
    @Then("User has the feasibility to remove the book at the time of check out also")
    public void user_has_the_feasibility_to_remove_the_book_at_the_time_of_check_out_also() {
        test_11_home_Page_arrivals_addToBasket_items_removebook.assertMyMessages();
        Driver.tearDown();
    }

}
