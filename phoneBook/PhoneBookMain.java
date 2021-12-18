package phoneBook;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookMain {
    static Scanner input;
    static Contacts contacts;
    static UpdateContacts contact;
    static Address address;

    static {
        input = new Scanner(System.in);
        contacts = new Contacts();
        contact = new UpdateContacts();
        address = new Address();

    }

    public static void main(String[] args) {
        Address a1 = new Address("abc", "123", "MO", "63367");
        Contacts c1 = new Contacts("String", "J ", "Harris", "6363466226", a1);
        UpdateContacts update1 = new UpdateContacts();
        Contacts c2 = new Contacts("Lexi", " ", "Spotanski", "6369781393", a1);
        update1.addContacts(c1);
        update1.addContacts(c2);

        int option = 0;

        while (option != 5) {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println("-----CONTACT LIST-----");
                    update1.printAlpha(update1.getContacts());
                    break;
                case 2:
                    System.out.println("----SEARCH PHONEBOOK-----");
                    int searchChoice = 0;
                    while (searchChoice != 8) {
                        searchChoice = searchMenu();
                        switch (searchChoice) {
                            case 1:
                                System.out.println("First Name: ");
                                String searchFirst = input.nextLine();
                                update1.printContacts(update1.findByFirstName(searchFirst));
                                break;
                            case 2:
                                System.out.println("Last Name: ");
                                String searchLast = input.nextLine();
                                update1.printContacts(update1.findByLastName(searchLast));
                                break;
                            case 3:
                                System.out.println("Phone Number: ");
                                String searchPhone = input.nextLine();
                                update1.printContacts(update1.findByPhone(searchPhone));
                                break;
                            case 4:
                                 System.out.println("Full Name: ");
                                 String searchFirstName = input.next();
                                 String searchLastName = input.nextLine();
                               update1.printContacts(update1.searchByFullName(searchFirstName, searchLastName));
                                break;
                            case 5:
                                System.out.println("City Name: ");
                                String searchCity = input.nextLine();
                                System.out.println(update1.findByCity(searchCity));
                                break;
                            case 6:
                                System.out.println("State Name: ");
                                String searchState = input.nextLine();
                                System.out.println(update1.findByState(searchState));
                                break;
                            case 7:
                                System.out.println("Traveling to Main Menu... ");
                                break;


                        }
                    }
                break;
                case 3:
                    System.out.println("-----ADD NEW CONTACT-----");
                    System.out.println("Enter First Name: ");
                    contacts.setFirstName(input.nextLine());
                    System.out.println("Enter Last Name: ");
                    contacts.setLastName(input.nextLine());
                    System.out.println("Enter Primary Phone Number: ");
                    contacts.setPhoneNumber(input.nextLine());
                    System.out.println("-----Enter Address-----");
                    System.out.println("Enter Street: ");
                    String addStreet = input.nextLine();
                    System.out.println("Enter City: ");
                    String addCity = input.nextLine();
                    System.out.println("Enter State: ");
                    String addState = input.nextLine();
                    System.out.println("Enter Zip Code: ");
                    String addZipCode = input.nextLine();
                    contacts.addAddress(addStreet, addCity, addState, addZipCode);
                    update1.addContacts(contacts);
                    update1.printContacts(update1.getContacts());
                    break;
                case 4:
                    System.out.println("-----Delete Contact-----");
                    System.out.println("Enter a phone number to be deleted: ");
                    String phoneNumber = input.nextLine();
                    update1.deleteContact(contacts);
                    update1.printContacts(update1.getContacts());
                case 5:
                    System.out.println("BYE!");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 5");

            }
        }
    }

    public static int menu() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("| Choose an option from the menu: | ");
        System.out.println("===================================");
        System.out.println("Menu\n1.Display All Contacts\n2.Search contacts\n3.Add a new contact\n4.Remove contact\n5. Exit");
        int option = scan2.nextInt();
        System.out.println();
        return option;
    }

    public static int searchMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Search by:\n1.Search by First Name\n2.Search by Last Name \n3. Search by Phone Number \n4. Search by Full Name \n5.Search by City \n6. Search by State \n7.Return to Main Menu");
        int option = scan.nextInt();
        System.out.println();
        return option;
    }
}


