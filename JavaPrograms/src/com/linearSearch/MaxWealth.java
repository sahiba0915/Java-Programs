package com.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{4,5,6}, {1,8,9}};
        int ans = maximumWealth(nums);
        System.out.println(ans);

    }

    public static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person= 0; person<(accounts.length) ;person++){
            int sum = 0;
            for(int account = 0; account <accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
