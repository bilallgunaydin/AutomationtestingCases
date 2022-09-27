package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450 extends abstractClass {
    private WebDriver driver;

    public Test_10_HomePage_Arrivals_AddToBasket_Items_CouponCheckLess450() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Mastering JavaScript')]")
    private WebElement clickJavascriptElement;

    public void setClickJavascriptElement() {
        clickFunction(clickJavascriptElement);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")

    private WebElement couponText;
    /*@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li/span/span")
    private WebElement icon;

     */
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li/span")
    private WebElement price;

    public void assertMyMessage(int discount) {
        String coupon = String.format(couponText.getText());
        if (price.getText().contains(String.valueOf(discount)))
            Assertion(coupon, "The minimum spend for this coupon is ₹450.00.");
    }
}
