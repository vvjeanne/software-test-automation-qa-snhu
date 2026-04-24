// Ava Lindgren - 12 April 2026

package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

	
	// ******* test contact id *******
	
	// fail test with over ten characters
	@Test
	public void testIdOverTen() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273121273", "Ava", "Lindgren", "3319372947", "1002 Robinson Way");
		});
	}

	// fail test with null
	@Test
	public void testIdNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Ava", "Lindgren", "3319372947", "1002 Robinson Way");
		});
	}
	
	// ******* test set firstName *******
	
	// fail test with over ten characters
	@Test
	public void testFirstNameOverTen() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Avavavavava", "Lindgren", "3319372947", "1002 Robinson Way");
		});
	}

	// fail test with null
	@Test
	public void testFirstNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", null, "Lindgren", "3319372947", "1002 Robinson Way");
		});
	}
	
	
	// ******* test set lastName *******
	
	// fail test with over ten characters
	@Test
	public void testLastNameOverTen() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", "LindgrenLindgren", "3319372947", "1002 Robinson Way");
		});
	}

	// fail test with null
	@Test
	public void testLastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", null, "3319372947", "1002 Robinson Way");
		});
	}
	
	
	// ******* test set phone *******
	
	// fail test without exactly ten characters
	@Test
	public void testPhoneNotTen() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", "Lindgren", "33193729477", "1002 Robinson Way");
		});
	}

	// fail test with null
	@Test
	public void testPhoneNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", "Lindgren", null, "1002 Robinson Way");
		});
	}
	
	
	// ******* test set address *******
	
	// fail test with over thirty characters
	@Test
	public void testAddressOverThirty() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", "Lindgren", "3319372947", "10021002 RobinsonRobinson WayWay");
		});
	}

	// fail test with null
	@Test
	public void testAddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("121273", "Ava", "Lindgren", "3319372947", null);
		});
	}
	
}
