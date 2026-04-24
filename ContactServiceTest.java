// Ava Lindgren - 12 April 2026

package main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

	private ContactService service;
	
	@BeforeEach
    void setUp() {
        service = new ContactService();
    }
	
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contacts.clear();
	}

    @Test
    void testSuccessAddContact() {
        Contact contact = new Contact("121273", "Ava", "Lindgren", "3319372947", "1002 Robinson Way");
        service.addContact(contact);
        assertNotNull(service);
    }

    @Test
    void testAddContactFail() {
        Contact contactX = new Contact("121273", "Ava", "Lindgren", "3319372947", "1002 Robinson Way");
        service.addContact(contactX);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contactX);
        });
    }
    
    @Test
    void testSuccessUpdateContact() {
        Contact contact = new Contact("033003", "Maddy", "McFalls", "2294038845", "20909 Valley Road");
        service.addContact(contact);
        service.updateContact("033003", "Madison", null, null, "2090 Valley Road");
        assertEquals("Madison", contact.getFirstName());
        assertEquals("2090 Valley Road", contact.getAddress());
    }

    @Test
    void testContactDelete() {
        Contact contact = new Contact("randoID", "Rando", "RandoLast", "9283746572", "033 Hwy 9");
        service.addContact(contact);
        service.removeContact("randoID");
        assertThrows(IllegalArgumentException.class, () -> {
        	// attempt to delete a contact that does not exist
            service.removeContact("randoID"); 
        });
    }

}