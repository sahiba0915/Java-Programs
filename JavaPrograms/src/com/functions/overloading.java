package com.functions;

public class overloading {
    public static void main(String[] args) {
       fun(20);
       fun("Komal");
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println("second one");
        System.out.println(a);
    }
}
