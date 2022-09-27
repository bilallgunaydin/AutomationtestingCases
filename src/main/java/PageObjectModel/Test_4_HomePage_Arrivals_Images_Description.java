package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_4_HomePage_Arrivals_Images_Description extends abstractClass {
    private WebDriver driver;

    public Test_4_HomePage_Arrivals_Images_Description() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Description')]")
    private WebElement clickDescription;

    public void setClickDescription() {
        clickFunction(clickDescription);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[3]/div[1]/p")
    private WebElement successMessage;

    public void assertMyMessage() {

        Assertion(successMessage, ("The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver. It contains hundreds of solutions to real-world problems, with clear explanations and ready-to-run test scripts you can use in your own projects."));
    }
}
