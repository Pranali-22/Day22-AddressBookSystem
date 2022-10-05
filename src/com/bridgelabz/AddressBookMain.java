/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * UC2 - Ability to add a new Contact to Address Book
 */

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName,lastName, address, city, state, zip, phoneNo, email;
		
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName = input.nextLine();
	    lastName = input.nextLine();
		address = input.nextLine();
		city = input.nextLine();
		state = input.nextLine();
		zip = input.nextLine();
		phoneNo = input.nextLine();
		email = input.nextLine();		
		
		Contact personObj = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
		personObj.displaData();
		
		AddressBook addressBook1 = new AddressBook();
		addressBook1.addToAddressBook(personObj);
		
		input.close();
	}
}
