package com.arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = { 1, 5 , 54 , 82 ,2};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2));
    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
