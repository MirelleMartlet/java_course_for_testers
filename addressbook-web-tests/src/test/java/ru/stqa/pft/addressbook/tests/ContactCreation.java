package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().createContact(new ContactData("Irina", "Alexandrovna", "Gavrilova1", "IGavrilova", "Title", "Aplana", "Kl. Tsetkin street,89/1", "+74996575400", "+79276679854", "+76574453876", "+77558907655", "igavrilova@home", "gavrilova@mail.com", "igavrilova.com", "Moskov ", "1", "None", "1989", "2020", 17, 12, 17, 12, 1));
    }

}
