package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{

    @Given("open browser")
    public void open_browser()
    {
        System.out.println("open browser");
    }

    @When("user enter username")
    public void user_enter_username()
    {
        System.out.println("entered username");

    }

    @When("user enter password")
    public void user_enter_password()
    {
        System.out.println("entered password");

    }

    @When("user click on login button")
    public void user_click_on_login_button()
    {
        System.out.println("clicked on login button");

    }

    @Then("home page should be visible")
    public void home_page_should_be_visible()
    {
        System.out.println("home page is visible");

    }

    @When("user enter wrong password")
    public void user_enter_wrong_password()
    {
        System.out.println("entered wrong password");
    }
    @Then("error msg should be visible")
    public void error_msg_should_be_visible()
    {
        System.out.println("error msg visible");
    }


    @Given("user enter username as {string}")
    public void user_enter_username_as(String string)
    {
        System.out.println("username entered:"+string);
    }
    @Given("user enter password as {string}")
    public void user_enter_password_as(String string)
    {
        System.out.println("password entered:"+string);

    }
    @Then("home page should be visible with {string} logo text")
    public void home_page_should_be_visible_with_logo_text(String string)
    {
        System.out.println("home page visible:"+string);

    }


}
