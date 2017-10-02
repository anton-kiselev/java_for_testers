package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends  TestBase {

    
    @Test
    public void ContactCreationTests() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().createContact(new ContactData("test_first_name", "test_last_name", "test_adress", "891782324", "test_first_name.test_last_name@mail.ru", "test1"));
    }




}
