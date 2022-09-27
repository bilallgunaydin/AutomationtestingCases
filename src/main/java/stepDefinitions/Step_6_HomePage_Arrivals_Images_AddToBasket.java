package stepDefinitions;

import PageObjectModel.Test_6_HomePage_Arrivals_Images_AddToBasket;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_6_HomePage_Arrivals_Images_AddToBasket {
    Test_6_HomePage_Arrivals_Images_AddToBasket test_6_homePage_arrivals_images_addToBasket = new Test_6_HomePage_Arrivals_Images_AddToBasket();

    @And("Click on the Add To Basket button which adds that book to your basket")
    public void clickOnTheAddToBasketButtonWhichAddsThatBookToYourBasket() {
        test_6_homePage_arrivals_images_addToBasket.clickAddToBasket();
    }

    @And("User can view that Book in the Menu item with price.")
    public void userCanViewThatBookInTheMenuItemWithPrice() {
        test_6_homePage_arrivals_images_addToBasket.viewBasketItem();
    }

    @Then("User can add a book by clicking on Add To Basket button which adds that book in to his Basket")
    public void userCanAddABookByClickingOnAddToBasketButtonWhichAddsThatBookInToHisBasket() {
        test_6_homePage_arrivals_images_addToBasket.assertMyMessage();
        Driver.tearDown();
    }



}
