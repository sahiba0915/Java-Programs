package com.var;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Please enter the temprature in C");
        float tempC = temp.nextFloat();
        float tempF = (tempC*9/5) + 32;
        System.out.println(tempF);
    }
}
