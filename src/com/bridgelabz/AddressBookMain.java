/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * UC4- Ability to delete a person using person's name - Use Console to delete a person
 */

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AddressBook addressBook1 = new AddressBook();	
		int choice =1;
		
		while (choice!=0){         
            switch (choice){
                case 0:
                    return;                   
                case 1:
                    addressBook1.addToAddressBook();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;   
                case 3:
                	addressBook1.displayAddressBook();
                	break;
                case 4:
                	addressBook1.deleteContact();
                	break;
            }
            
            System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display\nPress 4 to delete contact");
            choice = input.nextInt();
        }
		
		input.close();
	}
}
