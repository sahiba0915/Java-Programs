package com.arrays;
import java.util.Scanner;

public class ArrayQuestions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        arrays of primitive type
        int[] arr = new int[5];
        for(int i=0; i<=arr.length;i++){
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }


    }
}
