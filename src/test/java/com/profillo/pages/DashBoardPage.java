package com.profillo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersButton;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksButton;


}
