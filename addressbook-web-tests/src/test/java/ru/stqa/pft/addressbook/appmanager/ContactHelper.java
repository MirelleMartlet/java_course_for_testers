package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irina on 05.06.2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToContactPage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getCompanyAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email2"), contactData.getEmail1());
        type(By.name("email3"), contactData.getEmail2());
        type(By.name("homepage"), contactData.getHomepage());
        click(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getDate1() + "]"));
        click(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getMonth1() + "]"));
        click(By.xpath("//div[@id='content']/form/select[3]//option[" + contactData.getDate2() + "]"));
        click(By.xpath("//div[@id='content']/form/select[4]//option[" + contactData.getMonth2() + "]"));
        click(By.xpath("//div[@id='content']/form/select[5]//option[" + contactData.getGroup() + "]"));

        type(By.name("byear"), contactData.getYear());
        type(By.name("ayear"), contactData.getYear2());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getHome());
        type(By.name("notes"), contactData.getNotes());
    }

    public void updateContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getCompanyAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email2"), contactData.getEmail1());
        type(By.name("email3"), contactData.getEmail2());
        type(By.name("homepage"), contactData.getHomepage());
        click(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getDate1() + "]"));
        click(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getMonth1() + "]"));
        click(By.xpath("//div[@id='content']/form/select[3]//option[" + contactData.getDate2() + "]"));
        click(By.xpath("//div[@id='content']/form/select[4]//option[" + contactData.getMonth2() + "]"));

        type(By.name("byear"), contactData.getYear());
        type(By.name("ayear"), contactData.getYear2());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getHome());
        type(By.name("notes"), contactData.getNotes());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        ;
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void initContactModification(int numContact) {
        click(By.xpath(".//*[@id='maintable']/tbody/tr[" + (numContact + 2) + "]/td[8]/a/img"));
    }

    public void submitContactModification() {

        click(By.name("update"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToContactPage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements) {
            List<WebElement> cells = element.findElements(By.tagName("td"));
            String lastName = cells.get(1).getText();
            String firstName = cells.get(2).getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            ContactData contact = new ContactData(id, firstName, lastName);
            contacts.add(contact);
        }
        return contacts;
    }
}