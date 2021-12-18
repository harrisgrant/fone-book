package phoneBook;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateContacts {
    static Scanner input;
    static Contacts contact;
    public Contacts[] phonebookArray = new Contacts[0];
    public Address[] addressArray = new Address[0];

    static {
        input = new Scanner(System.in);
        contact = new Contacts();
    }
    public UpdateContacts(){}

    public void addContacts(Contacts newContacts) {

        Contacts[] tempArray = new Contacts[phonebookArray.length + 1];

        for (int i = 0; i < phonebookArray.length; i++) {
            tempArray[i] = phonebookArray[i];
        }
        tempArray[tempArray.length - 1] = newContacts;

        phonebookArray = tempArray;
    }

    public void deleteContact(Contacts delete) {

        Contacts[] tempArray = new Contacts[this.phonebookArray.length - 1];
        int counter = 0;
        for (int i = 0; i < this.phonebookArray.length - 1; i++) {
            if (phonebookArray[i] != delete) {
                tempArray[counter] = phonebookArray[i];
                counter++;
            }
        }
        this.phonebookArray =  tempArray;
    }

    public Contacts[] getContacts() {
        return phonebookArray;
    }

    public void printContacts(Contacts[] search) {
        for (Contacts contacts : search) {
            contacts.getContacts();
        }
    }
    public void printAlpha(Contacts[] searched) {
        String[] alphabatize = new String[searched.length];
        for (int i = 0; i < searched.length; i++) {
            alphabatize[i] = searched[i].getFirstName();
        }
        Arrays.sort(alphabatize);
        for (int i = 0; i < alphabatize.length; i++) {
            for (int j = 0; j < phonebookArray.length; j++) {
                if (alphabatize[i] == phonebookArray[j].getFirstName()) {
                    phonebookArray[j].getContacts();
                }
            }
        }
    }

    public Contacts[] findByFirstName(String first) {

        int counter = 0;
        for (int i = 0; i < phonebookArray.length; i++) {
            if (phonebookArray[i].getFirstName().equals(first)) {
                counter++;
            }
        }
        Contacts[] tempArray = new Contacts[counter];
        int counter2 = 0;
        for (int i = 1; i < phonebookArray.length; i++) {
            tempArray[counter2] = phonebookArray[i];
            counter2++;
        }
        return tempArray;
    }

    public Contacts[] findByLastName(String last) {
        int counter = 0;
        for (int i = 0; i < this.contact.phonebookArray.length; ++i) {
            if (this.phonebookArray[i].getLastName().equals(last)) {
                counter++;
            }
        }
        Contacts[] tempArray = new Contacts[counter];
        int counter2 = 0;
        for (int i = 1; i < contact.phonebookArray.length; i++) {
            tempArray[counter2] = contact.phonebookArray[i];
            counter2++;
        }
        return tempArray;
    }
    public Contacts[] searchByFullName(String firstName, String lastName) {

        if (phonebookArray.length == 0) {
            throw new NullPointerException("NO MATCH!");
        }

        int count = 0;

        for (int i = 0; i < phonebookArray.length; i++) {
            if (phonebookArray[i].getFirstName().equalsIgnoreCase(firstName)
                    && phonebookArray[i].getLastName().equalsIgnoreCase(lastName)) {
                count++;
            }
        }
        Contacts[] temp = new Contacts[count];

        int entryIndex = 0;
        for (int i = 0; i < phonebookArray.length; i++) {
            if (phonebookArray[i].getFirstName().equalsIgnoreCase(firstName)
                    && phonebookArray[i].getLastName().equalsIgnoreCase(lastName)) {
                temp[entryIndex] = phonebookArray[i];
                entryIndex++;
            }
        }

        return temp;
    }



    public Contacts[] findByPhone(String phoneNumber) {
        int counter = 0;
        for (int i = 0; i < phonebookArray.length; i++) {
            if (phonebookArray[i].getPhoneNumber().equals(phoneNumber)) {
                counter++;
            }
        }
        Contacts[] tempArray = new Contacts[counter];
        int counter2 = 0;
        for (int i = 1; i < phonebookArray.length; i++) {
            tempArray[counter2] = phonebookArray[i];
            counter2++;
        }
        return tempArray;
    }


    public String findByCity(String city) {
        int count = 0;
        for (Contacts c : phonebookArray) {
            if (c.getAddress().getCity().equals(city)) {
                count++;
            }
        }
       Contacts[] temp = new Contacts[count];
        int k = 0;
        for (Contacts c : phonebookArray) {
            if (c.getAddress().getCity().equals(city)) {
                temp[k] = c;
                k++;
            }
        }
        return Arrays.toString(temp);
    }
    public String findByState(String state) {
        int counter = 0;
        for (Contacts c : phonebookArray) {
            if (c.getAddress().getState().equals(state)) {
                counter++;
            }
        }
        Contacts[] temp = new Contacts[counter];
        int j = 0;
        for(Contacts c : phonebookArray){
            if(c.getAddress().getState().equals(state)){
                temp[j] = c;
            }
        }
        return Arrays.toString(temp);
    }
    }
