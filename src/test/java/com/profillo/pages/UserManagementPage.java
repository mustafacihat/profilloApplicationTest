package com.profillo.pages;

import com.profillo.utitilies.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class UserManagementPage extends BasePage{

    public void chooseRandomEditUser(){
        Random rn = new Random();
        int rndm= rn.nextInt(10)+1;
        WebElement element = Driver.get().findElement(By.xpath("//tbody/tr[" + rndm + "]/td[1]"));
        element.click();
    }

}
