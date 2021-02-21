package com.profillo.pages;

import com.profillo.utitilies.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;


    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    public void librarianLogin(){
        usernameInput.sendKeys("librarian30@library");
        passwordInput.sendKeys("e3BxcFKE",Keys.ENTER);
    }

    public void studentLogin(){
        usernameInput.sendKeys("student50@library");
        passwordInput.sendKeys("so9lCgZf",Keys.ENTER);
    }

}
