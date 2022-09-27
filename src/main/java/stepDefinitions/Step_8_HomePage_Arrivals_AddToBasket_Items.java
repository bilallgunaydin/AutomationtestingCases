package stepDefinitions;

import PageObjectModel.Test_8_HomePage_Arrivals_AddToBasket_Items;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_8_HomePage_Arrivals_AddToBasket_Items {
    Test_8_HomePage_Arrivals_AddToBasket_Items test_8_homePage_arrivals_addToBasket_items = new Test_8_HomePage_Arrivals_AddToBasket_Items();
    @And("Now click on Item link which navigates to proceed to check out page.")
    public void nowClickOnItemLinkWhichNavigatesToProceedToCheckOutPage() {
        test_8_homePage_arrivals_addToBasket_items.clickCheckOut();
    }

    @Then("User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page")
    public void userCanClickOnTheItemLinkInMenuItemAfterAddingTheBookInToTheBasketWhichLeadsToTheCheckOutPage() {
        test_8_homePage_arrivals_addToBasket_items.assertMyMessage();
        Driver.tearDown();
    }

}
