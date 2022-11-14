package com.rahul;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextFloat(); float to int conversion is not possible
        float num = input.nextFloat();
        System.out.println(num);

//        Type Conversion
        int num2 = (int)(67.65f);
        System.out.println(num2);
//        Automatic Type Promotions in Expressions
        byte a = 20;
        byte b = 10;
        byte c = 10;
        int op = (a * b)/c;
        System.out.println(op);

//        Unicode values
        System.out.println("नमस्ते");

//        Rules for conversion
        byte d = 42;
        char s = 'a';
        short e = 1024;
        int f = 50000;
        float g = 5.67f;
        double h = 0.124;
        double result = (g*d) + (f/s) - (h-e);
        System.out.println((g*d) + " " + (f/s) + " " + (h-e));
        System.out.println(result);


    }
}

