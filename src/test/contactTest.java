package test;

import contactApp.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class contactTest {
    @Test
    void testContactIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact((String)null, (String)null, (String)null, (String)null, (String)null);
        });
    }

    @Test
    void testContact() {
        Contact contact = new Contact("345123", "Isa", "Ali", "1323214321", "1/1 Downing St.");
        assertEquals("Isa", contact.getName());
        assertEquals("2565555555", contact.getPhoneNumber());
        assertEquals("354 Main St.", contact.getContactAddress());
        assertEquals("345123", contact.getContactID());
    }

    @Test
    void testFirstAndLast() {
        Contact contact = new Contact("345123", "Isa", "Ali", "1323214321", "1/1 Downing St.");
        contact.setFirstName("Isa");
        contact.setLastName("Ali");
        assertEquals("Isa", contact.getName());
    }

    @Test
    void testPhoneNumberAndAddress() {
        Contact contact = new Contact("345123", "Isa", "Ali", "1323214321", "1/1 Downing St.");
        contact.setPhoneNumber("8513212451");
        contact.setAddress("354 Main St.");
        assertEquals("8513212451", contact.getPhoneNumber());
        assertEquals("354 Main St.", contact.getContactAddress());
    }

    @Test
    void testNullSetAttributes() {
        Contact contact = new Contact("345123", "Isa", "Ali", "1323214321", "1/1 Downing St.");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName((String)null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName((String)null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress((String)null);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhoneNumber((String)null);
        });
    }


    @Test
    void testGetters() {
        Contact contact = new Contact("345123", "Isa", "Ali", "1323214321", "1/1 Downing St.");
        assertEquals("Isa Ali", contact.getName());
        assertEquals("345123", contact.getContactID());
        assertEquals("8610142333", contact.getPhoneNumber());
        assertEquals("354 Main St.", contact.getContactAddress());
    }
}
