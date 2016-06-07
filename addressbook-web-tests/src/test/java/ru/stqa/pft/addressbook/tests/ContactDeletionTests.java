package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Irina on 05.06.2016.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().isAlertPresent();
    }
}
