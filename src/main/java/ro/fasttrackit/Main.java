package ro.fasttrackit;

import ro.fasttrackit.lombok.PersonLombok;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PersonLombok person = PersonLombok.builder()
                .age(21)
                .build();
    }
}