package com.functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int [] nums){
     nums[0] = 0;
    }
}
