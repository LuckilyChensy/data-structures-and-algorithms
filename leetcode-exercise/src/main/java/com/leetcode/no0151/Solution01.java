package com.leetcode.no0151;

public class Solution01 {

    public String reverseWords(String s){

        s = s.trim();
        int j = s.length() - 1;
        int i = j;

        StringBuilder result = new StringBuilder();

        while(i >= 0){
            while(i>=0 && s.charAt(i) != ' '){ i--; }
            result.append(s.substring(i+1,j+1) + " ");
            while(i >=0 && s.charAt(i) == ' '){ i--; }
            j = i;
        }

        return result.toString().trim();

    }

}
