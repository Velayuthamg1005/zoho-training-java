package OOPS.AddressBook;

/*

Address Book Mini Project

Build a simple address book program using classes. The program should allow:

1. Adding a contact (name and phone number).
2. Viewing all contacts.
3. Searching for a contact by name.

Sample Input/Output:
1. Add Contact
2. View Contacts
3. Search Contact
4. Exit

Enter Choice: 1
Name: John
Phone: 123456789

Enter Choice: 2
Contacts:
John - 123456789


*/


public class Contact {
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // toString method to easily print a contact
    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}

