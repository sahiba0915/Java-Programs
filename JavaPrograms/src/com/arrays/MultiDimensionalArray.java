package com.arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          /*
          1 2 3
          4 5 6
          7 8 9
           */
        int[][] arr = new int[3][3];
       for(int row=0; row< arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               arr[row][col] = in.nextInt();
           }
       }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
       }

    }
