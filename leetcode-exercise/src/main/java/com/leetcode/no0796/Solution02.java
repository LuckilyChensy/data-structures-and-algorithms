package com.leetcode.no0796;

public class Solution02 {
    public boolean rotateString(String A,String B){
        return A.length() == B.length() && (A+A).contains(B);
    }
}