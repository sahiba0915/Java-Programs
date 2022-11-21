package com.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        String str = "Komal";
        char target = 'k';
        System.out.println(stringSearch(str, target, 1, 4));


    }

    static boolean stringSearch(String str, int target, int start, int end){
        if(str.length() == 0){
            return false;
        }
        for (int i = start; i < end; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

