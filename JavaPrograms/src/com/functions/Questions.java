package com.functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is a prime number or not: ");
        System.out.println("Enter a number to check whether it is a prime number or not: ");
        int n = in.nextInt();
        boolean answer = isPrime(n);
        System.out.println(answer);
        boolean ans = isArmStrong(n);
        System.out.println(ans);
    }

    static boolean isArmStrong(int n) {
        int original = n;
        int sum = 0;
        while (n >0){
            int rem = n%10;
            n= n/10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;

    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%2 == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
