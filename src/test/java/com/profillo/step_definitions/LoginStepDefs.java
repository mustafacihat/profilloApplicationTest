package com.profillo.step_definitions;

import com.profillo.pages.LoginPage;
import com.profillo.utitilies.BrowserUtils;
import com.profillo.utitilies.ConfigurationReader;
import com.profillo.utitilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is in the login page")
    public void the_user_is_in_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {
       new LoginPage().login(username,password);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should be in application dashboard")
    public void the_user_should_be_in_application_dashboard() {
        Assert.assertEquals("verify the title is Library","Library",Driver.get().getTitle());
    }


    @Then("the user should be in login page")
    public void the_user_should_be_in_login_page() {
        Assert.assertEquals("verify the url","http://library3.cybertekschool.com/login.html",Driver.get().getCurrentUrl());
    }


}
