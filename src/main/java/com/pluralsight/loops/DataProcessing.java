package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Person("Billy", "John", 34));
        people.add(new Person("Sarah", "Williams", 28));
        people.add(new Person("Michael", "Brown", 41));
        people.add(new Person("Jessica", "Davis", 22));
        people.add(new Person("Daniel", "Miller", 30));
        people.add(new Person("Ashley", "Wilson", 26));
        people.add(new Person("Christopher", "Moore", 38));
        people.add(new Person("Emily", "Taylor", 19));
        people.add(new Person("Matthew", "Davis", 45));
        people.add(new Person("Olivia", "Thomas", 31));

        System.out.print("Search name: ");
        String name = scanner.nextLine();


        List<Person> match = new ArrayList<>();

        for(Person person : people){
            if (name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())){
                match.add(person);
            }

        }

        for (Person matched : match){
            System.out.println(matched);
        }
    }
}
