package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_7_HomePage_Arrivals_AddToBasketWithMoreBooks extends abstractClass{
    private WebDriver driver;
    public Test_7_HomePage_Arrivals_AddToBasketWithMoreBooks()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div[2]/form/div/input")
    private WebElement quantity;
    public void sendQuatity()
    {
        sendKeysFunction(quantity,"10000");
    }

    @FindBy(xpath = "//button[contains(text(),'Add to basket')]")
    private WebElement basketElement;
    public void addBooktheBasket()
    {
        clickFunction(basketElement);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/form/div/input")
    private WebElement successMessage;
    public void assertMyMessages() {
        Assertions(successMessage, "Değer 9908 veya daha küçük olmalıdır.");
    }
}
