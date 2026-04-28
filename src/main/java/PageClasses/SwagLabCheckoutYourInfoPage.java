package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutYourInfoPage
{
    @FindBy(xpath = "//input[@id='first-name']") private WebElement FN;
    @FindBy(xpath = "//input[@id='last-name']") private WebElement LN;
    @FindBy(xpath = "//input[@id='postal-code']") private WebElement Zincode;
    @FindBy(xpath = "//input[@id='continue']") private WebElement continueBtn;

    public SwagLabCheckoutYourInfoPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void enterFN(String firstname)
    {
        FN.sendKeys(firstname);
    }

    public void enterLN(String lastname)
    {
       LN.sendKeys(lastname);
    }

    public void enterPinCode(String postalCode)
    {
        Zincode.sendKeys(postalCode);
    }

    public void clickOnContinueButton()
    {
        continueBtn.click();
    }
}
