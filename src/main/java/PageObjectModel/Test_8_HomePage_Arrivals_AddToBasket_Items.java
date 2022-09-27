package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_8_HomePage_Arrivals_AddToBasket_Items extends abstractClass {
    private WebDriver driver;
    public Test_8_HomePage_Arrivals_AddToBasket_Items()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
    private WebElement checkOutElement;
    public void clickCheckOut()
    {
        clickFunction(checkOutElement);
    }

    public void assertMyMessage() {
        String url=driver.getCurrentUrl();
        Assertion(url, "https://practice.automationtesting.in/checkout/");
    }

}
