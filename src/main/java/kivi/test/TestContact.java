package kivi.test;

import kivi.model.Constant;

import java.util.ArrayList;
import java.util.Scanner;

public class TestContact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Constant> contacts = new ArrayList<>();

        contacts.add((new Constant("Alice", "Johnson", 1234567890, "123 Main St")));
        contacts.add((new Constant("Bob", "Miligan", 987654321, "473 Dark St")));
        contacts.add((new Constant("Greg", "Miligan", 987654321, "473 Dark St")));

        System.out.println("Enter Name to find:");
        String name = scanner.nextLine();
        for(Constant constant : contacts){
            if (constant.getFirstName().equalsIgnoreCase(name)){
                System.out.println(constant);
            }
        }
        System.out.println("Enter Phone number to delete:");
        String maneDelete = scanner.nextLine();
        contacts.removeIf(constant -> constant.getFirstName().equalsIgnoreCase(maneDelete));
        System.out.println("Sucessfully deleted: " + contacts);
    }
}
