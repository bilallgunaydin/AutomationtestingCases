package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_11_HomePage_Arrivals_AddToBasket_Items_Removebook extends abstractClass {
    private WebDriver driver;

    public Test_11_HomePage_Arrivals_AddToBasket_Items_Removebook() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[1]/td[1]/a")
    private WebElement removeElement;

    public void removeBook() {
        clickFunction(removeElement);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[1]")

    private WebElement message1;

    public void assertMyMessages() {
        if (message1.getText().contains("Mastering JavaScript removed. Undo?"))
            Assertion(message1, "Mastering JavaScript removed. Undo?");
    }

}
