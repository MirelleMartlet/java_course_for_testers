package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Irina on 05.06.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Irina", "Alexandrovna", "Gavrilova1", "IGavrilova", "Title", "Aplana", "Kl. Tsetkin street,89/1", "+74996575400", "+79276679854", "+76574453876", "+77558907655", "igavrilova@home", "gavrilova@mail.com", "igavrilova.com", "Moskov ", "1", "None", "1989", "2020", 17, 12, 17, 12, 1));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact(0);

        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().isAlertPresent();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
