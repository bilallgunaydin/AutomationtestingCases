package stepDefinitions;

import PageObjectModel.Test_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450 {
    Test_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450 test_10_homePage_arrivals_addToBasket_items_couponCheckLess450 = new Test_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450();

    @And("Click the Mastering Javascript Text")
    public void click_the_mastering_javascript_text() {
        test_10_homePage_arrivals_addToBasket_items_couponCheckLess450.setClickJavascriptElement();
    }

    @Then("User can not able to apply coupon by entering 'krishnasakinala' in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price > {int} rps")
    public void user_can_not_able_to_apply_coupon_by_entering_in_the_coupon_textbox_which_give_50rps_off_on_the_total_price_because_the_coupon_is_applicable_for_the_book_price_rps(int discount) {
        test_10_homePage_arrivals_addToBasket_items_couponCheckLess450.assertMyMessage(discount);
    }

}
