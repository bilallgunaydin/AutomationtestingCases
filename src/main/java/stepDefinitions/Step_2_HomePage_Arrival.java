package stepDefinitions;

import PageObjectModel.Test_2_HomePage_Arrival;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Step_2_HomePage_Arrival {
    Test_2_HomePage_Arrival test_2_HomePage_Arrival = new Test_2_HomePage_Arrival();
    @And("Test whether the Home page has Three Arrivals only")
    public void testWhetherTheHomePageHasThreeArrivalsOnly() {
        test_2_HomePage_Arrival.checkArrival();
    }

    @Then("The Home page must contains only three Arrivals")
    public void theHomePageMustContainsOnlyThreeArrivals() {
        test_2_HomePage_Arrival.assertMyMessage();
        Driver.tearDown();
    }


}
