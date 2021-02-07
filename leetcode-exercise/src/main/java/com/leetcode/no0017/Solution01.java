package com.leetcode.no0017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution01 {

    private final String[] mapping = new String[]{
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    private void combinations(String digits, int idx, String str, List<String> result){
        if(idx == digits.length()){
            result.add(str);
            return;
        }

        String chars = mapping[digits.charAt(idx) - '2'];

        for(int i = 0; i < chars.length();++i){
            combinations(digits,idx+1,str+chars.charAt(i),result);
        }
    }

    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0){
            return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        combinations(digits,0,"",result);

        return result;
    }

}
