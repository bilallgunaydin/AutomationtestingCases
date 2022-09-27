package stepDefinitions;

import PageObjectModel.Test_9_HomePage_Arrivals_AddToBasket_Items_Coupon;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_9_HomePage_Arrivals_AddToBasket_Items_Coupon {
    Test_9_HomePage_Arrivals_AddToBasket_Items_Coupon test_9_homePage_arrivals_addToBasket_items_coupon = new Test_9_HomePage_Arrivals_AddToBasket_Items_Coupon();
    @And("Click Have a coupon link")
    public void clickHaveACouponLink() {
        test_9_homePage_arrivals_addToBasket_items_coupon.clickCoupon();
    }

    @And("Enter the Coupon code as {string} to get 50rps off on the total.")
    public void enterTheCouponCodeAsToGetRpsOffOnTheTotal(String coupon) {
        test_9_homePage_arrivals_addToBasket_items_coupon.sendCouponElement(coupon);
    }

    @And("click aplly coupon button")
    public void clickApllyCouponButton() {
        test_9_homePage_arrivals_addToBasket_items_coupon.clickApylyButton();
    }

    @Then("User can able to apply coupon by entering {string} in the coupon textbox which give 50rps off on the total price")
    public void userCanAbleToApplyCouponByEnteringInTheCouponTextboxWhichGiveRpsOffOnTheTotalPrice(String coupon) {
        test_9_homePage_arrivals_addToBasket_items_coupon.assertMyMessage(coupon);
        Driver.tearDown();
    }

}
