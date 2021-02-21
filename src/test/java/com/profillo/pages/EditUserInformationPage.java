package com.profillo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditUserInformationPage extends BasePage{

   @FindBy(name = "full_name")
   public WebElement fullNameInputBox;

    @FindBy(css = "button[type='submit']")
    public WebElement saveChanges;

    @FindBy(css = ".toast-message")
    public WebElement editUserSuccessMessage;

    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(name = "email")
    public WebElement emailInputBox;

    @FindBy(id = "user_group_id")
    public WebElement userGroupDropDown;


    @FindBy(id = "status")
    public WebElement statusDropDown;

    @FindBy(name = "start_date")
    public WebElement startDate;

    @FindBy(name = "end_date")
    public WebElement endDate;

    @FindBy(name = "address")
    public WebElement addressInputBox;






}
