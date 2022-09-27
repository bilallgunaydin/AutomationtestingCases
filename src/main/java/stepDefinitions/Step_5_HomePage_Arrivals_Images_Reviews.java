package stepDefinitions;

import PageObjectModel.Test_5_HomePage_Arrivals_Images_Reviews;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_5_HomePage_Arrivals_Images_Reviews {
    Test_5_HomePage_Arrivals_Images_Reviews test5HomePageArrivalsImagesReviews = new Test_5_HomePage_Arrivals_Images_Reviews();
    @And("Now clock on Reviews tab for the book you clicked on")
    public void nowClockOnReviewsTabForTheBookYouClickedOn() {
        test5HomePageArrivalsImagesReviews.setReviewTabElement();
    }

    @And("Rate a five star")
    public void rateAFiveStar() {
        test5HomePageArrivalsImagesReviews.setRateStar();
    }

    @And("Write {string} comment on Your Review")
    public void writeCommentOnYourReview(String review) {
        test5HomePageArrivalsImagesReviews.typeReviewComment(review);
    }

    @And("type name {string}")
    public void typeName(String name) {
        test5HomePageArrivalsImagesReviews.typeName(name);
    }

    @And("type email {string}")
    public void typeEmail(String email) {
        test5HomePageArrivalsImagesReviews.typeMail(email);
    }

    @And("click save checkbox Button")
    public void clickSaveCheckboxButton() {
        test5HomePageArrivalsImagesReviews.clickCheckBox();
    }

    @And("click submit Button")
    public void clickSubmitButton() {
        test5HomePageArrivalsImagesReviews.clickSubmitButton();
    }

    @Then("There should be a Reviews regarding that book the user clicked on")
    public void thereShouldBeAReviewsRegardingThatBookTheUserClickedOn() {
        test5HomePageArrivalsImagesReviews.assertMyMessage();
        Driver.tearDown();
    }

}
