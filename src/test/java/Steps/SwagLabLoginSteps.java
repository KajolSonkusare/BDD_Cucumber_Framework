package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import PageClasses.SwagLabHomePage;
import PageClasses.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabLoginSteps
{
    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);

    @Given("user is on Swag lab login")
    public void user_is_on_swag_lab_login() throws IOException
    {
        String urlValue= UtilityClass.getPFData("URL");  //get URL from property file
        DriverFactory.driver.get(urlValue);
    }

    @When("user enter username on swaglab login page {string}")
    public void user_enter_username_on_swaglab_login_page(String username)
    {
        login.enterUN(username);
    }

    @When("user enter password on swaglab login page {string}")
    public void user_enter_password_on_swaglab_login_page(String password)
    {
        login.enterPWD(password);
    }

    @When("user click on login btn on swaglab login page")
    public void user_click_on_login_btn_on_swaglab_login_page()
    {
        login.clickOnloginBtn();
    }

    @Then("home page visible with logo text {string}")
    public void home_page_visible_with_logo_text(String expLogoText)
    {
        String actLogoText= home.getLogoText();
        Assert.assertEquals(actLogoText,expLogoText,"Failed-Act & Exp Logo Text are different");
    }

    @Then("login failed error message should be visible message {string}")
    public void login_failed_error_message_should_be_visible_message(String expErrorMsg)
    {
        String actErrorMsg=login.getErrorMsg();
        Assert.assertEquals(actErrorMsg,expErrorMsg,"act & exp error msg mismatch");

    }

    @Then("login button should be enabled")
    public void login_button_should_be_enabled()
    {
        boolean actResult=login.getLoginButtonEnabled();
        Assert.assertTrue(actResult,"act Result is false");
    }




}
