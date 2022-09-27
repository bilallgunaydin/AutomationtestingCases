package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Test_3_HomePage_Images_in_Arrivals_should_navigate extends abstractClass{
    private WebDriver driver;
    public Test_3_HomePage_Images_in_Arrivals_should_navigate()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Selenium Ruby')]")

    private WebElement clickSeleniumText;
    public void setClickSeleniumText()
    {
        clickFunction(clickSeleniumText);
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[1]/a/img")


    private WebElement clickSeleniumImage;

    public void setClickSeleniumImage()
    {
        clickFunction(clickSeleniumImage);
    }

    @FindBy(xpath = "//a[contains(text(),'Close')]")

    private WebElement clickSeleniumImageClose;
    public void setClickSeleniumImageClose() throws InterruptedException {
        Thread.sleep(2000);
        clickFunction(clickSeleniumImageClose);
    }
    @FindBy(xpath = "//p[contains(text(),'The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver.')]")
    private WebElement successMessage;
    public void assertMyMessage()  {

        Assertion(successMessage,("The Selenium WebDriver Recipes book is a quick problem-solving guide to automated testing web applications with Selenium WebDriver."));
    }


}
