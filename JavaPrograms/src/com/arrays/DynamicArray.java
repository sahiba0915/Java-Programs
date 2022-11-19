package com.arrays;

public class DynamicArray {
    public static void main(String[] args) {
         int[][] arr = {
                 {1,2,3},
                 {6,9},
                 {8,9,4,5}
         };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
