package com.javatpoint.basic.controlstatement;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 40996044;

        // Check if the year is a leap year
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Common Year");
        }
    }
}
