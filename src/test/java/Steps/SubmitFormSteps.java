package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitFormSteps
{
    @Given("user in at Signup page")
    public void user_in_at_signup_page()
    {
        System.out.println("at signup page");
    }
    @When("user enters {string} inside form")
    public void user_enters_inside_form(String name)
    {
        System.out.println("Entered Name:"+name);

    }
    @When("user enters age as {int}")
    public void user_enters_age_as(Integer age)
    {
        System.out.println("Entered age:"+age);

    }
    @When("user confirm gender as {string}")
    public void user_confirm_gender_as(String Male)
    {
        System.out.println("Entered Gender:"+Male);
    }
    @Then("user gets created")
    public void user_gets_created()
    {
        System.out.println("user gets created");
    }


}
