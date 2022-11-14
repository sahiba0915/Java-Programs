package com.rahul;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = input.nextInt();
        System.out.println("Please enter the first number");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is " + " " + sum);
    }
}
