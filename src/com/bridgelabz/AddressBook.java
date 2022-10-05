/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author Dell
 * UC2 - Ability to add a new Contact to Address Book
 */

public class AddressBook {
	
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void addToAddressBook(Contact personContact) {
		contactList.add(personContact);
	}
}
