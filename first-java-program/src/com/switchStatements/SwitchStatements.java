package com.switchStatements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select from Apple, Mango, Orange and Grapes.");
        String fruits = in.next();



        switch (fruits) {
            case "Apple" -> System.out.println("Red fruit");
            case "Mango" -> System.out.println("Yellow fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Green fruit");
            default -> System.out.println("Please enter a valid fruit name");
        }

        System.out.println("Please select a number from 1-7.");
        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid day");
        }


    }
}
