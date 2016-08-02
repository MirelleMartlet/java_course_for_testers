package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Irina on 05.06.2016.
 */
public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Irina", "Alexandrovna", "Gavrilova1", "IGavrilova", "Title", "Aplana", "Kl. Tsetkin street,89/1", "+74996575400", "+79276679854", "+76574453876", "+77558907655", "igavrilova@home", "gavrilova@mail.com", "igavrilova.com", "Moskov ", "1", "None", "1989", "2020", 17, 12, 17, 12, 1));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);

        app.getContactHelper().initContactModification(before.size() - 1);
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "Irina1", "Alexandrovna1", "Gavrilova4", "IGavrilova4", "Title", "Aplana", "Kl. Tsetkin street,89/1", "+74996575400", "+79276679854", "+76574453876", "+77558907655", "igavrilova@home", "gavrilova@mail.com", "igavrilova.com", "Moskov ", "1", "None", "1989", "2020", 17, 12, 17, 12, 1);
        app.getContactHelper().updateContactForm(contact);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);

        Comparator<? super ContactData> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
    }

}
