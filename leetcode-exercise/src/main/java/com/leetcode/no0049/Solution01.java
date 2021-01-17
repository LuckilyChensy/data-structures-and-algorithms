package com.leetcode.no0049;

import java.util.*;

public class Solution01 {

    private String getKeyBySort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            String key = getKeyBySort(str);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
