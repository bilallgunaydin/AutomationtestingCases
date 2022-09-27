package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test_5_HomePage_Arrivals_Images_Reviews extends abstractClass {
    private WebDriver driver;

    public Test_5_HomePage_Arrivals_Images_Reviews() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
    private WebElement reviewTabElement;
    public void setReviewTabElement()
    {
        clickFunction(reviewTabElement);
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div/div/form/p[2]/p/span/a[5]")
    private WebElement star;
    public void setRateStar()
    {
        clickFunction(star);
    }

    @FindBy(id = "comment")
    private WebElement reviewComment;
    public void typeReviewComment(String review)
    {
        sendKeysFunction(reviewComment,review);
    }

    @FindBy(id="author")
    private WebElement nameElement;
    public void typeName(String name)
    {
        sendKeysFunction(nameElement,name);
    }
    @FindBy(id="email")
    private WebElement emailElement;
    public void typeMail(String email)
    {
        sendKeysFunction(emailElement,email);
    }

    @FindBy(id="wp-comment-cookies-consent")
    private WebElement saveCheckBoxElement;
    public void clickCheckBox()
    {
        clickFunction(saveCheckBoxElement);
    }

    @FindBy(id="submit")
    private WebElement submitElement;
    public void clickSubmitButton()
    {
        clickFunction(submitElement);
    }
    @FindBy(xpath = "//p[contains(text(),'The book is best')]")
    private WebElement successMessage;
    public void assertMyMessage()  {

        Assertion(successMessage,("The book is best"));
    }

}
