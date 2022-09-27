package stepDefinitions;

import PageObjectModel.Test_1_HomePage_Slider;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Step_1_HomePage_Slider {
    Test_1_HomePage_Slider test_1_HomePage_Slider = new Test_1_HomePage_Slider();
    private WebDriver driver;

    @Given("Navigate to Website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click on Shop Menu")
    public void clickOnShopMenu() {
        test_1_HomePage_Slider.clickShopMenu();
    }

    @And("click on Home menu button")
    public void clickOnHomeMenuButton() {
        test_1_HomePage_Slider.clickHome();
    }

    @And("Test whether the Home page has Three Sliders only")
    public void testWhetherTheHomePageHasThreeSlidersOnly() {
        test_1_HomePage_Slider.checkSlider();
    }

    @Then("The Home page must contains only three sliders")
    public void theHomePageMustContainsOnlyThreeSliders()  {
        test_1_HomePage_Slider.assertMyMessage();
        Driver.tearDown();
    }


}