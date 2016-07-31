package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina on 05.06.2016.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {

        if (isAlertPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isAlertPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }



    public void gotoEditGroup() {
        if (wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                && wd.findElement(By.tagName("label")).getText().equals("Group")){
            return;
        }
        click(By.linkText("add new"));
    }




}
