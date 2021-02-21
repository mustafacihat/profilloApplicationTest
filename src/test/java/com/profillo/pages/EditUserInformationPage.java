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
}
