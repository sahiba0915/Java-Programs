package com.functions;

import java.util.Scanner;

public class Sumoftwonumbers {
    public static void main(String[] args) {
        sum();

         int ans = sum2();
            System.out.println(ans);
            int ans2 = sum3(20,30);
        System.out.println(ans2);
    }
    
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }



    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the first number: ");
        num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        num2 = in.nextInt();
        sum = (num1 + num2);
        return sum;
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the first number: ");
        num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        num2 = in.nextInt();
        sum = (num1 + num2);
        System.out.println("The sum is: " + sum);
    }
}
