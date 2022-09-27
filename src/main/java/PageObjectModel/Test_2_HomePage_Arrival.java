package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Test_2_HomePage_Arrival extends abstractClass {
    private WebDriver driver;

    public Test_2_HomePage_Arrival() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h3")
    private List<WebElement> webElements;

    public int checkArrival() {
        int countArrival = 0;
        countArrival = webElements.size();
        return countArrival;
    }
    public void assertMyMessage() {
        Assertion(checkArrival(),String.format("Arrival Number: "+String.valueOf(webElements.size())));
    }

}
