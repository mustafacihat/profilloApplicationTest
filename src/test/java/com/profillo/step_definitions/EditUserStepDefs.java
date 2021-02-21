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
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

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

    @When("librarian change the password information with {string} and clicks the Save changes button")
    public void librarian_change_the_password_information_with_and_clicks_the_Save_changes_button(String password) {
        new EditUserInformationPage().passwordInputBox.clear();
        new EditUserInformationPage().passwordInputBox.sendKeys(password);
        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the email information with {string} and clicks the Save changes button")
    public void librarian_change_the_email_information_with_and_clicks_the_Save_changes_button(String email) {
        int num = new Random().nextInt();
        new EditUserInformationPage().emailInputBox.clear();
        new EditUserInformationPage().emailInputBox.sendKeys(num + email);
        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the userGroup  with other one and clicks the Save changes button")
    public void librarian_change_the_userGroup_with_other_one_and_clicks_the_Save_changes_button() {
        EditUserInformationPage editUserInformationPage = new EditUserInformationPage();

        Select select = new Select(editUserInformationPage.userGroupDropDown);
        if (select.getFirstSelectedOption().getText().equals("Librarian")) {
            select.selectByVisibleText("Students");
        } else {
            select.selectByVisibleText("Librarian");
        }

        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the status  with other one and clicks the Save changes button")
    public void librarian_change_the_status_with_other_one_and_clicks_the_Save_changes_button() {
        EditUserInformationPage editUserInformationPage = new EditUserInformationPage();

        Select select = new Select(editUserInformationPage.statusDropDown);
        if (select.getFirstSelectedOption().getText().equals("ACTIVE")) {
            select.selectByVisibleText("INACTIVE");
        } else {
            select.selectByVisibleText("ACTIVE");
        }

        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the start date information with {string} and clicks the Save changes button")
    public void librarian_change_the_start_date_information_with_and_clicks_the_Save_changes_button(String startDate) {
        new EditUserInformationPage().startDate.clear();
        new EditUserInformationPage().startDate.sendKeys(startDate);
        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the end date information with {string} and clicks the Save changes button")
    public void librarian_change_the_end_date_information_with_and_clicks_the_Save_changes_button(String endDate) {
        new EditUserInformationPage().endDate.clear();
        new EditUserInformationPage().endDate.sendKeys(endDate);
        new EditUserInformationPage().saveChanges.click();
    }

    @When("librarian change the address  information with {string} and clicks the Save changes button")
    public void librarian_change_the_address_information_with_and_clicks_the_Save_changes_button(String address) {
        new EditUserInformationPage().addressInputBox.clear();
        new EditUserInformationPage().addressInputBox.sendKeys(address);
        new EditUserInformationPage().saveChanges.click();
    }


}
