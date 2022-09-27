package stepDefinitions;

import PageObjectModel.Test_7_HomePage_Arrivals_AddToBasketWithMoreBooks;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_7_HomePage_Arrivals_AddToBasketWithMoreBooks {
    Test_7_HomePage_Arrivals_AddToBasketWithMoreBooks test_7_homePage_arrivals_addToBasketWithMoreBooks = new Test_7_HomePage_Arrivals_AddToBasketWithMoreBooks();
    @And("Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.")
    public void selectMoreBooksThanTheBooksInStockExIfTheStockHasBooksTryToAdd() {
        test_7_homePage_arrivals_addToBasketWithMoreBooks.sendQuatity();
    }

    @And("Click the add to basket button")
    public void clickTheAddToBasketButton() {
        test_7_homePage_arrivals_addToBasketWithMoreBooks.addBooktheBasket();
    }

    @Then("Now it throws an error prompt like you must enter a value between 1 and 9908")
    public void nowItThrowsAnErrorPromptLikeYouMustEnterAValueBetweenAnd() {
        test_7_homePage_arrivals_addToBasketWithMoreBooks.assertMyMessages();
        Driver.tearDown();
    }

}
