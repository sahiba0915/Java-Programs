package com.linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Komal";
        char target = 'r';
        System.out.println(stringSearch(str, target));


    }

    static boolean stringSearch(String str, int target){
      if(str.length() == 0){
          return false;
      }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
