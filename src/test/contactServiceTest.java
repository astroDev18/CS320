package test;

import contactApp.contactService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class contactServiceTest {
    // reset array after a test
    @AfterEach
    void tearDown() throws Exception {
        contactService.contactList.clear();
    }

    // Testing add contact method
    @Test
    void testAddContactMethod() {

        String id = "0";
        String firstName = "Isa";
        String lastName = "Ali";
        String phoneNumber = "7651234521";
        String contactAddress = "931 Downing St.";

        contactService test = new contactService();

        Assertions.assertTrue(contactService.contactList.isEmpty());

        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);

        Assertions.assertFalse(contactService.contactList.isEmpty());

        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);

        Assertions.assertFalse(contactService.contactList.isEmpty());
        Assertions.assertEquals(0, contactService.contactList.get(0).getContactID());
        Assertions.assertEquals(firstName, contactService.contactList.get(0).getName());
        Assertions.assertEquals(phoneNumber, contactService.contactList.get(0).getPhoneNumber());
        Assertions.assertEquals(contactAddress, contactService.contactList.get(0).getContactAddress());
    }
    // Testing Delete Contact Method
    @Test void testDeleteContact() {
        String id = "0";
        String firstName = "Isa";
        String lastName = "Ali";
        String phoneNumber = "7651234521";
        String contactAddress = "931 Downing St.";
        boolean testBool = false;

        contactService test = new contactService();

        Assertions.assertTrue(contactService.contactList.isEmpty());

        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);
        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);
        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);

        Assertions.assertEquals(3, contactService.contactList.size());

        // Loop through looking for ID

        for (int i = 0; i < contactService.contactList.size(); i++) {
            if(contactService.contactList.get(i).getContactID() == 1) {
                testBool = true;
            }
        }
        Assertions.assertFalse(testBool);
    }

    // Testing phone number
    @Test
    void testPhoneNumber() {
        String id = "0";
        String firstName = "Isa";
        String lastName = "Ali";
        String phoneNumber = "7651234521";
        String contactAddress = "931 Downing St.";

        contactService test = new contactService();

        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);

        Assertions.assertEquals(phoneNumber, contactService.contactList.get(0).getPhoneNumber());

        test.editNumber("0", "7651234521");
        assertEquals("7651234521", contactService.contactList.get(0).getPhoneNumber());
    }

    @Test
    void testEditName() {
        String id = "0";
        String firstName = "Isa";
        String lastName = "Ali";
        String phoneNumber = "7651234521";
        String contactAddress = "931 Downing St.";

        contactService test = new contactService();
        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);
        Assertions.assertEquals(firstName, contactService.contactList.get(0).getName());

        test.editFirstName("0", "New_Name");
        assertEquals("New_Name", contactService.contactList.get(0).getName());
    }
    @Test
    void testEditAddress() {

        String id = "0";
        String firstName = "Isa";
        String lastName = "Ali";
        String phoneNumber = "7651234521";
        String contactAddress = "931 Downing St.";

        contactService test = new contactService();
        test.addContact(id, firstName, lastName, phoneNumber, contactAddress);

        Assertions.assertEquals(contactAddress, contactService.contactList.get(0).getContactAddress());

        test.editAddress("0", "Test_Address");
        assertEquals("Test_Address", contactService.contactList.get(0).getContactAddress());
    }
}


