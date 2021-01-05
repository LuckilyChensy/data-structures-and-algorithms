package com.leetcode.no0076;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution02 {

    Map<Character,Integer> ori = new HashMap<Character,Integer>();
    Map<Character,Integer> cnt = new HashMap<Character,Integer>();

    public String minWindow(String s,String t){

        int tLen = t.length();

        for(int i = 0; i < tLen; i++){
            char c = t.charAt(i);
            ori.put(c,ori.getOrDefault(c,0) + 1);
        }

        int left = 0;
        int right = -1;
        int len = Integer.MAX_VALUE;
        int ansL = -1;
        int ansR = -1;
        int sLen = s.length();
        while(right<sLen){
            ++right;
            if(right<sLen && ori.containsKey(s.charAt(right))){
                cnt.put(s.charAt(right),cnt.getOrDefault(s.charAt(right),0)+1);
            }
            while(check()&&left <= right){
                if(right -left + 1 < len){
                    len = right - left + 1;
                    ansL = left;
                    ansR = left + len;
                }
                if(ori.containsKey(s.charAt(left))){
                    cnt.put(s.charAt(left),cnt.getOrDefault(s.charAt(left),0)-1);
                }
                ++left;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public boolean check() {
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }

}
