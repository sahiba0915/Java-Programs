package com.functions;

public class swap {
    static int num1 = 10;
    static int num2 = 20;
    public static void main(String[] args) {
       swap();
        System.out.println(num1 + " " + num2);
    }

    static void swap(){
       int temp = num1;
       num1 = num2;
       num2 = temp;
    }
}
