package com.profillo.step_definitions;

import com.profillo.pages.DashBoardPage;
import com.profillo.pages.EditUserInformationPage;
import com.profillo.pages.LoginPage;
import com.profillo.pages.UserManagementPage;
import com.profillo.utitilies.BrowserUtils;
import com.profillo.utitilies.ConfigurationReader;
import com.profillo.utitilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditUserStepDefs {

    @Given("librarian is in the application dashboard")
    public void librarian_is_in_the_application_dashboard() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().librarianLogin();
    }

    @When("librarian click the Users button")
    public void librarian_click_the_Users_button() {
        new DashBoardPage().usersButton.click();
    }

    @When("librarian chooses one user randomly and click the Edit User button")
    public void librarian_chooses_one_user_randomly_and_click_the_Edit_User_button() {
        new UserManagementPage().chooseRandomEditUser();
        BrowserUtils.waitFor(2);
    }

    @When("librarian change the fullname information with {string} and clicks the Save changes button")
    public void librarian_change_the_fullname_information_with_and_clicks_the_Save_changes_button(String fullName) {
        System.out.println(new EditUserInformationPage().fullNameInputBox.getAttribute("value"));
        new EditUserInformationPage().fullNameInputBox.clear();
        new EditUserInformationPage().fullNameInputBox.sendKeys(fullName);
        new EditUserInformationPage().saveChanges.click();
    }

    @Then("librarian should get {string} success message")
    public void librarian_should_get_success_message(String message) {
        Assert.assertEquals("verify the message", message, new EditUserInformationPage().editUserSuccessMessage.getText());
    }
}
