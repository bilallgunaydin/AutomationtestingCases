package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Test_1_HomePage_Slider extends abstractClass {
    private WebDriver driver;

    public Test_1_HomePage_Slider() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Shop")
    private WebElement shopMenuClickElement;

    public void clickShopMenu() {
        clickFunction(shopMenuClickElement);
    }

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeClickElement;

    public void clickHome() {
        clickFunction(homeClickElement);
    }

    @FindBy(className = "n2-ss-slide")
    private List<WebElement> listsliderelement;
    public int checkSlider() {
        int countSlider = 0;
        countSlider=listsliderelement.size();
        return countSlider;
    }
    public void assertMyMessage() {
        Assertion(checkSlider(),String.format("Slider Number: "+String.valueOf(listsliderelement.size())));
    }

}
