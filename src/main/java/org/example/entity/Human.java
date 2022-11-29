package org.example.entity;


public class Human {
    private static String firstName;
    private static String lastName;
    private static double height;

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Human.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Human.lastName = lastName;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Human.height = height;
    }
}
