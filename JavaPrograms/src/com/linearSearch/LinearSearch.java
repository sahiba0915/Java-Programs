package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {15,9,23};
        int target = 15;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(target==element){
                return i;
            }
        }
        return -1;
    }
}
