package com.linearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {18,12,14,16,17};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
