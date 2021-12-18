package phoneBook;

import java.util.Arrays;
import java.util.Scanner;

public class Contacts {

    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    static Scanner input;

    public Contacts[] phonebookArray = new Contacts[0];

    static {
        input = new Scanner(System.in);
    }
    public Contacts() {
    }

    @Override
    public String toString() {
        return "Contact: " + firstName + middleName + lastName + phoneNumber  + address;
    }

    public Contacts(String firstName, String middleName, String lastName, String phoneNumber, Address address) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public void addAddress(String street, String city, String state, String zipCode) {
        Address tempAddress = new Address(street, city, state, zipCode);
        address = tempAddress;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Contacts[] getContacts() {
        System.out.println("First Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " + lastName
                + "\nPhone #: " + phoneNumber + "\nAddress: " + address);
        return new Contacts[0];
    }
    }







