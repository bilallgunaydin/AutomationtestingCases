package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice extends abstractClass {
    private WebDriver driver;

    public Test_13_HomePage_Arrivals_AddToBasket_Items_Check_out_BookFinalPrice() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[2]/table/tfoot/tr[3]/td/strong/span" )

    private WebElement totalPrice;
    public void assertMyMessage() {
        Assertion(totalPrice,"₹367.50");
    }
}
