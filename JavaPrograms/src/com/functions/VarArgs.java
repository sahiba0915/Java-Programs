package com.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
          fun(2,4,5,6,7,8,9);
          multiple(2,3,"Komal", "Sahiba");

    }

    static void multiple(int a, int b, String ...c){
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

