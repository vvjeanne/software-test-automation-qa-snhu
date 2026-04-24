// Ava Lindgren - 12 April 2026

package main;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	// create map to hold map of contacts
	public static Map<String, Contact> contacts = new HashMap<>();
	
	// add new contact
	public void addContact(Contact contact) {
		// if contact is null or if contact id is already in map then display error message
		if (contact == null || contacts.containsKey(contact.getId())) {
			throw new IllegalArgumentException("Contact invalid or already exists . . .\n");
		}
		contacts.put(contact.getId(), contact);
	}
	
	// remove a contact
	public void removeContact(String id) {
		// if contact id does not exist in map then display error message
		if (!contacts.containsKey(id)) {
			throw new IllegalArgumentException("Contact does not exist . . .\n");
		}
		contacts.remove(id);
	}
	
	// update existing contacts
	public void updateContact(String id, String firstName, String lastName, String phone, String address) {
		Contact contact = contacts.get(id);
		
		// if contact is null then display error message
		if (contact == null) {
			throw new IllegalArgumentException("Contact does not exist . . .");
		}
		
		// if firstName is not null, set updated firstName to firstName
		if (firstName != null) {
			contact.setFirstName(firstName);
		}
		
		// if lastName is not null, set updated lastName to lastName
		if (lastName != null) {
			contact.setLastName(lastName);
		}
		
		// if phone is not null, set updated phone to phone
		if (phone != null) {
			contact.setPhone(phone);
		}
		
		// if address is not null, set updated address to address
		if (address != null) {
			contact.setAddress(address);
		}
	}

}
