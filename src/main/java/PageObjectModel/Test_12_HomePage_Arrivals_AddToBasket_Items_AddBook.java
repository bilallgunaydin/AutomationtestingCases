package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_12_HomePage_Arrivals_AddToBasket_Items_AddBook extends abstractClass {
    private WebDriver driver;

    public Test_12_HomePage_Arrivals_AddToBasket_Items_AddBook() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "cart[9766527f2b5d3e95d4a733fcfb77bd7e][qty]")
    private WebElement numberElement;
    public void setUpdateElement()
    {
        numberElement.clear();
        sendKeysFunction(numberElement,"2");
    }

    @FindBy(name="update_cart")
    private WebElement updateElement;
    public void clickUpdate()
    {
        clickFunction(updateElement);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div[1]")
    private WebElement successMessage;
    public void assertMyMessage() {

        Assertion(successMessage,"Basket updated.");
    }
}
