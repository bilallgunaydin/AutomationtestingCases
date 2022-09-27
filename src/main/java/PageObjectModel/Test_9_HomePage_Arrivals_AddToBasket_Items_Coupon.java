package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_9_HomePage_Arrivals_AddToBasket_Items_Coupon extends abstractClass{
    private WebDriver driver;
    public Test_9_HomePage_Arrivals_AddToBasket_Items_Coupon()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Click here to enter your code")
    private WebElement couponElement;
    public void clickCoupon()
    {
        clickFunction(couponElement);
    }

    @FindBy(name = "coupon_code")
    private WebElement getCouponElement;
    public void sendCouponElement(String coupon)
    {
        sendKeysFunction(getCouponElement,coupon);
    }

    @FindBy(name = "apply_coupon")
    private WebElement clickApplyElement;
    public void clickApylyButton()
    {
        clickFunction(clickApplyElement);
    }

    @FindBy(xpath = "//th[contains(text(),'Coupon: krishnasakinala')]")
    private WebElement successMessage;
    public void assertMyMessage(String coupon)  {

        Assertion(successMessage,coupon);
    }

}
