package stepDefinitions;

import PageObjectModel.Test_4_HomePage_Arrivals_Images_Description;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_4_HomePage_Arrivals_Images_Description {
    Test_4_HomePage_Arrivals_Images_Description test_4_homePage_arrivals_images_description = new Test_4_HomePage_Arrivals_Images_Description();
    @And("Click on Description tab for the book you clicked on")
    public void clickOnDescriptionTabForTheBookYouClickedOn() {
        test_4_homePage_arrivals_images_description.setClickDescription();
    }

    @Then("There should be a description regarding that book the user clicked on")
    public void thereShouldBeADescriptionRegardingThatBookTheUserClickedOn() {
        test_4_homePage_arrivals_images_description.assertMyMessage();
        Driver.tearDown();
    }


}
