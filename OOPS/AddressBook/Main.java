package OOPS.AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    addressBook.addContact(name, phone);
                    System.out.println("Contact added!");
                    break;

                case 2:
                    System.out.println("Contacts:");
                    addressBook.viewContacts();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Exiting Address Book. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
