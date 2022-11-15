package com.switchStatements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select Emp no from 1-3.");
        int empNo = in.nextInt();
        System.out.println("Please select Department IT or Mngt.");
        String dept = in.next();
        switch (empNo) {
            case 1 -> System.out.println("Sahiba Kumari");
            case 2 -> System.out.println("Komal Kumari");
            case 3 -> {
                System.out.println("Emp no. 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT department");
                    case "Mngt." -> System.out.println("Mngt. department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct emp no.");
        }
    }
}
