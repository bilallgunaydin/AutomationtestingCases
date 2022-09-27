package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_6_HomePage_Arrivals_Images_AddToBasket extends abstractClass {
    private WebDriver driver;

    public Test_6_HomePage_Arrivals_Images_AddToBasket() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Add to basket')]")
    private WebElement addToBasketElement;

    public void clickAddToBasket() {
        clickFunction(addToBasketElement);
    }

    @FindBy(xpath = "//a[contains(text(),'View Basket')]")

    private WebElement basketItem;

    public void viewBasketItem() {
        clickFunction(basketItem);
    }

    @FindBy(xpath = "//a[contains(text(),'Selenium Ruby')]")
    private WebElement successMessage;

    public void assertMyMessage() {
        Assertion(successMessage, "Selenium Ruby");
    }

}
