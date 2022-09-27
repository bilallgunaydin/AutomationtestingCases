package stepDefinitions;

import PageObjectModel.Test_3_HomePage_Images_in_Arrivals_should_navigate;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_3_HomePage_Images_in_Arrivals_should_navigate {
    Test_3_HomePage_Images_in_Arrivals_should_navigate test_3_HomePage_Images_in_Arrivals_should_navigate = new Test_3_HomePage_Images_in_Arrivals_should_navigate();
    @And("Click the Selenium Ruby text")
    public void clickTheSeleniumRubyText() {
        test_3_HomePage_Images_in_Arrivals_should_navigate.setClickSeleniumText();
    }

    @And("Click the Selenium Ruby Image")
    public void clickTheSeleniumRubyImage() {
        test_3_HomePage_Images_in_Arrivals_should_navigate.setClickSeleniumImage();
    }

    @And("Close the Selenium Ruby Image")
    public void closeTheSeleniumRubyImage() throws InterruptedException {
        test_3_HomePage_Images_in_Arrivals_should_navigate.setClickSeleniumImageClose();
    }

    @Then("Image should be clickable and shoul navigate to next page where user can add that book to his basket")
    public void ımageShouldBeClickableAndShoulNavigateToNextPageWhereUserCanAddThatBookToHisBasket() {
        test_3_HomePage_Images_in_Arrivals_should_navigate.assertMyMessage();
        Driver.tearDown();
    }

}
