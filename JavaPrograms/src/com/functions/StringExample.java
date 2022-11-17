package com.functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String message = greeting();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name = in.next();
        String personalizedmessage = greet(name);
        System.out.println(personalizedmessage);
    }

    static String greet (String name){
        String msg = "hello" + " " + name;
        return msg;
    }

    static String greeting() {
        String greet = "How are you?";
        return greet;
    }
}
