/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * Ability to create a Contacts in Address Book with 
 * first and last names, address, city, state, zip, phone number and email...
 */

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName1,lastName1, address1, city1, state1, zip1, phoneNo1, email1;
		
		System.out.println("Enter first name, last name, address, city, state, zip, phone number, email ID sequentially");
		firstName1 = input.nextLine();
	    lastName1 = input.nextLine();
		address1 = input.nextLine();
		city1 = input.nextLine();
		state1 = input.nextLine();
		zip1 = input.nextLine();
		phoneNo1 = input.nextLine();
		email1 = input.nextLine();		
		
		AddressBook addressBookObj1 = new AddressBook(firstName1, lastName1, address1, city1, state1, zip1,
				 phoneNo1, email1);
		addressBookObj1.displaData();
		
		input.close();
	}

}
