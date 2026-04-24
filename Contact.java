// Ava Lindgren - 12 April 2026

package main;

public class Contact {
	// id string requires unique contact ID string so is private final
	private final String id; 
	// firstName, lastName, phone, and address strings
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		
		// if contact ID is null or if contact ID is longer than 10 characters
		if (id == null || id.length() > 10) {
			// output error message
			throw new IllegalArgumentException("Invalid ID . . .\n");
		}
		
		// if firstName is null or if firstName is longer than 10 characters
		if (firstName == null || firstName.length() > 10) {
			// output error message
			throw new IllegalArgumentException("Invalid First Name . . .\n");
		}

		// if lastName is null or if lastName is longer than 10 characters
		if (lastName == null || lastName.length() > 10) {
			// output error message
			throw new IllegalArgumentException("Invalid Last Name . . .\n");
		}

		// if phone is null or if phone is longer than 10 characters or if phone does not match one or more digits
		if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
			// output error message
			throw new IllegalArgumentException("Invalid Phone Number . . .\n");
		}
		
		// if address is null or is address is longer than 30 characters
		if (address == null || address.length() > 30) {
			// output error message
			throw new IllegalArgumentException("Invalid Address . . .\n");
		}
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// getters and setters
	
	// id getter, no setter as id is non-updatable
	public String getId() {
		return id;
	}
	
	// firstName getter
	public String getFirstName() {
		return firstName;
	}
	//firstName setter
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name . . .\n");
		}
		this.firstName = firstName;
	}
	
	// lastName getter
	public String getLastName() {
		return lastName;
	}
	//lastName setter
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name . . .\n");
		}
		this.lastName = lastName;
	}
	
	// phone getter
	public String getPhone() {
		return phone;
	}
	// phone setter
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10 || !phone.matches("\\d+") ) {
			throw new IllegalArgumentException("Invalid Phone Number . . .");
		}
		this.phone = phone;
	}
	
	// address getter
	public String getAddress() {
		return address;
	}
	// address setter
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address . . .\n");
		}
		this.address = address;
	}
	
}
